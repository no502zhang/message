package com.wiseyq.sms.service.impl;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiseyq.core.security.SessionUtil;
import com.wiseyq.message.common.SmsValidateUtil;
import com.wiseyq.message.entity.SendMessage;
import com.wiseyq.message.service.MessageSender;
import com.wiseyq.sms.dto.Message;
import com.wiseyq.sms.feign.MpTemplate;
import com.wiseyq.sms.feign.TemplateClient;
import com.wiseyq.sms.service.SMSService;

@Service
public class SMSServiceImpl implements SMSService {

    @Autowired
    private TemplateClient templateClient;

    @Override
    public void sendSms(Message message) {
        if (StringUtils.isBlank(message.getParkId())) {
            message.setParkId(SessionUtil.getParkId());
        }
        MpTemplate template = templateClient.findTemplate(message.getParkId(), message.getTemplateCode());
        if (template != null) {
            String content = template.getContent();
            Map<String, String> param = message.getTemplateParam();
            if (param != null) {
                for (String key : param.keySet()) {
                    String value = param.get(key);
                    content = content.replaceAll("\\$\\{" + key + "\\}", value);
                }
            }

            SendMessage sendMessage = new SendMessage();
            sendMessage.setMobile(message.getPhoneNumber());
            sendMessage.setContent(content);

            // 验证短信内容
            SmsValidateUtil.ordinarySms(sendMessage);
            // 发送短信
            MessageSender.sendAbstractMessageByThread(sendMessage);
        }
    }

}

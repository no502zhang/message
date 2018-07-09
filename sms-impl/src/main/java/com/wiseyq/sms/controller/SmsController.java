package com.wiseyq.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiseyq.core.base.controller.ResultData;
import com.wiseyq.sms.dto.Message;
import com.wiseyq.sms.service.SMSService;

@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SMSService smsService;

    @PostMapping("/sendSms")
    public ResultData sendSms(@RequestBody Message message) {
        ResultData result = new ResultData();
        try {
            smsService.sendSms(message);

            result.setResult(true);
        } catch (Exception e) {
            result.setResult(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}

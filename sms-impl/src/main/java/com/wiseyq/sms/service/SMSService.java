package com.wiseyq.sms.service;

import com.wiseyq.sms.dto.Message;

public interface SMSService {
    void sendSms(Message message);
}

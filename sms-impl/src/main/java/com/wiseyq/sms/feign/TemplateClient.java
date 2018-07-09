package com.wiseyq.sms.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SYSTEM")
public interface TemplateClient {

    @GetMapping(value = "/push/mpTemplate/findTemplate")
    MpTemplate findTemplate(@RequestParam("parkId") String parkId, @RequestParam("tempCode") String tempCode);
}

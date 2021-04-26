package com.example.dubboprovider.service;

import com.example.dubboprovider.utils.TimeUtil;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0",interfaceClass = Provider.class)
public class ProviderImpl implements Provider {
    @Override
    public String ins() {
        System.out.println("sout");
        return TimeUtil.getCurrentTime();
    }


}

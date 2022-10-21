package ru.adm123.starterdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.adm123.starterInfo.provider.AppFailedTestProvider;
import ru.adm123.starterInfo.provider.AppNameProvider;
import ru.adm123.starterInfo.provider.AppVersionProvider;

import java.util.Collections;

@Configuration
public class InfoConfiguration {

    @Bean
    public AppVersionProvider appVersionProvider() {
        return () -> "1.2.3.4";
    }

    @Bean
    public AppNameProvider appNameProviderStub() {
        return new AppNameProvider() {

            @Override
            public String getAppName() {
                return "Суперсервис офигенный";
            }

            @Override
            public String getServiceName() {
                return "mega_service";
            }

            @Override
            public String getServiceType() {
                return "report";
            }

        };
    }

    @Bean
    public AppFailedTestProvider appFailedTestProvider() {
        return () -> Collections.singletonList("someTestName");
    }

}

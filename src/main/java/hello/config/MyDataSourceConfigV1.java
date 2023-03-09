package hello.config;

import hello.datasource.MyDataSource;
import hello.datasource.MyDataSourcePropertiesV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
//@EnableConfigurationProperties(MyDataSourcePropertiesV1.class)
public class MyDataSourceConfigV1 {

    private final MyDataSourcePropertiesV1 properties;

    @Bean
    public MyDataSource dataSource() {
        return new MyDataSource(
                properties.getUrl(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getEtc().getMaxConnection(),
                properties.getEtc().getTimeout(),
                properties.getEtc().getOptions());
    }

}

package hello.datasource;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * DataSource 설정 프로퍼티
 *
 * @see ConfigurationProperties
 */
@Data
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV1 {

    /**
     * 접속 DB URL 주소
     */
    private String url;
    private String username;
    private String password;
    private Etc etc = new Etc();

    @Data
    public static class Etc {
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();
    }

}

package bitxon.run;

import bitxon.AccountApplication;
import bitxon.test.TestcontainersConfig;
import org.springframework.boot.SpringApplication;

public class LocalRunner {
    public static void main(String[] args) {
        SpringApplication.from(AccountApplication::main)
            .with(TestcontainersConfig.class)
            .run(args);
    }
}

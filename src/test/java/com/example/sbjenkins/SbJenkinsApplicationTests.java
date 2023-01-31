package com.example.sbjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SbJenkinsApplicationTests {

    @Test
    void contextLoads() {
        assertThat(true).isEqualTo(true);
    }
}

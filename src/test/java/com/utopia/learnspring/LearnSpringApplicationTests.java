package com.utopia.learnspring;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnSpringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void lookMomICanMockStaticMethods() {
//        assertThat(Buddy.name()).isEqualTo("John");

        try (MockedStatic<Buddy> theMock = Mockito.mockStatic(Buddy.class)) {
            theMock.when(Buddy::name).thenReturn("Rafael");

            System.out.println(Buddy.name());
//            assertThat(Buddy.name()).isEqualTo("Rafael");
        }

//        assertThat(Buddy.name()).isEqualTo("John");
    }

}

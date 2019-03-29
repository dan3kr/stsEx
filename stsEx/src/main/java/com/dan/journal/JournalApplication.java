package com.dan.journal;

import com.dan.journal.domain.JournalEntry;
import com.dan.journal.repository.InterfaceTest1;
import com.dan.journal.repository.JournalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JournalApplication {

    public static void main(String[] args) {

        //Logger log = LoggerFactory.getLogger(JournalApplication.class);
        //log.info("aaa : > " + hoho("git 테스트를 위해서 수정한다. 아무의미없다...."));

        SpringApplication.run(JournalApplication.class, args);
    }


    /*
    // spring boot 프레임웍이 abstract void afterPropertiesSet() 가 하나 있는
    // 리턴 타입이 InitializingBean 인 method 를 만나면 응용프로그램을 실행하기전에 Bean (Object 생성) 설정을 한다.
    // 이 Bean (Object 생성) 이 Autowired 를 만나면 injection 된다.
    @Bean
    InitializingBean saveData(JournalRepository repository){
        return () -> {
            repository.save(new JournalEntry("스프링 부트 입문","오늘부터 스프링 부트 공부하기 시작했다","2016-01-01"));
            repository.save(new JournalEntry("간단한 스프링 부트 프로젝트","스프링 부트 프로젝트를 처음 만들어 보았다","2016-01-02"));
            repository.save(new JournalEntry("스프링 부트 해부","스프링 부트를 자세히 살펴보았다","2016-02-01"));
            repository.save(new JournalEntry("스프링 부트 클라우드","클라우드 파운드리를 응용한 스프링 부트를 공부했다","2016-03-01"));
        };
    }

    static InitializingBean haha(String kkk){
        return () -> {
            String str = kkk;
        };
    }

    static InterfaceTest1 hoho(String kkk){
        // Lambda 는 abstract method 가 하나 있는 interface 이다
        // 아래 return () -> {} 은 Lambda 이므로 interface 이다
        // return type 이 String 하나의 abstract method 를 가진 InterfaceTest1 인터페이스를 return 한다.
        return () -> {
            return kkk;
        };
    }

    static String getAAA(String aaa){
        return aaa;
    }
    */

}

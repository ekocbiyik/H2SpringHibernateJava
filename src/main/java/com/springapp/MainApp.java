package com.springapp;

import com.springapp.model.Personel;
import com.springapp.service.IPersonelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by enbiya on 26.10.2016.
 */
public class MainApp {


    public static ApplicationContext applicationContext;

    private static IPersonelService personelService;


    public static void main(String[] args) {

        applicationContext = new ClassPathXmlApplicationContext("hibernate-config.xml");
        personelService = applicationContext.getBean(IPersonelService.class);

        Personel p = new Personel();
        p.setName("tamdgfamdır");
        p.setAge("614345");

        personelService.savePersonel(p);

    }

}

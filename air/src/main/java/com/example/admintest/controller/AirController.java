package com.example.admintest.controller;

import com.example.admintest.MultiModuleTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JavaDoc용 클래스의 용도를 설명합니다
 *
 * @author 서비스INFRA팀 TA파트 장환호
 * @version 1.0
 * <pre>
 * 2020.02.27 : 최초 작성
 * </pre>
 * @since 2020-02-27
 */
@RestController
public class AirController {

    @GetMapping(path = "/air")
    public String getAir() {
        MultiModuleTest multiModuleTest = new MultiModuleTest();
        multiModuleTest.setName("Multi Module Test!!!");
        return multiModuleTest.getName();
    }
}

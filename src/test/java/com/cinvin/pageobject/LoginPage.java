package com.cinvin.pageobject;

import com.cinvin.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Author:Cinvin
//标题
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //手机号输入框
    private By phoneBy=By.name("account");
    //密码输入框
    private  By psdBy=By.name("pass");
    //登录按钮
    private  By loginBy=By.xpath("//div[@class='padding-cont pt-login']/a[@class='btn-btn']");

    //输入账号
    public void typePhone(String phoneNumber){
        type(phoneBy,phoneNumber);
    }
    //输入密码
    public void typepsd(String psd){
        type(psdBy,psd);
    }
    //点击登录
    public void clickLogin(){
        click(loginBy);
    }

}

package com.cinvin.testcases;

import com.cinvin.common.BaseTest;
import com.cinvin.constants.Constants;
import com.cinvin.pageobject.LettelIndexPAge;
import com.cinvin.pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Author:Cinvin
//标题
public class messageCase extends BaseTest {
    @BeforeMethod
    public void setUp(){
        //打开浏览器
        openBrowser(Constants.BROWSER_NAME);
        //打开登录页面
        getUrl(Constants.LOGIN_URL);
        //最大化浏览器
        browserMaxmize();
        //前置操作登录课堂派
        LoginPage loginPage = new LoginPage(driver);
        //输入手机号
        loginPage.typePhone(Constants.PHONE_NUMBER);
        //输入密码
        loginPage.typepsd(Constants.psd);
        //点击登录
        loginPage.clickLogin();
    }
    @Test
    public void sendMessage() throws InterruptedException {
        LettelIndexPAge lettelIndexPAge=new LettelIndexPAge(driver);
        //跳转私信页面
        Thread.sleep(3000);
        getUrl(Constants.LETTER_URL);
        //搜索框中输入姓名
        lettelIndexPAge.typeSearchName(Constants.SEARCH_NAME);
        //输入私信内容
        lettelIndexPAge.typeMessage(Constants.MESSAGE);
        //点击发送
        lettelIndexPAge.clickSend();
        Assert.assertTrue(driver.getPageSource().contains(Constants.MESSAGE));
    }
    @AfterMethod
    public void tearDown(){

    }
}

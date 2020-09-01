package com.cinvin.testcases;

import com.cinvin.common.BaseTest;
import com.cinvin.constants.Constants;
import com.cinvin.pageobject.Indexpage;
import com.cinvin.pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Author:Cinvin
//标题
public class CourseCase extends BaseTest {
    @BeforeMethod
    public void setUp(){
        //打开浏览器
        openBrowser(Constants.BROWSER_NAME);
        //打开登录页面
        getUrl(Constants.LOGIN_URL);
        //浏览器最大化
        browserMaxmize();
        //前置操作登录课堂派
        LoginPage loginPage=new LoginPage(driver);
        //输入手机号
        loginPage.typePhone(Constants.PHONE_NUMBER);
        //输入密码
        loginPage.typepsd(Constants.psd);
        //点击登录
        loginPage.clickLogin();
    }
    @Test
    public void AddCourse(){
        //点击加入课程
        Indexpage indexpage=new Indexpage(driver);
        indexpage.clickAddCourse();
        //输入加课码
        indexpage.typeAddCode(Constants.ADD_CODE);
        //点击加入
        indexpage.clickAddLink();
        //获取提示信息
        String actualtips=indexpage.getTips();
        System.out.println(actualtips);
//        断言
        Assert.assertEquals(actualtips,"加入课堂成功");
    }
    @Test
    public void DropCourse(){
        Indexpage indexpage=new Indexpage(driver);
        //点击更多
        indexpage.clickMore();
        //点击退课
        indexpage.clickDropCourse();
        //输入密码验证
        indexpage.typePsdVerify(Constants.psd);
        //点击确认
        indexpage.clickVerify();
        //获取提示信息
        String actualtips = indexpage.getTips();
        Assert.assertEquals(actualtips,"课程退课成功");

    }
    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }
}

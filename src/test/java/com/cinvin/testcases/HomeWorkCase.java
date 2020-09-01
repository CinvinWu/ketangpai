package com.cinvin.testcases;

import com.cinvin.common.BaseTest;
import com.cinvin.constants.Constants;
import com.cinvin.pageobject.Indexpage;
import com.cinvin.pageobject.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Author:Cinvin
//标题
public class HomeWorkCase extends BaseTest {
    @BeforeMethod
    public void setUp() {
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

        //点击加入课程
        Indexpage indexpage = new Indexpage(driver);
        indexpage.clickAddCourse();
        //输入加课码
        indexpage.typeAddCode(Constants.ADD_CODE);
        //点击加入
        indexpage.clickAddLink();
        //点击课程标题
        indexpage.clickTitle();
        //点击作业
        indexpage.clickTask();
        //点击作业标题
        indexpage.clickTaskTitle();
        //短短是否有更新提交字样
        if (driver.getPageSource().contains("更新提交")) {
            //点击更新提交
            indexpage.clickNewSubmit1();
            //点击确定
            indexpage.clickUpdateSure();
        }
    }
    @Test
    public void FileUpload(){
        Indexpage indexpage=new Indexpage(driver);
        //点击添加作业
        indexpage.clickUpload();
        //上传文件
        indexpage.upLoad();
        //点击留言输入框
        indexpage.clickComment();
        //输入留言
        indexpage.typeComment(Constants.COMMENT);
        //点击保存
        indexpage.clickSave();
        if (driver.getPageSource().contains("更新提交")){
            indexpage.clickNewSubmit2();
        }else {
            //点击提交
            indexpage.clickSubmit();
        }
        //断言
        Assert.assertEquals(indexpage.getSUbmitMessage(),"作业提交成功");
    }
    @AfterMethod
    public void tearDown(){
        getUrl(Constants.INDEX_URL);
        //退课
        Indexpage indexpage=new Indexpage(driver);
        //点击更多
        indexpage.clickMore();
        //点击退课
        indexpage.clickDropCourse();
        //输入密码验证
        indexpage.typePsdVerify(Constants.psd);
        //点击确认
        indexpage.clickVerify();
        //退出浏览器
        quitBrowser();
    }
}

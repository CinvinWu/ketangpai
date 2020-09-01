package com.cinvin.pageobject;

import com.cinvin.common.BasePage;
import com.cinvin.constants.Constants;
import org.openqa.selenium.*;

import java.io.IOException;

//Author:Cinvin
//标题
public class Indexpage extends BasePage {
    public Indexpage(WebDriver driver) {
        super(driver);
    }
    //加入课程
    private By addCourseBy=By.xpath("//div[@class='ktcon cl']//div[text()='+ 加入课程']");
    //加课码输入框
    private By addCodeBy=By.xpath("//input[@placeholder='请输入课程加课验证码']");
    //加入选项
    private By addLinkBy=By.xpath("//a[text()='加入']");
    //提示信息
    private By tipsBy=By.xpath("//div[@class='gTips']");
    //更多
    private By moreBy= By.xpath("//p[text()=' 加课码："+ Constants.ADD_CODE+"']/following-sibling::a/span[text()='更多']");
    //退课
    private By dropCourseBy=By.xpath("//p[text()=' 加课码："+ Constants.ADD_CODE+"']/following-sibling::ul//a[text()='退课']");
    //归档
    private By archiveBy=By.xpath("//p[text()=' 加课码："+ Constants.ADD_CODE+"']/following-sibling::ul//a[text()='归档']");
    //退课时密码验证输入框
    private By psdVerifyBy=By.xpath("//input[@type='password']");
    //退课确认
    private By verifyBy=By.xpath("//div[@class='deletebot cl']//a[text()='退课']");

    //点击加入课程
    public void clickAddCourse(){
        click(addCourseBy);
    }
    //输入加课码
    public void typeAddCode(String addCode){
        type(addCodeBy,addCode);
    }
    //点击加入选项
    public void clickAddLink(){
        click(addLinkBy);
    }
    //获取提示信息
    public String getTips(){
        return getElementText(tipsBy);
    }
    //点击更多
    public void clickMore(){
        click(moreBy);
    }
    //点击退课
    public void clickDropCourse(){
        click(dropCourseBy);
    }
    //退课时输入密码验证
    public void typePsdVerify(String psd){
        type(psdVerifyBy,psd);
    }
    //点击确认
    public void clickVerify(){
        click(verifyBy);
    }

    //课程标题
    private By courseTitleBy=By.xpath("//a[@title='"+Constants.COURSE_TITLE+"']");
    //点击课程标题
    public void clickTitle(){
        click(courseTitleBy);
    }
    //作业
    private By taskBy=By.xpath("//a[text()='作业']");
    //点击作业
    public void clickTask(){
        click(taskBy);
    }
    //作业标题
    private By taskTitleBy=By.xpath("//a[@title='"+Constants.TASK_TITLE+"']");
    //点击作业标题
    public void clickTaskTitle(){
        click(taskTitleBy);
    }
    //添加作业文件
    private By uploadBy=By.xpath("//div[@class='shangchuan']/a");
//    private By uploadBy=By.xpath("//div[text()='添加作业文件']/following-sibling::div");
    //点击添加文件
//    public void clickUpload(){
//        jsClick(uploadBy);
//    }
    public void clickUpload(){
        click(uploadBy);
    }
    //上传文件
    public void upLoad(){
        try {
            Runtime.getRuntime().exec(Constants.getFilePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //留言
    private By commentBy=By.xpath("//span[@class='s2']");
    //点击留言区域
    public void clickComment(){
        click(commentBy);
    }
    //留言输入框
    private By commentAreaBy=By.id("comment");
    //输入留言
    public void typeComment(String comment){
        type(commentAreaBy,comment);
    }
    //保存选项
    private By saveBy=By.xpath("//a[text()='保存']");
    //点击保存
    public void clickSave(){
        click(saveBy);
    }
    //提交按钮
    private By submitBy=By.xpath("//a[@class='tj-btn active']");
    //点击提交
    public void clickSubmit(){
        click(submitBy);
    }
    //作业提交提示信息
    private By submitMessageBy=By.xpath("//div[@class='weui_dialog_bd']");
    public String getSUbmitMessage(){
        return getElementText(submitMessageBy);
    }

    //更新提交1
    private By newSubmit1By=By.xpath("//a[@class='new-tj1']");
    //更新提交2
    private By newSubmit2By=By.xpath("//a[@class='new-tj2 active']");
    //点击更新提交1
    public void clickNewSubmit1(){
        click(newSubmit1By);
    }
    //点击更新提交2
    public void clickNewSubmit2(){
        click(newSubmit2By);
    }
    //更新提交确定选项
    private By updateSureBy=By.xpath("//div[@id='update-pop']/div/a[@class='sure active']");
    //点击确定
    public void clickUpdateSure(){
        click(updateSureBy);
    }
}




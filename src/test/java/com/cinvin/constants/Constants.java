package com.cinvin.constants;

//Author:Cinvin
//标题
public class Constants {
    //浏览器
    public static final String BROWSER_NAME="chrome";
    //课堂派主页
    public static String INDEX_URL="https://www.ketangpai.com/Main/index.html";
    //课堂派登录页
    public static String LOGIN_URL="https://www.ketangpai.com/User/login.html";
    //私信页面
    public static String LETTER_URL="https://www.ketangpai.com/Letter/index.html";
    //课堂派账号
    public static String PHONE_NUMBER="18707164383";
    //课堂派密码
    public static String psd="0110019591wxw";
    //加课码
    public static String ADD_CODE="7J6JC7";
    //课程名称
    public static String COURSE_TITLE="Java-Web阶段考核项目专用";
    //作业标题
    public static String TASK_TITLE="web自动化测试3";
    //获取路径
    public static String getFilePath(){
        String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\UploadFile.exe";
        return filePath;
    }
    //留言
    public static String COMMENT="测试";
    //私信搜索的姓名
    public static String SEARCH_NAME="乔木";
    //私信内容
    public static String MESSAGE="web自动化测试";
}

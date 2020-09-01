package com.cinvin.pageobject;

import com.cinvin.common.BasePage;
import com.cinvin.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Author:Cinvin
//标题
public class LettelIndexPAge extends BasePage {

    public LettelIndexPAge(WebDriver driver) {
        super(driver);
    }
    //搜索输入框
    private By searchBy=By.xpath("//div[@class='search-box']/input");
    //输入要私信的人
    public void typeSearchName(String searchName){
        type(searchBy,searchName);
    }
    //显示列表的会话
    private By listNameBy=By.xpath("//span[text()='"+ Constants.SEARCH_NAME+"']");
    //点击显示列表的会话
    public void clickListName(){
        click(listNameBy);
    }
    //文本输入框
    private By textAreaBy=By.xpath("//textarea[@class='ps-container']");
    //输入私信内容
    public void typeMessage(String message){
        type(textAreaBy,message);
    }
    //发送
    private By sendBy=By.xpath("//a[@class='btn btn-positive']");
    //点击发送
    public void clickSend(){
        click(sendBy);
    }

}

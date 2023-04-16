package com.tanke.util;
//游戏常量类

import java.awt.*;

public class Constant {
    /******游戏窗口相关********/
    public static final String GAME_TITLE="坦克大战";

    public static final int FRAME_WIDTH=900;
    public static final int FRAME_HEIGHT=700;

    public static final int FRAME_X=1920- FRAME_WIDTH>>1;
    public static final int FRAME_Y=1080-FRAME_HEIGHT>>1;




    /******游戏菜单相关********/
    public static final int STATE_MENU=0;
    public static final int STATE_HELP=1;
    public static final int STATE_ABOUT=2;
    public static final int STATE_RUM=3;
    public static final int STATE_OVER=4;

    public static final String[]MENUS={
            "开始游戏",
            "继续游戏",
            "游戏帮助",
            "游戏关于",
            "退出游戏",

    };
    //字体
    public static final Font GAME_FONT=new Font("宋体",Font.BOLD,24);







}

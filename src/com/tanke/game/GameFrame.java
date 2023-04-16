package com.tanke.game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//游戏主窗口
import static com.tanke.util.Constant.*;

public class GameFrame extends Frame {
    //游戏状态
    public static int gameState;

    //窗口初始化
    public GameFrame() {
        initFrame();
        initEventListener();
    }

    //对游戏进行初始化
    private void initGame() {
        gameState = STATE_MENU;

    }

    //属性初始化
    private void initFrame() {
        //设置标题
        setTitle(GAME_TITLE);
        //设置窗体大小
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //设置窗口的左上角坐标(居中显示)
        setLocation(FRAME_X, FRAME_Y);
        //设置窗口大小不可改变
        setResizable(false);


        //设置窗口可见
        setVisible(true);
        while (true) {

            repaint();
        }
    }
        //初始化窗口的事件监听
        private void initEventListener () {
            //注册窗口监听事件
            addWindowListener(new WindowAdapter() {
                //点击关闭按钮的时候方法会被自动调用
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);//结束
                }
            });

        }
        //是Frame类的方法，继承下来的方法
        //该方法负责所有的绘制内容，所有需要屏幕中显示的
        //内容 都要在该方法内调用，该方法不能主动调用。必须通过调用repaint();去回调该方法
        public void update (Graphics g){
            g.setFont(GAME_FONT);
            switch (gameState) {
                case STATE_MENU:
                    dramMenu(g);
                    break;
                case STATE_ABOUT:
                    drawAbout(g);
                    break;
                case STATE_HELP:
                    drawHelp(g);
                    break;
                case STATE_OVER:
                    drawOver(g);
                    break;
                case STATE_RUM:
                    drawRum(g);
                    break;
            }
        }

    private void drawRum (Graphics g){

    }

    private void drawOver (Graphics g){

    }

    private void drawHelp (Graphics g){

    }

    private void drawAbout (Graphics g){
    }

    //绘制菜单状态下的方法
    //@param g画笔对象，系统提供的
    private void dramMenu (Graphics g){
        //绘制黑色的背景
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        final int STR_WIDTH = 76;
        int x = FRAME_WIDTH - STR_WIDTH >> 1;
        int y = FRAME_HEIGHT / 3;
        final int DIS = 50;

        g.setColor(Color.white);
        for (int i = 0; i < MENUS.length; i++) {
            g.drawString(MENUS[i], x, y + DIS * i);
        }
    }
    }

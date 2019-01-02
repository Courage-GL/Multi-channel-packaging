package com.example.thunderdbot.myapplication;



/**
 * Created by guesswhoami on 2017/8/10.
 */

public class ENV {

    /**
     * 当release == true时，为上线releasehost，
     * 当release == false,packageType == 1 时，testhost
     * 当release == false,packageType != 1 时，PreReleaseHost
     */
    private final static int ip = 56;
    private final static int packageType = 0;
    public static boolean release = false;

//    private final static String TestHost = "http://192.168.89.164:8081/sound-recycle-app";// java胡瑞树 本机ip 其他接口
//    private final static String TestHost = "http://192.168.88.154:8080/recycle-app";// java赵明 本机ip 其他接口
//    private final static String TestHost = "http://192.168.43.62:8089/sound-recycle-app";// java杨延顺 本机ip  测验证码，换手机号接口
//    private final static String TestHost = "http://192.168.109.48:5592/recycle-app";//测试环境
    private final static String TestHost = "http://124.204.40.228:8083/recycle-app";//2018.08.29演示包
    private final static String PreReleaseHost = "http://192.168.100.121:8080/recycle-app";//预上线环境
    private final static String ReleaseHost = "http://app.haoleiok.com/recycle-app";//正式环境
    private final static String TestImageHost = "http://192.168.100.165";//测试环境
    private final static String PreReleaseImageHost = "http://192.168.100.121:8080/recycle-app";//预上线环境
    private final static String ReleaseImageHost = "http://192.168.100.121:8080/recycle-app";//正式环境

    public static String getHttpHost() {
//        if (BuildConfig.ENV_TYPE == 1) {
//            return TestHost;
//        } else if (BuildConfig.ENV_TYPE == 2) {
//            return PreReleaseHost;
//        } else if (BuildConfig.ENV_TYPE == 3) {
//            return ReleaseHost;
//        }
        return ReleaseHost;
    }

    public static String getImageHost() {
//        if (BuildConfig.ENV_TYPE == 1) {
//            return TestImageHost;
//        } else if (BuildConfig.ENV_TYPE == 2) {
//            return PreReleaseImageHost;
//        } else if (BuildConfig.ENV_TYPE == 3) {
//            return ReleaseImageHost;
//        }
        return ReleaseImageHost;
    }

}

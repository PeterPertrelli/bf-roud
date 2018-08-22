package com.zxf.steps;

import com.zxf.util.FileDownloadTool;

/**
 * @author zhuxiangfei
 * @Description:
 * @date 2018/8/22
 */
public class ADownload {
    public static void main(String[] args) {

        System.out.println(" download begin...");
        FileDownloadTool.download("http://www.17500.cn/getData/ssq.TXT", "F:/study/resource/bfroud", "ssq.TXT");
        System.out.println(" download done...");

    }
}

package com.zxf.steps;

import com.zxf.demo.AFileLoader;
import com.zxf.machine.LoadDataProcessMachine;
import com.zxf.module.PrepareDataModelProcess;

/**
 * @author zhuxiangfei
 * @Description:
 * @date 2018/8/22
 */
public class BAnalyse {
    public static void main(String[] args) {
        PrepareDataModelProcess dataModel = new PrepareDataModelProcess();
        LoadDataProcessMachine.exec(dataModel);
        System.out.println("==================================================");


        System.out.println(dataModel.getLotteryList().get(200).getSixThPrizeCount());
        System.out.println(dataModel.getLotteryList().get(200).getSixThPrizeAmount());


    }
}

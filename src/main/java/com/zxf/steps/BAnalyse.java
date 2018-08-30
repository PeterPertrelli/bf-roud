package com.zxf.steps;

import com.zxf.demo.AFileLoader;
import com.zxf.machine.LoadDataProcessMachine;
import com.zxf.module.PrepareDataModelProcess;
import com.zxf.strategy.Exp1;

/**
 * @author zhuxiangfei
 * @Description:
 * @date 2018/8/22
 */
public class BAnalyse {
    public static void main(String[] args) {
        PrepareDataModelProcess dataModel = new PrepareDataModelProcess();
        LoadDataProcessMachine.exec(dataModel);
        System.out.println("            start                   ");

        Exp1.process(dataModel.getLotteryList());



        System.out.println("            end                   ");





    }
}

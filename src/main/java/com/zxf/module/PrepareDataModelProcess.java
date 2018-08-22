package com.zxf.module;

import com.zxf.process.LoadDataProcess;
import com.zxf.tool.DateUtil;
import com.zxf.vo.Lottery;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxiangfei
 * @Description:
 * @date 2018/8/22
 */
public class PrepareDataModelProcess implements LoadDataProcess {

    private List<Lottery> lotteryList = new ArrayList<>();

    public List<Lottery> getLotteryList() {
        return lotteryList;
    }

    @Override
    public List<String> prepareSrcFileListPath() {
        List<String> fileList = new ArrayList<String>();
        fileList.add("F:/study/resource/bfroud/ssq.TXT");
        return fileList;
    }

    @Override
    public boolean need(String s) {
        return true;
    }

    @Override
    public void prepareData(String s, String s1) {
        String[] strArr = s.split(" ");
        Lottery lottery = new Lottery();
        int i = 0;
        lottery.setSeq(Long.parseLong(strArr[i++]));
        lottery.setDate(DateUtil.toDate(strArr[i++],DateUtil.SIMPLE_DATE_FORMAT));
        lottery.setRed1(Long.parseLong(strArr[i++]));
        lottery.setRed2(Long.parseLong(strArr[i++]));
        lottery.setRed3(Long.parseLong(strArr[i++]));
        lottery.setRed4(Long.parseLong(strArr[i++]));
        lottery.setRed5(Long.parseLong(strArr[i++]));
        lottery.setRed6(Long.parseLong(strArr[i++]));
        lottery.setBlue(Long.parseLong(strArr[i++]));
        lottery.setRed1st(Long.parseLong(strArr[i++]));
        lottery.setRed2en(Long.parseLong(strArr[i++]));
        lottery.setRed3ird(Long.parseLong(strArr[i++]));
        lottery.setRed4ourth(Long.parseLong(strArr[i++]));
        lottery.setRed5ifth(Long.parseLong(strArr[i++]));
        lottery.setRed6ixth(Long.parseLong(strArr[i++]));
        lottery.setBetAmount(Long.parseLong(strArr[i++]));
        lottery.setPondAmount(Long.parseLong(strArr[i++]));
        lottery.setFirstPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setFirstPrizeAmount(Long.parseLong(strArr[i++]));
        lottery.setSecondPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setSecondPrizeAmount(Long.parseLong(strArr[i++]));
        lottery.setThirdPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setThirdPrizeAmount(Long.parseLong(strArr[i++]));
        lottery.setFourthPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setFourthPrizeAmount(Long.parseLong(strArr[i++]));
        lottery.setFifthPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setFifthPrizeAmount(Long.parseLong(strArr[i++]));
        lottery.setSixThPrizeCount(Long.parseLong(strArr[i++]));
        lottery.setSixThPrizeAmount(Long.parseLong(strArr[i++]));
        this.lotteryList.add(lottery);
    }
}

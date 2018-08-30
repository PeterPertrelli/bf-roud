package com.zxf.strategy;

import com.zxf.vo.Lottery;

import java.util.*;

/**
 * @author zhuxiangfei
 * @Description:
 * @date 2018/8/30
 */
public class Exp1 {
    private static Map<Long, Set<Long>> blueExceptMap = new HashMap<>();
    static {
        blueExceptMap.put(1L, newSet());
        blueExceptMap.put(2L, newSet());
        blueExceptMap.put(3L, newSet());
        blueExceptMap.put(4L, newSet());
        blueExceptMap.put(5L, newSet());
        blueExceptMap.put(6L, newSet());
        blueExceptMap.put(7L, newSet());
        blueExceptMap.put(8L, newSet());
        blueExceptMap.put(9L, newSet());
        blueExceptMap.put(0L, newSet());
    }
    public static Set<Long> newSet(){
        Set<Long> argList = new HashSet<>();
        return argList;
    }
    public static void process(List<Lottery> lotteryList){

        Long beforeBlue = null;
        Set<Long> argSet = null;

        try{
            for(Lottery lottery : lotteryList){
                if(null == beforeBlue){
                    beforeBlue = lottery.getBlue();
                    continue;
                }
                argSet = blueExceptMap.get(beforeBlue%10);

//            System.out.println("before is "+beforeBlue+"    "+(beforeBlue%10)+" next is not in "+argList);

                argSet.add(lottery.getBlue());

                argSet = null;
                beforeBlue = lottery.getBlue();
            }
        }catch (Exception e){
            System.out.println("Exception before is "+beforeBlue+"    "+(beforeBlue%10)+" next is not in "+argSet);
        }

        System.out.println("===============================");
        if(blueExceptMap.size() == 0){
            System.out.println("All except rule is down!");
        }else{
            for(Map.Entry<Long, Set<Long>> entry : blueExceptMap.entrySet()){
                System.out.println("before is "+entry.getKey()+" next is in "+entry.getValue());
            }
        }
        System.out.println("===============================");


    }
}

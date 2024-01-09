package com.ouc.tcp.test;

import java.util.zip.CRC32;

import com.ouc.tcp.message.TCP_HEADER;
import com.ouc.tcp.message.TCP_PACKET;

public class CheckSum {

    /*计算TCP报文段校验和：只需校验TCP首部中的seq、ack和sum，以及TCP数据字段*/
    /* 这个版本的校验和都为0 不用担心数据的错误问题*/
    public static short computeChkSum(TCP_PACKET tcpPack) {
        int checkSum = 0;
        return (short) checkSum;
    }

}

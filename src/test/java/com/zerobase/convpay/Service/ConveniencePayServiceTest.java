package com.zerobase.convpay.Service;

import com.zerobase.convpay.dto.ConvenienceType;
import com.zerobase.convpay.dto.PayRequest;
import com.zerobase.convpay.dto.PayResponse;
import com.zerobase.convpay.dto.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {

    ConveniencePayService conveniencePayService = new ConveniencePayService();


    @Test
    void pay() {
        //given
        PayRequest payRequest = new PayRequest(ConvenienceType.G25, 100);

        //when
        PayResponse pay = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.SUCCESS, pay.getPayResult());
        assertEquals(100, pay.getPaidAmount());

    }


    @Test
    void payCancel() {
    }
}
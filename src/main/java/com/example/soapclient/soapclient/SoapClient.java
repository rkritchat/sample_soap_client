package com.example.soapclient.soapclient;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class SoapClient {

    public String convertNumberToWord(String number){
        NumberConversion service = new NumberConversion();
        NumberConversionSoapType stub = service.getNumberConversionSoap();
        return stub.numberToWords(new BigInteger(number));
    }

}

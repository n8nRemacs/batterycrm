package com.huawei.agconnect.config.a;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* loaded from: classes7.dex */
public final class k {
    public static com.huawei.agconnect.a a(String str, String str2) {
        com.huawei.agconnect.a aVar = com.huawei.agconnect.a.f363130c;
        com.huawei.agconnect.a aVar2 = com.huawei.agconnect.a.f363131d;
        com.huawei.agconnect.a aVar3 = com.huawei.agconnect.a.f363132e;
        com.huawei.agconnect.a aVar4 = com.huawei.agconnect.a.f363133f;
        if (str != null) {
            switch (str) {
                case "CN":
                    return aVar;
                case "DE":
                    return aVar2;
                case "RU":
                    return aVar3;
                case "SG":
                    return aVar4;
            }
        }
        if (str2 != null) {
            if (str2.contains("connect-drcn")) {
                return aVar;
            }
            if (str2.contains("connect-dre")) {
                return aVar2;
            }
            if (str2.contains("connect-drru")) {
                return aVar3;
            }
            if (str2.contains("connect-dra")) {
                return aVar4;
            }
        }
        return com.huawei.agconnect.a.f363129b;
    }

    public static String b(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Constants.ENCODING);
        char[] cArr = new char[4096];
        while (true) {
            int i12 = inputStreamReader.read(cArr);
            if (-1 == i12) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i12);
        }
    }

    public static String c(String str) {
        int i12 = 0;
        if (str.length() > 0) {
            while (str.charAt(i12) == '/') {
                i12++;
            }
        }
        return "/" + str.substring(i12);
    }
}

package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class je1 {
    @Y61.l
    public static ie1 a(@Y61.k String str) {
        Integer numY0;
        int length = str.length();
        int i12 = 0;
        while (true) {
            if (i12 < length) {
                if (str.charAt(i12) == '-') {
                    str = str.substring(0, i12);
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        List listE0 = C43066x.e0(str, new char[]{'.'});
        String str2 = (String) C42745f0.K(0, listE0);
        if (str2 != null && (numY0 = C43066x.y0(str2)) != null) {
            int iIntValue = numY0.intValue();
            Integer numY02 = C43066x.y0((String) (1 <= listE0.size() - 1 ? listE0.get(1) : "0"));
            if (numY02 != null) {
                int iIntValue2 = numY02.intValue();
                Integer numY03 = C43066x.y0((String) (2 <= listE0.size() - 1 ? listE0.get(2) : "0"));
                if (numY03 != null) {
                    return new ie1(iIntValue, iIntValue2, numY03.intValue());
                }
            }
        }
        return null;
    }
}

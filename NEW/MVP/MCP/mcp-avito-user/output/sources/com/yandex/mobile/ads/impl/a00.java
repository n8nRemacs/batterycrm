package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a00 {
    @j.P
    public static AdImpressionData a(@j.N Map map) {
        String str = (String) map.get(i10.b(9));
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new AdImpressionData(str);
    }
}

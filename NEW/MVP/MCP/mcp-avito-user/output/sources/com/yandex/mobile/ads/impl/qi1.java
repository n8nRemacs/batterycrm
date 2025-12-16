package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
final class qi1 {
    @j.N
    public static String a(@j.N String str, @j.N Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }
}

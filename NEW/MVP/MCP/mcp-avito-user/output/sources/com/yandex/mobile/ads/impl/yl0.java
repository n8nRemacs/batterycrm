package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class yl0 {
    public static long a(@j.N AdResponse adResponse) {
        y6 y6VarM = adResponse.m();
        Long lT2 = adResponse.t();
        if (lT2 == null) {
            lT2 = y6VarM == y6.f391937d ? 5000L : 0L;
        }
        return lT2.longValue();
    }
}

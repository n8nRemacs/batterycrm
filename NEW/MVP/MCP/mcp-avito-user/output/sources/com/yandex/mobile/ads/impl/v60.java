package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;

/* loaded from: classes8.dex */
public final class v60 {
    @j.N
    public static o60 a(@j.N InstreamAd instreamAd) {
        if (instreamAd instanceof o60) {
            return (o60) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}

package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.h60;
import j.K;

@K
/* loaded from: classes8.dex */
public final class MobileInstreamAds {
    private MobileInstreamAds() {
    }

    public static void setAdGroupPreloading(boolean z12) {
        h60.a().a(z12);
    }

    public static void setControlsEnabled(boolean z12) {
        h60.a().b(z12);
    }

    public static void setDiscardAdGroupOnSkip(boolean z12) {
        h60.a().c(z12);
    }
}

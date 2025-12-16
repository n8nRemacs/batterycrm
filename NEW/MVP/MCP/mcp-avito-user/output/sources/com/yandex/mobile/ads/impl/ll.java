package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ll implements zd {
    @Override // com.yandex.mobile.ads.impl.zd
    public final int a(@Y61.k Context context, int i12) {
        float fC2 = kotlin.ranges.s.c(100.0f, rj1.b(context) * 0.15f);
        int iA2 = i12 > 655 ? kotlin.math.b.a((i12 / 728.0d) * 90.0d) : i12 > 632 ? 81 : i12 > 526 ? kotlin.math.b.a((i12 / 468.0d) * 60.0d) : i12 > 432 ? 68 : kotlin.math.b.a((i12 / 320.0d) * 50.0d);
        int i13 = (int) fC2;
        if (iA2 > i13) {
            iA2 = i13;
        }
        if (iA2 < 50) {
            return 50;
        }
        return iA2;
    }
}

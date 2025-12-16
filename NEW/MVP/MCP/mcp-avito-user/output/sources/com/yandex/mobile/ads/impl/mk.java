package com.yandex.mobile.ads.impl;

import android.graphics.Color;

/* loaded from: classes8.dex */
public final class mk {
    @X41.n
    public static final int a(@Y61.l String str) {
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return -16777216;
        }
    }
}

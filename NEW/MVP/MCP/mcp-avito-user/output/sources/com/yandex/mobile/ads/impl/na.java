package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.j20;

/* loaded from: classes8.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    @SuppressLint({"StaticFieldLeak"})
    private static volatile j20 f388195a;

    @X41.n
    @Y61.k
    public static final j20 a(@Y61.k Context context) {
        if (f388195a == null) {
            synchronized (j20.a.a()) {
                try {
                    if (f388195a == null) {
                        f388195a = new j20(context.getApplicationContext());
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f388195a;
    }
}

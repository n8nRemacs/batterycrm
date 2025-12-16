package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ty {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private static volatile sy f390334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f390335b = new Object();

    @X41.n
    @Y61.k
    public static final sy a(@Y61.k Context context) {
        if (f390334a == null) {
            synchronized (f390335b) {
                try {
                    if (f390334a == null) {
                        f390334a = new sy(y90.a(context));
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        sy syVar = f390334a;
        if (syVar != null) {
            return syVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

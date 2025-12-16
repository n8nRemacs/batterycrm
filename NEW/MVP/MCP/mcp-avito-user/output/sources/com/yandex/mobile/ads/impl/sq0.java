package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class sq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private static volatile rq0 f390012a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f390013b = new Object();

    @X41.n
    @Y61.k
    public static final rq0 a(@Y61.k Context context) {
        if (f390012a == null) {
            synchronized (f390013b) {
                try {
                    if (f390012a == null) {
                        f390012a = new rq0(y90.a(context));
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        rq0 rq0Var = f390012a;
        if (rq0Var != null) {
            return rq0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

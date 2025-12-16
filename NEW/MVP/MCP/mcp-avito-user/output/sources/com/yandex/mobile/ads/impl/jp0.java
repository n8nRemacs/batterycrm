package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class jp0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private static final Object f386946a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile bz0 f386947b;

    @j.N
    public static bz0 a(@j.N Context context) {
        if (f386947b == null) {
            synchronized (f386946a) {
                try {
                    if (f386947b == null) {
                        f386947b = cz0.a(context, 1);
                        f386947b.a();
                    }
                } finally {
                }
            }
        }
        return f386947b;
    }
}

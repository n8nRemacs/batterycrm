package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class wy {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f391511a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile my f391512b;

    @j.N
    public static ea0 a(@j.N Context context) {
        if (f391512b == null) {
            synchronized (f391511a) {
                try {
                    if (f391512b == null) {
                        f391512b = new my(context, "com.google.android.gms.location.LocationServices");
                    }
                } finally {
                }
            }
        }
        return f391512b;
    }
}

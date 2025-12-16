package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class kz {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f387332a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile my f387333b;

    @j.N
    public static ea0 a(@j.N Context context) {
        if (f387333b == null) {
            synchronized (f387332a) {
                try {
                    if (f387333b == null) {
                        f387333b = new my(context, "com.huawei.hms.location.LocationServices");
                    }
                } finally {
                }
            }
        }
        return f387333b;
    }
}

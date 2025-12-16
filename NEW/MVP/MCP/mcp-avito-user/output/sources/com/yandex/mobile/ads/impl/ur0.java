package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class ur0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f390617a = "Yandex";

    /* renamed from: b, reason: collision with root package name */
    private final String f390618b = "6.0.1";

    private ur0() {
    }

    public static ur0 a() {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("6.0.1")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new ur0();
    }

    public final String b() {
        return this.f390617a;
    }

    public final String c() {
        return this.f390618b;
    }
}

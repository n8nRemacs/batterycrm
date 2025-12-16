package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public final class f20 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f385154a = new AtomicLong();

    public static long a() {
        return f385154a.getAndIncrement();
    }
}

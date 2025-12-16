package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public final class q90 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f389116a = new AtomicLong();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q90(long j12, kn knVar, long j13) {
        this();
        Uri uri = knVar.f387192a;
        Collections.emptyMap();
    }

    public static long a() {
        return f389116a.getAndIncrement();
    }

    public q90() {
    }
}

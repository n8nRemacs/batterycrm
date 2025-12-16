package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
public final class mj0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f388011a;

    public mj0(String str) {
        this.f388011a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@j.N Runnable runnable) {
        return new Thread(runnable, this.f388011a);
    }
}

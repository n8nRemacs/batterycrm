package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class j41 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f386764a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f386765b;

    public final void a(@j.N Runnable runnable) {
        synchronized (this.f386764a) {
            try {
                if (this.f386765b) {
                    return;
                }
                this.f386765b = true;
                runnable.run();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

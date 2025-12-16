package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class dh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qy0 f384603b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eh f384604c;

    public dh(eh ehVar, qy0 qy0Var) {
        this.f384604c = ehVar;
        this.f384603b = qy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f384604c.f384928c.put(this.f384603b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;

/* loaded from: classes8.dex */
final class v31 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConditionVariable f390788b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w31 f390789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(w31 w31Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f390789c = w31Var;
        this.f390788b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f390789c) {
            this.f390788b.open();
            w31.a(this.f390789c);
            this.f390789c.f391274b.getClass();
        }
    }
}

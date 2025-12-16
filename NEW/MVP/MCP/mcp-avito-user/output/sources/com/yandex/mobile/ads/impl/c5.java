package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class c5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private q00 f384175b;

    public final void a(@j.P q00 q00Var) {
        this.f384175b = q00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q00 q00Var = this.f384175b;
        if (q00Var != null) {
            q00Var.a(i5.f386318j);
        }
    }
}

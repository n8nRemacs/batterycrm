package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class ml1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final int f388024b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f388025c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final r00 f388026d;

    public ml1(int i12, @j.P String str, @j.N r00 r00Var) {
        this.f388024b = i12;
        this.f388025c = str;
        this.f388026d = r00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((j00) this.f388026d).a(this.f388024b, this.f388025c);
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class bk1 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ag1 f383974a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final aj1 f383975b;

    public bk1(@j.N kn0 kn0Var, @j.N lo0 lo0Var) {
        this.f383974a = kn0Var;
        this.f383975b = qi0.a(lo0Var);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        if (this.f383975b.a()) {
            if (this.f383974a.isPlayingAd()) {
                return;
            }
            this.f383974a.c();
        } else if (this.f383974a.isPlayingAd()) {
            this.f383974a.a();
        }
    }
}

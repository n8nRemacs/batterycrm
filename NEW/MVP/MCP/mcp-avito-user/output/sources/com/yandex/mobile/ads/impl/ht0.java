package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ht0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final wt f386211a;

    public ht0(@j.N wt wtVar) {
        this.f386211a = wtVar;
    }

    public final void a() {
        com.google.android.exoplayer2.d0 d0VarA = this.f386211a.a();
        if (d0VarA != null) {
            d0VarA.setPlayWhenReady(false);
        }
    }

    public final void b() {
        com.google.android.exoplayer2.d0 d0VarA = this.f386211a.a();
        if (d0VarA != null) {
            d0VarA.setPlayWhenReady(true);
        }
    }
}

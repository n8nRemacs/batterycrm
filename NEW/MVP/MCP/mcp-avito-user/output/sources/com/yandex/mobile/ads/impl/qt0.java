package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class qt0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final wt f389293a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Float f389294b;

    public qt0(@j.N wt wtVar) {
        this.f389293a = wtVar;
    }

    public final void a(float f12) {
        if (this.f389294b == null) {
            this.f389294b = a();
        }
        com.google.android.exoplayer2.d0 d0VarA = this.f389293a.a();
        if (d0VarA != null) {
            d0VarA.setVolume(f12);
        }
    }

    public final void b() {
        Float f12 = this.f389294b;
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            com.google.android.exoplayer2.d0 d0VarA = this.f389293a.a();
            if (d0VarA != null) {
                d0VarA.setVolume(fFloatValue);
            }
        }
        this.f389294b = null;
    }

    @j.P
    public final Float a() {
        com.google.android.exoplayer2.d0 d0VarA = this.f389293a.a();
        if (d0VarA != null) {
            return Float.valueOf(d0VarA.getVolume());
        }
        return null;
    }
}

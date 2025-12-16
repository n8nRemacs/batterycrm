package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class zf1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ri1 f392252a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f392253b;

    public zf1(@j.N ag1 ag1Var, @j.N ri1 ri1Var) {
        this.f392252a = ri1Var;
        this.f392253b = ag1Var.getVolume() == 0.0f;
    }

    public final void a(float f12) {
        if (f12 == 0.0f) {
            if (this.f392253b) {
                return;
            }
            this.f392253b = true;
            this.f392252a.l();
            return;
        }
        if (this.f392253b) {
            this.f392253b = false;
            this.f392252a.a();
        }
    }
}

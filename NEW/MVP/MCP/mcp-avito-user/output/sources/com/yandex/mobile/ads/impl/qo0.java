package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class qo0 implements hx, so0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ro0 f389274a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private k2 f389275b;

    public qo0(@j.N ro0 ro0Var, @j.N k2 k2Var) {
        this.f389274a = ro0Var;
        this.f389275b = k2Var;
    }

    private void b() {
        this.f389274a.b(this);
        this.f389275b = null;
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void a(boolean z12) {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f389274a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void a() {
        k2 k2Var = this.f389275b;
        if (k2Var != null) {
            k2Var.b();
        }
        b();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
    }
}

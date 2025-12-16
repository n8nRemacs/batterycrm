package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class po0 implements hx, so0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ro0 f388915a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wj f388916b;

    public po0(@j.N ro0 ro0Var, @j.N wj wjVar) {
        this.f388915a = ro0Var;
        this.f388916b = wjVar;
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        this.f388915a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f388915a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.so0
    public final void a(boolean z12) {
        if (z12) {
            return;
        }
        this.f388916b.a();
        this.f388915a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
final class rn0 implements hx, xn0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sn0 f389579a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private k2 f389580b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Long f389581c;

    public rn0(@j.N AdResponse adResponse, @j.N sn0 sn0Var, @j.N k2 k2Var) {
        this.f389579a = sn0Var;
        this.f389580b = k2Var;
        this.f389581c = adResponse.D();
    }

    private void c() {
        this.f389579a.b(this);
        this.f389580b = null;
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a(long j12, long j13) {
        Long l12 = this.f389581c;
        if (l12 == null || j13 <= l12.longValue()) {
            return;
        }
        k2 k2Var = this.f389580b;
        if (k2Var != null) {
            k2Var.b();
        }
        c();
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void b() {
        k2 k2Var = this.f389580b;
        if (k2Var != null) {
            k2Var.b();
        }
        c();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void invalidate() {
        c();
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void start() {
        this.f389579a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xn0
    public final void a() {
        k2 k2Var = this.f389580b;
        if (k2Var != null) {
            k2Var.a();
            this.f389580b = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.hx
    public final void resume() {
    }
}

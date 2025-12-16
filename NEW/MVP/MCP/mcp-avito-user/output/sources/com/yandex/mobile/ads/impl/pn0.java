package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* loaded from: classes8.dex */
public final class pn0 implements un0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final in0 f388895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ho0 f388896b;

    public pn0(@Y61.k du duVar, @Y61.k ho0 ho0Var) {
        this.f388895a = duVar;
        this.f388896b = ho0Var;
    }

    public final void a() {
        ((du) this.f388895a).a(this.f388896b.c());
    }

    public final void b() {
        this.f388896b.b().a().clearAnimation();
        ((du) this.f388895a).a((TextureView) null);
    }
}

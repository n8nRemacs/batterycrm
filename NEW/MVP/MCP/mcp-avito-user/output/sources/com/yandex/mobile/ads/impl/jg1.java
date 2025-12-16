package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class jg1<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final jw0 f386854a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final fv0 f386855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final id1<T> f386856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final wj1<T> f386857d;

    public jg1(@Y61.k Context context, @Y61.k ff1<T> ff1Var, @Y61.k yi1 yi1Var, @Y61.k qg1 qg1Var, @Y61.k ri1 ri1Var, @Y61.k qf1<T> qf1Var) {
        this.f386854a = new jw0(ri1Var);
        this.f386855b = new fv0(context, ff1Var);
        this.f386856c = new id1<>(ff1Var, yi1Var, ri1Var, qf1Var);
        this.f386857d = new wj1<>(ff1Var, yi1Var, qg1Var, ri1Var, qf1Var);
    }

    public final void a(@Y61.k hg1 hg1Var) {
        hg1Var.a(this.f386854a, this.f386855b, this.f386856c, this.f386857d);
        hg1Var.a(this.f386857d);
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class a70 implements ei1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final zi1 f383427a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final c70 f383428b;

    public a70(@Y61.k p60 p60Var, @Y61.k ff1 ff1Var, @Y61.k qg1 qg1Var, @Y61.k b70 b70Var) {
        this.f383427a = new zi1(b70Var);
        this.f383428b = new c70(qg1Var, p60Var, ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ei1
    public final boolean a() {
        return this.f383428b.a() && this.f383427a.a();
    }
}

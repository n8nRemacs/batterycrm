package com.yandex.mobile.ads.impl;

import java.util.Set;

/* loaded from: classes8.dex */
public final class qg1 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f389164c = {kotlin.jvm.internal.m0.f406844a.e(new kotlin.jvm.internal.Y(qg1.class, "status", "getStatus()Lcom/yandex/mobile/ads/instream/status/VideoAdStatus;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Set<pg1> f389165a = kotlin.collections.b1.g(pg1.f388821a);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a f389166b;

    public static final class a extends kotlin.properties.e<pg1> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ qg1 f389167a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(qg1 qg1Var) {
            pg1 pg1Var = pg1.f388821a;
            this.f389167a = qg1Var;
            super(pg1Var);
        }

        @Override // kotlin.properties.e
        public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, pg1 pg1Var, pg1 pg1Var2) {
            this.f389167a.f389165a.add(pg1Var2);
        }
    }

    public qg1() {
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f389166b = new a(this);
    }

    public final void b(@Y61.k pg1 pg1Var) {
        this.f389166b.setValue(this, f389164c[0], pg1Var);
    }

    @Y61.k
    public final pg1 a() {
        return this.f389166b.getValue(this, f389164c[0]);
    }

    public final void b() {
        this.f389165a.clear();
        b(pg1.f388821a);
    }

    public final boolean a(@Y61.k pg1 pg1Var) {
        return this.f389165a.contains(pg1Var);
    }
}

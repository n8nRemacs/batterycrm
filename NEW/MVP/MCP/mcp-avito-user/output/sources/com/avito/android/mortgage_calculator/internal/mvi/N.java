package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.util.R0;

/* compiled from: CalculatorActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class N implements dagger.internal.h<C32739a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.builder.f f204450a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.entity.e f204451b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.analytics.c f204452c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f204453d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.domain.d f204454e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.domain.f f204455f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f204456g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f204457h;

    public N(com.avito.android.mortgage_calculator.internal.mvi.builder.f fVar, com.avito.android.mortgage_calculator.internal.mvi.entity.e eVar, com.avito.android.mortgage_calculator.internal.analytics.c cVar, dagger.internal.u uVar, com.avito.android.mortgage_calculator.internal.mvi.domain.d dVar, com.avito.android.mortgage_calculator.internal.mvi.domain.f fVar2, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f204450a = fVar;
        this.f204451b = eVar;
        this.f204452c = cVar;
        this.f204453d = uVar;
        this.f204454e = dVar;
        this.f204455f = fVar2;
        this.f204456g = uVar2;
        this.f204457h = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage_calculator.internal.mvi.builder.d dVar = (com.avito.android.mortgage_calculator.internal.mvi.builder.d) this.f204450a.get();
        this.f204451b.getClass();
        return new C32739a(dVar, new com.avito.android.mortgage_calculator.internal.mvi.entity.d(), (com.avito.android.mortgage_calculator.internal.analytics.a) this.f204452c.get(), (R0) this.f204453d.get(), (com.avito.android.mortgage_calculator.internal.mvi.domain.b) this.f204454e.get(), (com.avito.android.mortgage_calculator.internal.mvi.domain.e) this.f204455f.get(), (com.avito.android.mortgage_calculator.data.a) this.f204456g.get(), (com.avito.android.mortgage_calculator.data.g) this.f204457h.get());
    }
}

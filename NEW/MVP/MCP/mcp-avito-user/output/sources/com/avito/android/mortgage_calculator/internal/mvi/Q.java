package com.avito.android.mortgage_calculator.internal.mvi;

/* compiled from: CalculatorFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Q implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final V f204461a;

    /* renamed from: b, reason: collision with root package name */
    public final N f204462b;

    /* renamed from: c, reason: collision with root package name */
    public final T f204463c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.builder.f f204464d;

    public Q(V v12, N n12, T t12, com.avito.android.mortgage_calculator.internal.mvi.builder.f fVar) {
        this.f204461a = v12;
        this.f204462b = n12;
        this.f204463c = t12;
        this.f204464d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U u12 = (U) this.f204461a.get();
        C32739a c32739a = (C32739a) this.f204462b.get();
        this.f204463c.getClass();
        return new P("MortgageCalculator", ((com.avito.android.mortgage_calculator.internal.mvi.builder.d) this.f204464d.get()).a(), new O(u12, c32739a, new S()));
    }
}

package com.avito.android.mortgage_calculator.internal.mvi;

/* compiled from: CalculatorReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.builder.c f204467a;

    public V(com.avito.android.mortgage_calculator.internal.mvi.builder.c cVar) {
        this.f204467a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U((com.avito.android.mortgage_calculator.internal.mvi.builder.a) this.f204467a.get());
    }
}

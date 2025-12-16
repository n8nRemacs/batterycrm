package com.avito.android.mortgage_calculator.internal;

import kotlinx.coroutines.flow.i2;

/* compiled from: MortgageCalculatorSharedViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class T0 implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.Q f204261a;

    public T0(com.avito.android.mortgage_calculator.internal.mvi.Q q12) {
        this.f204261a = q12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage_calculator.internal.mvi.P p12 = (com.avito.android.mortgage_calculator.internal.mvi.P) this.f204261a.get();
        i2.f411430a.getClass();
        return new S0(p12, i2.a.f411432b);
    }
}

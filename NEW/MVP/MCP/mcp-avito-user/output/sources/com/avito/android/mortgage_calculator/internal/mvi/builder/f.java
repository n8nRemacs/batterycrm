package com.avito.android.mortgage_calculator.internal.mvi.builder;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InitialCalculatorStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f204502a;

    public f(c cVar) {
        this.f204502a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f204502a.getClass();
        return new d(new b());
    }
}

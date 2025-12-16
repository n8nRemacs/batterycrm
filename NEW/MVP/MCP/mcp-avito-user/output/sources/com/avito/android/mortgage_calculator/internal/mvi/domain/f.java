package com.avito.android.mortgage_calculator.internal.mvi.domain;

import com.avito.android.mortgage_calculator.internal.mvi.mapper.m;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadOffersUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f204545a;

    /* renamed from: b, reason: collision with root package name */
    public final m f204546b;

    /* renamed from: c, reason: collision with root package name */
    public final u f204547c;

    public f(u uVar, m mVar, u uVar2) {
        this.f204545a = uVar;
        this.f204546b = mVar;
        this.f204547c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = g.b(this.f204545a);
        this.f204546b.getClass();
        return new e(eVarB, new com.avito.android.mortgage_calculator.internal.mvi.mapper.e(), (R0) this.f204547c.get());
    }
}

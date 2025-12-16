package com.avito.android.mortgage_calculator.internal.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadInitialValuesUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f204526a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage_calculator.internal.mvi.mapper.c f204527b;

    /* renamed from: c, reason: collision with root package name */
    public final u f204528c;

    public d(u uVar, com.avito.android.mortgage_calculator.internal.mvi.mapper.c cVar, u uVar2) {
        this.f204526a = uVar;
        this.f204527b = cVar;
        this.f204528c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f204526a));
        this.f204527b.getClass();
        return new b(eVarA, new com.avito.android.mortgage_calculator.internal.mvi.mapper.b(), (R0) this.f204528c.get());
    }
}

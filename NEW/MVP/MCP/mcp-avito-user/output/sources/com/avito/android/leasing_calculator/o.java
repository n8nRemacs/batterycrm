package com.avito.android.leasing_calculator;

import android.content.res.Resources;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LeasingCalculatorRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175122a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f175123b;

    public o(dagger.internal.l lVar, u uVar) {
        this.f175122a = uVar;
        this.f175123b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((i) this.f175122a.get(), (Resources) this.f175123b.f393949a);
    }
}

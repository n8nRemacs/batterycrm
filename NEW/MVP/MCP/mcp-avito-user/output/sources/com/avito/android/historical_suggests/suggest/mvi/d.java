package com.avito.android.historical_suggests.suggest.mvi;

import com.avito.android.historical_suggests.suggest.interactor.n;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoricalSuggestsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final n f162133a;

    /* renamed from: b, reason: collision with root package name */
    public final u f162134b;

    public d(n nVar, u uVar) {
        this.f162133a = nVar;
        this.f162134b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.historical_suggests.suggest.interactor.a) this.f162133a.get(), (com.avito.android.historical_suggests.suggest.usecase.i) this.f162134b.get());
    }
}

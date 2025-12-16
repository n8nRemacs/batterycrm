package com.avito.android.historical_suggests.suggest;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: HistoricalSuggestsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.historical_suggests.suggest.mvi.g f162150a;

    public o(com.avito.android.historical_suggests.suggest.mvi.g gVar) {
        this.f162150a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.historical_suggests.suggest.mvi.f fVar = (com.avito.android.historical_suggests.suggest.mvi.f) this.f162150a.get();
        i2.f411430a.getClass();
        return new n(fVar, i2.a.f411432b);
    }
}

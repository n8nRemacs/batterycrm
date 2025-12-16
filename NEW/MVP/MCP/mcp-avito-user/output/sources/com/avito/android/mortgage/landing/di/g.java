package com.avito.android.mortgage.landing.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingAdapterModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f199610a;

    public g(dagger.internal.f fVar) {
        this.f199610a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f199610a.get();
        int i12 = c.f199604a;
        return jVar;
    }
}

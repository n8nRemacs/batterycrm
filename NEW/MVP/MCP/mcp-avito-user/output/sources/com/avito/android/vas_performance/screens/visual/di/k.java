package com.avito.android.vas_performance.screens.visual.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasListModule_ProvideSimpleRecyclerAdapter$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f321031b;

    public k(u uVar, Provider provider) {
        this.f321030a = uVar;
        this.f321031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f321030a.get();
        com.avito.konveyor.a aVar2 = this.f321031b.get();
        h.f321026a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}

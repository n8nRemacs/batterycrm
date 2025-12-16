package com.avito.android.tariff_lf_constructor.configure.landing.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorLandingModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299660b;

    public f(u uVar, Provider provider) {
        this.f299659a = uVar;
        this.f299660b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f299659a.get();
        com.avito.konveyor.a aVar2 = this.f299660b.get();
        b.f299654a.getClass();
        return new j(aVar, aVar2);
    }
}

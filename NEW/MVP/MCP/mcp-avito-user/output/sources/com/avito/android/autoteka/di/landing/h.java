package com.avito.android.autoteka.di.landing;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaLandingModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96441a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96442b;

    public h(u uVar, Provider provider) {
        this.f96441a = uVar;
        this.f96442b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96441a.get();
        com.avito.konveyor.a aVar2 = this.f96442b.get();
        b.f96428a.getClass();
        return new j(aVar, aVar2);
    }
}

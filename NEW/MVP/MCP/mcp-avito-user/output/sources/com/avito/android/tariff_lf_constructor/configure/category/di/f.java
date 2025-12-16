package com.avito.android.tariff_lf_constructor.configure.category.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureCategoryModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299362a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f299363b;

    public f(u uVar, Provider provider) {
        this.f299362a = uVar;
        this.f299363b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f299362a.get();
        com.avito.konveyor.a aVar2 = this.f299363b.get();
        b bVar = b.f299358a;
        return new j(aVar, aVar2);
    }
}

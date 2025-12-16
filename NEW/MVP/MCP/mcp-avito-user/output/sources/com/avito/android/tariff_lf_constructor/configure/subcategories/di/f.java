package com.avito.android.tariff_lf_constructor.configure.subcategories.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfigureSubCategoriesModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300445a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f300446b;

    public f(u uVar, Provider provider) {
        this.f300445a = uVar;
        this.f300446b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f300445a.get();
        com.avito.konveyor.a aVar2 = this.f300446b.get();
        b bVar = b.f300441a;
        return new j(aVar, aVar2);
    }
}

package com.avito.android.passport.profile_add.create_flow.select_vertical.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectVerticalModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f211895a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f211896b;

    /* renamed from: c, reason: collision with root package name */
    public final u f211897c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f211895a = provider;
        this.f211896b = provider2;
        this.f211897c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f211895a);
        com.avito.konveyor.a aVar = this.f211896b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f211897c.get();
        c.f211894a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}

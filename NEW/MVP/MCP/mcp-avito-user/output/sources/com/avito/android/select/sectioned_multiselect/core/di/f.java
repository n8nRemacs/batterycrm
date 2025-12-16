package com.avito.android.select.sectioned_multiselect.core.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectModule_ProvideDataAwareAdapterPresenter$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f266621a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f266622b;

    /* renamed from: c, reason: collision with root package name */
    public final u f266623c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f266621a = provider;
        this.f266622b = provider2;
        this.f266623c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f266621a);
        com.avito.konveyor.adapter.a aVar = this.f266622b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f266623c.get();
        d.f266618a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}

package com.avito.android.safedeal.delivery.di.module;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsOrderCancellationBlueprintsModule_ProvideDataAwareAdapterPresenter$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f256061a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f256062b;

    /* renamed from: c, reason: collision with root package name */
    public final u f256063c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f256061a = provider;
        this.f256062b = provider2;
        this.f256063c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f256061a.get();
        com.avito.konveyor.adapter.a aVar = this.f256062b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f256063c.get();
        a.f256059a.getClass();
        return new com.avito.android.recycler.data_aware.d(dagger.internal.l.a(c12), aVar, eVar);
    }
}

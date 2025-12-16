package com.avito.android.brandspace.di;

import androidx.view.P0;
import androidx.view.T0;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BrandspaceFragmentModule_ProvideViewModel$_avito_brandspace_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<com.avito.android.brandspace.vm.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f107689a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.brandspace.vm.c f107690b;

    public i(dagger.internal.l lVar, com.avito.android.brandspace.vm.c cVar) {
        this.f107689a = lVar;
        this.f107690b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f107689a.f393949a;
        com.avito.android.brandspace.vm.b bVar = (com.avito.android.brandspace.vm.b) this.f107690b.get();
        d.f107680a.getClass();
        return (com.avito.android.brandspace.vm.d) new P0(t02, bVar).a(com.avito.android.brandspace.vm.d.class);
    }
}

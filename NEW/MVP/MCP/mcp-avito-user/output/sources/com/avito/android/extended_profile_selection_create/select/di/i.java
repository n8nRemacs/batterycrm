package com.avito.android.extended_profile_selection_create.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSelectionCreateModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f152264a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f152265b;

    public i(u uVar, Provider provider) {
        this.f152264a = uVar;
        this.f152265b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f152264a.get();
        com.avito.konveyor.a aVar2 = this.f152265b.get();
        f.f152261a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}

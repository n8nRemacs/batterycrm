package com.avito.android.validation;

import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.validation.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36009g0 implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.c> f319376a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f319377b;

    public C36009g0(Provider<com.avito.android.recycler.data_aware.c> provider, Provider<InterfaceC14698b> provider2) {
        this.f319376a = provider;
        this.f319377b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = this.f319376a.get();
        InterfaceC14698b interfaceC14698b = this.f319377b.get();
        A.f319242a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, interfaceC14698b);
    }
}

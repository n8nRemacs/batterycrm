package com.avito.android.bxcontent.di.module;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideDestroyableViewHolderBuilder$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class A implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f110878a;

    public A(Provider<com.avito.konveyor.a> provider) {
        this.f110878a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f110878a.get();
        C29070s.f111022a.getClass();
        return new C14699c(aVar);
    }
}

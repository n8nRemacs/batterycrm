package com.avito.android.tariff_lf_constructor.configure.vertical.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureVerticalModule_ProvideListRecyclerAdapter$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f300585b;

    public f(u uVar, Provider provider) {
        this.f300584a = uVar;
        this.f300585b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f300584a.get();
        com.avito.konveyor.a aVar2 = this.f300585b.get();
        b.f300574a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new defpackage.a());
    }
}

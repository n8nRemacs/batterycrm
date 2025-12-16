package com.avito.android.advert.di;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideSafeRecyclerAdapter$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class d0 implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f69391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f69392b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f69393c;

    public d0(Provider<com.avito.konveyor.adapter.a> provider, Provider<InterfaceC14698b> provider2, Provider<com.avito.android.util.C> provider3) {
        this.f69391a = provider;
        this.f69392b = provider2;
        this.f69393c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f69391a.get();
        InterfaceC14698b interfaceC14698b = this.f69392b.get();
        com.avito.android.util.C c12 = this.f69393c.get();
        C27710t.f69463a.getClass();
        return new C14700d(aVar, interfaceC14698b, c12);
    }
}

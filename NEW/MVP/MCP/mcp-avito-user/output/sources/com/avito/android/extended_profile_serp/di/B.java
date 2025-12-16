package com.avito.android.extended_profile_serp.di;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.extended_profile_serp.di.C30515a;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpModule_ProvideProfileSerpContentAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f152663a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f152664b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f152665c;

    public B(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f152663a = provider;
        this.f152664b = uVar;
        this.f152665c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f152663a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f152664b.get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C30515a.b.C30521h) this.f152665c).get();
        C30538h.f152853a.getClass();
        return new C14700d(aVar, interfaceC14698b, c12);
    }
}

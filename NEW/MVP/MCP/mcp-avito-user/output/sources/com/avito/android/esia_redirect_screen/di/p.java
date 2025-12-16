package com.avito.android.esia_redirect_screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectModule_ProvideButtonsRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148037a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f148038b;

    public p(u uVar, Provider provider) {
        this.f148037a = uVar;
        this.f148038b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f148037a.get();
        com.avito.konveyor.a aVar2 = this.f148038b.get();
        m.f148034a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}

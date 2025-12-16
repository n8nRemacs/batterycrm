package com.avito.android.tariff.cpa.configure_info.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaConfigureInfoModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294466a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f294467b;

    public g(u uVar, Provider provider) {
        this.f294466a = uVar;
        this.f294467b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f294466a.get();
        com.avito.konveyor.a aVar2 = this.f294467b.get();
        int i12 = d.f294463a;
        return new j(aVar, aVar2);
    }
}

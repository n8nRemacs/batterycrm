package com.avito.android.comfortable_deal.submitting.promo.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoRecyclerModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f123147a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f123148b;

    public g(u uVar, Provider provider) {
        this.f123147a = uVar;
        this.f123148b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f123147a.get();
        com.avito.konveyor.a aVar2 = this.f123148b.get();
        d.f123142a.getClass();
        return new j(aVar, aVar2);
    }
}

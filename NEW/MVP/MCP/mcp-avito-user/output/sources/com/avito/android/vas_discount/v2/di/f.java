package com.avito.android.vas_discount.v2.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasDiscountV2Module_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319781a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f319782b;

    public f(u uVar, Provider provider) {
        this.f319781a = uVar;
        this.f319782b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f319781a.get();
        com.avito.konveyor.a aVar2 = this.f319782b.get();
        d.f319779a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}

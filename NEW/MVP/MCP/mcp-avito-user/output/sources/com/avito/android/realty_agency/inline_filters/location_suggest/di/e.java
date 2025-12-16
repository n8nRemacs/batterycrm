package com.avito.android.realty_agency.inline_filters.location_suggest.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationSuggestModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f251669a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f251670b;

    public e(u uVar, Provider provider) {
        this.f251669a = uVar;
        this.f251670b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f251669a.get();
        com.avito.konveyor.a aVar2 = this.f251670b.get();
        d.f251668a.getClass();
        return new j(aVar, aVar2);
    }
}

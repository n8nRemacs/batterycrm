package com.avito.android.orderBeduinV2.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.orderBeduinV2.mvi.domain.b f209911a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.order.feature.data.e f209912b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f209913c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f209914d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<dD.b> f209915e;

    public l(com.avito.android.orderBeduinV2.mvi.domain.b bVar, com.avito.android.order.feature.data.e eVar, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f209911a = bVar;
        this.f209912b = eVar;
        this.f209913c = lVar;
        this.f209914d = provider;
        this.f209915e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.orderBeduinV2.mvi.domain.a) this.f209911a.get(), (com.avito.android.order.feature.data.a) this.f209912b.get(), (String) this.f209913c.f393949a, this.f209914d.get(), this.f209915e.get());
    }
}

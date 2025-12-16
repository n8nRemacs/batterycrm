package com.avito.android.order.feature.mvi;

import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: OrderActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C32941a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.order.feature.domain.b f209664a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.order.feature.data.e f209665b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f209666c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f209667d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Z0> f209668e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f209669f;

    public l(com.avito.android.order.feature.domain.b bVar, com.avito.android.order.feature.data.e eVar, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f209664a = bVar;
        this.f209665b = eVar;
        this.f209666c = lVar;
        this.f209667d = provider;
        this.f209668e = provider2;
        this.f209669f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32941a((com.avito.android.order.feature.domain.a) this.f209664a.get(), (com.avito.android.order.feature.data.a) this.f209665b.get(), (String) this.f209666c.f393949a, this.f209667d.get(), this.f209668e.get(), this.f209669f.get());
    }
}

package com.avito.android.wallet.page.history.details.mvi.component;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nd.InterfaceC44378a;

/* compiled from: PaymentHistoryDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.history.details.mvi.j f327901a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44378a> f327902b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f327903c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f327904d;

    public h(com.avito.android.wallet.page.history.details.mvi.j jVar, Provider provider, Provider provider2, Provider provider3) {
        this.f327901a = jVar;
        this.f327902b = provider;
        this.f327903c = provider2;
        this.f327904d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.wallet.page.history.details.mvi.i) this.f327901a.get(), this.f327902b.get(), this.f327903c.get(), this.f327904d.get());
    }
}

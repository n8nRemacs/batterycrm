package com.avito.android.trx_promo_impl.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.paid_services.PaidServicesResultRepository;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.trx_promo_impl.domain.a> f304351a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f304352b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f304353c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f304354d;

    public g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f304351a = provider;
        this.f304352b = provider2;
        this.f304353c = provider3;
        this.f304354d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f304351a.get(), this.f304352b.get(), this.f304353c.get(), (PaidServicesResultRepository) this.f304354d.f393949a);
    }
}

package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.deeplinks.PaymentDetails;
import javax.inject.Provider;

/* compiled from: AutotekaPaymentBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.order.k> f97503a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97504b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f97505c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97506d;

    public o(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f97503a = provider;
        this.f97504b = lVar;
        this.f97505c = lVar2;
        this.f97506d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f97503a.get(), (PaymentDetails) this.f97504b.f393949a, ((Boolean) this.f97505c.f393949a).booleanValue(), this.f97506d.get());
    }
}

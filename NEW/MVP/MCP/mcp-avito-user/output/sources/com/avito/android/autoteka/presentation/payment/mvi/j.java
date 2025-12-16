package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.deeplinks.PaymentDetails;
import javax.inject.Provider;

/* compiled from: AutotekaPaymentActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.order.k> f97479a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f97480b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f97481c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f97482d;

    public j(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f97479a = provider;
        this.f97480b = uVar;
        this.f97481c = provider2;
        this.f97482d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f97479a.get(), (com.avito.android.autoteka.data.order.f) this.f97480b.get(), this.f97481c.get(), (PaymentDetails) this.f97482d.f393949a);
    }
}

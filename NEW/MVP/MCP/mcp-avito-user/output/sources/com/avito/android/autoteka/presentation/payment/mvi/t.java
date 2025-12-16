package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.autoteka.deeplinks.PaymentDetails;
import javax.inject.Provider;

/* compiled from: AutotekaPaymentOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f97520a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97521b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f97522c;

    public t(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f97520a = lVar;
        this.f97521b = provider;
        this.f97522c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s((PaymentDetails) this.f97520a.f393949a, this.f97521b.get(), this.f97522c.get());
    }
}

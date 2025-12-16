package com.avito.android.travel_payment_selector.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f302651a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f302652b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f302653c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f302654d;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f302651a = lVar;
        this.f302652b = lVar2;
        this.f302653c = provider;
        this.f302654d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f302651a.f393949a, (Long) this.f302652b.f393949a, this.f302653c.get(), this.f302654d.get());
    }
}

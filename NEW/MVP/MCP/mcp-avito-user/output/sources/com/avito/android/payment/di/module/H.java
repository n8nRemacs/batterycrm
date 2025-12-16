package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvideDisclaimerTextBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<com.avito.android.payment.items.text_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214206a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.payment.items.text_item.e> f214207b;

    public H(F f12, Provider<com.avito.android.payment.items.text_item.e> provider) {
        this.f214206a = f12;
        this.f214207b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.items.text_item.e eVar = this.f214207b.get();
        this.f214206a.getClass();
        return new com.avito.android.payment.items.text_item.a(eVar);
    }
}

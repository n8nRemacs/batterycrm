package com.avito.android.payment.di.module;

/* compiled from: PaymentStatusFormModule_ProvidePaymentInfoTextBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class K implements dagger.internal.h<com.avito.android.payment.items.text_item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214214a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214215b;

    public K(F f12, dagger.internal.u uVar) {
        this.f214214a = f12;
        this.f214215b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.items.text_item.e eVar = (com.avito.android.payment.items.text_item.e) this.f214215b.get();
        this.f214214a.getClass();
        return new com.avito.android.payment.items.text_item.b(eVar);
    }
}

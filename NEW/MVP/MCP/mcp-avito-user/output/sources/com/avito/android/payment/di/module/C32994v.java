package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvidePaymentInfoTextBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32994v implements dagger.internal.h<com.avito.android.payment.items.text_item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214307a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214308b;

    public C32994v(C32977d c32977d, dagger.internal.u uVar) {
        this.f214307a = c32977d;
        this.f214308b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.items.text_item.e eVar = (com.avito.android.payment.items.text_item.e) this.f214308b.get();
        this.f214307a.getClass();
        return new com.avito.android.payment.items.text_item.b(eVar);
    }
}

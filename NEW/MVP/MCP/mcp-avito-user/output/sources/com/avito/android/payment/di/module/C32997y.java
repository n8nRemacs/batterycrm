package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideSubmitButtonBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32997y implements dagger.internal.h<com.avito.android.payment.items.submit_button_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214313a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214314b;

    public C32997y(C32977d c32977d, dagger.internal.u uVar) {
        this.f214313a = c32977d;
        this.f214314b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.items.submit_button_item.e eVar = (com.avito.android.payment.items.submit_button_item.e) this.f214314b.get();
        this.f214313a.getClass();
        return new com.avito.android.payment.items.submit_button_item.a(eVar);
    }
}

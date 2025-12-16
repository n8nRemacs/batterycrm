package com.avito.android.payment.di.module;

/* compiled from: PaymentStatusFormModule_ProvideSubmitButtonBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Q implements dagger.internal.h<com.avito.android.payment.items.submit_button_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214229a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214230b;

    public Q(F f12, dagger.internal.u uVar) {
        this.f214229a = f12;
        this.f214230b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.items.submit_button_item.e eVar = (com.avito.android.payment.items.submit_button_item.e) this.f214230b.get();
        this.f214229a.getClass();
        return new com.avito.android.payment.items.submit_button_item.a(eVar);
    }
}

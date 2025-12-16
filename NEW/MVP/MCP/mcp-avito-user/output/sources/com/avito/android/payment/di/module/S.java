package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvideSubmitButtonItemPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class S implements dagger.internal.h<com.avito.android.payment.items.submit_button_item.e> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214231a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.payment.form.status.j> f214232b;

    public S(F f12, Provider<com.avito.android.payment.form.status.j> provider) {
        this.f214231a = f12;
        this.f214232b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f214232b);
        this.f214231a.getClass();
        return new com.avito.android.payment.items.submit_button_item.e(new E(eVarB));
    }
}

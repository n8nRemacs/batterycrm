package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvideItemConverter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<com.avito.android.payment.form.status.h> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214212a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f214213b;

    public J(F f12, Provider<com.avito.android.util.text.a> provider) {
        this.f214212a = f12;
        this.f214213b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f214213b.get();
        this.f214212a.getClass();
        return new com.avito.android.payment.form.status.i(aVar);
    }
}

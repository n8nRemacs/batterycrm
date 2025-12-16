package com.avito.android.payment.di.module;

import com.avito.android.payment.form.status.C33014a;

/* compiled from: PaymentStatusFormModule_ProvideStatusFormProcessingPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<com.avito.android.payment.form.status.B> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214227a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214228b;

    public P(F f12, dagger.internal.u uVar) {
        this.f214227a = f12;
        this.f214228b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33014a((com.avito.android.payment.form.M) this.f214228b.get(), this.f214227a.f214202b);
    }
}

package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideSubmitButtonItemPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class z implements dagger.internal.h<com.avito.android.payment.items.submit_button_item.e> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214315a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f214316b;

    public z(C32977d c32977d, dagger.internal.f fVar) {
        this.f214315a = c32977d;
        this.f214316b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f214316b));
        this.f214315a.getClass();
        return new com.avito.android.payment.items.submit_button_item.e(new C32976c(eVarA));
    }
}

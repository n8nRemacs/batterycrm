package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideInputItemPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32986m implements dagger.internal.h<com.avito.android.payment.items.phone_item.e> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214278a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f214279b;

    public C32986m(C32977d c32977d, dagger.internal.f fVar) {
        this.f214278a = c32977d;
        this.f214279b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f214279b);
        this.f214278a.getClass();
        return new com.avito.android.payment.items.phone_item.e(new com.avito.android.date_time_picker.h(eVarB, 1));
    }
}

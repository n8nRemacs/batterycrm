package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideInfoLabelBlueprint$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32984k implements dagger.internal.h<ru.avito.component.info_label.f> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214275a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214276b;

    public C32984k(C32977d c32977d, dagger.internal.u uVar) {
        this.f214275a = c32977d;
        this.f214276b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ru.avito.component.info_label.h hVar = (ru.avito.component.info_label.h) this.f214276b.get();
        this.f214275a.getClass();
        return new ru.avito.component.info_label.f(hVar);
    }
}

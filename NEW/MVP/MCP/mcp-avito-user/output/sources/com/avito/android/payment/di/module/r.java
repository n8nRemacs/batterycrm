package com.avito.android.payment.di.module;

import com.avito.android.validation.g1;
import com.avito.android.validation.h1;

/* compiled from: PaymentGenericFormModule_ProvideLocalPretendInteractorResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<g1> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214292a;

    public r(C32977d c32977d) {
        this.f214292a = c32977d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h1(this.f214292a.f214255e);
    }
}

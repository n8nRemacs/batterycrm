package com.avito.android.verification.verification_input_bill_amount;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputBillAmountViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_input_bill_amount.mvi.j f325543a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325544b;

    public k(com.avito.android.verification.verification_input_bill_amount.mvi.j jVar, Provider provider) {
        this.f325543a = jVar;
        this.f325544b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.verification.verification_input_bill_amount.mvi.i) this.f325543a.get(), this.f325544b.get());
    }
}

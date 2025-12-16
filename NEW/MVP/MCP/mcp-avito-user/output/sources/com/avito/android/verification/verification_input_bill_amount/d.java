package com.avito.android.verification.verification_input_bill_amount;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputBillAmountInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325524a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325525b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f325526c;

    public d(Provider<A1> provider, Provider<R0> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f325524a = provider;
        this.f325525b = provider2;
        this.f325526c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f325524a.get(), this.f325525b.get(), this.f325526c.get());
    }
}

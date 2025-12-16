package com.avito.android.verification.verification_fetch_invoice;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationFetchInvoiceInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325167a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325168b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f325169c;

    public c(Provider<A1> provider, Provider<R0> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f325167a = provider;
        this.f325168b = provider2;
        this.f325169c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f325167a.get(), this.f325168b.get(), this.f325169c.get());
    }
}

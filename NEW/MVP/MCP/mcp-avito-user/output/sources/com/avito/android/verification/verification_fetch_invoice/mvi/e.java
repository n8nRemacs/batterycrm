package com.avito.android.verification.verification_fetch_invoice.mvi;

import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FetchInvoiceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f325200a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325201b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.verification.verification_fetch_invoice.c f325202c;

    public e(dagger.internal.l lVar, Provider provider, com.avito.android.verification.verification_fetch_invoice.c cVar) {
        this.f325200a = lVar;
        this.f325201b = provider;
        this.f325202c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((VerificationFetchInvoiceArgs) this.f325200a.f393949a, this.f325201b.get(), (com.avito.android.verification.verification_fetch_invoice.b) this.f325202c.get());
    }
}

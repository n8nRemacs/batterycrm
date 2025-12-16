package com.avito.android.verification.verification_fetch_invoice.mvi;

import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FetchInvoiceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f325210a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_fetch_invoice.c f325211b;

    public g(dagger.internal.l lVar, com.avito.android.verification.verification_fetch_invoice.c cVar) {
        this.f325210a = lVar;
        this.f325211b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((VerificationFetchInvoiceArgs) this.f325210a.f393949a, (com.avito.android.verification.verification_fetch_invoice.b) this.f325211b.get());
    }
}

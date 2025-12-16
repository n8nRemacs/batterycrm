package com.avito.android.verification.verification_fetch_invoice;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VerificationFetchInvoiceViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_fetch_invoice.mvi.j f325188a;

    public k(com.avito.android.verification.verification_fetch_invoice.mvi.j jVar) {
        this.f325188a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_fetch_invoice.mvi.i iVar = (com.avito.android.verification.verification_fetch_invoice.mvi.i) this.f325188a.get();
        i2.f411430a.getClass();
        return new j(iVar, i2.a.f411433c);
    }
}

package com.avito.android.verification.verification_fetch_invoice.mvi;

import com.avito.android.verification.inn.p;
import com.avito.android.verification.inn.q;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FetchInvoiceReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final q f325225a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.inn.k f325226b;

    public n(q qVar, com.avito.android.verification.inn.k kVar) {
        this.f325225a = qVar;
        this.f325226b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f325225a.get();
        this.f325226b.getClass();
        return new m(pVar, new com.avito.android.verification.inn.a());
    }
}

package com.avito.android.verification.verification_confirm_requisites.mvi;

import com.avito.android.verification.inn.q;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmRequisitesReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final q f325016a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.inn.k f325017b;

    public p(q qVar, com.avito.android.verification.inn.k kVar) {
        this.f325016a = qVar;
        this.f325017b = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.inn.p pVar = (com.avito.android.verification.inn.p) this.f325016a.get();
        this.f325017b.getClass();
        return new o(pVar, new com.avito.android.verification.inn.a());
    }
}

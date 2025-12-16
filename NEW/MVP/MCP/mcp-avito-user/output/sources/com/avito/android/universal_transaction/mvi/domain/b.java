package com.avito.android.universal_transaction.mvi.domain;

import com.avito.android.universal_transaction.mvi.data.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetTransactionDetailsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f306408a;

    public b(c cVar) {
        this.f306408a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.universal_transaction.mvi.data.a) this.f306408a.get());
    }
}

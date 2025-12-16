package com.avito.android.payment_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final m f215009a;

    public s(m mVar) {
        this.f215009a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((l) this.f215009a.get(), null, 2, null);
    }
}

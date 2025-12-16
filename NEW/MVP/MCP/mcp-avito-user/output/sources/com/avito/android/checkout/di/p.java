package com.avito.android.checkout.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzCheckoutScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f118256a;

    public p(dagger.internal.l lVar) {
        this.f118256a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f118256a.f393949a;
        n.f118253a.getClass();
        return new C28478k(MnzCheckoutScreen.f90405d, rVar, null, 4, null);
    }
}

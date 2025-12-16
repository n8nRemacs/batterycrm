package com.avito.android.marketplace;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: FinanceMarketplaceIntentFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f185955a;

    public q(C30102l3 c30102l3) {
        this.f185955a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((Context) this.f185955a.get());
    }
}

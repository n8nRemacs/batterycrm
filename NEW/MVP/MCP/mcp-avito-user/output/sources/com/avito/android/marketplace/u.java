package com.avito.android.marketplace;

/* compiled from: FinanceMarketplaceViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.marketplace.mvi.components.g f185958a;

    public u(com.avito.android.marketplace.mvi.components.g gVar) {
        this.f185958a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.marketplace.mvi.components.f) this.f185958a.get(), null, 2, null);
    }
}

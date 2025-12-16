package com.avito.android.advert.item.ownership_cost.items.results;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostResultsItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f78059a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f78060b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<k6.b> f78061c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f78059a = uVar;
        this.f78060b = provider;
        this.f78061c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.advert.item.ownership_cost.dialogs.a) this.f78059a.get(), this.f78060b.get(), this.f78061c.get());
    }
}

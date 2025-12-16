package com.avito.android.advert.item.ownership_cost.items;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.ownership_cost.items.input_form.a> f77970a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.ownership_cost.items.results.i f77971b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<m> f77972c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.ownership_cost.f> f77973d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f77974e;

    public g(Provider provider, com.avito.android.advert.item.ownership_cost.items.results.i iVar, Provider provider2, Provider provider3, Provider provider4) {
        this.f77970a = provider;
        this.f77971b = iVar;
        this.f77972c = provider2;
        this.f77973d = provider3;
        this.f77974e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f77970a.get(), (com.avito.android.advert.item.ownership_cost.items.results.h) this.f77971b.get(), this.f77972c.get(), this.f77973d.get(), this.f77974e.get());
    }
}

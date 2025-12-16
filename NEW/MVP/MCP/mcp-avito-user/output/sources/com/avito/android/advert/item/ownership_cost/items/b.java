package com.avito.android.advert.item.ownership_cost.items;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f77960a;

    /* renamed from: b, reason: collision with root package name */
    public final u f77961b;

    public b(u uVar, Provider provider) {
        this.f77960a = provider;
        this.f77961b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f77960a.get(), (i) this.f77961b.get());
    }
}

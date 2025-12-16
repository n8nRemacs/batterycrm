package com.avito.android.advert.item.ownership_cost;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipCostRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77947a;

    public i(u uVar) {
        this.f77947a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((a) this.f77947a.get());
    }
}

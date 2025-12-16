package com.avito.android.advert.item.ownership_discrepancy.mvi;

import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipDiscrepancyActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f78112a;

    public c(l lVar) {
        this.f78112a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((OwnershipDiscrepancyOpenParams) this.f78112a.f393949a);
    }
}

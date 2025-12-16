package com.avito.android.advert.item.ownership_discrepancy;

import com.avito.android.advert.item.ownership_discrepancy.mvi.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipDiscrepancyViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f78107a;

    public e(f fVar) {
        this.f78107a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.advert.item.ownership_discrepancy.mvi.e) this.f78107a.get(), null, 2, null);
    }
}

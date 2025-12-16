package com.avito.android.advert.item.ownership_cost.di;

import com.avito.android.remote.model.OwnershipCostResponse;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipCostRegionDialogModule_ProvideRegionSelectChangesRelayFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes10.dex */
public final class f implements h<com.jakewharton.rxrelay3.c<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region>> {

    /* compiled from: OwnershipCostRegionDialogModule_ProvideRegionSelectChangesRelayFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f77882a = new f();
    }

    public static f a() {
        return a.f77882a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f77880a.getClass();
        return new com.jakewharton.rxrelay3.c();
    }
}

package com.avito.android.sales_items;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSalesItemsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f258242a;

    public o(C30214v6 c30214v6) {
        this.f258242a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((AK0.l) this.f258242a.get());
    }
}

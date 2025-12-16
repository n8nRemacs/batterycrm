package com.avito.android.favorite_sellers.adapter.seller;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155754a;

    public b(u uVar) {
        this.f155754a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f155754a.get());
    }
}

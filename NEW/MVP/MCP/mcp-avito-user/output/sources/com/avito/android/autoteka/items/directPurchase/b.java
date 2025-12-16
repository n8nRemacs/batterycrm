package com.avito.android.autoteka.items.directPurchase;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DirectPurchaseBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f96737a;

    public b(g gVar) {
        this.f96737a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f96737a.get());
    }
}

package com.avito.android.advert.item.fair_price;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FairPriceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f75376a;

    public b(f fVar) {
        this.f75376a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f75376a.get());
    }
}

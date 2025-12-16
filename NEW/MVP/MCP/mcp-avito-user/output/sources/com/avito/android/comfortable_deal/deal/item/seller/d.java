package com.avito.android.comfortable_deal.deal.item.seller;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final h f121485a;

    public d(h hVar) {
        this.f121485a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f121485a.get());
    }
}

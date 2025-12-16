package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OfferBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f83893a;

    public b(dagger.internal.l lVar) {
        this.f83893a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((OfferOpenParams) this.f83893a.f393949a);
    }
}

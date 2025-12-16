package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OfferBottomSheetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f83896a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f83897b;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f83896a = lVar;
        this.f83897b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((OfferOpenParams) this.f83896a.f393949a, ((Boolean) this.f83897b.f393949a).booleanValue());
    }
}

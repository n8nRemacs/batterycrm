package com.avito.android.comfortable_deal.deal.item.seller.gallery.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerItemGalleryItemModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f121501a;

    public d(f fVar) {
        this.f121501a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f121501a.get();
        int i12 = c.f121500a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}

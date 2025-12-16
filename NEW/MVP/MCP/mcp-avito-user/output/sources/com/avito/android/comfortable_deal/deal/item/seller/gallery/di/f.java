package com.avito.android.comfortable_deal.deal.item.seller.gallery.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerItemGalleryItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.e f121502a;

    public f(com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.e eVar) {
        this.f121502a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        this.f121502a.getClass();
        com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.d dVar = new com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.d();
        int i12 = c.f121500a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.comfortable_deal.deal.item.seller.gallery.item.image.a(dVar));
        return c10493a.a();
    }
}

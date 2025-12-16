package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C36135w2;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: AdvertDetailsGalleryItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class M1 implements dagger.internal.h<L1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f73803a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73804b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f73805c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f73806d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C36135w2> f73807e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C43624b> f73808f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.advert.item.gallery.c f73809g;

    public M1(dagger.internal.l lVar, Provider provider, Provider provider2, dagger.internal.l lVar2, Provider provider3, Provider provider4, com.avito.android.advert.item.gallery.c cVar) {
        this.f73803a = lVar;
        this.f73804b = provider;
        this.f73805c = provider2;
        this.f73806d = lVar2;
        this.f73807e = provider3;
        this.f73808f = provider4;
        this.f73809g = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Integer num = (Integer) this.f73803a.f393949a;
        com.avito.android.advert.item.similars.j jVar = this.f73804b.get();
        com.avito.android.J0 j02 = this.f73805c.get();
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = (AdvertDetailsFastOpenParams) this.f73806d.f393949a;
        this.f73807e.get();
        C43624b c43624b = this.f73808f.get();
        this.f73809g.getClass();
        return new L1(num, jVar, j02, advertDetailsFastOpenParams, c43624b, new com.avito.android.advert.item.gallery.a());
    }
}

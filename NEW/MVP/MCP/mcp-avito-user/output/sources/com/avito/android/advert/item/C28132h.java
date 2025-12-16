package com.avito.android.advert.item;

import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBlocksPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28132h implements dagger.internal.h<C28129g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f75807a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f75808b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.multi_item.b> f75809c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.blocks.b> f75810d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f75811e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.sellersubscription.p> f75812f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.recomendations.j> f75813g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.a> f75814h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.commercials.f> f75815i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.trust_factors.h f75816j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<h2> f75817k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f75818l;

    public C28132h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, com.avito.android.advert.item.safedeal.trust_factors.h hVar, Provider provider8, Provider provider9) {
        this.f75807a = lVar;
        this.f75808b = lVar2;
        this.f75809c = provider;
        this.f75810d = provider2;
        this.f75811e = provider3;
        this.f75812f = provider4;
        this.f75813g = provider5;
        this.f75814h = provider6;
        this.f75815i = provider7;
        this.f75816j = hVar;
        this.f75817k = provider8;
        this.f75818l = provider9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28129g((AdvertDetailsFastOpenParams) this.f75807a.f393949a, (AdvertDetailsMultiItemState) this.f75808b.f393949a, this.f75809c.get(), this.f75810d.get(), this.f75811e.get(), this.f75812f.get(), this.f75813g.get(), this.f75814h.get(), this.f75815i.get(), (com.avito.android.advert.item.safedeal.trust_factors.f) this.f75816j.get(), this.f75817k.get(), this.f75818l.get());
    }
}

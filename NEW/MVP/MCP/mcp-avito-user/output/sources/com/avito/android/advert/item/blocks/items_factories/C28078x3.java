package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.x3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28078x3 implements dagger.internal.h<C28072w3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74071a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.fair_price.converter.c f74072b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f74073c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f74074d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f74075e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f74076f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C29640d> f74077g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Q2> f74078h;

    public C28078x3(Provider provider, com.avito.android.advert.item.fair_price.converter.c cVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f74071a = provider;
        this.f74072b = cVar;
        this.f74073c = provider2;
        this.f74074d = provider3;
        this.f74075e = provider4;
        this.f74076f = provider5;
        this.f74077g = provider6;
        this.f74078h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28072w3(this.f74071a.get(), (com.avito.android.advert.item.fair_price.converter.a) this.f74072b.get(), this.f74073c.get(), this.f74074d.get(), this.f74075e.get(), this.f74076f.get(), this.f74077g.get(), this.f74078h.get());
    }
}

package com.avito.android.imv_goods_advert.di;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.sellerprofile.D;
import com.avito.android.advert_details_items.sellerprofile.E;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.imv_goods_advert.di.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: ImvGoodsAdvertModule_ProvideAdvertSellerPresenter$_avito_imv_goods_advert_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<InterfaceC28280j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f170501a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f170502b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f170503c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.credits.installments.d> f170504d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_with_delivery.c> f170505e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.short_term_rent.a> f170506f;

    /* renamed from: g, reason: collision with root package name */
    public final u f170507g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f170508h;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f170501a = provider;
        this.f170502b = provider2;
        this.f170503c = provider3;
        this.f170504d = provider4;
        this.f170505e = provider5;
        this.f170506f = provider6;
        this.f170507g = uVar;
        this.f170508h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f170501a.get();
        InterfaceC28265d interfaceC28265d = this.f170502b.get();
        com.avito.android.advert_core.analytics.a aVar = this.f170503c.get();
        com.avito.android.credits.installments.d dVar = (com.avito.android.credits.installments.d) ((a.c.u) this.f170504d).get();
        com.avito.android.advert_core.price_with_delivery.c cVar = (com.avito.android.advert_core.price_with_delivery.c) ((a.c.B) this.f170505e).get();
        com.avito.android.advert_core.short_term_rent.a aVar2 = this.f170506f.get();
        com.avito.android.advert_details_items.toast_item_popularity.a aVar3 = (com.avito.android.advert_details_items.toast_item_popularity.a) this.f170507g.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.E) this.f170508h).get();
        f.f170496a.getClass();
        return new D(e12, interfaceC28265d, C42745f0.U(e12, interfaceC28265d), aVar, new com.jakewharton.rxrelay3.c(), dVar, cVar, aVar2, aVar3, interfaceC35745a5, null);
    }
}

package com.avito.android.advert.di;

import Ca.AbstractC13232a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: AdvertFragmentModule_ProvideAdvertSellerPresenter$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class C implements dagger.internal.h<InterfaceC28280j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.sellerprofile.E> f69074a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f69075b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f69076c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<l41.g<AbstractC13232a>> f69077d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.credits.installments.d> f69078e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_with_delivery.c> f69079f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.short_term_rent.a> f69080g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.toast_item_popularity.a> f69081h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f69082i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.sellerprofile.a0> f69083j;

    public C(Provider<com.avito.android.advert_details_items.sellerprofile.E> provider, Provider<InterfaceC28265d> provider2, Provider<com.avito.android.advert_core.analytics.a> provider3, Provider<l41.g<AbstractC13232a>> provider4, Provider<com.avito.android.credits.installments.d> provider5, Provider<com.avito.android.advert_core.price_with_delivery.c> provider6, Provider<com.avito.android.advert_core.short_term_rent.a> provider7, Provider<com.avito.android.advert_details_items.toast_item_popularity.a> provider8, Provider<InterfaceC35745a5> provider9, Provider<com.avito.android.advert_details_items.sellerprofile.a0> provider10) {
        this.f69074a = provider;
        this.f69075b = provider2;
        this.f69076c = provider3;
        this.f69077d = provider4;
        this.f69078e = provider5;
        this.f69079f = provider6;
        this.f69080g = provider7;
        this.f69081h = provider8;
        this.f69082i = provider9;
        this.f69083j = provider10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_details_items.sellerprofile.E e12 = this.f69074a.get();
        InterfaceC28265d interfaceC28265d = this.f69075b.get();
        com.avito.android.advert_core.analytics.a aVar = this.f69076c.get();
        l41.g<AbstractC13232a> gVar = this.f69077d.get();
        com.avito.android.credits.installments.d dVar = this.f69078e.get();
        com.avito.android.advert_core.price_with_delivery.c cVar = this.f69079f.get();
        com.avito.android.advert_core.short_term_rent.a aVar2 = this.f69080g.get();
        com.avito.android.advert_details_items.toast_item_popularity.a aVar3 = this.f69081h.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f69082i.get();
        com.avito.android.advert_details_items.sellerprofile.a0 a0Var = this.f69083j.get();
        C27710t.f69463a.getClass();
        return new com.avito.android.advert_details_items.sellerprofile.D(e12, interfaceC28265d, C42745f0.U(e12, interfaceC28265d), aVar, gVar, dVar, cVar, aVar2, aVar3, interfaceC35745a5, a0Var);
    }
}

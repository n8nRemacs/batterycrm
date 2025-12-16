package com.avito.android.advert.item.safedeal;

import co0.InterfaceC27233b;
import com.avito.android.advert.item.InterfaceC27811a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: AdvertSafeDealPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class N implements dagger.internal.h<C28180h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f78740a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f78741b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f78742c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78743d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.S> f78744e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC27811a> f78745f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28280j> f78746g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f78747h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.advert.favorites.a> f78748i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<I6.a> f78749j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC27233b> f78750k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.safedeal.trust_factors.a> f78751l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f78752m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N> f78753n;

    /* renamed from: o, reason: collision with root package name */
    public final T f78754o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.safedeal.real_one_click_payment_block.c> f78755p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f78756q;

    /* renamed from: r, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.trust_factors.c f78757r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.l f78758s;

    /* renamed from: t, reason: collision with root package name */
    public final Z f78759t;

    /* renamed from: u, reason: collision with root package name */
    public final com.avito.android.advert.item.safedeal.free_delivery.e f78760u;

    public N(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, T t12, Provider provider13, Provider provider14, com.avito.android.advert.item.safedeal.trust_factors.c cVar, dagger.internal.l lVar3, Z z12, com.avito.android.advert.item.safedeal.free_delivery.e eVar) {
        this.f78740a = lVar;
        this.f78741b = lVar2;
        this.f78742c = provider;
        this.f78743d = provider2;
        this.f78744e = provider3;
        this.f78745f = provider4;
        this.f78746g = provider5;
        this.f78747h = provider6;
        this.f78748i = provider7;
        this.f78749j = provider8;
        this.f78750k = provider9;
        this.f78751l = provider10;
        this.f78752m = provider11;
        this.f78753n = provider12;
        this.f78754o = t12;
        this.f78755p = provider13;
        this.f78756q = provider14;
        this.f78757r = cVar;
        this.f78758s = lVar3;
        this.f78759t = z12;
        this.f78760u = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f78740a.f393949a;
        String str2 = (String) this.f78741b.f393949a;
        com.avito.android.advert_core.analytics.a aVar = this.f78742c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f78743d.get();
        com.avito.android.advert.item.S s5 = this.f78744e.get();
        InterfaceC27811a interfaceC27811a = this.f78745f.get();
        InterfaceC28280j interfaceC28280j = this.f78746g.get();
        InterfaceC28265d interfaceC28265d = this.f78747h.get();
        com.avito.android.advert.favorites.a aVar2 = this.f78748i.get();
        I6.a aVar3 = this.f78749j.get();
        InterfaceC27233b interfaceC27233b = this.f78750k.get();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar4 = this.f78751l.get();
        com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar = this.f78752m.get();
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12 = this.f78753n.get();
        S s12 = (S) this.f78754o.get();
        com.avito.android.advert.item.safedeal.real_one_click_payment_block.c cVar = this.f78755p.get();
        com.avito.android.account.E e12 = this.f78756q.get();
        this.f78757r.getClass();
        return new C28180h(str, str2, aVar, interfaceC35745a5, s5, interfaceC27811a, interfaceC28280j, interfaceC28265d, aVar2, aVar3, interfaceC27233b, aVar4, hVar, n12, s12, cVar, e12, new com.avito.android.advert.item.safedeal.trust_factors.a(), (Y41.l) this.f78758s.f393949a, (Y) this.f78759t.get(), (com.avito.android.advert.item.safedeal.free_delivery.d) this.f78760u.get());
    }
}

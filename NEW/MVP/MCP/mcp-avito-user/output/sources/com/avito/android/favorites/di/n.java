package com.avito.android.favorites.di;

import com.avito.android.serp.adapter.witcher.C34895n;
import com.avito.android.serp.adapter.witcher.C34896o;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideFavoriteItemBinder$_avito_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34896o f157331a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.advert.b f157332b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.loading.b f157333c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.error.b f157334d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.e> f157335e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.with_movable_image.a> f157336f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.with_icon.a> f157337g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.banner.a> f157338h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.promo_banner_with_description.b f157339i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.promo_banner_with_benefits.b f157340j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.avito_for_business_exit.b f157341k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.interactive_title.a> f157342l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.job_snippet.b f157343m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.disclaimer.b f157344n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.A f157345o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f157346p;

    public n(C34896o c34896o, com.avito.android.favorites.adapter.advert.b bVar, com.avito.android.favorites.adapter.loading.b bVar2, com.avito.android.favorites.adapter.error.b bVar3, Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.favorites.adapter.promo_banner_with_description.b bVar4, com.avito.android.favorites.adapter.promo_banner_with_benefits.b bVar5, com.avito.android.favorites.adapter.avito_for_business_exit.b bVar6, Provider provider5, com.avito.android.favorites.adapter.job_snippet.b bVar7, com.avito.android.favorites.adapter.disclaimer.b bVar8, dagger.internal.A a12, dagger.internal.u uVar) {
        this.f157331a = c34896o;
        this.f157332b = bVar;
        this.f157333c = bVar2;
        this.f157334d = bVar3;
        this.f157335e = provider;
        this.f157336f = provider2;
        this.f157337g = provider3;
        this.f157338h = provider4;
        this.f157339i = bVar4;
        this.f157340j = bVar5;
        this.f157341k = bVar6;
        this.f157342l = provider5;
        this.f157343m = bVar7;
        this.f157344n = bVar8;
        this.f157345o = a12;
        this.f157346p = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34895n c34895n = (C34895n) this.f157331a.get();
        com.avito.android.favorites.adapter.advert.a aVar = (com.avito.android.favorites.adapter.advert.a) this.f157332b.get();
        com.avito.android.favorites.adapter.loading.a aVar2 = (com.avito.android.favorites.adapter.loading.a) this.f157333c.get();
        com.avito.android.favorites.adapter.error.a aVar3 = (com.avito.android.favorites.adapter.error.a) this.f157334d.get();
        com.avito.android.favorites.adapter.promo.e eVar = this.f157335e.get();
        com.avito.android.favorites.adapter.promo.with_movable_image.a aVar4 = this.f157336f.get();
        com.avito.android.favorites.adapter.promo.with_icon.a aVar5 = this.f157337g.get();
        com.avito.android.favorites.adapter.banner.a aVar6 = this.f157338h.get();
        com.avito.android.favorites.adapter.promo_banner_with_description.a aVar7 = (com.avito.android.favorites.adapter.promo_banner_with_description.a) this.f157339i.get();
        com.avito.android.favorites.adapter.promo_banner_with_benefits.a aVar8 = (com.avito.android.favorites.adapter.promo_banner_with_benefits.a) this.f157340j.get();
        com.avito.android.favorites.adapter.avito_for_business_exit.a aVar9 = (com.avito.android.favorites.adapter.avito_for_business_exit.a) this.f157341k.get();
        com.avito.android.favorites.adapter.interactive_title.a aVar10 = this.f157342l.get();
        com.avito.android.favorites.adapter.job_snippet.a aVar11 = (com.avito.android.favorites.adapter.job_snippet.a) this.f157343m.get();
        com.avito.android.favorites.adapter.disclaimer.a aVar12 = (com.avito.android.favorites.adapter.disclaimer.a) this.f157344n.get();
        Set set = (Set) this.f157345o.get();
        com.avito.android.favorites.adapter.group_card.a aVar13 = (com.avito.android.favorites.adapter.group_card.a) this.f157346p.get();
        C30647e c30647e = C30647e.f157320a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34895n);
        c10493a.b(eVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        c10493a.b(aVar9);
        c10493a.b(aVar11);
        c10493a.b(aVar13);
        c10493a.b(aVar10);
        c10493a.b(aVar12);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}

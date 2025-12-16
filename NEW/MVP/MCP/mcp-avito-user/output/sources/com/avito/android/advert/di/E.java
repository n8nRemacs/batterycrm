package com.avito.android.advert.di;

import Ab.C13005a;
import a5.C19682a;
import android.os.Bundle;
import com.avito.android.advert.di.t0;
import com.avito.android.advert.item.beduin.v2.AdvertDetailsBeduinItemVisibilityTrackerImpl;
import com.avito.android.util.R0;
import g6.C40535a;
import g6.C40536b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

/* compiled from: AdvertFragmentModule_ProvideBeduinItemVisibilityTracker$_avito_advert_details_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class E implements dagger.internal.h<com.avito.android.advert.item.beduin.v2.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Ab.c> f69085a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C13005a> f69086b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.b f69087c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert.item.autoteka.teaser.p f69088d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.advert.item.autoteka.teaser_v2.j f69089e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.advert.item.autoteka.teaser_v3.l f69090f;

    /* renamed from: g, reason: collision with root package name */
    public final a5.d f69091g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.credits.o f69092h;

    /* renamed from: i, reason: collision with root package name */
    public final c6.f f69093i;

    /* renamed from: j, reason: collision with root package name */
    public final C40536b f69094j;

    /* renamed from: k, reason: collision with root package name */
    public final W4.b f69095k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.advert.item.marketplace_sales_banner.d f69096l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.advert.item.marketplace_rewards.d f69097m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.advert_core.pp_recall_promo.s f69098n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.advert_core.pp_recall_promo.q f69099o;

    /* renamed from: p, reason: collision with root package name */
    public final com.avito.android.advert_core.comfortable_deal_promo.l f69100p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.l f69101q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<R0> f69102r;

    public E(Provider provider, Provider provider2, a5.b bVar, com.avito.android.advert.item.autoteka.teaser.p pVar, com.avito.android.advert.item.autoteka.teaser_v2.j jVar, com.avito.android.advert.item.autoteka.teaser_v3.l lVar, a5.d dVar, com.avito.android.credits.o oVar, c6.f fVar, C40536b c40536b, W4.b bVar2, com.avito.android.advert.item.marketplace_sales_banner.d dVar2, com.avito.android.advert.item.marketplace_rewards.d dVar3, com.avito.android.advert_core.pp_recall_promo.s sVar, com.avito.android.advert_core.pp_recall_promo.q qVar, com.avito.android.advert_core.comfortable_deal_promo.l lVar2, dagger.internal.l lVar3, Provider provider3) {
        this.f69085a = provider;
        this.f69086b = provider2;
        this.f69087c = bVar;
        this.f69088d = pVar;
        this.f69089e = jVar;
        this.f69090f = lVar;
        this.f69091g = dVar;
        this.f69092h = oVar;
        this.f69093i = fVar;
        this.f69094j = c40536b;
        this.f69095k = bVar2;
        this.f69096l = dVar2;
        this.f69097m = dVar3;
        this.f69098n = sVar;
        this.f69099o = qVar;
        this.f69100p = lVar2;
        this.f69101q = lVar3;
        this.f69102r = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object next;
        Ab.c cVar = this.f69085a.get();
        C13005a c13005a = this.f69086b.get();
        C19682a c19682a = (C19682a) this.f69087c.get();
        com.avito.android.advert.item.autoteka.teaser.o oVar = (com.avito.android.advert.item.autoteka.teaser.o) this.f69088d.get();
        com.avito.android.advert.item.autoteka.teaser_v2.i iVar = (com.avito.android.advert.item.autoteka.teaser_v2.i) this.f69089e.get();
        com.avito.android.advert.item.autoteka.teaser_v3.k kVar = (com.avito.android.advert.item.autoteka.teaser_v3.k) this.f69090f.get();
        a5.c cVar2 = (a5.c) this.f69091g.get();
        com.avito.android.credits.n nVar = (com.avito.android.credits.n) this.f69092h.get();
        c6.e eVar = (c6.e) this.f69093i.get();
        C40535a c40535a = (C40535a) this.f69094j.get();
        W4.a aVar = (W4.a) this.f69095k.get();
        com.avito.android.advert.item.marketplace_sales_banner.c cVar3 = (com.avito.android.advert.item.marketplace_sales_banner.c) this.f69096l.get();
        com.avito.android.advert.item.marketplace_rewards.c cVar4 = (com.avito.android.advert.item.marketplace_rewards.c) this.f69097m.get();
        com.avito.android.advert_core.pp_recall_promo.r rVar = (com.avito.android.advert_core.pp_recall_promo.r) this.f69098n.get();
        com.avito.android.advert_core.pp_recall_promo.p pVar = (com.avito.android.advert_core.pp_recall_promo.p) this.f69099o.get();
        com.avito.android.advert_core.comfortable_deal_promo.k kVar2 = (com.avito.android.advert_core.comfortable_deal_promo.k) this.f69100p.get();
        Bundle bundle = (Bundle) this.f69101q.f393949a;
        R0 r02 = (R0) ((t0.b.C27738j0) this.f69102r).get();
        C27710t c27710t = C27710t.f69463a;
        AdvertDetailsBeduinItemVisibilityTrackerImpl.a aVar2 = new AdvertDetailsBeduinItemVisibilityTrackerImpl.a(bundle, r02);
        aVar2.a(cVar);
        aVar2.a(c13005a);
        aVar2.a(c19682a);
        aVar2.a(oVar);
        aVar2.a(iVar);
        aVar2.a(kVar);
        aVar2.a(cVar2);
        aVar2.a(nVar);
        aVar2.a(eVar);
        aVar2.a(c40535a);
        aVar2.a(aVar);
        aVar2.a(cVar3);
        aVar2.a(rVar);
        aVar2.a(pVar);
        aVar2.a(kVar2);
        aVar2.a(cVar4);
        AdvertDetailsBeduinItemVisibilityTrackerImpl advertDetailsBeduinItemVisibilityTrackerImpl = new AdvertDetailsBeduinItemVisibilityTrackerImpl(aVar2.f73274b, r02, null);
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                ArrayList<AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo> parcelableArrayList = bundle.getParcelableArrayList(str);
                if (parcelableArrayList != null) {
                    HashMap<Long, List<AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo>> map = advertDetailsBeduinItemVisibilityTrackerImpl.f73262g;
                    Long lValueOf = Long.valueOf(Long.parseLong(str));
                    for (AdvertDetailsBeduinItemVisibilityTrackerImpl.FilterTrackInfo filterTrackInfo : parcelableArrayList) {
                        Iterator<T> it = advertDetailsBeduinItemVisibilityTrackerImpl.f73256a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((WV0.a) next).getClass().equals(filterTrackInfo.f73266b)) {
                                break;
                            }
                        }
                        filterTrackInfo.f73271g = (WV0.a) next;
                    }
                    map.put(lValueOf, parcelableArrayList);
                }
            }
        }
        return advertDetailsBeduinItemVisibilityTrackerImpl;
    }
}

package com.avito.android.campaigns_sale_search.di;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.campaigns_sale_search.di.a;
import com.avito.android.campaigns_sale_search.konveyor.search_item.h;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.campaigns_sale_search.mvi.n;
import com.avito.android.campaigns_sale_search.mvi.s;
import com.avito.android.campaigns_sale_search.mvi.y;
import com.avito.android.campaigns_sale_search.q;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import om.InterfaceC44818a;
import vm.InterfaceC49348c;

/* compiled from: DaggerCampaignsSaleSearchComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class g {

    /* compiled from: DaggerCampaignsSaleSearchComponent.java */
    public static final class b implements com.avito.android.campaigns_sale_search.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC44818a> f114524a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f114525b;

        /* renamed from: c, reason: collision with root package name */
        public final l f114526c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.campaigns_sale_search.network.a> f114527d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC49348c> f114528e;

        /* renamed from: f, reason: collision with root package name */
        public final l f114529f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.campaigns_sale_search.mvi.l f114530g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f114531h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f114532i;

        /* renamed from: j, reason: collision with root package name */
        public final s f114533j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f114534k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f114535l;

        /* renamed from: m, reason: collision with root package name */
        public final q f114536m;

        /* renamed from: n, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f114537n;

        /* renamed from: o, reason: collision with root package name */
        public final l f114538o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.c f114539p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.campaigns_sale_search.konveyor.history_item.c f114540q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.campaigns_sale_search.konveyor.page_loading_item.c f114541r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.campaigns_sale_search.konveyor.page_error_item.c f114542s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f114543t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f114544u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f114545v;

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale_search.di.b f114546a;

            public a(com.avito.android.campaigns_sale_search.di.b bVar) {
                this.f114546a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f114546a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        /* renamed from: com.avito.android.campaigns_sale_search.di.g$b$b, reason: collision with other inner class name */
        public static final class C3346b implements u<InterfaceC44818a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale_search.di.b f114547a;

            public C3346b(com.avito.android.campaigns_sale_search.di.b bVar) {
                this.f114547a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44818a interfaceC44818aY5 = this.f114547a.y5();
                t.c(interfaceC44818aY5);
                return interfaceC44818aY5;
            }
        }

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        public static final class c implements u<InterfaceC49348c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale_search.di.b f114548a;

            public c(com.avito.android.campaigns_sale_search.di.b bVar) {
                this.f114548a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f114548a.C3();
            }
        }

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f114549a;

            public d(cv.b bVar) {
                this.f114549a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f114549a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.campaigns_sale_search.di.b f114550a;

            public e(com.avito.android.campaigns_sale_search.di.b bVar) {
                this.f114550a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f114550a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCampaignsSaleSearchComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f114551a;

            public f(InterfaceC30106l7 interfaceC30106l7) {
                this.f114551a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f114551a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC30106l7 interfaceC30106l7, cv.b bVar, com.avito.android.campaigns_sale_search.di.b bVar2, CampaignsSaleSearchArguments campaignsSaleSearchArguments, C28478k c28478k, Y41.l lVar, Resources resources, a aVar) {
            this.f114524a = new C3346b(bVar2);
            this.f114525b = new e(bVar2);
            l lVarA = l.a(campaignsSaleSearchArguments);
            this.f114526c = lVarA;
            this.f114527d = dagger.internal.g.d(new com.avito.android.campaigns_sale_search.network.f(lVarA, this.f114524a, this.f114525b));
            this.f114528e = new c(bVar2);
            l lVarA2 = l.a(resources);
            this.f114529f = lVarA2;
            this.f114530g = new com.avito.android.campaigns_sale_search.mvi.l(lVarA2, this.f114526c, this.f114527d, this.f114528e);
            this.f114533j = new s(new a(bVar2), new d(bVar));
            this.f114534k = new f(interfaceC30106l7);
            this.f114535l = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f114534k);
            this.f114536m = new q(new com.avito.android.campaigns_sale_search.mvi.q(n.a(), this.f114530g, this.f114533j, y.a(), this.f114535l));
            this.f114537n = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA3 = l.a(lVar);
            this.f114538o = lVarA3;
            this.f114539p = new com.avito.android.campaigns_sale_search.konveyor.search_item.c(new h(this.f114529f, lVarA3));
            this.f114540q = new com.avito.android.campaigns_sale_search.konveyor.history_item.c(new com.avito.android.campaigns_sale_search.konveyor.history_item.g(lVarA3));
            this.f114541r = new com.avito.android.campaigns_sale_search.konveyor.page_loading_item.c(com.avito.android.campaigns_sale_search.konveyor.page_loading_item.f.a());
            this.f114542s = new com.avito.android.campaigns_sale_search.konveyor.page_error_item.c(new com.avito.android.campaigns_sale_search.konveyor.page_error_item.g(this.f114538o));
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f114537n);
            com.avito.android.campaigns_sale_search.konveyor.search_item.c cVar = this.f114539p;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar);
            list.add(this.f114540q);
            list.add(this.f114541r);
            list.add(this.f114542s);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f114543t = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f114544u = uVarH;
            this.f114545v = dagger.internal.g.d(new com.avito.android.campaigns_sale_search.di.e(uVarH, this.f114543t));
        }

        @Override // com.avito.android.campaigns_sale_search.di.a
        public final void a(CampaignsSaleSearchFragment campaignsSaleSearchFragment) {
            campaignsSaleSearchFragment.f114475n0 = this.f114536m;
            campaignsSaleSearchFragment.f114477p0 = this.f114535l.get();
            campaignsSaleSearchFragment.f114478q0 = this.f114545v.get();
        }
    }

    /* compiled from: DaggerCampaignsSaleSearchComponent.java */
    public static final class c implements a.InterfaceC3345a {
        public c() {
        }

        @Override // com.avito.android.campaigns_sale_search.di.a.InterfaceC3345a
        public final com.avito.android.campaigns_sale_search.di.a a(CampaignsSaleSearchArguments campaignsSaleSearchArguments, C28478k c28478k, Y41.l lVar, Resources resources, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, com.avito.android.campaigns_sale_search.di.b bVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC30106l7, interfaceC39417a, bVar, campaignsSaleSearchArguments, c28478k, lVar, resources, null);
        }
    }

    public static a.InterfaceC3345a a() {
        return new c();
    }
}

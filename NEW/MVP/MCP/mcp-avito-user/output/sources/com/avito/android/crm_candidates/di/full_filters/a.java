package com.avito.android.crm_candidates.di.full_filters;

import Y41.l;
import Y41.p;
import android.content.res.Resources;
import androidx.view.C22977J;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.full_filters.b;
import com.avito.android.crm_candidates.domain.o;
import com.avito.android.crm_candidates.domain.q;
import com.avito.android.crm_candidates.features.full_filters.logics.h;
import com.avito.android.crm_candidates.features.full_filters.logics.k;
import com.avito.android.crm_candidates.features.full_filters.logics.v;
import com.avito.android.crm_candidates.features.list_filter.logics.m;
import com.avito.android.crm_candidates.view.base.JobCrmFullFiltersFragment;
import com.avito.android.crm_candidates.view.list_items.select_filter.i;
import com.avito.android.di.module.C30136o4;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import iP.InterfaceC41329a;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.T;

/* compiled from: DaggerFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerFiltersComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.crm_candidates.di.full_filters.b.a
        public final com.avito.android.crm_candidates.di.full_filters.b a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources, C22977J c22977j, List list, p pVar, p pVar2, l lVar, l lVar2, l lVar3) {
            interfaceC39417a.getClass();
            list.getClass();
            return new c(dVar, interfaceC39417a, c28478k, resources, c22977j, list, pVar, pVar2, lVar, lVar2, lVar3, null);
        }
    }

    /* compiled from: DaggerFiltersComponent.java */
    public static final class c implements com.avito.android.crm_candidates.di.full_filters.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f129249a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.chips_filter.e> f129250b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f129251c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.range_filter.e> f129252d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f129253e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f129254f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.select_filter.e> f129255g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f129256h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129257i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f129258j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f129259k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.list_filter.f> f129260l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129261m;

        /* renamed from: n, reason: collision with root package name */
        public final h f129262n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.domain.c> f129263o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC41329a> f129264p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f129265q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Locale> f129266r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.date_time_formatter.b> f129267s;

        /* renamed from: t, reason: collision with root package name */
        public final u<o> f129268t;

        /* renamed from: u, reason: collision with root package name */
        public final v f129269u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28481c> f129270v;

        /* renamed from: w, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f129271w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC28373a> f129272x;

        /* renamed from: y, reason: collision with root package name */
        public final u<E> f129273y;

        /* renamed from: z, reason: collision with root package name */
        public final m f129274z;

        /* compiled from: DaggerFiltersComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.full_filters.a$c$a, reason: collision with other inner class name */
        public static final class C3838a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129275a;

            public C3838a(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129275a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f129275a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerFiltersComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129276a;

            public b(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129276a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f129276a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFiltersComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.full_filters.a$c$c, reason: collision with other inner class name */
        public static final class C3839c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129277a;

            public C3839c(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129277a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f129277a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerFiltersComponent.java */
        public static final class d implements u<InterfaceC41329a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129278a;

            public d(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129278a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41329a interfaceC41329aR2 = this.f129278a.r2();
                t.c(interfaceC41329aR2);
                return interfaceC41329aR2;
            }
        }

        /* compiled from: DaggerFiltersComponent.java */
        public static final class e implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129279a;

            public e(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129279a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f129279a.locale();
            }
        }

        /* compiled from: DaggerFiltersComponent.java */
        public static final class f implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.full_filters.d f129280a;

            public f(com.avito.android.crm_candidates.di.full_filters.d dVar) {
                this.f129280a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f129280a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.crm_candidates.di.full_filters.d dVar, cv.b bVar, C28478k c28478k, Resources resources, T t12, List list, p pVar, p pVar2, l lVar, l lVar2, l lVar3, C3837a c3837a) {
            this.f129249a = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.crm_candidates.view.list_items.chips_filter.e> uVarD = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.chips_filter.h(dagger.internal.l.a(pVar)));
            this.f129250b = uVarD;
            this.f129251c = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.chips_filter.c(uVarD));
            this.f129252d = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.range_filter.h(dagger.internal.l.a(pVar2)));
            this.f129253e = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.range_filter.c(dagger.internal.l.a(t12), this.f129252d));
            this.f129254f = dagger.internal.l.a(lVar);
            u<com.avito.android.crm_candidates.view.list_items.select_filter.e> uVarD2 = dagger.internal.g.d(new i(this.f129254f, dagger.internal.l.a(lVar3)));
            this.f129255g = uVarD2;
            this.f129256h = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.select_filter.c(uVarD2));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f129249a);
            u<TV0.b<?, ?>> uVar = this.f129251c;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(uVar);
            list2.add(this.f129253e);
            list2.add(this.f129256h);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f129257i = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f129258j = uVarH;
            this.f129259k = dagger.internal.g.d(new com.avito.android.crm_candidates.di.full_filters.f(uVarH, this.f129257i));
            u<com.avito.android.crm_candidates.view.list_items.list_filter.f> uVarD3 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.list_filter.i(dagger.internal.l.a(lVar2)));
            this.f129260l = uVarD3;
            this.f129261m = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.list_filter.e(new com.avito.android.crm_candidates.view.list_items.list_filter.b(uVarD3)));
            dagger.internal.l lVarA = dagger.internal.l.a(list);
            this.f129262n = new h(lVarA);
            this.f129263o = dagger.internal.g.d(new com.avito.android.crm_candidates.domain.d(lVarA));
            this.f129264p = new d(dVar);
            this.f129265q = new f(dVar);
            u<com.avito.android.date_time_formatter.b> uVarD4 = dagger.internal.g.d(new g(this.f129265q, new C30136o4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(dagger.internal.l.a(resources)))), new e(dVar)));
            this.f129267s = uVarD4;
            u<o> uVarD5 = dagger.internal.g.d(new q(uVarD4));
            this.f129268t = uVarD5;
            this.f129269u = new v(new k(this.f129262n, new com.avito.android.crm_candidates.features.full_filters.logics.f(uVarD5, this.f129263o, this.f129264p), com.avito.android.crm_candidates.features.full_filters.logics.m.a(), com.avito.android.crm_candidates.features.full_filters.logics.t.a()));
            this.f129270v = new C3839c(dVar);
            this.f129271w = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f129270v);
            this.f129274z = new m(new com.avito.android.crm_candidates.features.list_filter.logics.g(new com.avito.android.crm_candidates.features.list_filter.logics.c(new b(dVar), new C3838a(dVar), this.f129263o), com.avito.android.crm_candidates.features.list_filter.logics.i.a(), com.avito.android.crm_candidates.features.list_filter.logics.k.a()));
        }

        @Override // com.avito.android.crm_candidates.di.full_filters.b
        public final void a(JobCrmFullFiltersFragment jobCrmFullFiltersFragment) {
            jobCrmFullFiltersFragment.f129844n0 = this.f129259k.get();
            jobCrmFullFiltersFragment.f129845o0 = this.f129261m.get();
            jobCrmFullFiltersFragment.f129846p0 = this.f129269u;
            jobCrmFullFiltersFragment.f129848r0 = this.f129271w.get();
            jobCrmFullFiltersFragment.f129852v0 = this.f129274z;
        }
    }

    public static b.a a() {
        return new b();
    }
}

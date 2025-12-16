package com.avito.android.crm_candidates.di.candidates;

import Y41.l;
import Zs.C19601b;
import Zs.C19602c;
import Zs.C19603d;
import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.di.candidates.b;
import com.avito.android.crm_candidates.domain.n;
import com.avito.android.crm_candidates.domain.o;
import com.avito.android.crm_candidates.features.applications_list.logics.s;
import com.avito.android.crm_candidates.features.inline_filters.logics.q;
import com.avito.android.crm_candidates.features.list_filter.logics.k;
import com.avito.android.crm_candidates.features.list_filter.logics.m;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import com.avito.android.crm_candidates.view.list_items.survey_results.h;
import com.avito.android.crm_candidates.view.list_items.survey_results.j;
import com.avito.android.date_time_formatter.i;
import com.avito.android.di.module.C30136o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import iP.InterfaceC41329a;
import java.util.Locale;

/* compiled from: DaggerJobCrmCandidatesComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJobCrmCandidatesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.crm_candidates.di.candidates.b.a
        public final com.avito.android.crm_candidates.di.candidates.b a(com.avito.android.crm_candidates.di.candidates.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, resources, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, null);
        }
    }

    /* compiled from: DaggerJobCrmCandidatesComponent.java */
    public static final class c implements com.avito.android.crm_candidates.di.candidates.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f129198A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f129199B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.inline_filters.c> f129200C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129201D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f129202E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f129203F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.list_filter.f> f129204G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129205H;

        /* renamed from: I, reason: collision with root package name */
        public final u<h> f129206I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129207J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f129208K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f129209L;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.crm_candidates.di.candidates.c f129210a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f129211b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41329a> f129212c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f129213d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f129214e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Locale> f129215f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.date_time_formatter.b> f129216g;

        /* renamed from: h, reason: collision with root package name */
        public final u<o> f129217h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.domain.l> f129218i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.applications_list.logics.e f129219j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f129220k;

        /* renamed from: l, reason: collision with root package name */
        public final u<E> f129221l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.crm_candidates.features.applications_list.logics.c f129222m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f129223n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f129224o;

        /* renamed from: p, reason: collision with root package name */
        public final s f129225p;

        /* renamed from: q, reason: collision with root package name */
        public final q f129226q;

        /* renamed from: r, reason: collision with root package name */
        public final m f129227r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.applications_list.application_item.c> f129228s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.crm_candidates.view.list_items.applications_list.application_item.b f129229t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.d> f129230u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.b f129231v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.applications_list.error_item.d> f129232w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.crm_candidates.view.list_items.applications_list.error_item.b f129233x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.c> f129234y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f129235z;

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.candidates.a$c$a, reason: collision with other inner class name */
        public static final class C3834a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129236a;

            public C3834a(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129236a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f129236a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129237a;

            public b(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129237a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f129237a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        /* renamed from: com.avito.android.crm_candidates.di.candidates.a$c$c, reason: collision with other inner class name */
        public static final class C3835c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129238a;

            public C3835c(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129238a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f129238a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        public static final class d implements u<InterfaceC41329a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129239a;

            public d(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129239a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41329a interfaceC41329aR2 = this.f129239a.r2();
                t.c(interfaceC41329aR2);
                return interfaceC41329aR2;
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f129240a;

            public e(cv.b bVar) {
                this.f129240a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f129240a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        public static final class f implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129241a;

            public f(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129241a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f129241a.locale();
            }
        }

        /* compiled from: DaggerJobCrmCandidatesComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.crm_candidates.di.candidates.c f129242a;

            public g(com.avito.android.crm_candidates.di.candidates.c cVar) {
                this.f129242a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f129242a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.crm_candidates.di.candidates.c cVar, cv.b bVar, C28478k c28478k, Resources resources, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, C3833a c3833a) {
            this.f129210a = cVar;
            this.f129211b = bVar;
            this.f129212c = new d(cVar);
            this.f129213d = new b(cVar);
            this.f129214e = new g(cVar);
            u<com.avito.android.date_time_formatter.b> uVarD = dagger.internal.g.d(new com.avito.android.crm_candidates.di.candidates.e(this.f129214e, new C30136o4(i.b(new com.avito.android.date_time_formatter.h(dagger.internal.l.a(resources)))), new f(cVar)));
            this.f129216g = uVarD;
            u<o> uVarD2 = dagger.internal.g.d(new com.avito.android.crm_candidates.domain.q(uVarD));
            this.f129217h = uVarD2;
            u<com.avito.android.crm_candidates.domain.l> uVarD3 = dagger.internal.g.d(new n(this.f129212c, this.f129213d, uVarD2));
            this.f129218i = uVarD3;
            this.f129219j = new com.avito.android.crm_candidates.features.applications_list.logics.e(uVarD3);
            e eVar = new e(bVar);
            C3834a c3834a = new C3834a(cVar);
            this.f129221l = c3834a;
            this.f129222m = new com.avito.android.crm_candidates.features.applications_list.logics.c(uVarD3, eVar, this.f129213d, c3834a);
            this.f129223n = new C3835c(cVar);
            this.f129224o = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f129223n);
            this.f129225p = new s(new com.avito.android.crm_candidates.features.applications_list.logics.h(this.f129219j, this.f129222m, com.avito.android.crm_candidates.features.applications_list.logics.n.a(), com.avito.android.crm_candidates.features.applications_list.logics.q.a(), this.f129224o));
            u<com.avito.android.crm_candidates.domain.l> uVar = this.f129218i;
            this.f129226q = new q(new com.avito.android.crm_candidates.features.inline_filters.logics.h(new com.avito.android.crm_candidates.features.inline_filters.logics.e(uVar), new com.avito.android.crm_candidates.features.inline_filters.logics.c(uVar, this.f129213d, this.f129221l), new com.avito.android.crm_candidates.features.inline_filters.logics.l(uVar, uVar), com.avito.android.crm_candidates.features.inline_filters.logics.o.a(), this.f129224o));
            this.f129227r = new m(new com.avito.android.crm_candidates.features.list_filter.logics.g(new com.avito.android.crm_candidates.features.list_filter.logics.c(this.f129213d, this.f129221l, this.f129218i), com.avito.android.crm_candidates.features.list_filter.logics.i.a(), k.a()));
            u<com.avito.android.crm_candidates.view.list_items.applications_list.application_item.c> uVarD4 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.applications_list.application_item.f(dagger.internal.l.a(lVar)));
            this.f129228s = uVarD4;
            this.f129229t = new com.avito.android.crm_candidates.view.list_items.applications_list.application_item.b(uVarD4);
            u<com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.d> uVarD5 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.f(dagger.internal.l.a(lVar2)));
            this.f129230u = uVarD5;
            this.f129231v = new com.avito.android.crm_candidates.view.list_items.applications_list.loading_item.b(uVarD5);
            u<com.avito.android.crm_candidates.view.list_items.applications_list.error_item.d> uVarD6 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.applications_list.error_item.g(dagger.internal.l.a(lVar3)));
            this.f129232w = uVarD6;
            this.f129233x = new com.avito.android.crm_candidates.view.list_items.applications_list.error_item.b(uVarD6);
            u<com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.c> uVarD7 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.f(dagger.internal.l.a(lVar4)));
            this.f129234y = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new C19602c(this.f129229t, this.f129231v, this.f129233x, new com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.b(uVarD7)));
            this.f129235z = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new C19601b(uVarD8));
            this.f129198A = uVarD9;
            this.f129199B = dagger.internal.g.d(new C19603d(uVarD9, this.f129235z));
            u<com.avito.android.crm_candidates.view.list_items.inline_filters.c> uVarD10 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.inline_filters.f(dagger.internal.l.a(lVar5)));
            this.f129200C = uVarD10;
            u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.inline_filters.l(new com.avito.android.crm_candidates.view.list_items.inline_filters.b(uVarD10)));
            this.f129201D = uVarD11;
            u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.inline_filters.k(uVarD11));
            this.f129202E = uVarD12;
            this.f129203F = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.inline_filters.m(uVarD12, this.f129201D));
            u<com.avito.android.crm_candidates.view.list_items.list_filter.f> uVarD13 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.list_filter.i(dagger.internal.l.a(lVar6)));
            this.f129204G = uVarD13;
            this.f129205H = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.list_filter.e(new com.avito.android.crm_candidates.view.list_items.list_filter.b(uVarD13)));
            u<h> uVarD14 = dagger.internal.g.d(j.a());
            this.f129206I = uVarD14;
            u<com.avito.konveyor.a> uVarD15 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.survey_results.c(new com.avito.android.crm_candidates.view.list_items.survey_results.f(uVarD14)));
            this.f129207J = uVarD15;
            u<com.avito.konveyor.adapter.a> uVarD16 = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.survey_results.b(uVarD15));
            this.f129208K = uVarD16;
            this.f129209L = dagger.internal.g.d(new com.avito.android.crm_candidates.view.list_items.survey_results.d(uVarD16, this.f129207J));
        }

        @Override // com.avito.android.crm_candidates.di.candidates.b
        public final void a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
            jobCrmCandidatesFragment.f129806n0 = this.f129225p;
            jobCrmCandidatesFragment.f129808p0 = this.f129226q;
            jobCrmCandidatesFragment.f129810r0 = this.f129227r;
            jobCrmCandidatesFragment.f129812t0 = this.f129199B.get();
            jobCrmCandidatesFragment.f129813u0 = this.f129203F.get();
            jobCrmCandidatesFragment.f129814v0 = this.f129205H.get();
            jobCrmCandidatesFragment.f129815w0 = this.f129209L.get();
            jobCrmCandidatesFragment.f129816x0 = new com.avito.android.crm_candidates.view.ui.counter_view.b(this.f129218i.get());
            jobCrmCandidatesFragment.f129817y0 = this.f129224o.get();
            com.avito.android.crm_candidates.di.candidates.c cVar = this.f129210a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            jobCrmCandidatesFragment.f129818z0 = interfaceC28373aA;
            E eI2 = cVar.i();
            t.c(eI2);
            jobCrmCandidatesFragment.f129792A0 = eI2;
            jobCrmCandidatesFragment.f129793B0 = cVar.b3();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f129211b.u4();
            t.c(aVarU4);
            jobCrmCandidatesFragment.f129794C0 = aVarU4;
            R0 r0C = cVar.c();
            t.c(r0C);
            jobCrmCandidatesFragment.f129795D0 = r0C;
        }
    }

    public static b.a a() {
        return new b();
    }
}

package com.avito.android.work_profile.profile.applies.di;

import android.content.res.Resources;
import bQ0.InterfaceC25545a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.C30125n4;
import com.avito.android.di.module.C30136o4;
import com.avito.android.work_profile.domain.j;
import com.avito.android.work_profile.profile.applies.di.a;
import com.avito.android.work_profile.profile.applies.mvi.k;
import com.avito.android.work_profile.profile.applies.mvi.m;
import com.avito.android.work_profile.profile.applies.ui.AppliesToVacancyFragment;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import iQ0.C41335c;
import iQ0.InterfaceC41333a;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: DaggerAppliesToVacancyComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class i {

    /* compiled from: DaggerAppliesToVacancyComponent.java */
    public static final class b implements com.avito.android.work_profile.profile.applies.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.di.b f330840a;

        /* renamed from: b, reason: collision with root package name */
        public final l f330841b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ZP0.a> f330842c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC25545a> f330843d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f330844e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.work_profile.domain.mapper.b f330845f;

        /* renamed from: g, reason: collision with root package name */
        public final u<j> f330846g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.work_profile.domain.c f330847h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f330848i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Locale> f330849j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.mvi.f f330850k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f330851l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.mvi.d f330852m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f330853n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f330854o;

        /* renamed from: p, reason: collision with root package name */
        public final C41335c f330855p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f330856q;

        /* renamed from: r, reason: collision with root package name */
        public final l f330857r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.b f330858s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.ui.items.empty_applies.b f330859t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.applies.ui.items.applies_banner.b f330860u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f330861v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f330862w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f330863x;

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330864a;

            public a(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330864a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f330864a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.applies.di.i$b$b, reason: collision with other inner class name */
        public static final class C10279b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f330865a;

            public C10279b(cv.b bVar) {
                this.f330865a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f330865a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class c implements u<InterfaceC25545a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330866a;

            public c(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330866a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25545a interfaceC25545aU5 = this.f330866a.u5();
                t.c(interfaceC25545aU5);
                return interfaceC25545aU5;
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class d implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330867a;

            public d(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330867a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f330867a.P4();
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330868a;

            public e(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330868a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cI7 = this.f330868a.i7();
                t.c(interfaceC28481cI7);
                return interfaceC28481cI7;
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class f implements u<ZP0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330869a;

            public f(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330869a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZP0.a aVarB4 = this.f330869a.B4();
                t.c(aVarB4);
                return aVarB4;
            }
        }

        /* compiled from: DaggerAppliesToVacancyComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.applies.di.b f330870a;

            public g(com.avito.android.work_profile.profile.applies.di.b bVar) {
                this.f330870a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f330870a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public b(com.avito.android.work_profile.profile.applies.di.c cVar, com.avito.android.work_profile.profile.applies.di.b bVar, cv.b bVar2, Boolean bool, Resources resources, InterfaceC41333a interfaceC41333a, r rVar, a aVar) {
            this.f330840a = bVar;
            this.f330841b = l.a(bool);
            f fVar = new f(bVar);
            c cVar2 = new c(bVar);
            this.f330845f = new com.avito.android.work_profile.domain.mapper.b(new a(bVar));
            u<j> uVarD = dagger.internal.g.d(new com.avito.android.work_profile.data.d(fVar, cVar2, com.avito.android.work_profile.domain.mapper.d.a(), this.f330845f));
            this.f330846g = uVarD;
            this.f330847h = new com.avito.android.work_profile.domain.c(uVarD);
            this.f330848i = new g(bVar);
            com.avito.android.work_profile.profile.applies.mvi.action_handlers.b bVar3 = new com.avito.android.work_profile.profile.applies.mvi.action_handlers.b(this.f330847h, new k(new C30125n4(this.f330848i, new C30136o4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(l.a(resources)))), new d(bVar))));
            this.f330850k = new com.avito.android.work_profile.profile.applies.mvi.f(this.f330841b, bVar3);
            this.f330852m = new com.avito.android.work_profile.profile.applies.mvi.d(new C10279b(bVar2), bVar3);
            this.f330853n = new e(bVar);
            this.f330854o = dagger.internal.g.d(new com.avito.android.work_profile.profile.applies.di.f(cVar, this.f330853n, l.a(rVar)));
            this.f330855p = new C41335c(new com.avito.android.work_profile.profile.applies.mvi.i(this.f330850k, this.f330852m, m.a(), this.f330854o));
            this.f330856q = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA = l.a(interfaceC41333a);
            this.f330857r = lVarA;
            this.f330858s = new com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.b(new com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.i(lVarA));
            this.f330859t = new com.avito.android.work_profile.profile.applies.ui.items.empty_applies.b(com.avito.android.work_profile.profile.applies.ui.items.empty_applies.e.a());
            this.f330860u = new com.avito.android.work_profile.profile.applies.ui.items.applies_banner.b(new com.avito.android.work_profile.profile.applies.ui.items.applies_banner.f(this.f330857r));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f330856q);
            com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.b bVar4 = this.f330858s;
            List<u<T>> list = bVarA.f393937a;
            list.add(bVar4);
            list.add(this.f330859t);
            list.add(this.f330860u);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f330861v = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f330862w = uVarH;
            this.f330863x = dagger.internal.g.d(new com.avito.android.work_profile.profile.applies.di.g(cVar, uVarH, this.f330861v));
        }

        @Override // com.avito.android.work_profile.profile.applies.di.a
        public final void a(AppliesToVacancyFragment appliesToVacancyFragment) {
            appliesToVacancyFragment.f330912n0 = this.f330855p;
            appliesToVacancyFragment.f330913o0 = this.f330863x.get();
            com.avito.android.work_profile.profile.applies.di.b bVar = this.f330840a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            appliesToVacancyFragment.f330914p0 = interfaceC28373aA;
            appliesToVacancyFragment.f330915q0 = this.f330854o.get();
            appliesToVacancyFragment.f330916r0 = bVar.Q();
        }
    }

    /* compiled from: DaggerAppliesToVacancyComponent.java */
    public static final class c implements a.InterfaceC10278a {
        public c() {
        }

        @Override // com.avito.android.work_profile.profile.applies.di.a.InterfaceC10278a
        public final com.avito.android.work_profile.profile.applies.di.a a(boolean z12, Resources resources, AppliesToVacancyFragment appliesToVacancyFragment, r rVar, com.avito.android.work_profile.profile.applies.di.b bVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(new com.avito.android.work_profile.profile.applies.di.c(), bVar, interfaceC39417a, Boolean.valueOf(z12), resources, appliesToVacancyFragment, rVar, null);
        }
    }

    public static a.InterfaceC10278a a() {
        return new c();
    }
}

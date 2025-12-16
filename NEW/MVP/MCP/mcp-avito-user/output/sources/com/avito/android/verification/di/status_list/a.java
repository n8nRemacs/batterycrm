package com.avito.android.verification.di.status_list;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import com.avito.android.verification.di.status_list.b;
import com.avito.android.verification.verification_status_list.VerificationStatusListArgs;
import com.avito.android.verification.verification_status_list.VerificationStatusListFragment;
import com.avito.android.verification.verification_status_list.mvi.h;
import com.avito.android.verification.verification_status_list.mvi.k;
import com.avito.android.verification.verification_status_list.mvi.m;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVerificationStatusListComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationStatusListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.status_list.b.a
        public final com.avito.android.verification.di.status_list.b a(VerificationStatusListArgs verificationStatusListArgs, r rVar, com.avito.android.tariff.cpa.configure_info.items.feature.e eVar, com.avito.android.verification.verification_form_builder.a aVar, com.avito.android.verification.di.status_list.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, verificationStatusListArgs, rVar, eVar, aVar, null);
        }
    }

    /* compiled from: DaggerVerificationStatusListComponent.java */
    public static final class c implements com.avito.android.verification.di.status_list.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323825a = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.verification.inn.list.button.e> f323826b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.verification.inn.list.button.b f323827c;

        /* renamed from: d, reason: collision with root package name */
        public final l f323828d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.verification.list_items.attributed_text.c f323829e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.verification.common.list.verification_group.b f323830f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.space.d> f323831g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.verification.common.list.space.c f323832h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.verification.list_items.banner.c f323833i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.verification.common.list.modern_status.b f323834j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.verification.list_items.verification_status.c f323835k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323836l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323837m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f323838n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f323839o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323840p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323841q;

        /* renamed from: r, reason: collision with root package name */
        public final u<A1> f323842r;

        /* renamed from: s, reason: collision with root package name */
        public final u<R0> f323843s;

        /* renamed from: t, reason: collision with root package name */
        public final h f323844t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28373a> f323845u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.verification.verification_status_list.mvi.d f323846v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC35741a1> f323847w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.verification.verification_status_list.l f323848x;

        /* compiled from: DaggerVerificationStatusListComponent.java */
        /* renamed from: com.avito.android.verification.di.status_list.a$c$a, reason: collision with other inner class name */
        public static final class C10025a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.status_list.c f323849a;

            public C10025a(com.avito.android.verification.di.status_list.c cVar) {
                this.f323849a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f323849a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVerificationStatusListComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323850a;

            public b(cv.b bVar) {
                this.f323850a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323850a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationStatusListComponent.java */
        /* renamed from: com.avito.android.verification.di.status_list.a$c$c, reason: collision with other inner class name */
        public static final class C10026c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.status_list.c f323851a;

            public C10026c(com.avito.android.verification.di.status_list.c cVar) {
                this.f323851a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323851a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationStatusListComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.status_list.c f323852a;

            public d(com.avito.android.verification.di.status_list.c cVar) {
                this.f323852a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f323852a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerVerificationStatusListComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.status_list.c f323853a;

            public e(com.avito.android.verification.di.status_list.c cVar) {
                this.f323853a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cY2 = this.f323853a.Y2();
                t.c(interfaceC28481cY2);
                return interfaceC28481cY2;
            }
        }

        /* compiled from: DaggerVerificationStatusListComponent.java */
        public static final class f implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.status_list.c f323854a;

            public f(com.avito.android.verification.di.status_list.c cVar) {
                this.f323854a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323854a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.status_list.c cVar, cv.b bVar, VerificationStatusListArgs verificationStatusListArgs, r rVar, w wVar, com.avito.android.verification.inn.list.button.c cVar2, C10024a c10024a) {
            u<com.avito.android.verification.inn.list.button.e> uVarD = dagger.internal.g.d(new com.avito.android.verification.inn.list.button.f(l.a(cVar2)));
            this.f323826b = uVarD;
            this.f323827c = new com.avito.android.verification.inn.list.button.b(uVarD);
            l lVarA = l.a(wVar);
            this.f323828d = lVarA;
            this.f323829e = new com.avito.android.verification.list_items.attributed_text.c(new com.avito.android.verification.list_items.attributed_text.f(lVarA));
            this.f323830f = new com.avito.android.verification.common.list.verification_group.b(new com.avito.android.verification.common.list.verification_group.f(lVarA));
            u<com.avito.android.verification.common.list.space.d> uVarD2 = dagger.internal.g.d(com.avito.android.verification.common.list.space.e.a());
            this.f323831g = uVarD2;
            this.f323832h = new com.avito.android.verification.common.list.space.c(uVarD2);
            l lVar = this.f323828d;
            this.f323833i = new com.avito.android.verification.list_items.banner.c(new com.avito.android.verification.list_items.banner.f(lVar));
            this.f323834j = new com.avito.android.verification.common.list.modern_status.b(new com.avito.android.verification.common.list.modern_status.f(lVar));
            this.f323835k = new com.avito.android.verification.list_items.verification_status.c(new com.avito.android.verification.list_items.verification_status.g(lVar));
            A.b bVarA = A.a(7, 1);
            bVarA.f393938b.add(this.f323825a);
            com.avito.android.verification.inn.list.button.b bVar2 = this.f323827c;
            List<u<T>> list = bVarA.f393937a;
            list.add(bVar2);
            list.add(this.f323829e);
            list.add(this.f323830f);
            list.add(this.f323832h);
            list.add(this.f323833i);
            list.add(this.f323834j);
            list.add(this.f323835k);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323836l = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323837m = uVarH;
            this.f323838n = dagger.internal.g.d(new com.avito.android.verification.di.status_list.e(uVarH, this.f323836l));
            this.f323839o = new e(cVar);
            this.f323840p = dagger.internal.g.d(new g(l.a(rVar), this.f323839o));
            this.f323841q = new b(bVar);
            this.f323842r = new f(cVar);
            this.f323843s = new C10026c(cVar);
            com.avito.android.verification.verification_status_list.h hVar = new com.avito.android.verification.verification_status_list.h(l.a(verificationStatusListArgs), this.f323842r, this.f323843s);
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar = this.f323841q;
            this.f323844t = new h(uVar, hVar);
            this.f323846v = new com.avito.android.verification.verification_status_list.mvi.d(uVar, hVar, new C10025a(cVar));
            this.f323848x = new com.avito.android.verification.verification_status_list.l(new k(this.f323844t, this.f323846v, new m(new com.avito.android.verification.verification_status_list.b(com.avito.android.verification.common.b.a()), new d(cVar)), this.f323840p));
        }

        @Override // com.avito.android.verification.di.status_list.b
        public final void a(VerificationStatusListFragment verificationStatusListFragment) {
            verificationStatusListFragment.f325746n0 = this.f323838n.get();
            verificationStatusListFragment.f325747o0 = this.f323840p.get();
            verificationStatusListFragment.f325748p0 = this.f323848x;
        }
    }

    public static b.a a() {
        return new b();
    }
}

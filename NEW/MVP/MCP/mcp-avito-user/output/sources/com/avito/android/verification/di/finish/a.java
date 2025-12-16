package com.avito.android.verification.di.finish;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import com.avito.android.verification.di.finish.b;
import com.avito.android.verification.verification_finish.VerificationFinishArgs;
import com.avito.android.verification.verification_finish.VerificationFinishFragment;
import com.avito.android.verification.verification_finish.mvi.k;
import com.avito.android.verification.verification_finish.mvi.m;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerVerificationFinishComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationFinishComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.finish.b.a
        public final com.avito.android.verification.di.finish.b a(r rVar, VerificationFinishArgs verificationFinishArgs, com.avito.android.tariff.cpa.configure_info.items.feature.e eVar, com.avito.android.verification.di.finish.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, verificationFinishArgs, eVar, null);
        }
    }

    /* compiled from: DaggerVerificationFinishComponent.java */
    public static final class c implements com.avito.android.verification.di.finish.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<A1> f323607a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f323608b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f323609c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.verification.verification_finish.mvi.f f323610d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f323611e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.verification.verification_finish.mvi.d f323612f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35741a1> f323613g;

        /* renamed from: h, reason: collision with root package name */
        public final m f323614h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f323615i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323616j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.verification.verification_finish.b f323617k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f323618l;

        /* renamed from: m, reason: collision with root package name */
        public final l f323619m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.verification.list_items.verification_status.c f323620n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.verification.list_items.attributed_text.c f323621o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.verification.common.list.space.d> f323622p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.verification.common.list.space.c f323623q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.verification.list_items.image.b f323624r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.verification.list_items.icon_text.c f323625s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.verification.list_items.banner.c f323626t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f323627u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f323628v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f323629w;

        /* compiled from: DaggerVerificationFinishComponent.java */
        /* renamed from: com.avito.android.verification.di.finish.a$c$a, reason: collision with other inner class name */
        public static final class C10010a implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.finish.c f323630a;

            public C10010a(com.avito.android.verification.di.finish.c cVar) {
                this.f323630a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f323630a.h0();
                t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerVerificationFinishComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f323631a;

            public b(cv.b bVar) {
                this.f323631a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323631a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationFinishComponent.java */
        /* renamed from: com.avito.android.verification.di.finish.a$c$c, reason: collision with other inner class name */
        public static final class C10011c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.finish.c f323632a;

            public C10011c(com.avito.android.verification.di.finish.c cVar) {
                this.f323632a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323632a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationFinishComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.finish.c f323633a;

            public d(com.avito.android.verification.di.finish.c cVar) {
                this.f323633a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f323633a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerVerificationFinishComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.finish.c f323634a;

            public e(com.avito.android.verification.di.finish.c cVar) {
                this.f323634a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323634a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVerificationFinishComponent.java */
        public static final class f implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.finish.c f323635a;

            public f(com.avito.android.verification.di.finish.c cVar) {
                this.f323635a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323635a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.finish.c cVar, cv.b bVar, r rVar, VerificationFinishArgs verificationFinishArgs, w wVar, C10009a c10009a) {
            this.f323607a = new f(cVar);
            this.f323608b = new C10011c(cVar);
            com.avito.android.verification.verification_finish.m mVar = new com.avito.android.verification.verification_finish.m(l.a(verificationFinishArgs), this.f323607a, this.f323608b, new C10010a(cVar));
            this.f323610d = new com.avito.android.verification.verification_finish.mvi.f(mVar);
            b bVar2 = new b(bVar);
            this.f323611e = bVar2;
            this.f323612f = new com.avito.android.verification.verification_finish.mvi.d(bVar2, mVar);
            this.f323614h = new m(new com.avito.android.verification.verification_finish.e(com.avito.android.verification.common.b.a()), new d(cVar), this.f323611e);
            this.f323615i = new e(cVar);
            this.f323616j = dagger.internal.g.d(new i(l.a(rVar), this.f323615i));
            this.f323617k = new com.avito.android.verification.verification_finish.b(new com.avito.android.verification.verification_finish.mvi.i(this.f323610d, this.f323612f, k.a(), this.f323614h, this.f323616j));
            this.f323618l = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA = l.a(wVar);
            this.f323619m = lVarA;
            this.f323620n = new com.avito.android.verification.list_items.verification_status.c(new com.avito.android.verification.list_items.verification_status.g(lVarA));
            this.f323621o = new com.avito.android.verification.list_items.attributed_text.c(new com.avito.android.verification.list_items.attributed_text.f(lVarA));
            u<com.avito.android.verification.common.list.space.d> uVarD = dagger.internal.g.d(com.avito.android.verification.common.list.space.e.a());
            this.f323622p = uVarD;
            this.f323623q = new com.avito.android.verification.common.list.space.c(uVarD);
            this.f323624r = new com.avito.android.verification.list_items.image.b(com.avito.android.verification.list_items.image.d.a());
            l lVar = this.f323619m;
            this.f323625s = new com.avito.android.verification.list_items.icon_text.c(new com.avito.android.verification.list_items.icon_text.f(lVar));
            this.f323626t = new com.avito.android.verification.list_items.banner.c(new com.avito.android.verification.list_items.banner.f(lVar));
            A.b bVarA = A.a(6, 1);
            bVarA.f393938b.add(this.f323618l);
            com.avito.android.verification.list_items.verification_status.c cVar2 = this.f323620n;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f323621o);
            list.add(this.f323623q);
            list.add(this.f323624r);
            list.add(this.f323625s);
            list.add(this.f323626t);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f323627u = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f323628v = uVarH;
            this.f323629w = dagger.internal.g.d(new g(uVarH, this.f323627u));
        }

        @Override // com.avito.android.verification.di.finish.b
        public final void a(VerificationFinishFragment verificationFinishFragment) {
            verificationFinishFragment.f325229n0 = this.f323617k;
            verificationFinishFragment.f325231p0 = this.f323629w.get();
            verificationFinishFragment.f325232q0 = this.f323616j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

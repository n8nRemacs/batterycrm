package com.avito.android.comfortable_deal.clients.di;

import AK0.l;
import Jp.InterfaceC14233a;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.clients.ClientsFragment;
import com.avito.android.comfortable_deal.clients.di.a;
import com.avito.android.comfortable_deal.clients.k0;
import com.avito.android.comfortable_deal.clients.model.ClientsArguments;
import com.avito.android.comfortable_deal.clients.mvi.j;
import com.avito.android.comfortable_deal.clients.mvi.m;
import com.avito.android.comfortable_deal.clients.mvi.o;
import com.avito.android.comfortable_deal.clients.mvi.q;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import cv.InterfaceC39417a;
import d20.C39487a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerClientsComponent.java */
@e
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: DaggerClientsComponent.java */
    /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b, reason: collision with other inner class name */
    public static final class C3529b implements com.avito.android.comfortable_deal.clients.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f120194a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39387a> f120195b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f120196c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14233a> f120197d;

        /* renamed from: e, reason: collision with root package name */
        public final u<l> f120198e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f120199f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f120200g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.repository.l f120201h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.clients.interactor.b f120202i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f120203j;

        /* renamed from: k, reason: collision with root package name */
        public final j f120204k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f120205l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.clients.mvi.h f120206m;

        /* renamed from: n, reason: collision with root package name */
        public final q f120207n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f120208o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f120209p;

        /* renamed from: q, reason: collision with root package name */
        public final k0 f120210q;

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120211a;

            public a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120211a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f120211a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$b, reason: collision with other inner class name */
        public static final class C3530b implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120212a;

            public C3530b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120212a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f120212a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$c */
        public static final class c implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120213a;

            public c(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120213a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f120213a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$d */
        public static final class d implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120214a;

            public d(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120214a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120214a.E();
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$e */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120215a;

            public e(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120215a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f120215a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$f */
        public static final class f implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120216a;

            public f(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120216a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120216a.M2();
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$g */
        public static final class g implements u<l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120217a;

            public g(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120217a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120217a.r();
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.clients.di.b$b$h */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120218a;

            public h(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120218a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f120218a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C3529b(com.avito.android.comfortable_deal.di.a aVar, cv.b bVar, C28478k c28478k, ClientsArguments clientsArguments, a aVar2) {
            this.f120194a = bVar;
            c cVar = new c(aVar);
            e eVar = new e(aVar);
            this.f120196c = eVar;
            com.avito.android.comfortable_deal.repository.l lVar = new com.avito.android.comfortable_deal.repository.l(new g(aVar), new d(aVar), new f(aVar), cVar, eVar, new C3530b(aVar));
            this.f120201h = lVar;
            this.f120202i = new com.avito.android.comfortable_deal.clients.interactor.b(lVar, new com.avito.android.comfortable_deal.clients.use_case.e(lVar, eVar));
            dagger.internal.l lVarA = dagger.internal.l.a(clientsArguments);
            this.f120203j = lVarA;
            com.avito.android.comfortable_deal.clients.interactor.b bVar2 = this.f120202i;
            this.f120204k = new j(bVar2, lVarA);
            this.f120206m = new com.avito.android.comfortable_deal.clients.mvi.h(bVar2, new com.avito.android.comfortable_deal.clients.use_case.b(this.f120201h, this.f120196c), new ap.d(new a(aVar)));
            this.f120207n = new q(com.avito.android.comfortable_deal.clients.mvi.builder.c.a());
            this.f120208o = new h(aVar);
            this.f120209p = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f120208o);
            this.f120210q = new k0(new m(this.f120204k, this.f120206m, o.a(), this.f120207n, this.f120209p, this.f120203j));
        }

        @Override // com.avito.android.comfortable_deal.clients.di.a
        public final void a(ClientsFragment clientsFragment) {
            clientsFragment.f120093n0 = this.f120210q;
            clientsFragment.f120095p0 = this.f120209p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f120194a.u4();
            t.c(aVarU4);
            clientsFragment.f120097r0 = aVarU4;
        }
    }

    /* compiled from: DaggerClientsComponent.java */
    public static final class c implements a.b {
        public c() {
        }

        @Override // com.avito.android.comfortable_deal.clients.di.a.b
        public final com.avito.android.comfortable_deal.clients.di.a a(com.avito.android.comfortable_deal.di.a aVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ClientsArguments clientsArguments) {
            interfaceC39417a.getClass();
            clientsArguments.getClass();
            return new C3529b(aVar, interfaceC39417a, c28478k, clientsArguments, null);
        }
    }

    public static a.b a() {
        return new c();
    }
}

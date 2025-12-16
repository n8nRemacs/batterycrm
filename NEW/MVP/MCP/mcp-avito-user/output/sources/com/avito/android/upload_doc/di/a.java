package com.avito.android.upload_doc.di;

import Y41.l;
import Y41.p;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.H;
import com.avito.android.remote.R0;
import com.avito.android.upload_doc.di.b;
import com.avito.android.upload_doc.lifecycle.GigUploadDocFragment;
import com.avito.android.util.C;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import iH.InterfaceC41285a;

/* compiled from: DaggerGigUploadDocComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerGigUploadDocComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.upload_doc.di.b.a
        public final com.avito.android.upload_doc.di.b a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources, p pVar, GigUploadDocDeeplink.FlowType flowType, l lVar, l lVar2, l lVar3) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, c28478k, resources, pVar, flowType, lVar, lVar2, lVar3, null);
        }
    }

    /* compiled from: DaggerGigUploadDocComponent.java */
    public static final class c implements com.avito.android.upload_doc.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.view.sections.c> f306733A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f306734B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.l f306735C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.view.document.c> f306736D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f306737E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.upload_doc.view.sections.b f306738F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.view.checkbox.c> f306739G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f306740H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f306741I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f306742J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f306743K;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.upload_doc.di.d f306744a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f306745b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41285a> f306746c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f306747d;

        /* renamed from: e, reason: collision with root package name */
        public final u<MG0.a> f306748e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f306749f;

        /* renamed from: g, reason: collision with root package name */
        public final u<x> f306750g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Application> f306751h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Context> f306752i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f306753j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Gson> f306754k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f306755l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f306756m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C> f306757n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28373a> f306758o;

        /* renamed from: p, reason: collision with root package name */
        public final u<E> f306759p;

        /* renamed from: q, reason: collision with root package name */
        public final u<H> f306760q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.mvi.interactor.a> f306761r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f306762s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.upload_doc.lifecycle.i f306763t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f306764u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f306765v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.view.title.d> f306766w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.upload_doc.view.title.b f306767x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.upload_doc.view.description.d> f306768y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.upload_doc.view.description.b f306769z;

        /* compiled from: DaggerGigUploadDocComponent.java */
        /* renamed from: com.avito.android.upload_doc.di.a$c$a, reason: collision with other inner class name */
        public static final class C9428a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306770a;

            public C9428a(com.avito.android.upload_doc.di.d dVar) {
                this.f306770a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f306770a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306771a;

            public b(com.avito.android.upload_doc.di.d dVar) {
                this.f306771a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f306771a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        /* renamed from: com.avito.android.upload_doc.di.a$c$c, reason: collision with other inner class name */
        public static final class C9429c implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306772a;

            public C9429c(com.avito.android.upload_doc.di.d dVar) {
                this.f306772a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f306772a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class d implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306773a;

            public d(com.avito.android.upload_doc.di.d dVar) {
                this.f306773a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarRm = this.f306773a.rm();
                t.c(aVarRm);
                return aVarRm;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306774a;

            public e(com.avito.android.upload_doc.di.d dVar) {
                this.f306774a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f306774a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class f implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306775a;

            public f(com.avito.android.upload_doc.di.d dVar) {
                this.f306775a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f306775a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class g implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306776a;

            public g(com.avito.android.upload_doc.di.d dVar) {
                this.f306776a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306776a.g();
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class h implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306777a;

            public h(com.avito.android.upload_doc.di.d dVar) {
                this.f306777a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f306777a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class i implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f306778a;

            public i(cv.b bVar) {
                this.f306778a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f306778a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class j implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306779a;

            public j(com.avito.android.upload_doc.di.d dVar) {
                this.f306779a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hK2 = this.f306779a.K();
                t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class k implements u<InterfaceC41285a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306780a;

            public k(com.avito.android.upload_doc.di.d dVar) {
                this.f306780a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41285a interfaceC41285aUh = this.f306780a.uh();
                t.c(interfaceC41285aUh);
                return interfaceC41285aUh;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class l implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306781a;

            public l(com.avito.android.upload_doc.di.d dVar) {
                this.f306781a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f306781a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class m implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306782a;

            public m(com.avito.android.upload_doc.di.d dVar) {
                this.f306782a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f306782a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerGigUploadDocComponent.java */
        public static final class n implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.upload_doc.di.d f306783a;

            public n(com.avito.android.upload_doc.di.d dVar) {
                this.f306783a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0F2 = this.f306783a.f2();
                t.c(r0F2);
                return r0F2;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.upload_doc.di.d dVar, cv.b bVar, C28478k c28478k, Resources resources, p pVar, GigUploadDocDeeplink.FlowType flowType, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, C9427a c9427a) {
            this.f306744a = dVar;
            this.f306745b = bVar;
            this.f306746c = new k(dVar);
            this.f306748e = dagger.internal.g.d(new com.avito.android.upload_doc.di.f(new n(dVar)));
            this.f306749f = dagger.internal.l.a(flowType);
            this.f306750g = new h(dVar);
            this.f306751h = new C9429c(dVar);
            this.f306753j = dagger.internal.g.d(new com.avito.android.upload_doc.di.g(this.f306751h, com.avito.android.photo_storage.k.a(new g(dVar))));
            u<com.avito.android.photo_picker.converter.f> uVarD = dagger.internal.g.d(new com.avito.android.upload_doc.di.h(this.f306753j, N70.d.a(new l(dVar))));
            this.f306755l = uVarD;
            m mVar = new m(dVar);
            f fVar = new f(dVar);
            b bVar2 = new b(dVar);
            this.f306758o = bVar2;
            C9428a c9428a = new C9428a(dVar);
            this.f306759p = c9428a;
            j jVar = new j(dVar);
            this.f306760q = jVar;
            u<com.avito.android.upload_doc.mvi.interactor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.upload_doc.mvi.interactor.j(this.f306749f, uVarD, this.f306746c, this.f306748e, this.f306750g, mVar, fVar, bVar2, c9428a, jVar));
            this.f306761r = uVarD2;
            com.avito.android.upload_doc.mvi.logic.f fVar2 = new com.avito.android.upload_doc.mvi.logic.f(uVarD2);
            i iVar = new i(bVar);
            this.f306762s = iVar;
            this.f306763t = new com.avito.android.upload_doc.lifecycle.i(new com.avito.android.upload_doc.mvi.logic.i(fVar2, new com.avito.android.upload_doc.mvi.logic.d(this.f306749f, uVarD2, this.f306758o, this.f306759p, this.f306760q, iVar), com.avito.android.upload_doc.mvi.logic.k.a(), com.avito.android.upload_doc.mvi.logic.m.a()));
            this.f306764u = new e(dVar);
            this.f306765v = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f306764u);
            u<com.avito.android.upload_doc.view.title.d> uVarD3 = dagger.internal.g.d(com.avito.android.upload_doc.view.title.f.a());
            this.f306766w = uVarD3;
            this.f306767x = new com.avito.android.upload_doc.view.title.b(uVarD3);
            u<com.avito.android.upload_doc.view.description.d> uVarD4 = dagger.internal.g.d(com.avito.android.upload_doc.view.description.f.a());
            this.f306768y = uVarD4;
            this.f306769z = new com.avito.android.upload_doc.view.description.b(uVarD4);
            this.f306733A = dagger.internal.g.d(com.avito.android.upload_doc.view.sections.e.a());
            this.f306734B = dagger.internal.l.a(lVar);
            this.f306735C = dagger.internal.l.a(lVar2);
            u<com.avito.android.upload_doc.view.document.c> uVarD5 = dagger.internal.g.d(new com.avito.android.upload_doc.view.document.h(this.f306734B, this.f306735C, dagger.internal.l.a(lVar3)));
            this.f306736D = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new PG0.d(new com.avito.android.upload_doc.view.document.b(uVarD5)));
            this.f306737E = uVarD6;
            this.f306738F = new com.avito.android.upload_doc.view.sections.b(this.f306749f, uVarD6, this.f306733A, this.f306762s, this.f306758o, this.f306759p, this.f306760q);
            u<com.avito.android.upload_doc.view.checkbox.c> uVarD7 = dagger.internal.g.d(new com.avito.android.upload_doc.view.checkbox.f(dagger.internal.l.a(pVar)));
            this.f306739G = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new PG0.e(this.f306767x, this.f306769z, this.f306738F, new com.avito.android.upload_doc.view.checkbox.b(this.f306749f, uVarD7, new d(dVar), this.f306758o, this.f306759p, this.f306760q)));
            this.f306741I = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new PG0.c(uVarD8));
            this.f306742J = uVarD9;
            this.f306743K = dagger.internal.g.d(new PG0.f(uVarD9, this.f306741I));
        }

        @Override // com.avito.android.upload_doc.di.b
        public final void a(GigUploadDocFragment gigUploadDocFragment) {
            gigUploadDocFragment.f306813n0 = this.f306763t;
            gigUploadDocFragment.f306815p0 = this.f306765v.get();
            gigUploadDocFragment.f306816q0 = this.f306743K.get();
            gigUploadDocFragment.f306817r0 = this.f306744a.X();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f306745b.u4();
            t.c(aVarU4);
            gigUploadDocFragment.f306818s0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}

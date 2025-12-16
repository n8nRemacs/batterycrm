package com.avito.android.gig_apply.di;

import android.app.Application;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_apply.di.e;
import com.avito.android.gig_apply.domain.i;
import com.avito.android.gig_apply.mvi.B;
import com.avito.android.gig_apply.mvi.p;
import com.avito.android.gig_apply.mvi.s;
import com.avito.android.gig_apply.mvi.v;
import com.avito.android.gig_apply.mvi.z;
import com.avito.android.gig_apply.ui.GigSlotActivity;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import mH.C43965d;

/* compiled from: DaggerGigSlotComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: DaggerGigSlotComponent.java */
    /* renamed from: com.avito.android.gig_apply.di.b$b, reason: collision with other inner class name */
    public static final class C4671b implements e.a {
        public C4671b() {
        }

        @Override // com.avito.android.gig_apply.di.e.a
        public final e a(GigSlotOpenParams gigSlotOpenParams, f fVar, InterfaceC39417a interfaceC39417a) {
            gigSlotOpenParams.getClass();
            interfaceC39417a.getClass();
            return new c(fVar, interfaceC39417a, gigSlotOpenParams, null);
        }
    }

    /* compiled from: DaggerGigSlotComponent.java */
    public static final class c implements com.avito.android.gig_apply.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f159635a;

        /* renamed from: b, reason: collision with root package name */
        public final l f159636b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f159637c;

        /* renamed from: d, reason: collision with root package name */
        public final u<HG.a> f159638d;

        /* renamed from: e, reason: collision with root package name */
        public final i f159639e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f159640f;

        /* renamed from: g, reason: collision with root package name */
        public final C43965d f159641g;

        /* renamed from: h, reason: collision with root package name */
        public final p f159642h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Application> f159643i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Resources> f159644j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f159645k;

        /* renamed from: l, reason: collision with root package name */
        public final u<x> f159646l;

        /* renamed from: m, reason: collision with root package name */
        public final u<SK0.b> f159647m;

        /* renamed from: n, reason: collision with root package name */
        public final B f159648n;

        /* compiled from: DaggerGigSlotComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159649a;

            public a(com.avito.android.gig_apply.di.f fVar) {
                this.f159649a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f159649a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        /* renamed from: com.avito.android.gig_apply.di.b$c$b, reason: collision with other inner class name */
        public static final class C4672b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159650a;

            public C4672b(com.avito.android.gig_apply.di.f fVar) {
                this.f159650a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f159650a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        /* renamed from: com.avito.android.gig_apply.di.b$c$c, reason: collision with other inner class name */
        public static final class C4673c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159651a;

            public C4673c(com.avito.android.gig_apply.di.f fVar) {
                this.f159651a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f159651a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f159652a;

            public d(cv.b bVar) {
                this.f159652a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f159652a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        public static final class e implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159653a;

            public e(com.avito.android.gig_apply.di.f fVar) {
                this.f159653a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f159653a.H1();
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        public static final class f implements u<HG.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159654a;

            public f(com.avito.android.gig_apply.di.f fVar) {
                this.f159654a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                HG.a aVarJk = this.f159654a.Jk();
                t.c(aVarJk);
                return aVarJk;
            }
        }

        /* compiled from: DaggerGigSlotComponent.java */
        public static final class g implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_apply.di.f f159655a;

            public g(com.avito.android.gig_apply.di.f fVar) {
                this.f159655a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarI6 = this.f159655a.I6();
                t.c(bVarI6);
                return bVarI6;
            }
        }

        public c(com.avito.android.gig_apply.di.f fVar, cv.b bVar, GigSlotOpenParams gigSlotOpenParams, a aVar) {
            this.f159635a = bVar;
            l lVarA = l.a(gigSlotOpenParams);
            this.f159636b = lVarA;
            d dVar = new d(bVar);
            this.f159637c = dVar;
            i iVar = new i(new f(fVar));
            this.f159639e = iVar;
            C43965d c43965d = new C43965d(new a(fVar));
            this.f159641g = c43965d;
            this.f159642h = new p(lVarA, dVar, iVar, c43965d, new com.avito.android.gig_apply.domain.g(iVar, lVarA));
            u<Resources> uVarD = dagger.internal.g.d(new h(new C4672b(fVar)));
            this.f159644j = uVarD;
            com.avito.android.gig_apply.mvi.x xVar = new com.avito.android.gig_apply.mvi.x(uVarD);
            e eVar = new e(fVar);
            C4673c c4673c = new C4673c(fVar);
            l lVar = this.f159636b;
            C43965d c43965d2 = this.f159641g;
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar = this.f159637c;
            this.f159648n = new B(new v(this.f159642h, xVar, new z(lVar, eVar, c4673c, uVarD, c43965d2, uVar), new s(lVar, this.f159639e, uVar, new g(fVar))));
        }

        @Override // com.avito.android.gig_apply.di.e
        public final void a(GigSlotActivity gigSlotActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f159635a.u4();
            t.c(aVarU4);
            gigSlotActivity.f159872m = aVarU4;
            gigSlotActivity.f159873n = this.f159648n;
        }
    }

    public static e.a a() {
        return new C4671b();
    }
}

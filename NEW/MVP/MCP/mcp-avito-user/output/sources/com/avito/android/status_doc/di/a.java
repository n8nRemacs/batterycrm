package com.avito.android.status_doc.di;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.H;
import com.avito.android.status_doc.di.b;
import com.avito.android.status_doc.lifecycle.GigStatusDocFragment;
import com.avito.android.status_doc.mvi.logic.h;
import com.avito.android.status_doc.mvi.logic.j;
import com.avito.android.status_doc.mvi.logic.l;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerGigStatusDocComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerGigStatusDocComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.status_doc.di.b.a
        public final com.avito.android.status_doc.di.b a(com.avito.android.status_doc.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, resources, null);
        }
    }

    /* compiled from: DaggerGigStatusDocComponent.java */
    public static final class c implements com.avito.android.status_doc.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<WG.a> f284849a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f284850b;

        /* renamed from: c, reason: collision with root package name */
        public final u<E> f284851c;

        /* renamed from: d, reason: collision with root package name */
        public final u<H> f284852d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.status_doc.mvi.interactor.a> f284853e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f284854f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.status_doc.lifecycle.f f284855g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f284856h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f284857i;

        /* compiled from: DaggerGigStatusDocComponent.java */
        /* renamed from: com.avito.android.status_doc.di.a$c$a, reason: collision with other inner class name */
        public static final class C8517a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.status_doc.di.c f284858a;

            public C8517a(com.avito.android.status_doc.di.c cVar) {
                this.f284858a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f284858a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerGigStatusDocComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.status_doc.di.c f284859a;

            public b(com.avito.android.status_doc.di.c cVar) {
                this.f284859a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f284859a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGigStatusDocComponent.java */
        /* renamed from: com.avito.android.status_doc.di.a$c$c, reason: collision with other inner class name */
        public static final class C8518c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.status_doc.di.c f284860a;

            public C8518c(com.avito.android.status_doc.di.c cVar) {
                this.f284860a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f284860a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerGigStatusDocComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f284861a;

            public d(cv.b bVar) {
                this.f284861a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f284861a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigStatusDocComponent.java */
        public static final class e implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.status_doc.di.c f284862a;

            public e(com.avito.android.status_doc.di.c cVar) {
                this.f284862a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hK2 = this.f284862a.K();
                t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerGigStatusDocComponent.java */
        public static final class f implements u<WG.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.status_doc.di.c f284863a;

            public f(com.avito.android.status_doc.di.c cVar) {
                this.f284863a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WG.a aVarMj = this.f284863a.mj();
                t.c(aVarMj);
                return aVarMj;
            }
        }

        public c(com.avito.android.status_doc.di.c cVar, cv.b bVar, C28478k c28478k, Resources resources, C8516a c8516a) {
            f fVar = new f(cVar);
            b bVar2 = new b(cVar);
            this.f284850b = bVar2;
            u<com.avito.android.status_doc.mvi.interactor.a> uVarD = g.d(new com.avito.android.status_doc.mvi.interactor.d(fVar, bVar2, new C8517a(cVar), new e(cVar)));
            this.f284853e = uVarD;
            this.f284855g = new com.avito.android.status_doc.lifecycle.f(new h(new com.avito.android.status_doc.mvi.logic.e(uVarD), new com.avito.android.status_doc.mvi.logic.c(uVarD, this.f284850b, new d(bVar)), j.a(), l.a()));
            this.f284856h = new C8518c(cVar);
            this.f284857i = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f284856h);
        }

        @Override // com.avito.android.status_doc.di.b
        public final void a(GigStatusDocFragment gigStatusDocFragment) {
            gigStatusDocFragment.f284881n0 = this.f284855g;
            gigStatusDocFragment.f284883p0 = this.f284857i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

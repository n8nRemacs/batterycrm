package com.avito.android.tariff_cpt.configure.forbidden.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.forbidden.CptForbiddenFragment;
import com.avito.android.tariff_cpt.configure.forbidden.di.a;
import com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g;
import com.avito.android.tariff_cpt.configure.forbidden.viewmodel.j;
import com.avito.android.tariff_cpt.configure.forbidden.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCptForbiddenComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: DaggerCptForbiddenComponent.java */
    public static final class b implements com.avito.android.tariff_cpt.configure.forbidden.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<JC0.a> f297614a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f297615b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.forbidden.viewmodel.f f297616c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f297617d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f297618e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f297619f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f297620g;

        /* renamed from: h, reason: collision with root package name */
        public final l f297621h;

        /* compiled from: DaggerCptForbiddenComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f297622a;

            public a(cv.b bVar) {
                this.f297622a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297622a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCptForbiddenComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.forbidden.di.d$b$b, reason: collision with other inner class name */
        public static final class C9086b implements u<JC0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297623a;

            public C9086b(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297623a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JC0.a aVarLl = this.f297623a.Ll();
                t.c(aVarLl);
                return aVarLl;
            }
        }

        /* compiled from: DaggerCptForbiddenComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297624a;

            public c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297624a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f297624a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCptForbiddenComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.forbidden.di.d$b$d, reason: collision with other inner class name */
        public static final class C9087d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297625a;

            public C9087d(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297625a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f297625a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, a aVar) {
            C9086b c9086b = new C9086b(dVar);
            c cVar = new c(dVar);
            this.f297615b = cVar;
            this.f297616c = new com.avito.android.tariff_cpt.configure.forbidden.viewmodel.f(c9086b, cVar);
            this.f297617d = new a(bVar);
            this.f297618e = new C9087d(dVar);
            u<C28478k> uVarD = g.d(new com.avito.android.tariff_cpt.configure.forbidden.di.c(l.a(rVar)));
            this.f297619f = uVarD;
            this.f297620g = com.avito.android.advert.item.delivery_suggests.l.i(this.f297618e, uVarD);
            this.f297621h = l.a(new k(new j(this.f297616c, com.avito.android.tariff_cpt.configure.forbidden.viewmodel.c.a(), this.f297615b, this.f297617d, this.f297620g)));
        }

        @Override // com.avito.android.tariff_cpt.configure.forbidden.di.a
        public final void a(CptForbiddenFragment cptForbiddenFragment) {
            cptForbiddenFragment.f297586n0 = (g.a) this.f297621h.f393949a;
            cptForbiddenFragment.f297587o0 = this.f297620g.get();
        }
    }

    /* compiled from: DaggerCptForbiddenComponent.java */
    public static final class c implements a.InterfaceC9085a {
        public c() {
        }

        @Override // com.avito.android.tariff_cpt.configure.forbidden.di.a.InterfaceC9085a
        public final com.avito.android.tariff_cpt.configure.forbidden.di.a a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar) {
            interfaceC39417a.getClass();
            return new b(dVar, interfaceC39417a, rVar, null);
        }
    }

    public static a.InterfaceC9085a a() {
        return new c();
    }
}

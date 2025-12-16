package com.avito.android.tariff_cpt.configure.migration.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.migration.CptMigrationFragment;
import com.avito.android.tariff_cpt.configure.migration.di.a;
import com.avito.android.tariff_cpt.configure.migration.viewmodel.h;
import com.avito.android.tariff_cpt.configure.migration.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerCptMigrationComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerCptMigrationComponent.java */
    public static final class b implements com.avito.android.tariff_cpt.configure.migration.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<JC0.a> f298033a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f298034b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.migration.viewmodel.e> f298035c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.migration.viewmodel.a> f298036d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f298037e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f298038f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f298039g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f298040h;

        /* renamed from: i, reason: collision with root package name */
        public final l f298041i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.common.item.screen_title.d> f298042j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.common.item.screen_title.c f298043k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.migration.item.terms.d> f298044l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.migration.item.terms.c f298045m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.common.item.button.d> f298046n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f298047o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f298048p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f298049q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f298050r;

        /* compiled from: DaggerCptMigrationComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f298051a;

            public a(cv.b bVar) {
                this.f298051a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298051a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCptMigrationComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.migration.di.h$b$b, reason: collision with other inner class name */
        public static final class C9105b implements u<JC0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298052a;

            public C9105b(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298052a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JC0.a aVarLl = this.f298052a.Ll();
                t.c(aVarLl);
                return aVarLl;
            }
        }

        /* compiled from: DaggerCptMigrationComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298053a;

            public c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298053a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f298053a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCptMigrationComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298054a;

            public d(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298054a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f298054a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, a aVar) {
            C9105b c9105b = new C9105b(dVar);
            c cVar = new c(dVar);
            this.f298034b = cVar;
            this.f298035c = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.migration.viewmodel.g(c9105b, cVar));
            this.f298036d = dagger.internal.g.d(com.avito.android.tariff_cpt.configure.migration.viewmodel.c.a());
            this.f298037e = new a(bVar);
            this.f298038f = new d(dVar);
            u<C28478k> uVarD = dagger.internal.g.d(new g(l.a(rVar)));
            this.f298039g = uVarD;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f298038f, uVarD);
            this.f298040h = uVarI;
            this.f298041i = l.a(new com.avito.android.tariff_cpt.configure.migration.viewmodel.l(new k(uVarI, this.f298035c, this.f298036d, this.f298034b, this.f298037e)));
            u<com.avito.android.tariff_cpt.common.item.screen_title.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_cpt.common.item.screen_title.f.a());
            this.f298042j = uVarD2;
            this.f298043k = new com.avito.android.tariff_cpt.common.item.screen_title.c(uVarD2);
            u<com.avito.android.tariff_cpt.configure.migration.item.terms.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff_cpt.configure.migration.item.terms.f.a());
            this.f298044l = uVarD3;
            this.f298045m = new com.avito.android.tariff_cpt.configure.migration.item.terms.c(uVarD3);
            u<com.avito.android.tariff_cpt.common.item.button.d> uVarD4 = dagger.internal.g.d(com.avito.android.tariff_cpt.common.item.button.g.a());
            this.f298046n = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.migration.di.d(this.f298043k, this.f298045m, new com.avito.android.tariff_cpt.common.item.button.c(uVarD4)));
            this.f298047o = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.migration.di.c(uVarD5));
            this.f298048p = uVarD6;
            this.f298049q = dagger.internal.g.d(new f(uVarD6, this.f298047o));
            this.f298050r = dagger.internal.g.d(new e(this.f298042j, this.f298044l, this.f298046n));
        }

        @Override // com.avito.android.tariff_cpt.configure.migration.di.a
        public final void a(CptMigrationFragment cptMigrationFragment) {
            cptMigrationFragment.f297999n0 = (h.a) this.f298041i.f393949a;
            cptMigrationFragment.f298000o0 = this.f298049q.get();
            cptMigrationFragment.f298001p0 = this.f298040h.get();
            cptMigrationFragment.f298002q0 = this.f298050r.get();
        }
    }

    /* compiled from: DaggerCptMigrationComponent.java */
    public static final class c implements a.InterfaceC9104a {
        public c() {
        }

        @Override // com.avito.android.tariff_cpt.configure.migration.di.a.InterfaceC9104a
        public final com.avito.android.tariff_cpt.configure.migration.di.a a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar) {
            interfaceC39417a.getClass();
            return new b(dVar, interfaceC39417a, rVar, null);
        }
    }

    public static a.InterfaceC9104a a() {
        return new c();
    }
}

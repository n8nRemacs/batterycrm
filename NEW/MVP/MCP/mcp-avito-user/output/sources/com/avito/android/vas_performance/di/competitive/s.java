package com.avito.android.vas_performance.di.competitive;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.C36053g;
import com.avito.android.vas_performance.InterfaceC36051e;
import com.avito.android.vas_performance.di.competitive.f;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import zL0.InterfaceC50482a;

/* compiled from: DaggerCompetitiveVasComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class s {

    /* compiled from: DaggerCompetitiveVasComponent.java */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final i f319967a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f319968b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.header.c> f319969c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.vas_performance.ui.items.header.b f319970d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.competitive_vas.e> f319971e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.vas_performance.ui.items.competitive_vas.b f319972f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.competitive_vas_info_action.d> f319973g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_performance.ui.items.competitive_vas_info_action.c f319974h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.competitive_vas_tabs.e> f319975i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f319976j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f319977k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f319978l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f319979m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f319980n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC36051e> f319981o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC50482a> f319982p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC35745a5> f319983q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.repository.a> f319984r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28481c> f319985s;

        /* renamed from: t, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f319986t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28373a> f319987u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.competitive.q> f319988v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.competitive.p> f319989w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f319990x;

        /* compiled from: DaggerCompetitiveVasComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f319991a;

            public a(i iVar) {
                this.f319991a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f319991a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCompetitiveVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.di.competitive.s$b$b, reason: collision with other inner class name */
        public static final class C9916b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final i f319992a;

            public C9916b(i iVar) {
                this.f319992a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f319992a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCompetitiveVasComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final i f319993a;

            public c(i iVar) {
                this.f319993a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f319993a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCompetitiveVasComponent.java */
        public static final class d implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f319994a;

            public d(i iVar) {
                this.f319994a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f319994a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public b(l lVar, i iVar, cv.b bVar, String str, String str2, Boolean bool, Fragment fragment, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f319967a = iVar;
            this.f319968b = bVar;
            u<com.avito.android.vas_performance.ui.items.header.c> uVarD = dagger.internal.g.d(new n(lVar));
            this.f319969c = uVarD;
            this.f319970d = new com.avito.android.vas_performance.ui.items.header.b(uVarD);
            u<com.avito.android.vas_performance.ui.items.competitive_vas.e> uVarD2 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.competitive_vas.h.a());
            this.f319971e = uVarD2;
            this.f319972f = new com.avito.android.vas_performance.ui.items.competitive_vas.b(uVarD2);
            u<com.avito.android.vas_performance.ui.items.competitive_vas_info_action.d> uVarD3 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.competitive_vas_info_action.g.a());
            this.f319973g = uVarD3;
            this.f319974h = new com.avito.android.vas_performance.ui.items.competitive_vas_info_action.c(uVarD3);
            u<com.avito.android.vas_performance.ui.items.competitive_vas_tabs.e> uVarD4 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.competitive_vas_tabs.h.a());
            this.f319975i = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new o(lVar, this.f319970d, this.f319972f, this.f319974h, new com.avito.android.vas_performance.ui.items.competitive_vas_tabs.d(uVarD4)));
            this.f319976j = uVarD5;
            this.f319977k = B.a(new m(lVar, uVarD5));
            this.f319978l = dagger.internal.l.a(fragment);
            this.f319979m = dagger.internal.l.a(str);
            this.f319980n = dagger.internal.l.a(str2);
            this.f319981o = dagger.internal.g.d(C36053g.a());
            d dVar = new d(iVar);
            C9916b c9916b = new C9916b(iVar);
            this.f319983q = c9916b;
            this.f319984r = dagger.internal.g.d(new com.avito.android.vas_performance.repository.d(dVar, c9916b));
            this.f319985s = new c(iVar);
            u<ScreenPerformanceTracker> uVarD6 = dagger.internal.g.d(new e(dagger.internal.l.a(rVar), this.f319985s));
            this.f319986t = uVarD6;
            u<com.avito.android.vas_performance.ui.competitive.q> uVarD7 = dagger.internal.g.d(new com.avito.android.vas_performance.ui.competitive.r(this.f319979m, this.f319980n, uVarD6, this.f319981o, this.f319984r, this.f319983q, new a(iVar)));
            this.f319988v = uVarD7;
            this.f319989w = dagger.internal.g.d(new r(this.f319978l, uVarD7));
            this.f319990x = dagger.internal.g.d(new q(this.f319977k, this.f319976j));
        }

        @Override // com.avito.android.vas_performance.di.competitive.f
        public final void a(CompetitiveVasFragment competitiveVasFragment) {
            this.f319976j.get();
            competitiveVasFragment.f321466n0 = this.f319977k.get();
            z zVar = new z(4);
            zVar.a(this.f319969c.get());
            zVar.a(this.f319971e.get());
            zVar.a(this.f319973g.get());
            zVar.a(this.f319975i.get());
            competitiveVasFragment.f321467o0 = zVar.c();
            competitiveVasFragment.f321468p0 = this.f319989w.get();
            competitiveVasFragment.f321469q0 = this.f319990x.get();
            i iVar = this.f319967a;
            InterfaceC28373a interfaceC28373aA = iVar.a();
            t.c(interfaceC28373aA);
            competitiveVasFragment.f321470r0 = interfaceC28373aA;
            competitiveVasFragment.f321471s0 = this.f319986t.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f319968b.u4();
            t.c(aVarU4);
            competitiveVasFragment.f321472t0 = aVarU4;
            com.avito.android.util.text.a aVarE = iVar.e();
            t.c(aVarE);
            competitiveVasFragment.f321473u0 = aVarE;
        }
    }

    /* compiled from: DaggerCompetitiveVasComponent.java */
    public static final class c implements f.a {
        public c() {
        }

        @Override // com.avito.android.vas_performance.di.competitive.f.a
        public final f a(String str, String str2, boolean z12, CompetitiveVasFragment competitiveVasFragment, com.avito.android.analytics.screens.r rVar, i iVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(new l(), iVar, interfaceC39417a, str, str2, Boolean.valueOf(z12), competitiveVasFragment, rVar, null);
        }
    }

    public static f.a a() {
        return new c();
    }
}

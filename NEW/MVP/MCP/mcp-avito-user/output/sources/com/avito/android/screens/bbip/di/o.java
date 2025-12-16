package com.avito.android.screens.bbip.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip.di.c;
import com.avito.android.screens.bbip.ui.BbipFragment;
import com.avito.android.screens.bbip.ui.l;
import com.avito.android.screens.bbip.ui.q;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hh.InterfaceC40934b;
import ih.InterfaceC41399a;
import java.util.Set;
import np0.C44463c;
import pp0.C47125c;

/* compiled from: DaggerBbipComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class o {

    /* compiled from: DaggerBbipComponent.java */
    public static final class b implements com.avito.android.screens.bbip.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC40934b f260232a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f260233b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC41399a> f260234c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f260235d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35863o4> f260236e;

        /* renamed from: f, reason: collision with root package name */
        public final C44463c f260237f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip.ui.g> f260238g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f260239h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f260240i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f260241j;

        /* renamed from: k, reason: collision with root package name */
        public final u<SK0.b> f260242k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f260243l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip.ui.items.budget.e> f260244m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip.ui.items.duration.e> f260245n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f260246o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip.ui.items.title.d> f260247p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.screens.bbip.ui.items.title.c f260248q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip.ui.items.forecast.d> f260249r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f260250s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f260251t;

        /* renamed from: u, reason: collision with root package name */
        public final u<Resources> f260252u;

        /* compiled from: DaggerBbipComponent.java */
        public static final class a implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260253a;

            public a(InterfaceC40934b interfaceC40934b) {
                this.f260253a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f260253a.p();
                t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerBbipComponent.java */
        /* renamed from: com.avito.android.screens.bbip.di.o$b$b, reason: collision with other inner class name */
        public static final class C7806b implements u<InterfaceC41399a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260254a;

            public C7806b(InterfaceC40934b interfaceC40934b) {
                this.f260254a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41399a interfaceC41399aPc = this.f260254a.Pc();
                t.c(interfaceC41399aPc);
                return interfaceC41399aPc;
            }
        }

        /* compiled from: DaggerBbipComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f260255a;

            public c(cv.b bVar) {
                this.f260255a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f260255a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBbipComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260256a;

            public d(InterfaceC40934b interfaceC40934b) {
                this.f260256a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f260256a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerBbipComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260257a;

            public e(InterfaceC40934b interfaceC40934b) {
                this.f260257a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f260257a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerBbipComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260258a;

            public f(InterfaceC40934b interfaceC40934b) {
                this.f260258a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f260258a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC40934b interfaceC40934b, cv.b bVar, Fragment fragment, T0 t02, r rVar, a aVar) {
            this.f260232a = interfaceC40934b;
            this.f260233b = bVar;
            C7806b c7806b = new C7806b(interfaceC40934b);
            e eVar = new e(interfaceC40934b);
            this.f260235d = eVar;
            C44463c c44463c = new C44463c(new d(interfaceC40934b));
            this.f260237f = c44463c;
            this.f260238g = dagger.internal.g.d(new com.avito.android.screens.bbip.ui.j(c7806b, eVar, c44463c));
            this.f260239h = new f(interfaceC40934b);
            u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new com.avito.android.screens.bbip.di.b(dagger.internal.l.a(rVar), this.f260239h));
            this.f260240i = uVarD;
            this.f260243l = dagger.internal.l.a(new com.avito.android.screens.bbip.ui.r(new q(this.f260238g, this.f260235d, this.f260237f, uVarD, new c(bVar), new ZK0.c(new a(interfaceC40934b)))));
            this.f260244m = dagger.internal.g.d(com.avito.android.screens.bbip.ui.items.budget.h.a());
            u<com.avito.android.screens.bbip.ui.items.duration.e> uVarD2 = dagger.internal.g.d(com.avito.android.screens.bbip.ui.items.duration.i.a());
            this.f260245n = uVarD2;
            this.f260246o = dagger.internal.g.d(new l(uVarD2, this.f260244m));
            u<com.avito.android.screens.bbip.ui.items.title.d> uVarD3 = dagger.internal.g.d(com.avito.android.screens.bbip.ui.items.title.f.a());
            this.f260247p = uVarD3;
            this.f260248q = new com.avito.android.screens.bbip.ui.items.title.c(uVarD3);
            u<com.avito.android.screens.bbip.ui.items.forecast.d> uVarD4 = dagger.internal.g.d(com.avito.android.screens.bbip.ui.items.forecast.f.a());
            this.f260249r = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new k(this.f260248q, new com.avito.android.screens.bbip.ui.items.forecast.c(uVarD4), new com.avito.android.screens.bbip.ui.items.budget.d(this.f260244m), new com.avito.android.screens.bbip.ui.items.duration.d(this.f260245n)));
            this.f260250s = uVarD5;
            this.f260251t = B.a(new j(uVarD5));
            this.f260252u = dagger.internal.g.d(new n(dagger.internal.l.a(fragment)));
        }

        @Override // com.avito.android.screens.bbip.di.c
        public final void a(BbipFragment bbipFragment) {
            bbipFragment.f260267n0 = (l.a) this.f260243l.f393949a;
            bbipFragment.f260268o0 = this.f260246o.get();
            InterfaceC40934b interfaceC40934b = this.f260232a;
            InterfaceC28373a interfaceC28373aA = interfaceC40934b.a();
            t.c(interfaceC28373aA);
            bbipFragment.f260269p0 = interfaceC28373aA;
            bbipFragment.f260270q0 = this.f260240i.get();
            bbipFragment.f260271r0 = this.f260250s.get();
            bbipFragment.f260272s0 = this.f260251t.get();
            bbipFragment.f260273t0 = new C47125c(this.f260252u.get());
            com.avito.android.util.text.a aVarE = interfaceC40934b.e();
            t.c(aVarE);
            bbipFragment.f260274u0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f260233b.u4();
            t.c(aVarU4);
            bbipFragment.f260275v0 = aVarU4;
        }
    }

    /* compiled from: DaggerBbipComponent.java */
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.screens.bbip.di.c.a
        public final com.avito.android.screens.bbip.di.c a(BbipFragment bbipFragment, BbipFragment bbipFragment2, r rVar, InterfaceC40934b interfaceC40934b, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(interfaceC40934b, interfaceC39417a, bbipFragment, bbipFragment2, rVar, null);
        }
    }

    public static c.a a() {
        return new c();
    }
}

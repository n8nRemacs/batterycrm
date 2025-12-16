package com.avito.android.position_in_search.stats.screen.position_in_search.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchActivity;
import com.avito.android.position_in_search.stats.screen.position_in_search.di.b;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.i;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.j;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.k;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.m;
import com.avito.android.position_in_search.stats.screen.position_in_search.n;
import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPositionInSearchComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPositionInSearchComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.position_in_search.stats.screen.position_in_search.di.b.a
        public final com.avito.android.position_in_search.stats.screen.position_in_search.di.b a(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, long j12, String str) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, Long.valueOf(j12), str, null);
        }
    }

    /* compiled from: DaggerPositionInSearchComponent.java */
    public static final class c implements com.avito.android.position_in_search.stats.screen.position_in_search.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f221364a;

        /* renamed from: b, reason: collision with root package name */
        public final l f221365b;

        /* renamed from: c, reason: collision with root package name */
        public final u<P80.a> f221366c;

        /* renamed from: d, reason: collision with root package name */
        public final u<AK0.l> f221367d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f221368e;

        /* renamed from: f, reason: collision with root package name */
        public final u<PositionInSearchStorage> f221369f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.f f221370g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.position_in_search.stats.screen.position_in_search.domain.a> f221371h;

        /* renamed from: i, reason: collision with root package name */
        public final u<j> f221372i;

        /* renamed from: j, reason: collision with root package name */
        public final l f221373j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.position_in_search.stats.screen.position_in_search.mvi.f f221374k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.position_in_search.stats.screen.position_in_search.domain.g> f221375l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.position_in_search.stats.screen.position_in_search.mvi.d f221376m;

        /* renamed from: n, reason: collision with root package name */
        public final m f221377n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f221378o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f221379p;

        /* renamed from: q, reason: collision with root package name */
        public final n f221380q;

        /* compiled from: DaggerPositionInSearchComponent.java */
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.di.a$c$a, reason: collision with other inner class name */
        public static final class C6699a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.stats.screen.position_in_search.di.c f221381a;

            public C6699a(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar) {
                this.f221381a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f221381a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPositionInSearchComponent.java */
        public static final class b implements u<P80.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.stats.screen.position_in_search.di.c f221382a;

            public b(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar) {
                this.f221382a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                P80.a aVarCk = this.f221382a.Ck();
                t.c(aVarCk);
                return aVarCk;
            }
        }

        /* compiled from: DaggerPositionInSearchComponent.java */
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.di.a$c$c, reason: collision with other inner class name */
        public static final class C6700c implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.stats.screen.position_in_search.di.c f221383a;

            public C6700c(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar) {
                this.f221383a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f221383a.r();
            }
        }

        /* compiled from: DaggerPositionInSearchComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.stats.screen.position_in_search.di.c f221384a;

            public d(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar) {
                this.f221384a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f221384a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.position_in_search.stats.screen.position_in_search.di.c cVar, cv.b bVar, r rVar, Long l12, String str, C6698a c6698a) {
            this.f221364a = bVar;
            this.f221365b = l.a(l12);
            this.f221366c = new b(cVar);
            C6700c c6700c = new C6700c(cVar);
            C6699a c6699a = new C6699a(cVar);
            this.f221368e = c6699a;
            u<PositionInSearchStorage> uVarD = dagger.internal.g.d(new com.avito.android.position_in_search.stats.screen.position_in_search.storage.b(c6700c, c6699a));
            this.f221369f = uVarD;
            com.avito.android.position_in_search.stats.screen.position_in_search.domain.f fVar = new com.avito.android.position_in_search.stats.screen.position_in_search.domain.f(uVarD);
            this.f221370g = fVar;
            u<com.avito.android.position_in_search.stats.screen.position_in_search.domain.a> uVarD2 = dagger.internal.g.d(new com.avito.android.position_in_search.stats.screen.position_in_search.domain.c(this.f221365b, this.f221366c, fVar, this.f221368e));
            this.f221371h = uVarD2;
            this.f221372i = dagger.internal.g.d(new com.avito.android.position_in_search.stats.screen.position_in_search.domain.m(this.f221365b, uVarD2, this.f221366c, this.f221368e));
            l lVarA = l.a(str);
            this.f221373j = lVarA;
            this.f221374k = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.f(lVarA, this.f221372i);
            u<com.avito.android.position_in_search.stats.screen.position_in_search.domain.g> uVarD3 = dagger.internal.g.d(new i(this.f221365b, this.f221366c, this.f221370g, this.f221368e));
            this.f221375l = uVarD3;
            this.f221376m = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.d(this.f221373j, uVarD3, this.f221372i, this.f221371h, this.f221369f);
            this.f221377n = new m(this.f221370g);
            this.f221378o = new d(cVar);
            this.f221379p = dagger.internal.g.d(new C30060h5(this.f221378o, new e(l.a(rVar))));
            this.f221380q = new n(new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.i(this.f221374k, this.f221376m, k.a(), this.f221377n, this.f221379p));
        }

        @Override // com.avito.android.position_in_search.stats.screen.position_in_search.di.b
        public final void a(PositionInSearchActivity positionInSearchActivity) {
            positionInSearchActivity.f221314m = this.f221380q;
            positionInSearchActivity.f221315n = this.f221379p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f221364a.u4();
            t.c(aVarU4);
            positionInSearchActivity.f221316o = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}

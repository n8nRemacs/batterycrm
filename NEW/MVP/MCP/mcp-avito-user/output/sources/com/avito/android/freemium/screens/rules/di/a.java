package com.avito.android.freemium.screens.rules.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.freemium.screens.rules.FreemiumRulesFragment;
import com.avito.android.freemium.screens.rules.di.b;
import com.avito.android.freemium.screens.rules.mvi.i;
import com.avito.android.freemium.screens.rules.mvi.k;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFreemiumRulesComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFreemiumRulesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.freemium.screens.rules.di.b.a
        public final com.avito.android.freemium.screens.rules.di.b a(YE.c cVar, InterfaceC39417a interfaceC39417a, r rVar, long j12, String str, String str2) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, Long.valueOf(j12), str, str2, null);
        }
    }

    /* compiled from: DaggerFreemiumRulesComponent.java */
    public static final class c implements com.avito.android.freemium.screens.rules.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f159079a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f159080b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ZE.a> f159081c;

        /* renamed from: d, reason: collision with root package name */
        public final l f159082d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.freemium.screens.rules.domain.d f159083e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.freemium.screens.rules.mvi.d f159084f;

        /* renamed from: g, reason: collision with root package name */
        public final l f159085g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.freemium.screens.rules.mvi.b f159086h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f159087i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f159088j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f159089k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.freemium.screens.rules.l f159090l;

        /* compiled from: DaggerFreemiumRulesComponent.java */
        /* renamed from: com.avito.android.freemium.screens.rules.di.a$c$a, reason: collision with other inner class name */
        public static final class C4649a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f159091a;

            public C4649a(YE.c cVar) {
                this.f159091a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f159091a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFreemiumRulesComponent.java */
        public static final class b implements u<ZE.a> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f159092a;

            public b(YE.c cVar) {
                this.f159092a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZE.a aVarYf = this.f159092a.yf();
                t.c(aVarYf);
                return aVarYf;
            }
        }

        /* compiled from: DaggerFreemiumRulesComponent.java */
        /* renamed from: com.avito.android.freemium.screens.rules.di.a$c$c, reason: collision with other inner class name */
        public static final class C4650c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final YE.c f159093a;

            public C4650c(YE.c cVar) {
                this.f159093a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f159093a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(YE.c cVar, cv.b bVar, r rVar, Long l12, String str, String str2, C4648a c4648a) {
            this.f159079a = bVar;
            this.f159080b = new C4649a(cVar);
            this.f159081c = new b(cVar);
            l lVarA = l.a(l12);
            this.f159082d = lVarA;
            com.avito.android.freemium.screens.rules.domain.d dVar = new com.avito.android.freemium.screens.rules.domain.d(lVarA, this.f159080b, this.f159081c);
            this.f159083e = dVar;
            this.f159084f = new com.avito.android.freemium.screens.rules.mvi.d(dVar);
            this.f159085g = l.b(str);
            this.f159086h = new com.avito.android.freemium.screens.rules.mvi.b(this.f159083e, new com.avito.android.freemium.screens.rules.domain.b(this.f159082d, this.f159085g, l.a(str2), this.f159080b, this.f159081c));
            this.f159087i = new C4650c(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(l.a(rVar)));
            this.f159088j = uVarD;
            this.f159089k = com.avito.android.advert.item.delivery_suggests.l.i(this.f159087i, uVarD);
            this.f159090l = new com.avito.android.freemium.screens.rules.l(new com.avito.android.freemium.screens.rules.mvi.g(this.f159084f, this.f159086h, i.a(), k.a(), this.f159089k));
        }

        @Override // com.avito.android.freemium.screens.rules.di.b
        public final void a(FreemiumRulesFragment freemiumRulesFragment) {
            freemiumRulesFragment.f159053n0 = this.f159090l;
            freemiumRulesFragment.f159055p0 = this.f159089k.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f159079a.u4();
            t.c(aVarU4);
            freemiumRulesFragment.f159057r0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}

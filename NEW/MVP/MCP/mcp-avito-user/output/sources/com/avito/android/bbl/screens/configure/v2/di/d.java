package com.avito.android.bbl.screens.configure.v2.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.bbl.screens.configure.v2.di.a;
import com.avito.android.bbl.screens.configure.v2.mvi.f;
import com.avito.android.bbl.screens.configure.v2.mvi.i;
import com.avito.android.bbl.screens.configure.v2.mvi.k;
import com.avito.android.bbl.screens.configure.v2.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import lh.C43772c;
import lh.InterfaceC43770a;
import nh.InterfaceC44423b;
import oh.InterfaceC44774a;

/* compiled from: DaggerBblConfigureV2Component.java */
@e
/* loaded from: classes11.dex */
public final class d {

    /* compiled from: DaggerBblConfigureV2Component.java */
    public static final class b implements com.avito.android.bbl.screens.configure.v2.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC44423b f99302a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f99303b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC44774a> f99304c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f99305d;

        /* renamed from: e, reason: collision with root package name */
        public final l f99306e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f99307f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC43770a> f99308g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.bbl.screens.configure.v2.mvi.domain.a> f99309h;

        /* renamed from: i, reason: collision with root package name */
        public final f f99310i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v2.mvi.d f99311j;

        /* renamed from: k, reason: collision with root package name */
        public final m f99312k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f99313l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f99314m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f99315n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v2.m f99316o;

        /* compiled from: DaggerBblConfigureV2Component.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99317a;

            public a(InterfaceC44423b interfaceC44423b) {
                this.f99317a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f99317a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBblConfigureV2Component.java */
        /* renamed from: com.avito.android.bbl.screens.configure.v2.di.d$b$b, reason: collision with other inner class name */
        public static final class C2992b implements u<InterfaceC44774a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99318a;

            public C2992b(InterfaceC44423b interfaceC44423b) {
                this.f99318a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44774a interfaceC44774aR3 = this.f99318a.r3();
                t.c(interfaceC44774aR3);
                return interfaceC44774aR3;
            }
        }

        /* compiled from: DaggerBblConfigureV2Component.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99319a;

            public c(InterfaceC44423b interfaceC44423b) {
                this.f99319a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f99319a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBblConfigureV2Component.java */
        /* renamed from: com.avito.android.bbl.screens.configure.v2.di.d$b$d, reason: collision with other inner class name */
        public static final class C2993d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99320a;

            public C2993d(InterfaceC44423b interfaceC44423b) {
                this.f99320a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f99320a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC44423b interfaceC44423b, cv.b bVar, Fragment fragment, r rVar, String str, Y41.l lVar, a aVar) {
            this.f99302a = interfaceC44423b;
            this.f99303b = bVar;
            this.f99304c = new C2992b(interfaceC44423b);
            this.f99305d = new c(interfaceC44423b);
            this.f99306e = l.a(str);
            u<InterfaceC43770a> uVarD = g.d(new C43772c(new a(interfaceC44423b)));
            this.f99308g = uVarD;
            u<com.avito.android.bbl.screens.configure.v2.mvi.domain.a> uVarD2 = g.d(new com.avito.android.bbl.screens.configure.v2.mvi.domain.d(this.f99306e, uVarD, this.f99304c, this.f99305d));
            this.f99309h = uVarD2;
            this.f99310i = new f(uVarD2);
            u<InterfaceC43770a> uVar = this.f99308g;
            this.f99311j = new com.avito.android.bbl.screens.configure.v2.mvi.d(uVarD2, uVar);
            this.f99312k = new m(uVar);
            this.f99313l = new C2993d(interfaceC44423b);
            u<C28478k> uVarD3 = g.d(new com.avito.android.bbl.screens.configure.v2.di.c(l.a(rVar)));
            this.f99314m = uVarD3;
            this.f99315n = com.avito.android.advert.item.delivery_suggests.l.i(this.f99313l, uVarD3);
            this.f99316o = new com.avito.android.bbl.screens.configure.v2.m(new i(this.f99310i, this.f99311j, k.a(), this.f99312k, this.f99315n));
        }

        @Override // com.avito.android.bbl.screens.configure.v2.di.a
        public final void a(BblConfigureV2Fragment bblConfigureV2Fragment) {
            bblConfigureV2Fragment.f99268n0 = this.f99316o;
            bblConfigureV2Fragment.f99270p0 = this.f99315n.get();
            InterfaceC44423b interfaceC44423b = this.f99302a;
            com.avito.android.util.text.a aVarE = interfaceC44423b.e();
            t.c(aVarE);
            bblConfigureV2Fragment.f99272r0 = aVarE;
            InterfaceC28373a interfaceC28373aA = interfaceC44423b.a();
            t.c(interfaceC28373aA);
            bblConfigureV2Fragment.f99273s0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f99303b.u4();
            t.c(aVarU4);
            bblConfigureV2Fragment.f99274t0 = aVarU4;
        }
    }

    /* compiled from: DaggerBblConfigureV2Component.java */
    public static final class c implements a.InterfaceC2991a {
        public c() {
        }

        @Override // com.avito.android.bbl.screens.configure.v2.di.a.InterfaceC2991a
        public final com.avito.android.bbl.screens.configure.v2.di.a a(InterfaceC44423b interfaceC44423b, BblConfigureV2Fragment bblConfigureV2Fragment, InterfaceC39417a interfaceC39417a, r rVar, String str, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC44423b, interfaceC39417a, bblConfigureV2Fragment, rVar, str, lVar, null);
        }
    }

    public static a.InterfaceC2991a a() {
        return new c();
    }
}

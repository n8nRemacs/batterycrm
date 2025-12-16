package com.avito.android.advert_stats.detail.advertdetailstatsmvi.di;

import Za.C19523c;
import Za.InterfaceC19521a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.h;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.i;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.k;
import com.avito.android.advert_stats.detail.di.C28301b;
import com.avito.android.advert_stats.detail.di.C28302c;
import com.avito.android.advert_stats.detail.di.C28303d;
import com.avito.android.advert_stats.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.preloading.j;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.avito.android.util.P2;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import jb.InterfaceC42343a;
import kb.C42659a;

/* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
@e
/* loaded from: classes10.dex */
public final class d {

    /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
    public static final class b implements com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c f86055a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f86056b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f86057c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC19521a> f86058d;

        /* renamed from: e, reason: collision with root package name */
        public final l f86059e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC42343a> f86060f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f86061g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.preloading.d> f86062h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C> f86063i;

        /* renamed from: j, reason: collision with root package name */
        public final u<j<String, P2<C42659a>>> f86064j;

        /* renamed from: k, reason: collision with root package name */
        public final u<p> f86065k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.d f86066l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.b f86067m;

        /* renamed from: n, reason: collision with root package name */
        public final k f86068n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f86069o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f86070p;

        /* renamed from: q, reason: collision with root package name */
        public final l f86071q;

        /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
        public static final class a implements u<InterfaceC42343a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c f86072a;

            public a(com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar) {
                this.f86072a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42343a interfaceC42343aH5 = this.f86072a.h5();
                t.c(interfaceC42343aH5);
                return interfaceC42343aH5;
            }
        }

        /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
        /* renamed from: com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.d$b$b, reason: collision with other inner class name */
        public static final class C2568b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c f86073a;

            public C2568b(com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar) {
                this.f86073a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f86073a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c f86074a;

            public c(com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar) {
                this.f86074a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f86074a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
        /* renamed from: com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.d$b$d, reason: collision with other inner class name */
        public static final class C2569d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c f86075a;

            public C2569d(com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar) {
                this.f86075a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f86075a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar, cv.b bVar, Fragment fragment, String str, String str2, r rVar, C28478k c28478k, Y41.l lVar, Resources resources, a aVar) {
            this.f86055a = cVar;
            this.f86056b = resources;
            this.f86057c = bVar;
            this.f86058d = g.d(new C19523c(l.a(resources)));
            this.f86059e = l.a(str);
            a aVar2 = new a(cVar);
            this.f86060f = aVar2;
            u<com.avito.android.advert_stats.preloading.d> uVarD = g.d(new C28302c(aVar2, new c(cVar)));
            this.f86062h = uVarD;
            u<j<String, P2<C42659a>>> uVarD2 = g.d(new C28301b(uVarD, new C2568b(cVar)));
            this.f86064j = uVarD2;
            u<p> uVarD3 = g.d(new C28303d(uVarD2, this.f86060f));
            this.f86065k = uVarD3;
            l lVar2 = this.f86059e;
            this.f86066l = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.d(lVar2, uVarD3);
            this.f86067m = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.b(lVar2, uVarD3);
            this.f86068n = new k(this.f86059e, l.b(str2), this.f86058d);
            this.f86069o = new C2569d(cVar);
            this.f86070p = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f86069o);
            this.f86071q = l.a(new com.avito.android.advert_stats.detail.advertdetailstatsmvi.j(new i(new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.g(this.f86066l, this.f86067m, com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.i.a(), this.f86068n, this.f86070p))));
        }

        @Override // com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a
        public final void O8(AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment) {
            advertDetailStatsMVIFragment.f86031t0 = (h.a) this.f86071q.f393949a;
            advertDetailStatsMVIFragment.f86033v0 = this.f86070p.get();
            com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar = this.f86055a;
            advertDetailStatsMVIFragment.f86034w0 = cVar.m2();
            advertDetailStatsMVIFragment.f86035x0 = cVar.k5();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            advertDetailStatsMVIFragment.f86036y0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f86057c.u4();
            t.c(aVarU4);
            advertDetailStatsMVIFragment.f86037z0 = aVarU4;
            SK0.b bVarP = cVar.p();
            t.c(bVarP);
            advertDetailStatsMVIFragment.f86028A0 = bVarP;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final Resources O9() {
            return this.f86056b;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f86055a.a();
            t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f86055a.b();
            t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f86055a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC35863o4 m() {
            InterfaceC35863o4 interfaceC35863o4M = this.f86055a.m();
            t.c(interfaceC35863o4M);
            return interfaceC35863o4M;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final L0 z() {
            L0 l0Z = this.f86055a.z();
            t.c(l0Z);
            return l0Z;
        }
    }

    /* compiled from: DaggerAdvertDetailStatsMVIComponent.java */
    public static final class c implements a.InterfaceC2567a {
        public c() {
        }

        @Override // com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a.InterfaceC2567a
        public final com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a a(AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment, String str, String str2, r rVar, C28478k c28478k, Y41.l lVar, Resources resources, InterfaceC39417a interfaceC39417a, com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c cVar) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, advertDetailStatsMVIFragment, str, str2, rVar, c28478k, lVar, resources, null);
        }
    }

    public static a.InterfaceC2567a a() {
        return new c();
    }
}

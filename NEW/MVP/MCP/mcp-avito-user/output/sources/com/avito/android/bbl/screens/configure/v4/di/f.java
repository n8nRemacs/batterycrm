package com.avito.android.bbl.screens.configure.v4.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.configure.v4.di.a;
import com.avito.android.bbl.screens.configure.v4.mvi.i;
import com.avito.android.bbl.screens.configure.v4.mvi.k;
import com.avito.android.bbl.screens.configure.v4.mvi.n;
import com.avito.android.bbl.screens.configure.v4.ui.BblConfigureV4Fragment;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import lh.C43772c;
import lh.InterfaceC43770a;
import oh.InterfaceC44774a;

/* compiled from: DaggerBblConfigureV4Component.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerBblConfigureV4Component.java */
    public static final class b implements com.avito.android.bbl.screens.configure.v4.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f99458a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC44774a> f99459b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f99460c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v4.mvi.domain.b f99461d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v4.mvi.f f99462e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f99463f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC43770a> f99464g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v4.mvi.d f99465h;

        /* renamed from: i, reason: collision with root package name */
        public final n f99466i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f99467j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f99468k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f99469l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.v4.ui.g f99470m;

        /* compiled from: DaggerBblConfigureV4Component.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bbl.screens.configure.v4.di.b f99471a;

            public a(com.avito.android.bbl.screens.configure.v4.di.b bVar) {
                this.f99471a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f99471a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBblConfigureV4Component.java */
        /* renamed from: com.avito.android.bbl.screens.configure.v4.di.f$b$b, reason: collision with other inner class name */
        public static final class C2997b implements u<InterfaceC44774a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bbl.screens.configure.v4.di.b f99472a;

            public C2997b(com.avito.android.bbl.screens.configure.v4.di.b bVar) {
                this.f99472a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44774a interfaceC44774aR3 = this.f99472a.r3();
                t.c(interfaceC44774aR3);
                return interfaceC44774aR3;
            }
        }

        /* compiled from: DaggerBblConfigureV4Component.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bbl.screens.configure.v4.di.b f99473a;

            public c(com.avito.android.bbl.screens.configure.v4.di.b bVar) {
                this.f99473a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f99473a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBblConfigureV4Component.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.bbl.screens.configure.v4.di.b f99474a;

            public d(com.avito.android.bbl.screens.configure.v4.di.b bVar) {
                this.f99474a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f99474a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.bbl.screens.configure.v4.di.c cVar, com.avito.android.bbl.screens.configure.v4.di.b bVar, cv.b bVar2, String str, PaidServicesResultRepository paidServicesResultRepository, r rVar, a aVar) {
            this.f99458a = bVar2;
            this.f99459b = new C2997b(bVar);
            this.f99460c = new c(bVar);
            com.avito.android.bbl.screens.configure.v4.mvi.domain.b bVar3 = new com.avito.android.bbl.screens.configure.v4.mvi.domain.b(l.a(str), this.f99459b, this.f99460c);
            this.f99461d = bVar3;
            this.f99462e = new com.avito.android.bbl.screens.configure.v4.mvi.f(bVar3);
            u<InterfaceC43770a> uVarD = dagger.internal.g.d(new C43772c(new a(bVar)));
            this.f99464g = uVarD;
            this.f99465h = new com.avito.android.bbl.screens.configure.v4.mvi.d(this.f99461d, uVarD);
            this.f99466i = new n(uVarD);
            this.f99467j = new d(bVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.bbl.screens.configure.v4.di.d(cVar, l.a(rVar)));
            this.f99468k = uVarD2;
            this.f99469l = com.avito.android.advert.item.delivery_suggests.l.i(this.f99467j, uVarD2);
            this.f99470m = new com.avito.android.bbl.screens.configure.v4.ui.g(new i(this.f99462e, this.f99465h, k.a(), this.f99466i, this.f99469l));
        }

        @Override // com.avito.android.bbl.screens.configure.v4.di.a
        public final void a(BblConfigureV4Fragment bblConfigureV4Fragment) {
            bblConfigureV4Fragment.f99515n0 = this.f99470m;
            bblConfigureV4Fragment.f99517p0 = this.f99469l.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f99458a.u4();
            t.c(aVarU4);
            bblConfigureV4Fragment.f99518q0 = aVarU4;
        }
    }

    /* compiled from: DaggerBblConfigureV4Component.java */
    public static final class c implements a.InterfaceC2996a {
        public c() {
        }

        @Override // com.avito.android.bbl.screens.configure.v4.di.a.InterfaceC2996a
        public final com.avito.android.bbl.screens.configure.v4.di.a a(String str, PaidServicesResultRepository paidServicesResultRepository, r rVar, com.avito.android.bbl.screens.configure.v4.di.b bVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(new com.avito.android.bbl.screens.configure.v4.di.c(), bVar, interfaceC39417a, str, paidServicesResultRepository, rVar, null);
        }
    }

    public static a.InterfaceC2996a a() {
        return new c();
    }
}

package com.avito.android.safedeal.universal_delivery_type.courier.di;

import Zi.InterfaceC19564a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.courier.BeduinUniversalDeliveryTypeCourierFragment;
import com.avito.android.safedeal.universal_delivery_type.courier.di.a;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.q;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import java.util.List;
import kj.InterfaceC42698a;

/* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
    /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b, reason: collision with other inner class name */
    public static final class C7682b implements com.avito.android.safedeal.universal_delivery_type.courier.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.courier.di.c f256471a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.di.j f256472b;

        /* renamed from: c, reason: collision with root package name */
        public final u<gj.d> f256473c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f256474d;

        /* renamed from: e, reason: collision with root package name */
        public final u<a.b> f256475e;

        /* renamed from: f, reason: collision with root package name */
        public final l f256476f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC40691b> f256477g;

        /* renamed from: h, reason: collision with root package name */
        public final l f256478h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.safedeal.universal_delivery_type.courier.f> f256479i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.courier.mvi.g f256480j;

        /* renamed from: k, reason: collision with root package name */
        public final l f256481k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC19564a> f256482l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.courier.mvi.b f256483m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.courier.h f256484n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f256485o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f256486p;

        /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b$a */
        public static final class a implements u<InterfaceC19564a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC42698a f256487a;

            public a(InterfaceC42698a interfaceC42698a) {
                this.f256487a = interfaceC42698a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19564a interfaceC19564aVg = this.f256487a.Vg();
                t.c(interfaceC19564aVg);
                return interfaceC19564aVg;
            }
        }

        /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b$b, reason: collision with other inner class name */
        public static final class C7683b implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.universal_delivery_type.courier.di.c f256488a;

            public C7683b(com.avito.android.safedeal.universal_delivery_type.courier.di.c cVar) {
                this.f256488a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256488a.El();
            }
        }

        /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b$c */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256489a;

            public c(cv.b bVar) {
                this.f256489a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f256489a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b$d */
        public static final class d implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256490a;

            public d(cv.b bVar) {
                this.f256490a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f256490a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.di.b$b$e */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.universal_delivery_type.courier.di.c f256491a;

            public e(com.avito.android.safedeal.universal_delivery_type.courier.di.c cVar) {
                this.f256491a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256491a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C7682b() {
            throw null;
        }

        public C7682b(com.avito.android.safedeal.universal_delivery_type.courier.di.c cVar, cv.b bVar, com.avito.android.safedeal.universal_delivery_type.di.j jVar, InterfaceC42698a interfaceC42698a, r rVar, UniversalDeliveryTypeContent.Tab.Courier courier, List list, String str, C28478k c28478k, a aVar) {
            this.f256471a = cVar;
            this.f256472b = jVar;
            this.f256473c = new C7683b(cVar);
            this.f256474d = new c(bVar);
            this.f256475e = new d(bVar);
            l lVarA = l.a(c28478k);
            this.f256476f = lVarA;
            this.f256477g = dagger.internal.g.d(new com.avito.android.safedeal.universal_delivery_type.courier.di.e(lVarA, this.f256473c, this.f256474d, this.f256475e));
            this.f256478h = l.a(courier);
            u<com.avito.android.safedeal.universal_delivery_type.courier.f> uVarD = dagger.internal.g.d(new f(this.f256477g));
            this.f256479i = uVarD;
            this.f256480j = new com.avito.android.safedeal.universal_delivery_type.courier.mvi.g(this.f256478h, uVarD, this.f256477g);
            this.f256481k = l.b(str);
            this.f256482l = new a(interfaceC42698a);
            this.f256483m = new com.avito.android.safedeal.universal_delivery_type.courier.mvi.b(this.f256481k, l.b(list), this.f256482l, this.f256477g);
            this.f256484n = new com.avito.android.safedeal.universal_delivery_type.courier.h(this.f256477g, new com.avito.android.safedeal.universal_delivery_type.courier.mvi.j(this.f256480j, com.avito.android.safedeal.universal_delivery_type.courier.mvi.l.a(), q.a(), this.f256483m));
            this.f256486p = dagger.internal.g.d(new g(this.f256476f, new e(cVar)));
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.courier.di.a
        public final void a(BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment) {
            beduinUniversalDeliveryTypeCourierFragment.f256448o0 = this.f256484n;
            com.avito.android.safedeal.universal_delivery_type.courier.di.c cVar = this.f256471a;
            beduinUniversalDeliveryTypeCourierFragment.f256450q0 = cVar.Ad();
            beduinUniversalDeliveryTypeCourierFragment.f256452s0 = cVar.sd();
            com.avito.android.safedeal.universal_delivery_type.l performanceTracker = this.f256472b.getPerformanceTracker();
            t.c(performanceTracker);
            beduinUniversalDeliveryTypeCourierFragment.f256453t0 = performanceTracker;
            beduinUniversalDeliveryTypeCourierFragment.f256454u0 = this.f256486p.get();
            cVar.W();
        }
    }

    /* compiled from: DaggerBeduinUniversalDeliveryTypeCourierComponent.java */
    public static final class c implements a.InterfaceC7681a {
        public c() {
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.courier.di.a.InterfaceC7681a
        public final com.avito.android.safedeal.universal_delivery_type.courier.di.a a(r rVar, UniversalDeliveryTypeContent.Tab.Courier courier, List list, String str, C28478k c28478k, InterfaceC42698a interfaceC42698a, com.avito.android.safedeal.universal_delivery_type.courier.di.c cVar, InterfaceC39417a interfaceC39417a, com.avito.android.safedeal.universal_delivery_type.di.j jVar) {
            courier.getClass();
            interfaceC39417a.getClass();
            return new C7682b(cVar, interfaceC39417a, jVar, interfaceC42698a, rVar, courier, list, str, c28478k, null);
        }
    }

    public static a.InterfaceC7681a a() {
        return new c();
    }
}

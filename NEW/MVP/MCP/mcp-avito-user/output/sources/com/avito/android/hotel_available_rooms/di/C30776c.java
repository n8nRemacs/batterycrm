package com.avito.android.hotel_available_rooms.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;
import com.avito.android.hotel_available_rooms.di.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lE.C43624b;

/* compiled from: DaggerHotelAvailableRoomsComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.hotel_available_rooms.di.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30776c {

    /* compiled from: DaggerHotelAvailableRoomsComponent.java */
    /* renamed from: com.avito.android.hotel_available_rooms.di.c$b */
    public static final class b implements n.a {
        public b() {
        }

        @Override // com.avito.android.hotel_available_rooms.di.n.a
        public final n a(InterfaceC39417a interfaceC39417a, o oVar, C28478k c28478k, Y41.l lVar, HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams) {
            interfaceC39417a.getClass();
            return new C4756c(new s(), new C(), new C30778e(), new j(), interfaceC39417a, oVar, c28478k, lVar, hotelAvailableRoomsOpenParams, null);
        }
    }

    /* compiled from: DaggerHotelAvailableRoomsComponent.java */
    /* renamed from: com.avito.android.hotel_available_rooms.di.c$c, reason: collision with other inner class name */
    public static final class C4756c implements n {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.m> f162679A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.mvi.u> f162680B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.provider.e> f162681C;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.mvi.t f162682D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f162683E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f162684F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.k f162685G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.l f162686H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162687I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f162688J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f162689K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f162690L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.konveyor.gallery.j f162691M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.konveyor.image.j f162692N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162693O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162694P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162695Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162696R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f162697S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162698T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162699U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162700V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162701W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162702X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162703Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f162704Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f162705a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f162706a0;

        /* renamed from: b, reason: collision with root package name */
        public final o f162707b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f162708b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f162709c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f162710c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<Locale> f162711d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<SimpleDateFormat> f162712e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<ZI.a> f162713f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.domain.converters.a> f162714g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.domain.converters.d> f162715h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<R0> f162716i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f162717j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.E> f162718k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<String> f162719l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<GI.a> f162720m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.mvi.k> f162721n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.mvi.f f162722o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.hotel_available_rooms.mvi.d f162723p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.q> f162724q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.q> f162725r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<C43624b> f162726s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.gallery.k> f162727t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.v> f162728u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.i> f162729v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.e> f162730w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.a> f162731x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<Context> f162732y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<Map<Integer, String>> f162733z;

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$a */
        public static final class a implements dagger.internal.u<com.avito.android.account.E> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162734a;

            public a(o oVar) {
                this.f162734a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.E eI2 = this.f162734a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162735a;

            public b(o oVar) {
                this.f162735a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f162735a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$c, reason: collision with other inner class name */
        public static final class C4757c implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162736a;

            public C4757c(o oVar) {
                this.f162736a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f162736a.g();
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$d */
        public static final class d implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162737a;

            public d(o oVar) {
                this.f162737a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f162737a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$e */
        public static final class e implements dagger.internal.u<ZI.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162738a;

            public e(o oVar) {
                this.f162738a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZI.a aVarQ4 = this.f162738a.q4();
                dagger.internal.t.c(aVarQ4);
                return aVarQ4;
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$f */
        public static final class f implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162739a;

            public f(o oVar) {
                this.f162739a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f162739a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$g */
        public static final class g implements dagger.internal.u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162740a;

            public g(o oVar) {
                this.f162740a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f162740a.J();
            }
        }

        /* compiled from: DaggerHotelAvailableRoomsComponent.java */
        /* renamed from: com.avito.android.hotel_available_rooms.di.c$c$h */
        public static final class h implements dagger.internal.u<com.avito.android.analytics.provider.e> {

            /* renamed from: a, reason: collision with root package name */
            public final o f162741a;

            public h(o oVar) {
                this.f162741a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f162741a.Z0();
            }
        }

        public C4756c() {
            throw null;
        }

        public C4756c(s sVar, C c12, C30778e c30778e, j jVar, cv.b bVar, o oVar, C28478k c28478k, Y41.l lVar, HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams, a aVar) {
            this.f162705a = bVar;
            this.f162707b = oVar;
            this.f162709c = dagger.internal.l.a(hotelAvailableRoomsOpenParams);
            dagger.internal.u<Locale> uVarD = dagger.internal.g.d(new v(sVar));
            this.f162711d = uVarD;
            this.f162712e = dagger.internal.g.d(new w(sVar, uVarD));
            this.f162713f = new e(oVar);
            dagger.internal.u<com.avito.android.hotel_available_rooms.domain.converters.a> uVarD2 = dagger.internal.g.d(com.avito.android.hotel_available_rooms.domain.converters.c.a());
            this.f162714g = uVarD2;
            this.f162715h = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.domain.converters.f(uVarD2));
            this.f162716i = new d(oVar);
            this.f162717j = new b(oVar);
            this.f162718k = new a(oVar);
            dagger.internal.u<String> uVarD3 = dagger.internal.g.d(new t(sVar, this.f162709c));
            this.f162719l = uVarD3;
            dagger.internal.u<GI.a> uVarD4 = dagger.internal.g.d(new GI.c(uVarD3, this.f162717j, this.f162718k));
            this.f162720m = uVarD4;
            dagger.internal.u<com.avito.android.hotel_available_rooms.mvi.k> uVarD5 = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.mvi.n(uVarD4, this.f162712e, this.f162713f, this.f162715h, this.f162716i));
            this.f162721n = uVarD5;
            this.f162722o = new com.avito.android.hotel_available_rooms.mvi.f(this.f162709c, uVarD5);
            this.f162723p = new com.avito.android.hotel_available_rooms.mvi.d(uVarD5);
            this.f162724q = dagger.internal.g.d(com.avito.android.hotel_available_rooms.konveyor.converters.s.a());
            this.f162725r = dagger.internal.g.d(com.avito.android.hotel_available_rooms.konveyor.converters.u.a());
            this.f162726s = new g(oVar);
            dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.gallery.k> uVarD6 = dagger.internal.g.d(com.avito.android.hotel_available_rooms.konveyor.gallery.m.a());
            this.f162727t = uVarD6;
            this.f162728u = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.converters.x(uVarD6, this.f162724q, this.f162725r, this.f162726s));
            this.f162729v = dagger.internal.g.d(com.avito.android.hotel_available_rooms.konveyor.converters.k.a());
            dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.e> uVarD7 = dagger.internal.g.d(com.avito.android.hotel_available_rooms.konveyor.converters.g.a());
            this.f162730w = uVarD7;
            this.f162731x = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.converters.c(uVarD7, this.f162728u, this.f162729v));
            dagger.internal.u<Map<Integer, String>> uVarD8 = dagger.internal.g.d(new u(sVar, new C4757c(oVar)));
            this.f162733z = uVarD8;
            dagger.internal.u<com.avito.android.hotel_available_rooms.konveyor.converters.m> uVarD9 = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.converters.o(uVarD8, this.f162712e));
            this.f162679A = uVarD9;
            dagger.internal.u<com.avito.android.hotel_available_rooms.mvi.u> uVarD10 = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.mvi.w(uVarD9, this.f162731x));
            this.f162680B = uVarD10;
            this.f162682D = new com.avito.android.hotel_available_rooms.mvi.t(uVarD10, this.f162727t, new h(oVar));
            this.f162683E = new f(oVar);
            this.f162684F = dagger.internal.g.d(new x(sVar, this.f162683E, dagger.internal.l.a(c28478k)));
            this.f162685G = new com.avito.android.hotel_available_rooms.k(new com.avito.android.hotel_available_rooms.mvi.j(this.f162722o, this.f162723p, com.avito.android.hotel_available_rooms.mvi.q.a(), this.f162682D, this.f162684F));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f162686H = lVarA;
            this.f162687I = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.filter.b(new com.avito.android.hotel_available_rooms.konveyor.filter.f(lVarA), this.f162711d));
            A.b bVarA = dagger.internal.A.a(1, 0);
            bVarA.f393937a.add(this.f162687I);
            dagger.internal.u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.di.g(c30778e, bVarA.b()));
            this.f162688J = uVarD11;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new C30779f(c30778e, uVarD11));
            this.f162689K = uVarD12;
            this.f162690L = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.di.h(c30778e, uVarD12, this.f162688J, com.avito.android.hotel_available_rooms.konveyor.c.a()));
            this.f162691M = new com.avito.android.hotel_available_rooms.konveyor.gallery.j(this.f162727t);
            com.avito.android.hotel_available_rooms.konveyor.image.j jVar2 = new com.avito.android.hotel_available_rooms.konveyor.image.j(this.f162686H);
            this.f162692N = jVar2;
            this.f162693O = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.image.l(jVar2));
            this.f162694P = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.image.f(this.f162692N));
            this.f162695Q = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.image.c(this.f162692N));
            this.f162696R = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.image_redesign.b(new com.avito.android.hotel_available_rooms.konveyor.image_redesign.e(this.f162686H)));
            A.b bVarA2 = dagger.internal.A.a(4, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f162693O;
            List<dagger.internal.u<T>> list = bVarA2.f393937a;
            list.add(uVar);
            list.add(this.f162694P);
            list.add(this.f162695Q);
            list.add(this.f162696R);
            dagger.internal.u<com.avito.konveyor.a> uVarD13 = dagger.internal.g.d(new l(jVar, bVarA2.b()));
            this.f162697S = uVarD13;
            this.f162698T = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.gallery.c(this.f162691M, new m(jVar, new k(jVar, uVarD13), uVarD13), this.f162726s));
            this.f162699U = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.amenity.b(new com.avito.android.hotel_available_rooms.konveyor.amenity.e(this.f162686H)));
            this.f162700V = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.text.b(new com.avito.android.hotel_available_rooms.konveyor.text.f(this.f162686H)));
            this.f162701W = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.booking.b(new com.avito.android.hotel_available_rooms.konveyor.booking.f(this.f162686H)));
            this.f162702X = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.more.b(new com.avito.android.hotel_available_rooms.konveyor.more.e(this.f162686H)));
            this.f162703Y = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.gap.b(com.avito.android.hotel_available_rooms.konveyor.gap.d.a()));
            this.f162704Z = dagger.internal.g.d(new com.avito.android.hotel_available_rooms.konveyor.promo_widget.b(new com.avito.android.hotel_available_rooms.konveyor.promo_widget.e(this.f162686H, this.f162720m)));
            A.b bVarA3 = dagger.internal.A.a(7, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar2 = this.f162698T;
            List<dagger.internal.u<T>> list2 = bVarA3.f393937a;
            list2.add(uVar2);
            list2.add(this.f162699U);
            list2.add(this.f162700V);
            list2.add(this.f162701W);
            list2.add(this.f162702X);
            list2.add(this.f162703Y);
            list2.add(this.f162704Z);
            dagger.internal.u<com.avito.konveyor.a> uVarD14 = dagger.internal.g.d(new E(c12, bVarA3.b()));
            this.f162706a0 = uVarD14;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD15 = dagger.internal.g.d(new D(c12, uVarD14));
            this.f162708b0 = uVarD15;
            this.f162710c0 = dagger.internal.g.d(new F(c12, uVarD15, this.f162706a0, com.avito.android.hotel_available_rooms.konveyor.c.a()));
        }

        @Override // com.avito.android.hotel_available_rooms.di.n
        public final void a(HotelAvailableRoomsActivity hotelAvailableRoomsActivity) {
            hotelAvailableRoomsActivity.f162647m = this.f162685G;
            hotelAvailableRoomsActivity.f162649o = this.f162684F.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f162705a.u4();
            dagger.internal.t.c(aVarU4);
            hotelAvailableRoomsActivity.f162650p = aVarU4;
            hotelAvailableRoomsActivity.f162651q = this.f162707b.F0();
            hotelAvailableRoomsActivity.f162652r = this.f162690L.get();
            hotelAvailableRoomsActivity.f162653s = this.f162710c0.get();
        }
    }

    public static n.a a() {
        return new b();
    }
}

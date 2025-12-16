package com.avito.android.safedeal.universal_delivery_type.di;

import Hr.InterfaceC14024a;
import Zi.InterfaceC19564a;
import Zi.InterfaceC19565b;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.B;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeActivity;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.di.g;
import com.avito.android.safedeal.universal_delivery_type.mvi.A;
import com.avito.android.safedeal.universal_delivery_type.mvi.w;
import cv.InterfaceC39417a;
import java.util.Set;

/* compiled from: DaggerUniversalDeliveryTypeComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.di.g.a
        public final g a(com.avito.android.analytics.screens.r rVar, UniversalDeliveryTypeParams universalDeliveryTypeParams, UniversalDeliveryTypeActivity universalDeliveryTypeActivity, i iVar, InterfaceC39417a interfaceC39417a, com.avito.android.universal_map.j jVar) {
            universalDeliveryTypeParams.getClass();
            interfaceC39417a.getClass();
            return new c(new k(), iVar, interfaceC39417a, jVar, rVar, universalDeliveryTypeParams, universalDeliveryTypeActivity, null);
        }
    }

    /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final i f256569a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.universal_map.j f256570b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19565b> f256571c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19564a> f256572d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<gj.d> f256573e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f256574f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.safedeal.universal_delivery_type.beduin.a> f256575g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<Wi.b> f256576h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<Set<gj.f<?>>> f256577i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<a.b> f256578j;

        /* renamed from: k, reason: collision with root package name */
        public final m f256579k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<B> f256580l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.p f256581m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f256582n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f256583o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<H> f256584p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28499v> f256585q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.screens.o> f256586r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.safedeal.universal_delivery_type.l> f256587s;

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.di.a$c$a, reason: collision with other inner class name */
        public static final class C7687a implements dagger.internal.u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final i f256588a;

            public C7687a(i iVar) {
                this.f256588a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256588a.El();
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC19565b> {

            /* renamed from: a, reason: collision with root package name */
            public final i f256589a;

            public b(i iVar) {
                this.f256589a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256589a.tf();
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.di.a$c$c, reason: collision with other inner class name */
        public static final class C7688c implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256590a;

            public C7688c(cv.b bVar) {
                this.f256590a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f256590a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        public static final class d implements dagger.internal.u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256591a;

            public d(cv.b bVar) {
                this.f256591a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f256591a.b();
                dagger.internal.t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        public static final class e implements dagger.internal.u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final i f256592a;

            public e(i iVar) {
                this.f256592a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bW3 = this.f256592a.w3();
                dagger.internal.t.c(bW3);
                return bW3;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final i f256593a;

            public f(i iVar) {
                this.f256593a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256593a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(k kVar, i iVar, cv.b bVar, com.avito.android.universal_map.j jVar, com.avito.android.analytics.screens.r rVar, UniversalDeliveryTypeParams universalDeliveryTypeParams, InterfaceC22983P interfaceC22983P, C7686a c7686a) {
            this.f256569a = iVar;
            this.f256570b = jVar;
            dagger.internal.u<InterfaceC19564a> uVarD = dagger.internal.g.d(new l(kVar, new b(iVar)));
            this.f256572d = uVarD;
            this.f256573e = new C7687a(iVar);
            this.f256574f = new C7688c(bVar);
            this.f256575g = dagger.internal.g.d(new o(kVar, uVarD));
            dagger.internal.u<Wi.b> uVarD2 = dagger.internal.g.d(new p(kVar));
            this.f256576h = uVarD2;
            dagger.internal.u<Set<gj.f<?>>> uVarD3 = dagger.internal.g.d(new n(kVar, this.f256575g, uVarD2));
            this.f256577i = uVarD3;
            this.f256579k = new m(kVar, this.f256573e, this.f256574f, uVarD3, new d(bVar));
            dagger.internal.l lVarA = dagger.internal.l.a(universalDeliveryTypeParams);
            com.avito.android.safedeal.universal_delivery_type.domain.b bVar2 = new com.avito.android.safedeal.universal_delivery_type.domain.b(lVarA, new Sn0.d(new e(iVar)));
            m mVar = this.f256579k;
            this.f256581m = new com.avito.android.safedeal.universal_delivery_type.p(this.f256579k, new com.avito.android.safedeal.universal_delivery_type.mvi.u(new com.avito.android.safedeal.universal_delivery_type.mvi.r(lVarA, bVar2, mVar, this.f256574f, this.f256575g, this.f256576h), new com.avito.android.safedeal.universal_delivery_type.mvi.e(bVar2, mVar), w.a(), A.a()));
            this.f256582n = new f(iVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(rVar);
            this.f256583o = lVarA2;
            dagger.internal.u<H> uVarD4 = dagger.internal.g.d(new s(lVarA2, this.f256582n));
            this.f256584p = uVarD4;
            this.f256585q = dagger.internal.g.d(new t(uVarD4));
            dagger.internal.u<com.avito.android.analytics.screens.o> uVarD5 = dagger.internal.g.d(new u(this.f256584p));
            this.f256586r = uVarD5;
            this.f256587s = dagger.internal.g.d(new com.avito.android.safedeal.universal_delivery_type.n(this.f256583o, uVarD5, this.f256582n, this.f256585q));
        }

        @Override // kj.InterfaceC42698a
        public final InterfaceC19564a Vg() {
            return this.f256572d.get();
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.di.g
        public final void vh(UniversalDeliveryTypeActivity universalDeliveryTypeActivity) {
            universalDeliveryTypeActivity.f256405n = this.f256581m;
            i iVar = this.f256569a;
            iVar.S6();
            InterfaceC14024a interfaceC14024aL = iVar.L();
            dagger.internal.t.c(interfaceC14024aL);
            universalDeliveryTypeActivity.f256407p = interfaceC14024aL;
            universalDeliveryTypeActivity.f256415x = this.f256587s.get();
            universalDeliveryTypeActivity.f256416y = iVar.Ad();
            universalDeliveryTypeActivity.f256402A = this.f256570b.y4();
        }
    }

    public static g.a a() {
        return new b();
    }
}

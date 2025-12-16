package com.avito.android.user_address.map.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.U0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.geo.j;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.location.find.o;
import com.avito.android.location.find.v;
import com.avito.android.location.find.w;
import com.avito.android.location.find.y;
import com.avito.android.permissions.G;
import com.avito.android.permissions.q;
import com.avito.android.permissions.s;
import com.avito.android.permissions.z;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.UserAddressMapFragment;
import com.avito.android.user_address.map.di.b;
import com.avito.android.user_address.map.domain.p;
import com.avito.android.user_address.map.e;
import com.avito.android.user_address.map.mvi.C35359l;
import com.avito.android.user_address.map.mvi.C35362o;
import com.avito.android.user_address.map.mvi.Y;
import com.avito.android.user_address.map.mvi.b0;
import com.avito.android.user_address.map.mvi.d0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import nF.C44245a;
import pW.C47017h;
import pW.C47018i;

/* compiled from: DaggerUserAddressMapComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUserAddressMapComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_address.map.di.b.a
        public final com.avito.android.user_address.map.di.b a(UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map, com.avito.android.user_address.g gVar, ActivityC22955m activityC22955m, UserAddressMapFragment userAddressMapFragment, Resources resources, r rVar, com.avito.android.user_address.map.di.c cVar, com.avito.android.user_address.di.b bVar, InterfaceC39417a interfaceC39417a) {
            bVar.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, bVar, interfaceC39417a, map, gVar, activityC22955m, userAddressMapFragment, resources, rVar, null);
        }
    }

    /* compiled from: DaggerUserAddressMapComponent.java */
    public static final class c implements com.avito.android.user_address.map.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<U0> f307515A;

        /* renamed from: B, reason: collision with root package name */
        public final u<AvitoMapAttachHelper> f307516B;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_address.g f307517a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.user_address.map.di.c f307518b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f307519c;

        /* renamed from: d, reason: collision with root package name */
        public final l f307520d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TG0.a> f307521e;

        /* renamed from: f, reason: collision with root package name */
        public final u<VG0.a> f307522f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.user_address.a> f307523g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.user_address.map.domain.d> f307524h;

        /* renamed from: i, reason: collision with root package name */
        public final u<j> f307525i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC31503a> f307526j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.location.find.d> f307527k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.location.find.r> f307528l;

        /* renamed from: m, reason: collision with root package name */
        public final u<w> f307529m;

        /* renamed from: n, reason: collision with root package name */
        public final u<o> f307530n;

        /* renamed from: o, reason: collision with root package name */
        public final l f307531o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.user_address.map.view.e> f307532p;

        /* renamed from: q, reason: collision with root package name */
        public final u<G> f307533q;

        /* renamed from: r, reason: collision with root package name */
        public final u<z> f307534r;

        /* renamed from: s, reason: collision with root package name */
        public final u<q> f307535s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C44245a> f307536t;

        /* renamed from: u, reason: collision with root package name */
        public final Y f307537u;

        /* renamed from: v, reason: collision with root package name */
        public final C35359l f307538v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f307539w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C28478k> f307540x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f307541y;

        /* renamed from: z, reason: collision with root package name */
        public final l f307542z;

        /* compiled from: DaggerUserAddressMapComponent.java */
        /* renamed from: com.avito.android.user_address.map.di.a$c$a, reason: collision with other inner class name */
        public static final class C9450a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307543a;

            public C9450a(com.avito.android.user_address.map.di.c cVar) {
                this.f307543a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f307543a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class b implements u<VG0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307544a;

            public b(com.avito.android.user_address.map.di.c cVar) {
                this.f307544a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                VG0.a aVarAj = this.f307544a.Aj();
                t.c(aVarAj);
                return aVarAj;
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        /* renamed from: com.avito.android.user_address.map.di.a$c$c, reason: collision with other inner class name */
        public static final class C9451c implements u<C44245a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307545a;

            public C9451c(com.avito.android.user_address.map.di.c cVar) {
                this.f307545a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f307545a.R0();
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class d implements u<com.avito.android.user_address.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.di.b f307546a;

            public d(com.avito.android.user_address.di.b bVar) {
                this.f307546a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.user_address.a aVarC = this.f307546a.c();
                t.c(aVarC);
                return aVarC;
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class e implements u<j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307547a;

            public e(com.avito.android.user_address.map.di.c cVar) {
                this.f307547a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                j jVarC0 = this.f307547a.c0();
                t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class f implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307548a;

            public f(com.avito.android.user_address.map.di.c cVar) {
                this.f307548a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f307548a.X0();
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class g implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307549a;

            public g(com.avito.android.user_address.map.di.c cVar) {
                this.f307549a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarA = this.f307549a.A();
                t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class h implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307550a;

            public h(com.avito.android.user_address.map.di.c cVar) {
                this.f307550a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f307550a.N();
            }
        }

        /* compiled from: DaggerUserAddressMapComponent.java */
        public static final class i implements u<TG0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.map.di.c f307551a;

            public i(com.avito.android.user_address.map.di.c cVar) {
                this.f307551a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TG0.a aVarF7 = this.f307551a.f7();
                t.c(aVarF7);
                return aVarF7;
            }
        }

        public c(com.avito.android.user_address.map.di.c cVar, com.avito.android.user_address.di.b bVar, cv.b bVar2, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map, com.avito.android.user_address.g gVar, Activity activity, Fragment fragment, Resources resources, r rVar, C9449a c9449a) {
            this.f307517a = gVar;
            this.f307518b = cVar;
            this.f307519c = bVar2;
            this.f307520d = l.a(map);
            i iVar = new i(cVar);
            b bVar3 = new b(cVar);
            d dVar = new d(bVar);
            this.f307523g = dVar;
            this.f307524h = dagger.internal.g.d(new p(iVar, bVar3, dVar));
            e eVar = new e(cVar);
            this.f307525i = eVar;
            u<InterfaceC31503a> uVarD = dagger.internal.g.d(C47017h.a(eVar));
            this.f307526j = uVarD;
            this.f307527k = dagger.internal.g.d(C47018i.a(uVarD));
            u<com.avito.android.location.find.r> uVarD2 = dagger.internal.g.d(v.a(this.f307525i));
            this.f307528l = uVarD2;
            u<w> uVarD3 = dagger.internal.g.d(y.a(uVarD2));
            this.f307529m = uVarD3;
            this.f307530n = dagger.internal.g.d(com.avito.android.location.find.q.a(uVarD3, this.f307527k));
            this.f307531o = l.a(activity);
            this.f307532p = dagger.internal.g.d(new com.avito.android.user_address.map.view.g(l.a(resources)));
            u<q> uVarD4 = dagger.internal.g.d(new s(new h(cVar), new g(cVar)));
            this.f307535s = uVarD4;
            C9451c c9451c = new C9451c(cVar);
            l lVar = this.f307520d;
            u<com.avito.android.user_address.map.domain.d> uVar = this.f307524h;
            u<o> uVar2 = this.f307530n;
            l lVar2 = this.f307531o;
            u<com.avito.android.user_address.a> uVar3 = this.f307523g;
            u<com.avito.android.user_address.map.view.e> uVar4 = this.f307532p;
            this.f307537u = new Y(lVar, lVar2, uVarD4, uVar, uVar2, uVar3, uVar4, c9451c);
            this.f307538v = new C35359l(lVar, uVar, uVar4);
            this.f307539w = new C9450a(cVar);
            u<C28478k> uVarD5 = dagger.internal.g.d(new com.avito.android.user_address.map.di.g(l.a(rVar)));
            this.f307540x = uVarD5;
            this.f307541y = com.avito.android.advert.item.delivery_suggests.l.i(this.f307539w, uVarD5);
            this.f307542z = l.a(new com.avito.android.user_address.map.g(new com.avito.android.user_address.map.f(new C35362o(this.f307537u, b0.a(), this.f307538v, d0.a(), this.f307520d, this.f307541y))));
            this.f307516B = dagger.internal.g.d(new com.avito.android.user_address.map.di.e(new f(cVar)));
        }

        @Override // com.avito.android.user_address.map.di.b
        public final void a(UserAddressMapFragment userAddressMapFragment) {
            userAddressMapFragment.f307489n0 = this.f307517a;
            userAddressMapFragment.f307490o0 = (e.a) this.f307542z.f393949a;
            userAddressMapFragment.f307491p0 = this.f307516B.get();
            this.f307518b.R0();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f307519c.u4();
            t.c(aVarU4);
            userAddressMapFragment.f307492q0 = aVarU4;
            userAddressMapFragment.f307493r0 = this.f307535s.get();
            userAddressMapFragment.f307494s0 = this.f307541y.get();
            userAddressMapFragment.f307495t0 = this.f307530n.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

package com.avito.android.sx_address.list.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.sx_address.list.SxAddressListFragment;
import com.avito.android.sx_address.list.di.h;
import com.avito.android.sx_address.list.di.l;
import com.avito.android.sx_address.list.di.m;
import com.avito.android.sx_address.list.di.s;
import com.avito.android.sx_address.list.di.x;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.mvi.B;
import com.avito.android.sx_address.list.mvi.E;
import com.avito.android.sx_address.list.mvi.G;
import com.avito.android.sx_address.list.mvi.I;
import cv.InterfaceC39417a;
import dagger.internal.A;
import java.util.Set;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;
import zA0.InterfaceC50429b;

/* compiled from: DaggerSxAddressListComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: DaggerSxAddressListComponent.java */
    public static final class b implements m.a {
        public b() {
        }

        @Override // com.avito.android.sx_address.list.di.m.a
        public final m a(SxAddressListParams sxAddressListParams, Resources resources, ActivityC22955m activityC22955m, n nVar, InterfaceC39417a interfaceC39417a) {
            sxAddressListParams.getClass();
            interfaceC39417a.getClass();
            return new C8901c(nVar, interfaceC39417a, sxAddressListParams, resources, activityC22955m, null);
        }
    }

    /* compiled from: DaggerSxAddressListComponent.java */
    /* renamed from: com.avito.android.sx_address.list.di.c$c, reason: collision with other inner class name */
    public static final class C8901c implements m {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f293067A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f293068B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f293069C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f293070D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f293071E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<d2<AddressItem>> f293072F;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f293073a;

        /* renamed from: b, reason: collision with root package name */
        public final n f293074b;

        /* renamed from: c, reason: collision with root package name */
        public final Activity f293075c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<EA0.a> f293076d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.domain.b> f293077e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f293078f;

        /* renamed from: g, reason: collision with root package name */
        public final t f293079g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.provider.a> f293080h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f293081i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.analytics.g> f293082j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.analytics.i> f293083k;

        /* renamed from: l, reason: collision with root package name */
        public final B f293084l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f293085m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.e> f293086n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC50429b> f293087o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.sx_address.list.mvi.y f293088p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.mvi.entity.d> f293089q;

        /* renamed from: r, reason: collision with root package name */
        public final I f293090r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.sx_address.list.i f293091s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f293092t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<Y1<AddressItem>> f293093u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sx_address.list.view.recycler.address.c> f293094v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f293095w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f293096x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f293097y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f293098z;

        /* compiled from: DaggerSxAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.list.di.c$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f293099a;

            public a(n nVar) {
                this.f293099a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f293099a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSxAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.list.di.c$c$b */
        public static final class b implements dagger.internal.u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f293100a;

            public b(n nVar) {
                this.f293100a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f293100a.v();
                dagger.internal.t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerSxAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.list.di.c$c$c, reason: collision with other inner class name */
        public static final class C8902c implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f293101a;

            public C8902c(cv.b bVar) {
                this.f293101a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f293101a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSxAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.list.di.c$c$d */
        public static final class d implements dagger.internal.u<EA0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f293102a;

            public d(n nVar) {
                this.f293102a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EA0.a aVarQ1 = this.f293102a.q1();
                dagger.internal.t.c(aVarQ1);
                return aVarQ1;
            }
        }

        public C8901c(n nVar, cv.b bVar, SxAddressListParams sxAddressListParams, Resources resources, Activity activity, a aVar) {
            this.f293073a = bVar;
            this.f293074b = nVar;
            this.f293075c = activity;
            this.f293077e = dagger.internal.B.a(new com.avito.android.sx_address.list.domain.g(new d(nVar)));
            this.f293078f = dagger.internal.l.a(sxAddressListParams);
            this.f293079g = new t(dagger.internal.l.a(activity));
            this.f293080h = new b(nVar);
            this.f293081i = new a(nVar);
            dagger.internal.u<com.avito.android.sx_address.list.analytics.g> uVarD = dagger.internal.g.d(l.a.f293110a);
            this.f293082j = uVarD;
            dagger.internal.u<com.avito.android.sx_address.list.analytics.i> uVarA = dagger.internal.B.a(new com.avito.android.sx_address.list.analytics.k(this.f293078f, uVarD, this.f293081i));
            this.f293083k = uVarA;
            this.f293084l = new B(this.f293077e, this.f293078f, this.f293079g, this.f293080h, uVarA);
            this.f293085m = new C8902c(bVar);
            this.f293086n = dagger.internal.g.d(new com.avito.android.sx_address.list.g(dagger.internal.l.a(resources)));
            dagger.internal.u<InterfaceC50429b> uVarD2 = dagger.internal.g.d(new zA0.d(this.f293081i, this.f293080h));
            this.f293087o = uVarD2;
            this.f293088p = new com.avito.android.sx_address.list.mvi.y(this.f293077e, this.f293078f, this.f293085m, this.f293079g, this.f293080h, this.f293086n, uVarD2, this.f293083k);
            dagger.internal.u<com.avito.android.sx_address.list.mvi.entity.d> uVarD3 = dagger.internal.g.d(com.avito.android.sx_address.list.mvi.entity.f.a());
            this.f293089q = uVarD3;
            this.f293090r = new I(uVarD3);
            this.f293091s = new com.avito.android.sx_address.list.i(new E(this.f293084l, this.f293088p, G.a(), this.f293090r));
            this.f293092t = dagger.internal.g.d(h.a.f293106a);
            dagger.internal.u<Y1<AddressItem>> uVarD4 = dagger.internal.g.d(s.a.f293113a);
            this.f293093u = uVarD4;
            dagger.internal.u<com.avito.android.sx_address.list.view.recycler.address.c> uVarD5 = dagger.internal.g.d(new com.avito.android.sx_address.list.view.recycler.address.f(uVarD4));
            this.f293094v = uVarD5;
            this.f293095w = dagger.internal.g.d(new com.avito.android.sx_address.list.view.recycler.address.b(uVarD5));
            A.b bVarA = dagger.internal.A.a(1, 1);
            bVarA.f393938b.add(this.f293092t);
            bVarA.f393937a.add(this.f293095w);
            dagger.internal.u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new g(bVarA.b()));
            this.f293096x = uVarD6;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new f(uVarD6));
            this.f293097y = uVarD7;
            this.f293098z = dagger.internal.g.d(new i(uVarD7, this.f293096x));
            this.f293067A = dagger.internal.g.d(x.a.f293118a);
            this.f293068B = dagger.internal.g.d(com.avito.android.sx_address.list.view.recycler.promo_banner.f.a());
            A.b bVarA2 = dagger.internal.A.a(1, 1);
            bVarA2.f393938b.add(this.f293067A);
            bVarA2.f393937a.add(this.f293068B);
            dagger.internal.u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new w(bVarA2.b()));
            this.f293069C = uVarD8;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new v(uVarD8));
            this.f293070D = uVarD9;
            this.f293071E = dagger.internal.g.d(new y(uVarD9, this.f293069C));
            this.f293072F = dagger.internal.g.d(new r(this.f293093u));
        }

        @Override // com.avito.android.sx_address.list.di.m
        public final void a(SxAddressListFragment sxAddressListFragment) {
            sxAddressListFragment.f293020n0 = this.f293091s;
            sxAddressListFragment.f293021o0 = this.f293098z.get();
            sxAddressListFragment.f293022p0 = this.f293097y.get();
            sxAddressListFragment.f293023q0 = this.f293071E.get();
            sxAddressListFragment.f293024r0 = this.f293070D.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f293073a.u4();
            dagger.internal.t.c(aVarU4);
            sxAddressListFragment.f293025s0 = aVarU4;
            sxAddressListFragment.f293026t0 = this.f293072F.get();
            sxAddressListFragment.f293027u0 = new com.avito.android.sx_address.list.view.recycler.promo_banner.a();
            sxAddressListFragment.f293028v0 = this.f293086n.get();
            n nVar = this.f293074b;
            com.avito.android.util.text.a aVarE = nVar.e();
            dagger.internal.t.c(aVarE);
            sxAddressListFragment.f293029w0 = aVarE;
            sxAddressListFragment.f293030x0 = this.f293083k.get();
            sxAddressListFragment.f293031y0 = this.f293082j.get();
            p.f293111a.getClass();
            sxAddressListFragment.f293032z0 = this.f293075c.getSharedPreferences("SX_ADDRESS_LIST_PREFERENCES", 0);
            com.avito.android.analytics.provider.a aVarV = nVar.v();
            dagger.internal.t.c(aVarV);
            sxAddressListFragment.f293015A0 = aVarV;
        }
    }

    public static m.a a() {
        return new b();
    }
}

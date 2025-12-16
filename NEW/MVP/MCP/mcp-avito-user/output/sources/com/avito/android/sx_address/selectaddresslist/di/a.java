package com.avito.android.sx_address.selectaddresslist.di;

import android.content.res.Resources;
import com.avito.android.sx_address.SelectAddressListParams;
import com.avito.android.sx_address.selectaddresslist.SelectAddressListFragment;
import com.avito.android.sx_address.selectaddresslist.di.b;
import com.avito.android.sx_address.selectaddresslist.di.g;
import com.avito.android.sx_address.selectaddresslist.di.i;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.mvi.n;
import com.avito.android.sx_address.selectaddresslist.mvi.q;
import com.avito.android.sx_address.selectaddresslist.mvi.s;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;

/* compiled from: DaggerSelectAddressListComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSelectAddressListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.sx_address.selectaddresslist.di.b.a
        public final com.avito.android.sx_address.selectaddresslist.di.b a(Resources resources, SelectAddressListParams selectAddressListParams, com.avito.android.sx_address.selectaddresslist.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, selectAddressListParams, null);
        }
    }

    /* compiled from: DaggerSelectAddressListComponent.java */
    public static final class c implements com.avito.android.sx_address.selectaddresslist.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.sx_address.selectaddresslist.di.c f294034a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f294035b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f294036c;

        /* renamed from: d, reason: collision with root package name */
        public final n f294037d;

        /* renamed from: e, reason: collision with root package name */
        public final u<EA0.a> f294038e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.sx_address.selectaddresslist.domain.a> f294039f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f294040g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.sx_address.selectaddresslist.f f294041h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.sx_address.selectaddresslist.b> f294042i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f294043j = dagger.internal.g.d(g.a.f294057a);

        /* renamed from: k, reason: collision with root package name */
        public final u<Y1<AddressListViewItem>> f294044k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.sx_address.selectaddresslist.view.recycler.c> f294045l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294046m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f294047n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f294048o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f294049p;

        /* renamed from: q, reason: collision with root package name */
        public final u<d2<AddressListViewItem>> f294050q;

        /* compiled from: DaggerSelectAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.selectaddresslist.di.a$c$a, reason: collision with other inner class name */
        public static final class C8936a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f294051a;

            public C8936a(cv.b bVar) {
                this.f294051a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294051a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelectAddressListComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.selectaddresslist.di.c f294052a;

            public b(com.avito.android.sx_address.selectaddresslist.di.c cVar) {
                this.f294052a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f294052a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectAddressListComponent.java */
        /* renamed from: com.avito.android.sx_address.selectaddresslist.di.a$c$c, reason: collision with other inner class name */
        public static final class C8937c implements u<EA0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sx_address.selectaddresslist.di.c f294053a;

            public C8937c(com.avito.android.sx_address.selectaddresslist.di.c cVar) {
                this.f294053a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EA0.a aVarQ1 = this.f294053a.q1();
                t.c(aVarQ1);
                return aVarQ1;
            }
        }

        public c(com.avito.android.sx_address.selectaddresslist.di.c cVar, cv.b bVar, Resources resources, SelectAddressListParams selectAddressListParams, C8935a c8935a) {
            this.f294034a = cVar;
            this.f294035b = bVar;
            this.f294037d = new n(new C8936a(bVar));
            this.f294039f = dagger.internal.g.d(new com.avito.android.sx_address.selectaddresslist.domain.d(new C8937c(cVar)));
            this.f294040g = new b(cVar);
            this.f294041h = new com.avito.android.sx_address.selectaddresslist.f(new q(this.f294037d, new com.avito.android.sx_address.selectaddresslist.mvi.i(l.a(selectAddressListParams), this.f294039f, this.f294040g), s.a(), com.avito.android.sx_address.selectaddresslist.mvi.u.a()));
            this.f294042i = dagger.internal.g.d(new com.avito.android.sx_address.selectaddresslist.d(l.a(resources)));
            u<Y1<AddressListViewItem>> uVarD = dagger.internal.g.d(i.a.f294059a);
            this.f294044k = uVarD;
            u<com.avito.android.sx_address.selectaddresslist.view.recycler.c> uVarD2 = dagger.internal.g.d(new com.avito.android.sx_address.selectaddresslist.view.recycler.f(uVarD));
            this.f294045l = uVarD2;
            this.f294046m = dagger.internal.g.d(new com.avito.android.sx_address.selectaddresslist.view.recycler.b(uVarD2));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f294043j);
            bVarA.f393937a.add(this.f294046m);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new f(bVarA.b()));
            this.f294047n = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new e(uVarD3));
            this.f294048o = uVarD4;
            this.f294049p = dagger.internal.g.d(new j(uVarD4, this.f294047n));
            this.f294050q = dagger.internal.g.d(new h(this.f294044k));
        }

        @Override // com.avito.android.sx_address.selectaddresslist.di.b
        public final void a(SelectAddressListFragment selectAddressListFragment) {
            selectAddressListFragment.f294015n0 = this.f294041h;
            selectAddressListFragment.f294016o0 = this.f294042i.get();
            selectAddressListFragment.f294017p0 = this.f294048o.get();
            selectAddressListFragment.f294018q0 = this.f294049p.get();
            selectAddressListFragment.f294019r0 = this.f294050q.get();
            com.avito.android.util.text.a aVarE = this.f294034a.e();
            t.c(aVarE);
            selectAddressListFragment.f294020s0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294035b.u4();
            t.c(aVarU4);
            selectAddressListFragment.f294021t0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}

package com.avito.android.user_address.list.di;

import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.interactor.g;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.list.UserAddressListFragment;
import com.avito.android.user_address.list.di.b;
import com.avito.android.user_address.list.domain.i;
import com.avito.android.user_address.list.mvi.h;
import com.avito.android.user_address.list.mvi.j;
import com.avito.android.user_address.list.mvi.m;
import com.avito.android.user_address.list.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerUserAddressListComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUserAddressListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_address.list.di.b.a
        public final com.avito.android.user_address.list.di.b a(Resources resources, l lVar, C28478k c28478k, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list, com.avito.android.user_address.list.di.c cVar, InterfaceC39417a interfaceC39417a, com.avito.android.user_address.di.b bVar) {
            list.getClass();
            interfaceC39417a.getClass();
            bVar.getClass();
            return new c(cVar, interfaceC39417a, bVar, resources, lVar, c28478k, list, null);
        }
    }

    /* compiled from: DaggerUserAddressListComponent.java */
    public static final class c implements com.avito.android.user_address.list.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f307322a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.user_address.list.di.c f307323b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.user_address.di.b f307324c;

        /* renamed from: d, reason: collision with root package name */
        public final u<g> f307325d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.user_address.a> f307326e;

        /* renamed from: f, reason: collision with root package name */
        public final i f307327f;

        /* renamed from: g, reason: collision with root package name */
        public final h f307328g;

        /* renamed from: h, reason: collision with root package name */
        public final j f307329h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f307330i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f307331j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.user_address.list.i f307332k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f307333l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f307334m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.user_address.list.e> f307335n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f307336o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f307337p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f307338q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f307339r;

        /* compiled from: DaggerUserAddressListComponent.java */
        /* renamed from: com.avito.android.user_address.list.di.a$c$a, reason: collision with other inner class name */
        public static final class C9445a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.list.di.c f307340a;

            public C9445a(com.avito.android.user_address.list.di.c cVar) {
                this.f307340a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f307340a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerUserAddressListComponent.java */
        public static final class b implements u<com.avito.android.user_address.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.di.b f307341a;

            public b(com.avito.android.user_address.di.b bVar) {
                this.f307341a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.user_address.a aVarC = this.f307341a.c();
                t.c(aVarC);
                return aVarC;
            }
        }

        /* compiled from: DaggerUserAddressListComponent.java */
        /* renamed from: com.avito.android.user_address.list.di.a$c$c, reason: collision with other inner class name */
        public static final class C9446c implements u<g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_address.list.di.c f307342a;

            public C9446c(com.avito.android.user_address.list.di.c cVar) {
                this.f307342a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                g gVarU0 = this.f307342a.u0();
                t.c(gVarU0);
                return gVarU0;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.user_address.list.di.c cVar, cv.b bVar, com.avito.android.user_address.di.b bVar2, Resources resources, l lVar, C28478k c28478k, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list, C9444a c9444a) {
            this.f307322a = bVar;
            this.f307323b = cVar;
            this.f307324c = bVar2;
            C9446c c9446c = new C9446c(cVar);
            this.f307325d = c9446c;
            b bVar3 = new b(bVar2);
            this.f307326e = bVar3;
            this.f307327f = new i(c9446c, bVar3);
            com.avito.android.user_address.list.domain.e eVar = new com.avito.android.user_address.list.domain.e(dagger.internal.l.a(list), this.f307325d, this.f307326e);
            this.f307328g = new h(this.f307327f, eVar);
            this.f307329h = new j(eVar);
            this.f307330i = new C9445a(cVar);
            this.f307331j = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f307330i);
            this.f307332k = new com.avito.android.user_address.list.i(new com.avito.android.user_address.list.mvi.c(this.f307328g, m.a(), this.f307329h, o.a(), this.f307331j));
            this.f307333l = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f307334m = dagger.internal.g.d(new com.avito.android.user_address.list.view.recycler.address.c(new com.avito.android.user_address.list.view.recycler.address.g(dagger.internal.l.a(lVar))));
            u<com.avito.android.user_address.list.e> uVarD = dagger.internal.g.d(new com.avito.android.user_address.list.g(dagger.internal.l.a(resources)));
            this.f307335n = uVarD;
            this.f307336o = dagger.internal.g.d(new com.avito.android.user_address.list.view.recycler.title.c(new com.avito.android.user_address.list.view.recycler.title.e(uVarD)));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f307333l);
            u<TV0.b<?, ?>> uVar = this.f307334m;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(uVar);
            list2.add(this.f307336o);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f307337p = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f307338q = uVarH;
            this.f307339r = dagger.internal.g.d(new e(uVarH, this.f307337p));
        }

        @Override // com.avito.android.user_address.list.di.b
        public final void a(UserAddressListFragment userAddressListFragment) {
            userAddressListFragment.f307301n0 = this.f307332k;
            userAddressListFragment.f307303p0 = this.f307339r.get();
            userAddressListFragment.f307304q0 = this.f307338q.get();
            userAddressListFragment.f307305r0 = this.f307335n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f307322a.u4();
            t.c(aVarU4);
            userAddressListFragment.f307306s0 = aVarU4;
            userAddressListFragment.f307307t0 = this.f307331j.get();
            InterfaceC28373a interfaceC28373aA = this.f307323b.a();
            t.c(interfaceC28373aA);
            userAddressListFragment.f307308u0 = interfaceC28373aA;
            com.avito.android.user_address.a aVarC = this.f307324c.c();
            t.c(aVarC);
            userAddressListFragment.f307309v0 = aVarC;
        }
    }

    public static b.a a() {
        return new b();
    }
}

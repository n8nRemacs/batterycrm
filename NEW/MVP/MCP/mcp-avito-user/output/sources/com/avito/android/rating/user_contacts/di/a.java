package com.avito.android.rating.user_contacts.di;

import Mg0.InterfaceC14487a;
import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.user_contacts.UserContactsActivity;
import com.avito.android.rating.user_contacts.di.b;
import com.avito.android.rating.user_contacts.di.h;
import com.avito.android.rating.user_contacts.m;
import com.avito.android.rating.user_contacts.mvi.j;
import com.avito.android.rating.user_contacts.mvi.n;
import com.avito.android.rating.user_contacts.mvi.p;
import com.avito.android.rating.user_contacts.mvi.r;
import com.avito.android.rating.user_contacts.mvi.t;
import com.avito.android.rating.user_contacts.o;
import com.avito.android.rating.user_contacts.q;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerUserContactsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerUserContactsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.rating.user_contacts.di.b.a
        public final com.avito.android.rating.user_contacts.di.b a(d dVar, InterfaceC39417a interfaceC39417a, boolean z12, Resources resources, String str, C28478k c28478k, l lVar, Y41.a aVar) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, Boolean.valueOf(z12), resources, str, c28478k, lVar, aVar, null);
        }
    }

    /* compiled from: DaggerUserContactsComponent.java */
    public static final class c implements com.avito.android.rating.user_contacts.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f247729a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.rating.user_contacts.di.d f247730b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14487a> f247731c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f247732d;

        /* renamed from: e, reason: collision with root package name */
        public final u<n> f247733e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f247734f;

        /* renamed from: g, reason: collision with root package name */
        public final j f247735g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.rating.user_contacts.mvi.e f247736h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.rating.user_contacts.j> f247737i;

        /* renamed from: j, reason: collision with root package name */
        public final t f247738j;

        /* renamed from: k, reason: collision with root package name */
        public final r f247739k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f247740l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f247741m;

        /* renamed from: n, reason: collision with root package name */
        public final q f247742n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f247743o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.rating.user_contacts.adapter.info.b f247744p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.rating.user_contacts.adapter.contact.b f247745q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f247746r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f247747s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f247748t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.recycler.responsive.a> f247749u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.recycler.responsive.e> f247750v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.recycler.responsive.j> f247751w;

        /* renamed from: x, reason: collision with root package name */
        public final u<m> f247752x;

        /* compiled from: DaggerUserContactsComponent.java */
        /* renamed from: com.avito.android.rating.user_contacts.di.a$c$a, reason: collision with other inner class name */
        public static final class C7437a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.user_contacts.di.d f247753a;

            public C7437a(com.avito.android.rating.user_contacts.di.d dVar) {
                this.f247753a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f247753a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerUserContactsComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f247754a;

            public b(cv.b bVar) {
                this.f247754a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f247754a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUserContactsComponent.java */
        /* renamed from: com.avito.android.rating.user_contacts.di.a$c$c, reason: collision with other inner class name */
        public static final class C7438c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.user_contacts.di.d f247755a;

            public C7438c(com.avito.android.rating.user_contacts.di.d dVar) {
                this.f247755a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f247755a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUserContactsComponent.java */
        public static final class d implements u<InterfaceC14487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.rating.user_contacts.di.d f247756a;

            public d(com.avito.android.rating.user_contacts.di.d dVar) {
                this.f247756a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14487a interfaceC14487aI1 = this.f247756a.I1();
                dagger.internal.t.c(interfaceC14487aI1);
                return interfaceC14487aI1;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.rating.user_contacts.di.d dVar, cv.b bVar, Boolean bool, Resources resources, String str, C28478k c28478k, l lVar, Y41.a aVar, C7436a c7436a) {
            this.f247729a = bVar;
            this.f247730b = dVar;
            this.f247731c = new d(dVar);
            this.f247732d = new C7438c(dVar);
            this.f247733e = dagger.internal.g.d(new p(dagger.internal.l.b(str), this.f247731c, this.f247732d));
            this.f247734f = new b(bVar);
            dagger.internal.l lVarA = dagger.internal.l.a(bool);
            u<n> uVar = this.f247733e;
            this.f247735g = new j(lVarA, uVar, this.f247734f);
            this.f247736h = new com.avito.android.rating.user_contacts.mvi.e(uVar);
            u<com.avito.android.rating.user_contacts.j> uVarD = dagger.internal.g.d(com.avito.android.rating.user_contacts.l.a());
            this.f247737i = uVarD;
            this.f247738j = new t(uVarD);
            this.f247739k = new r(this.f247734f);
            this.f247740l = new C7437a(dVar);
            u<ScreenPerformanceTracker> uVarD2 = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f247740l);
            this.f247741m = uVarD2;
            this.f247742n = new q(new com.avito.android.rating.user_contacts.mvi.m(this.f247735g, this.f247736h, this.f247738j, this.f247739k, uVarD2));
            this.f247743o = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f247744p = new com.avito.android.rating.user_contacts.adapter.info.b(com.avito.android.rating.user_contacts.adapter.info.e.a());
            this.f247745q = new com.avito.android.rating.user_contacts.adapter.contact.b(new com.avito.android.rating.user_contacts.adapter.contact.i(dagger.internal.l.a(lVar)));
            this.f247746r = dagger.internal.g.d(new com.avito.android.rating_ui.loading.b(new com.avito.android.rating_ui.loading.e(dagger.internal.l.a(aVar))));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f247743o);
            com.avito.android.rating.user_contacts.adapter.info.b bVar2 = this.f247744p;
            List<u<T>> list = bVarA.f393937a;
            list.add(bVar2);
            list.add(this.f247745q);
            list.add(this.f247746r);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f247747s = uVarK;
            this.f247748t = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            u<com.avito.android.recycler.responsive.a> uVarD3 = dagger.internal.g.d(h.a.f247760a);
            this.f247749u = uVarD3;
            u<com.avito.android.recycler.responsive.e> uVarD4 = dagger.internal.g.d(new f(uVarD3, this.f247748t));
            this.f247750v = uVarD4;
            this.f247751w = dagger.internal.g.d(new i(uVarD4, this.f247747s));
            this.f247752x = dagger.internal.g.d(o.a());
        }

        @Override // com.avito.android.rating.user_contacts.di.b
        public final void a(UserContactsActivity userContactsActivity) {
            userContactsActivity.f247654m = this.f247742n;
            userContactsActivity.f247656o = this.f247751w.get();
            userContactsActivity.f247657p = this.f247750v.get();
            userContactsActivity.f247658q = this.f247747s.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f247729a.u4();
            dagger.internal.t.c(aVarU4);
            userContactsActivity.f247659r = aVarU4;
            userContactsActivity.f247660s = this.f247752x.get();
            InterfaceC28373a interfaceC28373aA = this.f247730b.a();
            dagger.internal.t.c(interfaceC28373aA);
            userContactsActivity.f247661t = interfaceC28373aA;
            userContactsActivity.f247662u = this.f247741m.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

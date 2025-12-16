package com.avito.android.contact_access.di.service;

import Ae.InterfaceC13022a;
import Fr.InterfaceC13828a;
import Zw0.InterfaceC19615a;
import android.content.res.Resources;
import android.os.Bundle;
import cP.InterfaceC27082a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.contact_access.contact_access_service.domain.k;
import com.avito.android.contact_access.contact_access_service.mvi.i;
import com.avito.android.contact_access.contact_access_service.mvi.m;
import com.avito.android.contact_access.contact_access_service.mvi.n;
import com.avito.android.contact_access.contact_access_service.mvi.p;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceArguments;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceFragment;
import com.avito.android.contact_access.di.service.a;
import com.avito.android.remote.X;
import com.avito.android.util.InterfaceC35741a1;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerContactAccessServiceComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class h {

    /* compiled from: DaggerContactAccessServiceComponent.java */
    public static final class b implements a.InterfaceC3744a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC13828a f126124a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f126125b;

        /* renamed from: c, reason: collision with root package name */
        public ContactAccessServiceArguments f126126c;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f126127d;

        /* renamed from: e, reason: collision with root package name */
        public r f126128e;

        /* renamed from: f, reason: collision with root package name */
        public Resources f126129f;

        public b() {
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f126125b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a b(Resources resources) {
            this.f126129f = resources;
            return this;
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final com.avito.android.contact_access.di.service.a build() {
            t.a(InterfaceC13828a.class, this.f126124a);
            t.a(cv.b.class, this.f126125b);
            t.a(ContactAccessServiceArguments.class, this.f126126c);
            t.a(r.class, this.f126128e);
            t.a(Resources.class, this.f126129f);
            return new c(this.f126124a, this.f126125b, this.f126126c, this.f126127d, this.f126128e, this.f126129f, null);
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a c(Bundle bundle) {
            this.f126127d = bundle;
            return this;
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a d(InterfaceC13828a interfaceC13828a) {
            this.f126124a = interfaceC13828a;
            return this;
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a e(r rVar) {
            this.f126128e = rVar;
            return this;
        }

        @Override // com.avito.android.contact_access.di.service.a.InterfaceC3744a
        public final a.InterfaceC3744a f(ContactAccessServiceArguments contactAccessServiceArguments) {
            this.f126126c = contactAccessServiceArguments;
            return this;
        }
    }

    /* compiled from: DaggerContactAccessServiceComponent.java */
    public static final class c implements com.avito.android.contact_access.di.service.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC13828a f126130a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f126131b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f126132c;

        /* renamed from: d, reason: collision with root package name */
        public final u<H> f126133d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28499v> f126134e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28501x> f126135f;

        /* renamed from: g, reason: collision with root package name */
        public final u<o> f126136g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.contact_access.contact_access_service.view.f> f126137h;

        /* renamed from: i, reason: collision with root package name */
        public final u<X> f126138i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC19615a> f126139j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC27082a> f126140k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC13022a> f126141l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.contact_access.contact_access_service.domain.a> f126142m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f126143n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35741a1> f126144o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.contact_access.contact_access_service.mvi.f f126145p;

        /* renamed from: q, reason: collision with root package name */
        public final l f126146q;

        /* compiled from: DaggerContactAccessServiceComponent.java */
        public static final class a implements u<InterfaceC27082a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126147a;

            public a(InterfaceC13828a interfaceC13828a) {
                this.f126147a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27082a interfaceC27082aWe = this.f126147a.we();
                t.c(interfaceC27082aWe);
                return interfaceC27082aWe;
            }
        }

        /* compiled from: DaggerContactAccessServiceComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f126148a;

            public b(cv.b bVar) {
                this.f126148a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126148a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerContactAccessServiceComponent.java */
        /* renamed from: com.avito.android.contact_access.di.service.h$c$c, reason: collision with other inner class name */
        public static final class C3745c implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126149a;

            public C3745c(InterfaceC13828a interfaceC13828a) {
                this.f126149a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f126149a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerContactAccessServiceComponent.java */
        public static final class d implements u<X> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126150a;

            public d(InterfaceC13828a interfaceC13828a) {
                this.f126150a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f126150a.L2();
            }
        }

        /* compiled from: DaggerContactAccessServiceComponent.java */
        public static final class e implements u<InterfaceC13022a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126151a;

            public e(InterfaceC13828a interfaceC13828a) {
                this.f126151a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13022a interfaceC13022aL9 = this.f126151a.L9();
                t.c(interfaceC13022aL9);
                return interfaceC13022aL9;
            }
        }

        /* compiled from: DaggerContactAccessServiceComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13828a f126152a;

            public f(InterfaceC13828a interfaceC13828a) {
                this.f126152a = interfaceC13828a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126152a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC13828a interfaceC13828a, cv.b bVar, ContactAccessServiceArguments contactAccessServiceArguments, Bundle bundle, r rVar, Resources resources, a aVar) {
            this.f126130a = interfaceC13828a;
            this.f126131b = bVar;
            this.f126132c = new f(interfaceC13828a);
            u<H> uVarD = dagger.internal.g.d(new com.avito.android.contact_access.di.service.f(l.a(rVar), this.f126132c));
            this.f126133d = uVarD;
            this.f126134e = dagger.internal.g.d(new com.avito.android.contact_access.di.service.d(uVarD));
            this.f126135f = dagger.internal.g.d(new com.avito.android.contact_access.di.service.e(this.f126133d));
            u<o> uVarD2 = dagger.internal.g.d(new g(this.f126133d));
            this.f126136g = uVarD2;
            this.f126137h = dagger.internal.g.d(new com.avito.android.contact_access.contact_access_service.view.h(uVarD2, this.f126134e, this.f126135f));
            this.f126139j = dagger.internal.g.d(new k(new d(interfaceC13828a)));
            this.f126140k = new a(interfaceC13828a);
            this.f126141l = new e(interfaceC13828a);
            u<com.avito.android.contact_access.contact_access_service.domain.a> uVarD3 = dagger.internal.g.d(new com.avito.android.contact_access.contact_access_service.domain.g(this.f126139j, this.f126140k, this.f126141l, l.a(contactAccessServiceArguments), m.a()));
            this.f126142m = uVarD3;
            com.avito.android.contact_access.contact_access_service.mvi.d dVar = new com.avito.android.contact_access.contact_access_service.mvi.d(uVarD3);
            com.avito.android.contact_access.contact_access_service.mvi.b bVar2 = new com.avito.android.contact_access.contact_access_service.mvi.b(uVarD3, new b(bVar));
            this.f126145p = new com.avito.android.contact_access.contact_access_service.mvi.f(new C3745c(interfaceC13828a));
            this.f126146q = l.a(new p(new com.avito.android.contact_access.contact_access_service.mvi.o(new i(dVar, bVar2, com.avito.android.contact_access.contact_access_service.mvi.k.a(), this.f126145p))));
        }

        @Override // com.avito.android.contact_access.di.service.a
        public final void a(ContactAccessServiceFragment contactAccessServiceFragment) {
            InterfaceC13828a interfaceC13828a = this.f126130a;
            contactAccessServiceFragment.f126012n0 = interfaceC13828a.t0();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126131b.u4();
            t.c(aVarU4);
            contactAccessServiceFragment.f126013o0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = interfaceC13828a.a();
            t.c(interfaceC28373aA);
            contactAccessServiceFragment.f126014p0 = interfaceC28373aA;
            contactAccessServiceFragment.f126015q0 = this.f126137h.get();
            com.avito.android.util.text.a aVarE = interfaceC13828a.e();
            t.c(aVarE);
            contactAccessServiceFragment.f126016r0 = aVarE;
            contactAccessServiceFragment.f126019u0 = (n.a) this.f126146q.f393949a;
        }
    }

    public static a.InterfaceC3744a a() {
        return new b();
    }
}

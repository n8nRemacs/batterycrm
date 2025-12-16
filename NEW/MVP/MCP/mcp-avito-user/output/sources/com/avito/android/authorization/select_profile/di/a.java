package com.avito.android.authorization.select_profile.di;

import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.select_profile.SelectProfileActivity;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.authorization.select_profile.di.b;
import com.avito.android.authorization.select_profile.di.e;
import com.avito.android.authorization.select_profile.h;
import com.avito.android.authorization.select_profile.j;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ie.InterfaceC41389a;
import java.util.List;
import java.util.Set;
import pe.C47066a;
import pe.C47067b;

/* compiled from: DaggerSelectProfileComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerSelectProfileComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.select_profile.di.b.a
        public final com.avito.android.authorization.select_profile.di.b a(com.avito.android.authorization.select_profile.di.c cVar, InterfaceC39417a interfaceC39417a, SelectProfileActivity selectProfileActivity, Resources resources, Kundle kundle, String str, r rVar) {
            interfaceC39417a.getClass();
            return new c(new C47066a(), new com.avito.android.authorization.select_profile.adapter.text.di.b(), cVar, interfaceC39417a, selectProfileActivity, resources, kundle, str, rVar, null);
        }
    }

    /* compiled from: DaggerSelectProfileComponent.java */
    public static final class c implements com.avito.android.authorization.select_profile.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.select_profile.di.c f94292a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC41389a> f94293b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94294c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.c> f94295d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f94296e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<SelectProfileField>> f94297f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.adapter.profile.b> f94298g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f94299h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94300i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.adapter.text.b> f94301j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f94302k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f94303l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f94304m;

        /* renamed from: n, reason: collision with root package name */
        public final l f94305n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f94306o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC30274a> f94307p;

        /* renamed from: q, reason: collision with root package name */
        public final l f94308q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC35741a1> f94309r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28373a> f94310s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f94311t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C28478k> f94312u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f94313v;

        /* renamed from: w, reason: collision with root package name */
        public final u<j> f94314w;

        /* compiled from: DaggerSelectProfileComponent.java */
        /* renamed from: com.avito.android.authorization.select_profile.di.a$c$a, reason: collision with other inner class name */
        public static final class C2796a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.di.c f94315a;

            public C2796a(com.avito.android.authorization.select_profile.di.c cVar) {
                this.f94315a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f94315a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectProfileComponent.java */
        public static final class b implements u<InterfaceC41389a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.di.c f94316a;

            public b(com.avito.android.authorization.select_profile.di.c cVar) {
                this.f94316a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41389a interfaceC41389aHe = this.f94316a.He();
                t.c(interfaceC41389aHe);
                return interfaceC41389aHe;
            }
        }

        /* compiled from: DaggerSelectProfileComponent.java */
        /* renamed from: com.avito.android.authorization.select_profile.di.a$c$c, reason: collision with other inner class name */
        public static final class C2797c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94317a;

            public C2797c(cv.b bVar) {
                this.f94317a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94317a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelectProfileComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.di.c f94318a;

            public d(com.avito.android.authorization.select_profile.di.c cVar) {
                this.f94318a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f94318a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSelectProfileComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.di.c f94319a;

            public e(com.avito.android.authorization.select_profile.di.c cVar) {
                this.f94319a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94319a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSelectProfileComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.di.c f94320a;

            public f(com.avito.android.authorization.select_profile.di.c cVar) {
                this.f94320a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f94320a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(C47066a c47066a, com.avito.android.authorization.select_profile.adapter.text.di.b bVar, com.avito.android.authorization.select_profile.di.c cVar, cv.b bVar2, Activity activity, Resources resources, Kundle kundle, String str, r rVar, C2795a c2795a) {
            this.f94292a = cVar;
            l lVarA = l.a(str);
            b bVar3 = new b(cVar);
            e eVar = new e(cVar);
            this.f94294c = eVar;
            this.f94295d = g.d(new h(lVarA, bVar3, eVar));
            this.f94296e = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.jakewharton.rxrelay3.c<SelectProfileField>> uVarD = g.d(e.a.f94322a);
            this.f94297f = uVarD;
            u<com.avito.android.authorization.select_profile.adapter.profile.b> uVarD2 = g.d(new pe.c(c47066a, uVarD));
            this.f94298g = uVarD2;
            this.f94299h = g.d(new C47067b(c47066a, uVarD2));
            C2797c c2797c = new C2797c(bVar2);
            this.f94300i = c2797c;
            u<com.avito.android.authorization.select_profile.adapter.text.b> uVarD3 = g.d(new com.avito.android.authorization.select_profile.adapter.text.di.d(bVar, c2797c));
            this.f94301j = uVarD3;
            this.f94302k = g.d(new com.avito.android.authorization.select_profile.adapter.text.di.c(bVar, uVarD3));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f94296e);
            u<TV0.b<?, ?>> uVar = this.f94299h;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f94302k);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f94303l = uVarK;
            this.f94304m = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            l lVarA2 = l.a(activity);
            this.f94305n = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA2));
            this.f94306o = uVarA;
            this.f94307p = B.a(new o(uVarA, this.f94305n));
            this.f94308q = l.a(resources);
            this.f94309r = new d(cVar);
            this.f94310s = new C2796a(cVar);
            this.f94311t = new f(cVar);
            u<C28478k> uVarD4 = g.d(new com.avito.android.authorization.select_profile.di.f(l.a(rVar)));
            this.f94312u = uVarD4;
            this.f94313v = g.d(new C30065i(this.f94311t, uVarD4));
            this.f94314w = g.d(new com.avito.android.authorization.select_profile.u(this.f94308q, l.b(kundle), this.f94295d, this.f94304m, this.f94307p, this.f94300i, this.f94294c, this.f94309r, this.f94297f, this.f94310s, this.f94313v));
        }

        @Override // com.avito.android.authorization.select_profile.di.b
        public final void a(SelectProfileActivity selectProfileActivity) {
            selectProfileActivity.f94222m = this.f94314w.get();
            selectProfileActivity.f94223n = this.f94304m.get();
            selectProfileActivity.f94224o = this.f94303l.get();
            com.avito.android.authorization.select_profile.di.c cVar = this.f94292a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            selectProfileActivity.f94225p = interfaceC28373aA;
            selectProfileActivity.f94226q = cVar.m1();
            selectProfileActivity.f94227r = this.f94313v.get();
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            selectProfileActivity.f94228s = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}

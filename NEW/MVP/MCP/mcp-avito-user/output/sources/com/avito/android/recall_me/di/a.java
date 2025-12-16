package com.avito.android.recall_me.di;

import Bi0.C13153b;
import Bi0.C13154c;
import Cd.D;
import Cd.F;
import android.app.Application;
import android.content.res.Resources;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.recall_me.di.b;
import com.avito.android.recall_me.domain.m;
import com.avito.android.recall_me.presentation.C34233c;
import com.avito.android.recall_me.presentation.I;
import com.avito.android.recall_me.presentation.InterfaceC34231a;
import com.avito.android.recall_me.presentation.J;
import com.avito.android.recall_me.presentation.RecallMeFragment;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import wi0.InterfaceC49631b;

/* compiled from: DaggerRecallMeComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRecallMeComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.recall_me.di.b.a
        public final com.avito.android.recall_me.di.b a(RecallMeParams recallMeParams, S0 s02, Resources resources, e eVar, InterfaceC39417a interfaceC39417a) {
            recallMeParams.getClass();
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, eVar, recallMeParams, s02, resources, null);
        }
    }

    /* compiled from: DaggerRecallMeComponent.java */
    public static final class c implements com.avito.android.recall_me.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final S0 f251787a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.recall_me.di.e f251788b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f251789c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49631b> f251790d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f251791e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.recall_me.presentation.k f251792f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Application> f251793g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Gson> f251794h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.a> f251795i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.recall_me.domain.g> f251796j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC34231a> f251797k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f251798l;

        /* renamed from: m, reason: collision with root package name */
        public final J f251799m;

        /* renamed from: n, reason: collision with root package name */
        public final u<D> f251800n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.recall_me.presentation.items.title.b f251801o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.recall_me.presentation.items.single_input.e f251802p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.recall_me.presentation.items.accept_button.b f251803q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f251804r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f251805s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f251806t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f251807u;

        /* compiled from: DaggerRecallMeComponent.java */
        /* renamed from: com.avito.android.recall_me.di.a$c$a, reason: collision with other inner class name */
        public static final class C7554a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251808a;

            public C7554a(com.avito.android.recall_me.di.e eVar) {
                this.f251808a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f251808a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251809a;

            public b(com.avito.android.recall_me.di.e eVar) {
                this.f251809a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f251809a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        /* renamed from: com.avito.android.recall_me.di.a$c$c, reason: collision with other inner class name */
        public static final class C7555c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f251810a;

            public C7555c(cv.b bVar) {
                this.f251810a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f251810a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        public static final class d implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251811a;

            public d(com.avito.android.recall_me.di.e eVar) {
                this.f251811a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f251811a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        public static final class e implements u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251812a;

            public e(com.avito.android.recall_me.di.e eVar) {
                this.f251812a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f251812a.T();
                t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        public static final class f implements u<InterfaceC49631b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251813a;

            public f(com.avito.android.recall_me.di.e eVar) {
                this.f251813a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49631b interfaceC49631bJ5 = this.f251813a.j5();
                t.c(interfaceC49631bJ5);
                return interfaceC49631bJ5;
            }
        }

        /* compiled from: DaggerRecallMeComponent.java */
        public static final class g implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me.di.e f251814a;

            public g(com.avito.android.recall_me.di.e eVar) {
                this.f251814a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f251814a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(cv.b bVar, com.avito.android.recall_me.di.e eVar, RecallMeParams recallMeParams, S0 s02, Resources resources, C7553a c7553a) {
            this.f251787a = s02;
            this.f251788b = eVar;
            this.f251789c = dagger.internal.l.a(recallMeParams);
            this.f251790d = new f(eVar);
            this.f251791e = new g(eVar);
            com.avito.android.recall_me.presentation.k kVar = new com.avito.android.recall_me.presentation.k(dagger.internal.l.a(resources));
            this.f251792f = kVar;
            com.avito.android.recall_me.domain.b bVar2 = new com.avito.android.recall_me.domain.b(kVar);
            C13153b c13153b = new C13153b(new C7554a(eVar));
            d dVar = new d(eVar);
            e eVar2 = new e(eVar);
            u<InterfaceC49631b> uVar = this.f251790d;
            u<InterfaceC35745a5> uVar2 = this.f251791e;
            this.f251796j = dagger.internal.g.d(new m(uVar, uVar2, kVar, bVar2, new C13154c(c13153b, dVar, uVar, uVar2, eVar2)));
            u<InterfaceC34231a> uVarD = dagger.internal.g.d(new C34233c(this.f251792f));
            this.f251797k = uVarD;
            this.f251799m = new J(this.f251789c, this.f251796j, uVarD, this.f251791e, this.f251792f, new C7555c(bVar));
            q.b bVarA = q.a(1);
            bVarA.a(I.class, this.f251799m);
            this.f251800n = B.a(new F(bVarA.b()));
            this.f251801o = new com.avito.android.recall_me.presentation.items.title.b(com.avito.android.recall_me.presentation.items.title.d.a());
            k kVar2 = new k(new l(dagger.internal.l.a(s02), this.f251800n));
            this.f251802p = new com.avito.android.recall_me.presentation.items.single_input.e(new com.avito.android.recall_me.presentation.items.single_input.i(kVar2));
            this.f251803q = new com.avito.android.recall_me.presentation.items.accept_button.b(new com.avito.android.recall_me.presentation.items.accept_button.e(kVar2));
            this.f251804r = new b(eVar);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new h(this.f251801o, this.f251802p, this.f251803q, new com.avito.android.recall_me.presentation.items.user_agreement.b(new com.avito.android.recall_me.presentation.items.user_agreement.h(kVar2, com.avito.android.recall_me.presentation.items.user_agreement.e.a(), this.f251804r))));
            this.f251805s = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.recall_me.di.g(uVarD2));
            this.f251806t = uVarD3;
            this.f251807u = dagger.internal.g.d(new i(uVarD3, this.f251805s));
        }

        @Override // com.avito.android.recall_me.di.b
        public final void a(RecallMeFragment recallMeFragment) {
            D d12 = this.f251800n.get();
            j.f251825a.getClass();
            recallMeFragment.f251901n0 = (com.avito.android.recall_me.presentation.q) new P0(this.f251787a, d12, null, 4, null).a(I.class);
            recallMeFragment.f251902o0 = this.f251807u.get();
            recallMeFragment.f251903p0 = this.f251788b.a5();
            recallMeFragment.f251904q0 = this.f251806t.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

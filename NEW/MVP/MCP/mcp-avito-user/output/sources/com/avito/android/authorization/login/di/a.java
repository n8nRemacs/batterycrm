package com.avito.android.authorization.login.di;

import Sm0.C15204c;
import Tv0.InterfaceC15415a;
import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.login.C28676e;
import com.avito.android.authorization.login.I;
import com.avito.android.authorization.login.InterfaceC28674c;
import com.avito.android.authorization.login.InterfaceC28677f;
import com.avito.android.authorization.login.K;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.authorization.login.M;
import com.avito.android.authorization.login.di.b;
import com.avito.android.credman.s;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.model.text.AttributedTextCreator;
import com.avito.android.remote.model.text.AttributedTextCreatorImpl_Factory;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import l90.n;

/* compiled from: DaggerLoginComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerLoginComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.login.di.b.a
        public final com.avito.android.authorization.login.di.b a(com.avito.android.authorization.login.di.c cVar, LoginActivity loginActivity, r rVar, Resources resources, Kundle kundle, InterfaceC39417a interfaceC39417a, String str, r rVar2) {
            CodeConfirmationSource codeConfirmationSource = CodeConfirmationSource.f92757e;
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, loginActivity, rVar, resources, kundle, codeConfirmationSource, str, Boolean.FALSE, rVar2, null);
        }
    }

    /* compiled from: DaggerLoginComponent.java */
    public static final class c implements com.avito.android.authorization.login.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.login.di.c f94005a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f94006b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27663a> f94007c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28674c> f94008d;

        /* renamed from: e, reason: collision with root package name */
        public final l f94009e;

        /* renamed from: f, reason: collision with root package name */
        public final C15204c f94010f;

        /* renamed from: g, reason: collision with root package name */
        public final u<B3.a> f94011g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C40806a> f94012h;

        /* renamed from: i, reason: collision with root package name */
        public final u<K> f94013i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94014j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94015k;

        /* renamed from: l, reason: collision with root package name */
        public final u<AttributedTextCreator> f94016l;

        /* renamed from: m, reason: collision with root package name */
        public final l f94017m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f94018n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC30274a> f94019o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f94020p;

        /* renamed from: q, reason: collision with root package name */
        public final u<n> f94021q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C> f94022r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC15415a> f94023s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f94024t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C28478k> f94025u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f94026v;

        /* renamed from: w, reason: collision with root package name */
        public final u<s> f94027w;

        /* renamed from: x, reason: collision with root package name */
        public final l f94028x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC28677f> f94029y;

        /* compiled from: DaggerLoginComponent.java */
        /* renamed from: com.avito.android.authorization.login.di.a$c$a, reason: collision with other inner class name */
        public static final class C2784a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94030a;

            public C2784a(com.avito.android.authorization.login.di.c cVar) {
                this.f94030a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f94030a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94031a;

            public b(com.avito.android.authorization.login.di.c cVar) {
                this.f94031a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f94031a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        /* renamed from: com.avito.android.authorization.login.di.a$c$c, reason: collision with other inner class name */
        public static final class C2785c implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94032a;

            public C2785c(com.avito.android.authorization.login.di.c cVar) {
                this.f94032a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94032a.R();
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class d implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94033a;

            public d(com.avito.android.authorization.login.di.c cVar) {
                this.f94033a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f94033a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class e implements u<s> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94034a;

            public e(com.avito.android.authorization.login.di.c cVar) {
                this.f94034a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94034a.p4();
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94035a;

            public f(cv.b bVar) {
                this.f94035a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94035a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class g implements u<B3.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94036a;

            public g(com.avito.android.authorization.login.di.c cVar) {
                this.f94036a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94036a.O2();
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class h implements u<n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94037a;

            public h(com.avito.android.authorization.login.di.c cVar) {
                this.f94037a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                n nVarE1 = this.f94037a.e1();
                t.c(nVarE1);
                return nVarE1;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94038a;

            public i(com.avito.android.authorization.login.di.c cVar) {
                this.f94038a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94038a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLoginComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.login.di.c f94039a;

            public j(com.avito.android.authorization.login.di.c cVar) {
                this.f94039a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f94039a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.authorization.login.di.c cVar, cv.b bVar, Activity activity, r rVar, Resources resources, Kundle kundle, CodeConfirmationSource codeConfirmationSource, String str, Boolean bool, r rVar2, C2783a c2783a) {
            this.f94005a = cVar;
            this.f94006b = bVar;
            this.f94008d = dagger.internal.g.d(new C28676e(new C2784a(cVar)));
            l lVarA = l.a(resources);
            this.f94009e = lVarA;
            this.f94010f = new C15204c(lVarA);
            this.f94011g = new g(cVar);
            this.f94012h = new C2785c(cVar);
            this.f94013i = dagger.internal.g.d(M.a());
            this.f94014j = new i(cVar);
            this.f94015k = new f(bVar);
            this.f94016l = dagger.internal.g.d(AttributedTextCreatorImpl_Factory.create());
            l lVarA2 = l.a(activity);
            this.f94017m = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA2));
            this.f94018n = uVarA;
            this.f94019o = B.a(new o(uVarA, this.f94017m));
            this.f94020p = new b(cVar);
            this.f94023s = dagger.internal.g.d(new com.avito.android.authorization.login.di.f(this.f94009e, new h(cVar), new d(cVar)));
            this.f94024t = new j(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.authorization.login.di.h(l.a(rVar2)));
            this.f94025u = uVarD;
            this.f94026v = dagger.internal.g.d(new C30065i(this.f94024t, uVarD));
            this.f94027w = new e(cVar);
            this.f94028x = l.b(kundle);
            this.f94029y = dagger.internal.g.d(new I(this.f94008d, this.f94010f, this.f94011g, this.f94012h, this.f94013i, this.f94014j, this.f94015k, this.f94016l, this.f94019o, this.f94020p, this.f94023s, this.f94026v, this.f94027w, this.f94028x, l.a(str)));
        }

        @Override // com.avito.android.authorization.login.di.b
        public final void a(LoginActivity loginActivity) {
            loginActivity.f93978m = this.f94029y.get();
            com.avito.android.authorization.login.di.c cVar = this.f94005a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            loginActivity.f93979n = interfaceC28373aA;
            cVar.R();
            cVar.D();
            loginActivity.f93980o = cVar.x();
            loginActivity.f93981p = cVar.t0();
            loginActivity.f93982q = cVar.g0();
            loginActivity.f93983r = cVar.m1();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94006b.u4();
            t.c(aVarU4);
            loginActivity.f93984s = aVarU4;
            loginActivity.f93985t = this.f94026v.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

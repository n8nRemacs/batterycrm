package com.avito.android.code_confirmation.code_confirmation.di;

import Bi0.C13153b;
import Bi0.C13154c;
import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.C29405s;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationActivity;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g;
import com.avito.android.code_confirmation.code_confirmation.U;
import com.avito.android.code_confirmation.code_confirmation.W;
import com.avito.android.code_confirmation.code_confirmation.Y;
import com.avito.android.code_confirmation.code_confirmation.di.a;
import com.avito.android.code_confirmation.code_confirmation.di.f;
import com.avito.android.code_confirmation.code_confirmation.g0;
import com.avito.android.code_confirmation.code_confirmation.k0;
import com.avito.android.code_confirmation.code_confirmation.n0;
import com.avito.android.code_confirmation.code_confirmation.p0;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.S3;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import wi0.InterfaceC49631b;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerCodeConfirmationComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: DaggerCodeConfirmationComponent.java */
    public static final class b implements com.avito.android.code_confirmation.code_confirmation.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f119494A;

        /* renamed from: B, reason: collision with root package name */
        public final u<CodeConfirmationPresenter> f119495B;

        /* renamed from: C, reason: collision with root package name */
        public final u<n0> f119496C;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.code_confirmation.code_confirmation.di.b f119497a;

        /* renamed from: b, reason: collision with root package name */
        public final u<r> f119498b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f119499c;

        /* renamed from: d, reason: collision with root package name */
        public final l f119500d;

        /* renamed from: e, reason: collision with root package name */
        public final u<W> f119501e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f119502f;

        /* renamed from: g, reason: collision with root package name */
        public final l f119503g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC29394g> f119504h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Application> f119505i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Gson> f119506j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC49631b> f119507k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.server_time.a> f119508l;

        /* renamed from: m, reason: collision with root package name */
        public final C13154c f119509m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35741a1> f119510n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35945t1<Long>> f119511o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.code_confirmation.code_confirmation.timer.a> f119512p;

        /* renamed from: q, reason: collision with root package name */
        public final l f119513q;

        /* renamed from: r, reason: collision with root package name */
        public final u<IntentFilter> f119514r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.google.android.gms.auth.api.phone.f> f119515s;

        /* renamed from: t, reason: collision with root package name */
        public final u<g0> f119516t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C40806a> f119517u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C50648b> f119518v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f119519w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC30274a> f119520x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f119521y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC28481c> f119522z;

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119523a;

            public a(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119523a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f119523a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        /* renamed from: com.avito.android.code_confirmation.code_confirmation.di.j$b$b, reason: collision with other inner class name */
        public static final class C3508b implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119524a;

            public C3508b(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119524a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119524a.R();
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class c implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119525a;

            public c(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119525a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f119525a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f119526a;

            public d(cv.b bVar) {
                this.f119526a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f119526a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class e implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119527a;

            public e(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119527a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f119527a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class f implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119528a;

            public f(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119528a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f119528a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class g implements u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119529a;

            public g(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119529a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f119529a.T();
                t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class h implements u<InterfaceC49631b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119530a;

            public h(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119530a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49631b interfaceC49631bJ5 = this.f119530a.j5();
                t.c(interfaceC49631bJ5);
                return interfaceC49631bJ5;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119531a;

            public i(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119531a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f119531a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        /* renamed from: com.avito.android.code_confirmation.code_confirmation.di.j$b$j, reason: collision with other inner class name */
        public static final class C3509j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119532a;

            public C3509j(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119532a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f119532a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCodeConfirmationComponent.java */
        public static final class k implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.code_confirmation.di.b f119533a;

            public k(com.avito.android.code_confirmation.code_confirmation.di.b bVar) {
                this.f119533a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119533a.o();
            }
        }

        public b(com.avito.android.code_confirmation.code_confirmation.di.b bVar, cv.b bVar2, Activity activity, Resources resources, Kundle kundle, CodeConfirmationSource codeConfirmationSource, Boolean bool, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f119497a = bVar;
            this.f119498b = new c(bVar);
            this.f119499c = new i(bVar);
            l lVarA = l.a(resources);
            this.f119500d = lVarA;
            S3 s32 = S3.f318734a;
            this.f119501e = B.a(new Y(lVarA, s32));
            this.f119502f = new k(bVar);
            this.f119503g = l.a(bool);
            this.f119504h = dagger.internal.g.d(new C29405s(this.f119498b, this.f119499c, this.f119501e, this.f119502f, this.f119503g, l.a(codeConfirmationSource)));
            this.f119509m = new C13154c(new C13153b(new a(bVar)), new f(bVar), new h(bVar), this.f119499c, new g(bVar));
            this.f119510n = new e(bVar);
            this.f119511o = dagger.internal.g.d(com.avito.android.code_confirmation.code_confirmation.timer.h.a());
            this.f119512p = dagger.internal.g.d(new com.avito.android.code_confirmation.code_confirmation.timer.e(this.f119499c));
            this.f119513q = l.a(activity);
            this.f119514r = dagger.internal.g.d(f.a.f119492a);
            u<com.google.android.gms.auth.api.phone.f> uVarD = dagger.internal.g.d(new com.avito.android.code_confirmation.code_confirmation.di.g(this.f119513q));
            this.f119515s = uVarD;
            this.f119516t = dagger.internal.g.d(new k0(this.f119513q, uVarD, this.f119514r));
            this.f119517u = new C3508b(bVar);
            this.f119518v = B.a(new C50650d(this.f119510n, this.f119500d));
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(this.f119513q));
            this.f119519w = uVarA;
            this.f119520x = B.a(new o(uVarA, this.f119513q));
            this.f119521y = new d(bVar2);
            this.f119522z = new C3509j(bVar);
            this.f119494A = dagger.internal.g.d(new com.avito.android.code_confirmation.code_confirmation.di.d(l.a(rVar), this.f119522z));
            this.f119495B = dagger.internal.g.d(new U(this.f119504h, this.f119509m, this.f119499c, this.f119510n, this.f119501e, this.f119511o, this.f119512p, this.f119516t, this.f119517u, this.f119518v, this.f119520x, this.f119521y, this.f119494A, l.b(kundle)));
            this.f119496C = dagger.internal.g.d(new p0(s32));
        }

        @Override // com.avito.android.code_confirmation.code_confirmation.di.a
        public final void a(CodeConfirmationActivity codeConfirmationActivity) {
            codeConfirmationActivity.f119397m = this.f119495B.get();
            com.avito.android.code_confirmation.code_confirmation.di.b bVar = this.f119497a;
            codeConfirmationActivity.f119398n = bVar.x();
            codeConfirmationActivity.f119399o = bVar.g0();
            codeConfirmationActivity.f119400p = bVar.E2();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            codeConfirmationActivity.f119401q = interfaceC28373aA;
            codeConfirmationActivity.f119402r = this.f119496C.get();
            codeConfirmationActivity.f119403s = this.f119494A.get();
        }
    }

    /* compiled from: DaggerCodeConfirmationComponent.java */
    public static final class c implements a.InterfaceC3507a {
        public c() {
        }

        @Override // com.avito.android.code_confirmation.code_confirmation.di.a.InterfaceC3507a
        public final com.avito.android.code_confirmation.code_confirmation.di.a a(com.avito.android.code_confirmation.code_confirmation.di.b bVar, InterfaceC39417a interfaceC39417a, CodeConfirmationActivity codeConfirmationActivity, Resources resources, Kundle kundle, CodeConfirmationSource codeConfirmationSource, com.avito.android.analytics.screens.r rVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, codeConfirmationActivity, resources, kundle, codeConfirmationSource, Boolean.TRUE, rVar, null);
        }
    }

    public static a.InterfaceC3507a a() {
        return new c();
    }
}

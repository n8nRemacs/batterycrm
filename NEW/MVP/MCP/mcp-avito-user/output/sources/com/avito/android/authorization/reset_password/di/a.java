package com.avito.android.authorization.reset_password.di;

import Sm0.C15204c;
import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.reset_password.ResetPasswordActivity;
import com.avito.android.authorization.reset_password.di.b;
import com.avito.android.authorization.reset_password.j;
import com.avito.android.authorization.reset_password.k;
import com.avito.android.authorization.reset_password.v;
import com.avito.android.authorization.reset_password.z;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.S3;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerResetPasswordComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerResetPasswordComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.reset_password.di.b.a
        public final com.avito.android.authorization.reset_password.di.b a(com.avito.android.authorization.reset_password.di.c cVar, ResetPasswordActivity resetPasswordActivity, r rVar, Resources resources, Kundle kundle, InterfaceC39417a interfaceC39417a) {
            CodeConfirmationSource codeConfirmationSource = CodeConfirmationSource.f92755c;
            interfaceC39417a.getClass();
            return new c(new e(), cVar, interfaceC39417a, resetPasswordActivity, rVar, resources, kundle, codeConfirmationSource, Boolean.FALSE, null);
        }
    }

    /* compiled from: DaggerResetPasswordComponent.java */
    public static final class c implements com.avito.android.authorization.reset_password.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.reset_password.di.c f94144a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC34258d> f94145b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.remote.r> f94146c;

        /* renamed from: d, reason: collision with root package name */
        public final l f94147d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f94148e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94149f;

        /* renamed from: g, reason: collision with root package name */
        public final j f94150g;

        /* renamed from: h, reason: collision with root package name */
        public final l f94151h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f94152i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC30274a> f94153j;

        /* renamed from: k, reason: collision with root package name */
        public final C15204c f94154k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f94155l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f94156m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f94157n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94158o;

        /* renamed from: p, reason: collision with root package name */
        public final u<k> f94159p;

        /* compiled from: DaggerResetPasswordComponent.java */
        /* renamed from: com.avito.android.authorization.reset_password.di.a$c$a, reason: collision with other inner class name */
        public static final class C2790a implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.reset_password.di.c f94160a;

            public C2790a(com.avito.android.authorization.reset_password.di.c cVar) {
                this.f94160a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f94160a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerResetPasswordComponent.java */
        public static final class b implements u<com.avito.android.remote.r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.reset_password.di.c f94161a;

            public b(com.avito.android.authorization.reset_password.di.c cVar) {
                this.f94161a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.remote.r rVarK0 = this.f94161a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerResetPasswordComponent.java */
        /* renamed from: com.avito.android.authorization.reset_password.di.a$c$c, reason: collision with other inner class name */
        public static final class C2791c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94162a;

            public C2791c(cv.b bVar) {
                this.f94162a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94162a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerResetPasswordComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.reset_password.di.c f94163a;

            public d(com.avito.android.authorization.reset_password.di.c cVar) {
                this.f94163a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94163a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerResetPasswordComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.reset_password.di.c f94164a;

            public e(com.avito.android.authorization.reset_password.di.c cVar) {
                this.f94164a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f94164a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerResetPasswordComponent.java */
        public static final class f implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.reset_password.di.c f94165a;

            public f(com.avito.android.authorization.reset_password.di.c cVar) {
                this.f94165a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94165a.o();
            }
        }

        public c(com.avito.android.authorization.reset_password.di.e eVar, com.avito.android.authorization.reset_password.di.c cVar, cv.b bVar, Activity activity, r rVar, Resources resources, Kundle kundle, CodeConfirmationSource codeConfirmationSource, Boolean bool, C2789a c2789a) {
            this.f94144a = cVar;
            this.f94145b = new C2790a(cVar);
            this.f94146c = new b(cVar);
            l lVarA = l.a(resources);
            this.f94147d = lVarA;
            z zVar = new z(lVarA, S3.f318734a);
            f fVar = new f(cVar);
            d dVar = new d(cVar);
            this.f94149f = dVar;
            this.f94150g = new j(this.f94145b, this.f94146c, zVar, fVar, dVar);
            l lVarA2 = l.a(activity);
            this.f94151h = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA2));
            this.f94152i = uVarA;
            this.f94153j = B.a(new o(uVarA, this.f94151h));
            this.f94154k = new C15204c(this.f94147d);
            this.f94155l = new e(cVar);
            u<C28478k> uVarD = g.d(new com.avito.android.authorization.reset_password.di.f(eVar, l.a(rVar)));
            this.f94156m = uVarD;
            this.f94157n = g.d(new C30065i(this.f94155l, uVarD));
            this.f94158o = new C2791c(bVar);
            this.f94159p = g.d(new v(this.f94150g, this.f94149f, this.f94153j, this.f94154k, this.f94157n, this.f94147d, this.f94158o, l.b(kundle)));
        }

        @Override // com.avito.android.authorization.reset_password.di.b
        public final void a(ResetPasswordActivity resetPasswordActivity) {
            resetPasswordActivity.f94104m = this.f94159p.get();
            com.avito.android.authorization.reset_password.di.c cVar = this.f94144a;
            resetPasswordActivity.f94105n = cVar.m1();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            resetPasswordActivity.f94106o = interfaceC28373aA;
            resetPasswordActivity.f94107p = this.f94157n.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

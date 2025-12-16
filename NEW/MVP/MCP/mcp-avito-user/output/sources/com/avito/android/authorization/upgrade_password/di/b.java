package com.avito.android.authorization.upgrade_password.di;

import Sm0.C15204c;
import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.upgrade_password.InterfaceC28695e;
import com.avito.android.authorization.upgrade_password.UpgradePasswordFragment;
import com.avito.android.authorization.upgrade_password.di.e;
import com.avito.android.authorization.upgrade_password.y;
import com.avito.android.credman.s;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerUpgradePasswordComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerUpgradePasswordComponent.java */
    /* renamed from: com.avito.android.authorization.upgrade_password.di.b$b, reason: collision with other inner class name */
    public static final class C2815b implements e.a {
        public C2815b() {
        }

        @Override // com.avito.android.authorization.upgrade_password.di.e.a
        public final e a(f fVar, ActivityC22955m activityC22955m, r rVar, Kundle kundle, String str, String str2, String str3, Resources resources, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(fVar, interfaceC39417a, activityC22955m, rVar, kundle, str, str2, str3, resources, null);
        }
    }

    /* compiled from: DaggerUpgradePasswordComponent.java */
    public static final class c implements com.avito.android.authorization.upgrade_password.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.upgrade_password.di.f f94772a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC34258d> f94773b;

        /* renamed from: c, reason: collision with root package name */
        public final u<G> f94774c;

        /* renamed from: d, reason: collision with root package name */
        public final u<P> f94775d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94776e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28695e> f94777f;

        /* renamed from: g, reason: collision with root package name */
        public final u<s> f94778g;

        /* renamed from: h, reason: collision with root package name */
        public final l f94779h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f94780i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC30274a> f94781j;

        /* renamed from: k, reason: collision with root package name */
        public final C15204c f94782k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35741a1> f94783l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C50648b> f94784m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f94785n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f94786o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f94787p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C40806a> f94788q;

        /* renamed from: r, reason: collision with root package name */
        public final l f94789r;

        /* renamed from: s, reason: collision with root package name */
        public final l f94790s;

        /* renamed from: t, reason: collision with root package name */
        public final l f94791t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94792u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.authorization.upgrade_password.h> f94793v;

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94794a;

            public a(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94794a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f94794a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        /* renamed from: com.avito.android.authorization.upgrade_password.di.b$c$b, reason: collision with other inner class name */
        public static final class C2816b implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94795a;

            public C2816b(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94795a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f94795a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        /* renamed from: com.avito.android.authorization.upgrade_password.di.b$c$c, reason: collision with other inner class name */
        public static final class C2817c implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94796a;

            public C2817c(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94796a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94796a.R();
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class d implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94797a;

            public d(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94797a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94797a.E();
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class e implements u<s> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94798a;

            public e(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94798a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f94798a.p4();
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94799a;

            public f(cv.b bVar) {
                this.f94799a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94799a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class g implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94800a;

            public g(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94800a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f94800a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94801a;

            public h(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94801a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94801a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerUpgradePasswordComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.upgrade_password.di.f f94802a;

            public i(com.avito.android.authorization.upgrade_password.di.f fVar) {
                this.f94802a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f94802a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.authorization.upgrade_password.di.f fVar, cv.b bVar, Activity activity, r rVar, Kundle kundle, String str, String str2, String str3, Resources resources, a aVar) {
            this.f94772a = fVar;
            C2816b c2816b = new C2816b(fVar);
            a aVar2 = new a(fVar);
            d dVar = new d(fVar);
            h hVar = new h(fVar);
            this.f94776e = hVar;
            this.f94777f = dagger.internal.g.d(new com.avito.android.authorization.upgrade_password.g(c2816b, aVar2, dVar, hVar));
            this.f94778g = new e(fVar);
            l lVarA = l.a(activity);
            this.f94779h = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f94780i = uVarA;
            this.f94781j = B.a(new o(uVarA, this.f94779h));
            l lVarA2 = l.a(resources);
            this.f94782k = new C15204c(lVarA2);
            this.f94784m = B.a(new C50650d(new g(fVar), lVarA2));
            this.f94785n = new i(fVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.authorization.upgrade_password.di.h(l.a(rVar)));
            this.f94786o = uVarD;
            this.f94787p = dagger.internal.g.d(new C30065i(this.f94785n, uVarD));
            this.f94788q = new C2817c(fVar);
            this.f94789r = l.b(str);
            this.f94790s = l.b(str2);
            this.f94791t = l.b(str3);
            this.f94793v = dagger.internal.g.d(new y(this.f94777f, this.f94778g, this.f94781j, this.f94782k, this.f94784m, this.f94787p, this.f94776e, this.f94788q, this.f94789r, this.f94790s, this.f94791t, l.b(kundle), new f(bVar)));
        }

        @Override // com.avito.android.authorization.upgrade_password.di.e
        public final void a(UpgradePasswordFragment upgradePasswordFragment) {
            upgradePasswordFragment.f94768n0 = this.f94793v.get();
            InterfaceC28373a interfaceC28373aA = this.f94772a.a();
            t.c(interfaceC28373aA);
            upgradePasswordFragment.f94769o0 = interfaceC28373aA;
            upgradePasswordFragment.f94770p0 = this.f94787p.get();
        }
    }

    public static e.a a() {
        return new C2815b();
    }
}

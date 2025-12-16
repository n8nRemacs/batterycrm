package com.avito.android.authorization.change_password.di;

import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.change_password.ChangeResettedPasswordActivity;
import com.avito.android.authorization.change_password.di.c;
import com.avito.android.authorization.change_password.n;
import com.avito.android.di.module.C30065i;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerChangeResettedPasswordComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: DaggerChangeResettedPasswordComponent.java */
    public static final class b implements com.avito.android.authorization.change_password.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final d f93334a;

        /* renamed from: b, reason: collision with root package name */
        public final l f93335b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34258d> f93336c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f93337d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.authorization.change_password.c> f93338e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f93339f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f93340g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93341h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.authorization.change_password.f> f93342i;

        /* compiled from: DaggerChangeResettedPasswordComponent.java */
        public static final class a implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final d f93343a;

            public a(d dVar) {
                this.f93343a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f93343a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerChangeResettedPasswordComponent.java */
        /* renamed from: com.avito.android.authorization.change_password.di.e$b$b, reason: collision with other inner class name */
        public static final class C2764b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final d f93344a;

            public C2764b(d dVar) {
                this.f93344a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f93344a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerChangeResettedPasswordComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final d f93345a;

            public c(d dVar) {
                this.f93345a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93345a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.authorization.change_password.di.a aVar, d dVar, Activity activity, Resources resources, Kundle kundle, String str, String str2, r rVar, a aVar2) {
            this.f93334a = dVar;
            this.f93335b = l.a(str);
            l lVarA = l.a(str2);
            a aVar3 = new a(dVar);
            C2764b c2764b = new C2764b(dVar);
            this.f93337d = c2764b;
            this.f93338e = dagger.internal.g.d(new com.avito.android.authorization.change_password.e(this.f93335b, lVarA, aVar3, c2764b));
            this.f93339f = new c(dVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.authorization.change_password.di.b(aVar, l.a(rVar)));
            this.f93340g = uVarD;
            this.f93341h = dagger.internal.g.d(new C30065i(this.f93339f, uVarD));
            this.f93342i = dagger.internal.g.d(new n(l.b(kundle), this.f93338e, this.f93337d, this.f93341h));
        }

        @Override // com.avito.android.authorization.change_password.di.c
        public final void a(ChangeResettedPasswordActivity changeResettedPasswordActivity) {
            changeResettedPasswordActivity.f93321m = this.f93342i.get();
            d dVar = this.f93334a;
            changeResettedPasswordActivity.f93322n = dVar.t0();
            changeResettedPasswordActivity.f93323o = dVar.m1();
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            changeResettedPasswordActivity.f93324p = interfaceC28373aA;
            changeResettedPasswordActivity.f93325q = this.f93341h.get();
        }
    }

    /* compiled from: DaggerChangeResettedPasswordComponent.java */
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.authorization.change_password.di.c.a
        public final com.avito.android.authorization.change_password.di.c a(d dVar, ChangeResettedPasswordActivity changeResettedPasswordActivity, Resources resources, Kundle kundle, String str, String str2, r rVar) {
            return new b(new com.avito.android.authorization.change_password.di.a(), dVar, changeResettedPasswordActivity, resources, kundle, str, str2, rVar, null);
        }
    }

    public static c.a a() {
        return new c();
    }
}

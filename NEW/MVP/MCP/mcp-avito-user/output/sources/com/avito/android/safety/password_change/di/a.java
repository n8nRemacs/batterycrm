package com.avito.android.safety.password_change.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.E;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.credman.o;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.PasswordChangeParams;
import com.avito.android.safety.password_change.di.b;
import com.avito.android.safety.password_change.mvi.s;
import com.avito.android.safety.password_change.mvi.v;
import com.avito.android.safety.password_change.mvi.x;
import com.avito.android.safety.password_change.q;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPasswordChangeComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerPasswordChangeComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safety.password_change.di.b.a
        public final com.avito.android.safety.password_change.di.b a(com.avito.android.safety.password_change.di.c cVar, InterfaceC39417a interfaceC39417a, ActivityC22955m activityC22955m, r rVar, Resources resources, PasswordChangeParams passwordChangeParams, boolean z12) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, activityC22955m, rVar, resources, passwordChangeParams, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerPasswordChangeComponent.java */
    public static final class c implements com.avito.android.safety.password_change.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safety.password_change.di.c f257246a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f257247b;

        /* renamed from: c, reason: collision with root package name */
        public final l f257248c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f257249d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC30274a> f257250e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f257251f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f257252g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f257253h;

        /* renamed from: i, reason: collision with root package name */
        public final l f257254i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f257255j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC34401z0> f257256k;

        /* renamed from: l, reason: collision with root package name */
        public final u<G> f257257l;

        /* renamed from: m, reason: collision with root package name */
        public final u<B3.c> f257258m;

        /* renamed from: n, reason: collision with root package name */
        public final u<B3.a> f257259n;

        /* renamed from: o, reason: collision with root package name */
        public final s f257260o;

        /* renamed from: p, reason: collision with root package name */
        public final u<E> f257261p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.credman.f> f257262q;

        /* renamed from: r, reason: collision with root package name */
        public final u<o> f257263r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f257264s;

        /* renamed from: t, reason: collision with root package name */
        public final l f257265t;

        /* compiled from: DaggerPasswordChangeComponent.java */
        /* renamed from: com.avito.android.safety.password_change.di.a$c$a, reason: collision with other inner class name */
        public static final class C7721a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257266a;

            public C7721a(com.avito.android.safety.password_change.di.c cVar) {
                this.f257266a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f257266a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class b implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257267a;

            public b(com.avito.android.safety.password_change.di.c cVar) {
                this.f257267a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f257267a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        /* renamed from: com.avito.android.safety.password_change.di.a$c$c, reason: collision with other inner class name */
        public static final class C7722c implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257268a;

            public C7722c(com.avito.android.safety.password_change.di.c cVar) {
                this.f257268a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f257268a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class d implements u<com.avito.android.credman.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257269a;

            public d(com.avito.android.safety.password_change.di.c cVar) {
                this.f257269a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257269a.R8();
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class e implements u<o> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257270a;

            public e(com.avito.android.safety.password_change.di.c cVar) {
                this.f257270a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257270a.P2();
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f257271a;

            public f(cv.b bVar) {
                this.f257271a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f257271a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class g implements u<B3.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257272a;

            public g(com.avito.android.safety.password_change.di.c cVar) {
                this.f257272a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257272a.O2();
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class h implements u<B3.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257273a;

            public h(com.avito.android.safety.password_change.di.c cVar) {
                this.f257273a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257273a.I2();
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class i implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257274a;

            public i(com.avito.android.safety.password_change.di.c cVar) {
                this.f257274a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f257274a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerPasswordChangeComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_change.di.c f257275a;

            public j(com.avito.android.safety.password_change.di.c cVar) {
                this.f257275a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f257275a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.safety.password_change.di.d dVar, com.avito.android.safety.password_change.di.c cVar, cv.b bVar, Activity activity, r rVar, Resources resources, PasswordChangeParams passwordChangeParams, Boolean bool, C7720a c7720a) {
            this.f257246a = cVar;
            this.f257247b = bVar;
            l lVarA = l.a(activity);
            this.f257248c = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f257249d = uVarA;
            this.f257250e = B.a(new com.avito.android.dialog.o(uVarA, this.f257248c));
            this.f257251f = new j(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.safety.password_change.di.e(dVar, l.a(rVar)));
            this.f257252g = uVarD;
            this.f257253h = com.avito.android.advert.item.delivery_suggests.l.i(this.f257251f, uVarD);
            this.f257254i = l.a(passwordChangeParams);
            this.f257255j = new C7722c(cVar);
            i iVar = new i(cVar);
            b bVar2 = new b(cVar);
            this.f257260o = new s(new com.avito.android.safety.common.d(bVar2, new h(cVar), new g(cVar)), iVar, bVar2);
            this.f257261p = new C7721a(cVar);
            l lVarA2 = l.a(bool);
            d dVar2 = new d(cVar);
            l lVar = this.f257254i;
            u<InterfaceC28373a> uVar = this.f257255j;
            s sVar = this.f257260o;
            this.f257265t = l.a(new com.avito.android.safety.password_change.s(new com.avito.android.safety.password_change.r(new com.avito.android.safety.password_change.mvi.o(new com.avito.android.safety.password_change.mvi.l(lVar, uVar, sVar, this.f257261p, lVarA2, dVar2), new com.avito.android.safety.password_change.mvi.e(lVar, uVar, sVar, new e(cVar)), new v(lVar, new f(bVar)), x.a(), this.f257253h))));
        }

        @Override // com.avito.android.safety.password_change.di.b
        public final void a(PasswordChangeFragment passwordChangeFragment) {
            com.avito.android.safety.password_change.di.c cVar = this.f257246a;
            passwordChangeFragment.f257212n0 = cVar.x();
            passwordChangeFragment.f257213o0 = cVar.O();
            passwordChangeFragment.f257214p0 = this.f257250e.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            passwordChangeFragment.f257215q0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f257247b.u4();
            t.c(aVarU4);
            passwordChangeFragment.f257216r0 = aVarU4;
            passwordChangeFragment.f257217s0 = this.f257253h.get();
            passwordChangeFragment.f257218t0 = (q.a) this.f257265t.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}

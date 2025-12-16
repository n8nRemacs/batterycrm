package com.avito.android.user_adverts_filters.main.di;

import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment;
import com.avito.android.user_adverts_filters.main.di.b;
import com.avito.android.user_adverts_filters.main.mvi_delegate.B;
import com.avito.android.user_adverts_filters.main.mvi_delegate.D;
import com.avito.android.user_adverts_filters.main.mvi_delegate.w;
import com.avito.android.user_adverts_filters.main.mvi_delegate.y;
import com.avito.android.user_adverts_filters.main.mvi_main.s;
import com.avito.android.user_adverts_filters.main.mvi_main.x;
import com.avito.android.user_adverts_filters.main.mvi_main.z;
import com.avito.android.user_adverts_filters.main.view.a;
import com.avito.android.user_adverts_filters.main.view.d;
import com.avito.android.user_adverts_filters.main.vm.h;
import com.avito.android.user_adverts_filters.main.vm.v;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import sI0.InterfaceC48055a;

/* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.user_adverts_filters.main.di.b.a
        public final com.avito.android.user_adverts_filters.main.di.b a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment, UserAdvertsFiltersData userAdvertsFiltersData, r rVar, com.avito.android.user_adverts_filters.main.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, userAdvertsFiltersMainMviFragment, userAdvertsFiltersData, rVar, null);
        }
    }

    /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
    public static final class c implements com.avito.android.user_adverts_filters.main.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_adverts_filters.main.di.c f316005a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f316006b;

        /* renamed from: c, reason: collision with root package name */
        public final u<gj.d> f316007c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f316008d;

        /* renamed from: e, reason: collision with root package name */
        public final u<a.b> f316009e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.user_adverts_filters.main.action.a> f316010f = dagger.internal.g.d(com.avito.android.user_adverts_filters.main.action.b.a());

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.user_adverts_filters.main.action.c> f316011g = dagger.internal.g.d(com.avito.android.user_adverts_filters.main.action.d.a());

        /* renamed from: h, reason: collision with root package name */
        public final u<C28478k> f316012h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f316013i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f316014j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC40691b> f316015k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC48055a> f316016l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.user_adverts_filters.main.vm.g f316017m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28373a> f316018n;

        /* renamed from: o, reason: collision with root package name */
        public final l f316019o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC25659b> f316020p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC39737b> f316021q;

        /* renamed from: r, reason: collision with root package name */
        public final l f316022r;

        /* renamed from: s, reason: collision with root package name */
        public final l f316023s;

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        /* renamed from: com.avito.android.user_adverts_filters.main.di.a$c$a, reason: collision with other inner class name */
        public static final class C9800a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316024a;

            public C9800a(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316024a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f316024a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class b implements u<InterfaceC25659b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316025a;

            public b(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316025a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f316025a.sd();
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        /* renamed from: com.avito.android.user_adverts_filters.main.di.a$c$c, reason: collision with other inner class name */
        public static final class C9801c implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316026a;

            public C9801c(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316026a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f316026a.El();
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class d implements u<InterfaceC39737b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316027a;

            public d(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316027a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f316027a.Yb();
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f316028a;

            public e(cv.b bVar) {
                this.f316028a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f316028a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f316029a;

            public f(cv.b bVar) {
                this.f316029a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f316029a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316030a;

            public g(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316030a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f316030a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316031a;

            public h(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316031a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f316031a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUserAdvertsFiltersMainComponent.java */
        public static final class i implements u<InterfaceC48055a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts_filters.main.di.c f316032a;

            public i(com.avito.android.user_adverts_filters.main.di.c cVar) {
                this.f316032a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48055a interfaceC48055aA1 = this.f316032a.A1();
                t.c(interfaceC48055aA1);
                return interfaceC48055aA1;
            }
        }

        public c(com.avito.android.user_adverts_filters.main.di.c cVar, cv.b bVar, T0 t02, UserAdvertsFiltersData userAdvertsFiltersData, r rVar, C9799a c9799a) {
            this.f316005a = cVar;
            this.f316006b = new g(cVar);
            this.f316007c = new C9801c(cVar);
            this.f316008d = new e(bVar);
            this.f316009e = new f(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.user_adverts_filters.main.di.g(l.a(rVar)));
            this.f316012h = uVarD;
            u<ScreenPerformanceTracker> uVarD2 = dagger.internal.g.d(new com.avito.android.user_adverts_filters.main.di.h(uVarD, new h(cVar)));
            this.f316014j = uVarD2;
            this.f316015k = dagger.internal.g.d(new com.avito.android.user_adverts_filters.main.di.e(uVarD2, this.f316007c, this.f316008d, this.f316009e, this.f316010f, this.f316011g, this.f316012h));
            l lVarA = l.a(userAdvertsFiltersData);
            s sVar = new s(new com.avito.android.user_adverts_filters.main.domain.c(new i(cVar), this.f316006b), this.f316011g, this.f316010f, this.f316015k);
            z zVarA = z.a();
            com.avito.android.user_adverts_filters.main.mvi_main.u uVarA = com.avito.android.user_adverts_filters.main.mvi_main.u.a();
            u<R0> uVar = this.f316006b;
            this.f316017m = new com.avito.android.user_adverts_filters.main.vm.g(uVar, new x(lVarA, sVar, zVarA, uVarA, uVar, this.f316014j));
            w wVar = new w(this.f316015k, new C9800a(cVar), uVar);
            D dA2 = D.a();
            y yVarA = y.a();
            u<R0> uVar2 = this.f316006b;
            this.f316019o = l.a(new com.avito.android.user_adverts_filters.main.vm.w(new v(uVar2, this.f316015k, this.f316017m, new com.avito.android.user_adverts_filters.main.vm.d(uVar2, new B(wVar, dA2, yVarA, uVar2)))));
            this.f316022r = l.a(new com.avito.android.user_adverts_filters.main.view.j(new com.avito.android.user_adverts_filters.main.view.i(new b(cVar), new d(cVar))));
            this.f316023s = l.a(new com.avito.android.user_adverts_filters.main.view.c(com.avito.android.user_adverts_filters.main.view.b.a()));
        }

        @Override // com.avito.android.user_adverts_filters.main.di.b
        public final void a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment) {
            userAdvertsFiltersMainMviFragment.f315965n0 = (h.e) this.f316019o.f393949a;
            userAdvertsFiltersMainMviFragment.f315966o0 = (d.b) this.f316022r.f393949a;
            userAdvertsFiltersMainMviFragment.f315967p0 = (a.InterfaceC9823a) this.f316023s.f393949a;
            com.avito.android.user_adverts_filters.main.di.c cVar = this.f316005a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            userAdvertsFiltersMainMviFragment.f315968q0 = interfaceC28373aA;
            userAdvertsFiltersMainMviFragment.f315969r0 = cVar.Ad();
            userAdvertsFiltersMainMviFragment.f315970s0 = cVar.sd();
            userAdvertsFiltersMainMviFragment.f315971t0 = this.f316014j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

package com.avito.android.tariff_lf_constructor.configure.vertical.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.vertical.ConstructorConfigureVerticalFragment;
import com.avito.android.tariff_lf_constructor.configure.vertical.di.a;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import java.util.Set;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorConfigureVerticalComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerConstructorConfigureVerticalComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.vertical.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC40574b f300587a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.c f300588b = new com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.c(com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.e.a());

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.vertical.items.content.d> f300589c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.vertical.items.content.c f300590d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.d> f300591e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.c f300592f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f300593g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f300594h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f300595i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f300596j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f300597k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300598l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f300599m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC46937a> f300600n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.a> f300601o;

        /* renamed from: p, reason: collision with root package name */
        public final u<R0> f300602p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.e> f300603q;

        /* compiled from: DaggerConstructorConfigureVerticalComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300604a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f300604a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f300604a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerConstructorConfigureVerticalComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.vertical.di.h$b$b, reason: collision with other inner class name */
        public static final class C9193b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300605a;

            public C9193b(InterfaceC40574b interfaceC40574b) {
                this.f300605a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300605a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorConfigureVerticalComponent.java */
        public static final class c implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f300606a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f300606a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f300606a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, Fragment fragment, r rVar, a aVar) {
            this.f300587a = interfaceC40574b;
            u<com.avito.android.tariff_lf_constructor.configure.vertical.items.content.d> uVarD = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.vertical.items.content.g.a());
            this.f300589c = uVarD;
            this.f300590d = new com.avito.android.tariff_lf_constructor.configure.vertical.items.content.c(uVarD);
            u<com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.g.a());
            this.f300591e = uVarD2;
            this.f300592f = new com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.c(uVarD2);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new d(this.f300588b, this.f300590d, this.f300592f, new com.avito.android.tariff_lf_constructor.configure.vertical.items.text.c(com.avito.android.tariff_lf_constructor.configure.vertical.items.text.e.a())));
            this.f300593g = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.vertical.di.c(uVarD3));
            this.f300594h = uVarD4;
            this.f300595i = dagger.internal.g.d(new f(uVarD4, this.f300593g));
            this.f300596j = new C9193b(interfaceC40574b);
            u<C28478k> uVarD5 = dagger.internal.g.d(new g(l.a(rVar)));
            this.f300597k = uVarD5;
            this.f300598l = com.avito.android.advert.item.delivery_suggests.l.i(this.f300596j, uVarD5);
            this.f300599m = dagger.internal.g.d(new e(this.f300589c, this.f300591e, com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item.e.a(), com.avito.android.tariff_lf_constructor.configure.vertical.items.text.e.a()));
            this.f300600n = new c(interfaceC40574b);
            u<com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.a> uVarD6 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.c.a());
            this.f300601o = uVarD6;
            this.f300603q = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.g(uVarD6, this.f300600n, new a(interfaceC40574b)));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.vertical.di.a
        public final void a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment) {
            constructorConfigureVerticalFragment.f300554n0 = this.f300595i.get();
            constructorConfigureVerticalFragment.f300555o0 = this.f300598l.get();
            constructorConfigureVerticalFragment.f300556p0 = new GD0.a(this.f300593g.get());
            constructorConfigureVerticalFragment.f300557q0 = this.f300599m.get();
            InterfaceC40574b interfaceC40574b = this.f300587a;
            com.avito.android.account.plugin.rx.a aVarV2 = interfaceC40574b.v2();
            t.c(aVarV2);
            constructorConfigureVerticalFragment.f300558r0 = aVarV2;
            com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.e eVar = this.f300603q.get();
            ScreenPerformanceTracker screenPerformanceTracker = this.f300598l.get();
            R0 r0C = interfaceC40574b.c();
            t.c(r0C);
            constructorConfigureVerticalFragment.f300559s0 = new com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.h(eVar, screenPerformanceTracker, r0C);
        }
    }

    /* compiled from: DaggerConstructorConfigureVerticalComponent.java */
    public static final class c implements a.InterfaceC9192a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.vertical.di.a.InterfaceC9192a
        public final com.avito.android.tariff_lf_constructor.configure.vertical.di.a a(ConstructorConfigureVerticalFragment constructorConfigureVerticalFragment, InterfaceC40574b interfaceC40574b, r rVar) {
            return new b(interfaceC40574b, constructorConfigureVerticalFragment, rVar, null);
        }
    }

    public static a.InterfaceC9192a a() {
        return new c();
    }
}

package com.avito.android.tariff.cpa.configure_advance.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.TariffConfigureAdvanceScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpa.configure_advance.ConfigureAdvanceFragment;
import com.avito.android.tariff.cpa.configure_advance.di.a;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.InterfaceC35205a;
import com.avito.android.tariff.cpa.configure_advance.viewmodel.p;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import v50.g;

/* compiled from: DaggerConfigureAdvanceComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class o {

    /* compiled from: DaggerConfigureAdvanceComponent.java */
    public static final class b implements com.avito.android.tariff.cpa.configure_advance.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<p> f294280A;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f294281a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_advance.items.extra_info.d> f294282b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f294283c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294284d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_advance.items.advance_info.d> f294285e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294286f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_advance.items.header.d> f294287g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294288h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f294289i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f294290j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f294291k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f294292l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f294293m;

        /* renamed from: n, reason: collision with root package name */
        public final u<WB0.a> f294294n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35745a5> f294295o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_advance.viewmodel.j> f294296p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC35205a> f294297q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f294298r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f294299s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f294300t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f294301u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_advance.viewmodel.g> f294302v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f294303w;

        /* renamed from: x, reason: collision with root package name */
        public final u<g.b> f294304x;

        /* renamed from: y, reason: collision with root package name */
        public final u<v50.g> f294305y;

        /* renamed from: z, reason: collision with root package name */
        public final u<P0.c> f294306z;

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294307a;

            public a(WA0.b bVar) {
                this.f294307a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f294307a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        /* renamed from: com.avito.android.tariff.cpa.configure_advance.di.o$b$b, reason: collision with other inner class name */
        public static final class C8948b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f294308a;

            public C8948b(cv.b bVar) {
                this.f294308a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294308a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        public static final class c implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294309a;

            public c(WA0.b bVar) {
                this.f294309a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f294309a.S1();
            }
        }

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294310a;

            public d(WA0.b bVar) {
                this.f294310a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f294310a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294311a;

            public e(WA0.b bVar) {
                this.f294311a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f294311a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConfigureAdvanceComponent.java */
        public static final class f implements u<WB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294312a;

            public f(WA0.b bVar) {
                this.f294312a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WB0.a aVarT6 = this.f294312a.T6();
                t.c(aVarT6);
                return aVarT6;
            }
        }

        public b(WA0.b bVar, cv.b bVar2, Fragment fragment, Resources resources, String str, Screen screen, r rVar, String str2, a aVar) {
            this.f294281a = bVar2;
            u<com.avito.android.tariff.cpa.configure_advance.items.extra_info.d> uVarD = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_advance.items.extra_info.f.a());
            this.f294282b = uVarD;
            this.f294284d = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.items.extra_info.c(uVarD, new a(bVar)));
            u<com.avito.android.tariff.cpa.configure_advance.items.advance_info.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_advance.items.advance_info.g.a());
            this.f294285e = uVarD2;
            this.f294286f = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.items.advance_info.c(uVarD2));
            u<com.avito.android.tariff.cpa.configure_advance.items.header.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_advance.items.header.f.a());
            this.f294287g = uVarD3;
            this.f294288h = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.items.header.c(uVarD3));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar = this.f294284d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f294286f);
            list.add(this.f294288h);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.di.f(bVarA.b()));
            this.f294289i = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.di.e(uVarD4));
            this.f294290j = uVarD5;
            this.f294291k = dagger.internal.g.d(new h(uVarD5, this.f294289i));
            this.f294292l = dagger.internal.l.a(fragment);
            this.f294293m = dagger.internal.l.a(str);
            f fVar = new f(bVar);
            d dVar = new d(bVar);
            this.f294295o = dVar;
            this.f294296p = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.viewmodel.o(fVar, dVar));
            this.f294297q = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_advance.viewmodel.c.a());
            this.f294298r = new e(bVar);
            this.f294299s = dagger.internal.l.a(screen);
            this.f294300t = dagger.internal.l.a(rVar);
            this.f294301u = dagger.internal.g.d(new QB0.c(dagger.internal.l.a(str2), this.f294298r, this.f294299s, this.f294300t));
            this.f294302v = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_advance.viewmodel.i.a());
            C8948b c8948b = new C8948b(bVar2);
            this.f294303w = c8948b;
            u<v50.g> uVarD6 = dagger.internal.g.d(new g(new c(bVar), c8948b));
            this.f294305y = uVarD6;
            u<P0.c> uVarD7 = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_advance.viewmodel.f(this.f294293m, uVarD6, this.f294296p, this.f294297q, this.f294295o, this.f294301u, this.f294302v, this.f294303w));
            this.f294306z = uVarD7;
            this.f294280A = dagger.internal.g.d(new i(this.f294292l, uVarD7));
        }

        @Override // com.avito.android.tariff.cpa.configure_advance.di.a
        public final void a(ConfigureAdvanceFragment configureAdvanceFragment) {
            configureAdvanceFragment.f294243n0 = this.f294291k.get();
            configureAdvanceFragment.f294244o0 = this.f294280A.get();
            z zVar = new z(3);
            zVar.a(this.f294282b.get());
            zVar.a(this.f294285e.get());
            zVar.a(this.f294287g.get());
            configureAdvanceFragment.f294245p0 = zVar.c();
            configureAdvanceFragment.f294246q0 = this.f294301u.get();
            configureAdvanceFragment.f294247r0 = new com.avito.android.tariff.cpa.configure_advance.ui.d();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294281a.u4();
            t.c(aVarU4);
            configureAdvanceFragment.f294248s0 = aVarU4;
        }
    }

    /* compiled from: DaggerConfigureAdvanceComponent.java */
    public static final class c implements a.InterfaceC8947a {
        public c() {
        }

        @Override // com.avito.android.tariff.cpa.configure_advance.di.a.InterfaceC8947a
        public final com.avito.android.tariff.cpa.configure_advance.di.a a(ConfigureAdvanceFragment configureAdvanceFragment, Resources resources, WA0.b bVar, InterfaceC39417a interfaceC39417a, String str, TariffConfigureAdvanceScreen tariffConfigureAdvanceScreen, r rVar) {
            interfaceC39417a.getClass();
            tariffConfigureAdvanceScreen.getClass();
            return new b(bVar, interfaceC39417a, configureAdvanceFragment, resources, str, tariffConfigureAdvanceScreen, rVar, "tariffConfigureAdvance", null);
        }
    }

    public static a.InterfaceC8947a a() {
        return new c();
    }
}

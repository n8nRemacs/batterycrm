package com.avito.android.tariff.cpa.configure_info.di;

import aB0.C19752a;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.TariffCpaConfigureInfoScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpa.configure_info.CpaConfigureInfoFragment;
import com.avito.android.tariff.cpa.configure_info.di.a;
import com.avito.android.tariff.cpa.configure_info.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;

/* compiled from: DaggerCpaConfigureInfoComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: DaggerCpaConfigureInfoComponent.java */
    public static final class b implements com.avito.android.tariff.cpa.configure_info.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f294470a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_info.items.header.d> f294471b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f294472c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294473d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_info.items.feature.d> f294474e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f294475f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f294476g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f294477h;

        /* renamed from: i, reason: collision with root package name */
        public final u<j> f294478i;

        /* renamed from: j, reason: collision with root package name */
        public final l f294479j;

        /* renamed from: k, reason: collision with root package name */
        public final u<WB0.a> f294480k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35745a5> f294481l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_info.viewmodel.g> f294482m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpa.configure_info.viewmodel.a> f294483n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f294484o;

        /* renamed from: p, reason: collision with root package name */
        public final l f294485p;

        /* renamed from: q, reason: collision with root package name */
        public final l f294486q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f294487r;

        /* renamed from: s, reason: collision with root package name */
        public final u<P0.c> f294488s;

        /* renamed from: t, reason: collision with root package name */
        public final u<k> f294489t;

        /* compiled from: DaggerCpaConfigureInfoComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294490a;

            public a(WA0.b bVar) {
                this.f294490a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f294490a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCpaConfigureInfoComponent.java */
        /* renamed from: com.avito.android.tariff.cpa.configure_info.di.i$b$b, reason: collision with other inner class name */
        public static final class C8951b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294491a;

            public C8951b(WA0.b bVar) {
                this.f294491a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f294491a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCpaConfigureInfoComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294492a;

            public c(WA0.b bVar) {
                this.f294492a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f294492a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCpaConfigureInfoComponent.java */
        public static final class d implements u<WB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f294493a;

            public d(WA0.b bVar) {
                this.f294493a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WB0.a aVarT6 = this.f294493a.T6();
                t.c(aVarT6);
                return aVarT6;
            }
        }

        public b(WA0.b bVar, cv.b bVar2, Fragment fragment, String str, Screen screen, r rVar, String str2, a aVar) {
            this.f294470a = bVar2;
            u<com.avito.android.tariff.cpa.configure_info.items.header.d> uVarD = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_info.items.header.f.a());
            this.f294471b = uVarD;
            a aVar2 = new a(bVar);
            this.f294472c = aVar2;
            this.f294473d = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_info.items.header.c(uVarD, aVar2));
            u<com.avito.android.tariff.cpa.configure_info.items.feature.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_info.items.feature.g.a());
            this.f294474e = uVarD2;
            this.f294475f = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_info.items.feature.c(uVarD2, this.f294472c));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f294473d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f294475f);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new f(bVarA.b()));
            this.f294476g = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new e(uVarD3));
            this.f294477h = uVarD4;
            this.f294478i = dagger.internal.g.d(new g(uVarD4, this.f294476g));
            this.f294479j = l.a(fragment);
            d dVar = new d(bVar);
            C8951b c8951b = new C8951b(bVar);
            this.f294481l = c8951b;
            this.f294482m = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_info.viewmodel.j(dVar, c8951b));
            this.f294483n = dagger.internal.g.d(com.avito.android.tariff.cpa.configure_info.viewmodel.c.a());
            this.f294484o = new c(bVar);
            this.f294485p = l.a(screen);
            this.f294486q = l.a(rVar);
            this.f294487r = dagger.internal.g.d(new QB0.c(l.a(str2), this.f294484o, this.f294485p, this.f294486q));
            u<P0.c> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff.cpa.configure_info.viewmodel.f(l.a(str), this.f294482m, this.f294483n, this.f294481l, this.f294487r));
            this.f294488s = uVarD5;
            this.f294489t = dagger.internal.g.d(new h(this.f294479j, uVarD5));
        }

        @Override // com.avito.android.tariff.cpa.configure_info.di.a
        public final void a(CpaConfigureInfoFragment cpaConfigureInfoFragment) {
            cpaConfigureInfoFragment.f294440n0 = this.f294477h.get();
            cpaConfigureInfoFragment.f294441o0 = this.f294478i.get();
            cpaConfigureInfoFragment.f294442p0 = this.f294489t.get();
            cpaConfigureInfoFragment.f294443q0 = this.f294487r.get();
            cpaConfigureInfoFragment.f294444r0 = new C19752a(this.f294476g.get());
            z zVar = new z(2);
            zVar.a(this.f294471b.get());
            zVar.a(this.f294474e.get());
            cpaConfigureInfoFragment.f294445s0 = zVar.c();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f294470a.u4();
            t.c(aVarU4);
            cpaConfigureInfoFragment.f294446t0 = aVarU4;
        }
    }

    /* compiled from: DaggerCpaConfigureInfoComponent.java */
    public static final class c implements a.InterfaceC8950a {
        public c() {
        }

        @Override // com.avito.android.tariff.cpa.configure_info.di.a.InterfaceC8950a
        public final com.avito.android.tariff.cpa.configure_info.di.a a(CpaConfigureInfoFragment cpaConfigureInfoFragment, WA0.b bVar, InterfaceC39417a interfaceC39417a, String str, TariffCpaConfigureInfoScreen tariffCpaConfigureInfoScreen, r rVar) {
            interfaceC39417a.getClass();
            tariffCpaConfigureInfoScreen.getClass();
            return new b(bVar, interfaceC39417a, cpaConfigureInfoFragment, str, tariffCpaConfigureInfoScreen, rVar, "tariffConfigureInfo", null);
        }
    }

    public static a.InterfaceC8950a a() {
        return new c();
    }
}

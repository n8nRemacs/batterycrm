package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.statsd.F;
import com.avito.android.permissions.z;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetStartData;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.b;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.i;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.k;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.m;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.p;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.q;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.r;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerIacEnableBottomSheetComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerIacEnableBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.b.a
        public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.b a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment, Resources resources, IacEnableBottomSheetStartData iacEnableBottomSheetStartData, C28478k c28478k, com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar, InterfaceC39417a interfaceC39417a) {
            resources.getClass();
            iacEnableBottomSheetStartData.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, iacEnableBottomSheetFragment, resources, iacEnableBottomSheetStartData, c28478k, null);
        }
    }

    /* compiled from: DaggerIacEnableBottomSheetComponent.java */
    public static final class c implements com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f227784a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227785b;

        /* renamed from: c, reason: collision with root package name */
        public final u<NL.e> f227786c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f227787d;

        /* renamed from: e, reason: collision with root package name */
        public final u<OL.a> f227788e;

        /* renamed from: f, reason: collision with root package name */
        public final u<z> f227789f;

        /* renamed from: g, reason: collision with root package name */
        public final u<F> f227790g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f227791h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.d f227792i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35741a1> f227793j;

        /* renamed from: k, reason: collision with root package name */
        public final k f227794k;

        /* renamed from: l, reason: collision with root package name */
        public final m f227795l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f227796m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f227797n;

        /* renamed from: o, reason: collision with root package name */
        public final l f227798o;

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C6929a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227799a;

            public C6929a(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227799a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f227799a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class b implements u<OL.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227800a;

            public b(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227800a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OL.a aVarM1 = this.f227800a.M1();
                t.c(aVarM1);
                return aVarM1;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C6930c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227801a;

            public C6930c(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227801a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f227801a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227802a;

            public d(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227802a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f227802a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class e implements u<NL.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227803a;

            public e(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227803a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NL.e eVarC5 = this.f227803a.C5();
                t.c(eVarC5);
                return eVarC5;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class f implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227804a;

            public f(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227804a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarQd = this.f227804a.Qd();
                t.c(zVarQd);
                return zVarQd;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227805a;

            public g(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227805a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f227805a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerIacEnableBottomSheetComponent.java */
        public static final class h implements u<F> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c f227806a;

            public h(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar) {
                this.f227806a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                F fN02 = this.f227806a.N0();
                t.c(fN02);
                return fN02;
            }
        }

        public c(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c cVar, cv.b bVar, Fragment fragment, Resources resources, IacEnableBottomSheetStartData iacEnableBottomSheetStartData, C28478k c28478k, C6928a c6928a) {
            this.f227784a = bVar;
            this.f227785b = cVar;
            this.f227792i = new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.d(new e(cVar), new C6930c(cVar), new b(cVar), new f(cVar), new h(cVar), new C6929a(cVar));
            this.f227794k = new k(new d(cVar));
            this.f227795l = new m(l.a(iacEnableBottomSheetStartData));
            this.f227796m = new g(cVar);
            this.f227797n = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f227796m);
            this.f227798o = l.a(new r(new q(new i(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.f.a(), this.f227792i, this.f227794k, this.f227795l, this.f227797n))));
        }

        @Override // com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.b
        public final void a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment) {
            iacEnableBottomSheetFragment.f227750h0 = (p.a) this.f227798o.f393949a;
            iacEnableBottomSheetFragment.f227752j0 = this.f227797n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f227784a.u4();
            t.c(aVarU4);
            iacEnableBottomSheetFragment.f227753k0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f227785b.a();
            t.c(interfaceC28373aA);
            iacEnableBottomSheetFragment.f227754l0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}

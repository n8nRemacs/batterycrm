package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di;

import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemsBottomSheetFragment;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.m;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.i;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.k;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import pM.InterfaceC46977a;

/* compiled from: DaggerIacProblemBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacProblemBottomSheetComponent.java */
    public static final class b implements b.InterfaceC5002b {
        public b() {
        }

        @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b.InterfaceC5002b
        public final com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b a(ActivityC22955m activityC22955m, ActivityC22955m activityC22955m2, IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment, String str, r rVar, g gVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, activityC22955m, activityC22955m2, iacProblemsBottomSheetFragment, str, rVar, null);
        }
    }

    /* compiled from: DaggerIacProblemBottomSheetComponent.java */
    public static final class c implements com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f168875a;

        /* renamed from: b, reason: collision with root package name */
        public final g f168876b;

        /* renamed from: c, reason: collision with root package name */
        public final u<NL.e> f168877c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f168878d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.d f168879e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC46977a> f168880f;

        /* renamed from: g, reason: collision with root package name */
        public final n f168881g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f168882h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f168883i;

        /* renamed from: j, reason: collision with root package name */
        public final m f168884j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC35845m2> f168885k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e> f168886l;

        /* compiled from: DaggerIacProblemBottomSheetComponent.java */
        /* renamed from: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C5000a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f168887a;

            public C5000a(g gVar) {
                this.f168887a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f168887a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIacProblemBottomSheetComponent.java */
        public static final class b implements u<NL.e> {

            /* renamed from: a, reason: collision with root package name */
            public final g f168888a;

            public b(g gVar) {
                this.f168888a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NL.e eVarQf = this.f168888a.qf();
                t.c(eVarQf);
                return eVarQf;
            }
        }

        /* compiled from: DaggerIacProblemBottomSheetComponent.java */
        /* renamed from: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C5001c implements u<InterfaceC46977a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f168889a;

            public C5001c(g gVar) {
                this.f168889a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46977a interfaceC46977aX5 = this.f168889a.x5();
                t.c(interfaceC46977aX5);
                return interfaceC46977aX5;
            }
        }

        /* compiled from: DaggerIacProblemBottomSheetComponent.java */
        public static final class d implements u<InterfaceC35845m2> {

            /* renamed from: a, reason: collision with root package name */
            public final g f168890a;

            public d(g gVar) {
                this.f168890a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f168890a.h();
            }
        }

        /* compiled from: DaggerIacProblemBottomSheetComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final g f168891a;

            public e(g gVar) {
                this.f168891a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f168891a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(g gVar, cv.b bVar, Activity activity, ActivityC22955m activityC22955m, Fragment fragment, String str, r rVar, C4999a c4999a) {
            this.f168875a = bVar;
            this.f168876b = gVar;
            this.f168879e = new com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.d(new b(gVar), new C5000a(gVar));
            this.f168880f = new C5001c(gVar);
            this.f168881g = new n(l.a(str), this.f168880f);
            this.f168882h = new e(gVar);
            this.f168883i = dagger.internal.g.d(new f(l.a(rVar), this.f168882h));
            this.f168884j = new m(new i(com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.f.a(), this.f168879e, k.a(), this.f168881g, this.f168883i));
            this.f168885k = new d(gVar);
            this.f168886l = dagger.internal.g.d(new com.avito.android.iac_problems.impl_module.problems_bottom_sheet.g(l.a(activity), this.f168885k));
        }

        @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b
        public final void a(IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment) {
            iacProblemsBottomSheetFragment.f168851h0 = this.f168884j;
            iacProblemsBottomSheetFragment.f168853j0 = this.f168883i.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f168875a.u4();
            t.c(aVarU4);
            iacProblemsBottomSheetFragment.f168854k0 = aVarU4;
            g gVar = this.f168876b;
            InterfaceC35745a5 interfaceC35745a5D = gVar.d();
            t.c(interfaceC35745a5D);
            iacProblemsBottomSheetFragment.f168855l0 = interfaceC35745a5D;
            iacProblemsBottomSheetFragment.f168856m0 = this.f168886l.get();
            InterfaceC28373a interfaceC28373aA = gVar.a();
            t.c(interfaceC28373aA);
            iacProblemsBottomSheetFragment.f168857n0 = interfaceC28373aA;
        }
    }

    public static b.InterfaceC5002b a() {
        return new b();
    }
}

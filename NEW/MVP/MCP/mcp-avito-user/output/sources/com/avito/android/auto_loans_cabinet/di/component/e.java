package com.avito.android.auto_loans_cabinet.di.component;

import He.InterfaceC13981a;
import Ie.InterfaceC14063a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_loans_cabinet.AutoLoansCabinetActivity;
import com.avito.android.auto_loans_cabinet.L;
import com.avito.android.auto_loans_cabinet.M;
import com.avito.android.auto_loans_cabinet.N;
import com.avito.android.auto_loans_cabinet.di.component.a;
import com.avito.android.auto_loans_cabinet.mvi.f;
import com.avito.android.auto_loans_cabinet.mvi.h;
import com.avito.android.auto_loans_cabinet.mvi.k;
import com.avito.android.auto_loans_cabinet.mvi.m;
import com.avito.android.auto_loans_cabinet.mvi.p;
import com.avito.android.deep_linking.x;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAutoLoanCabinetPageComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
    public static final class b implements com.avito.android.auto_loans_cabinet.di.component.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f95354a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f95355b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14063a> f95356c;

        /* renamed from: d, reason: collision with root package name */
        public final h f95357d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f95358e;

        /* renamed from: f, reason: collision with root package name */
        public final f f95359f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f95360g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f95361h;

        /* renamed from: i, reason: collision with root package name */
        public final l f95362i;

        /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13981a f95363a;

            public a(InterfaceC13981a interfaceC13981a) {
                this.f95363a = interfaceC13981a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f95363a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
        /* renamed from: com.avito.android.auto_loans_cabinet.di.component.e$b$b, reason: collision with other inner class name */
        public static final class C2828b implements u<InterfaceC14063a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13981a f95364a;

            public C2828b(InterfaceC13981a interfaceC13981a) {
                this.f95364a = interfaceC13981a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14063a interfaceC14063aWf = this.f95364a.wf();
                t.c(interfaceC14063aWf);
                return interfaceC14063aWf;
            }
        }

        /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
        public static final class c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13981a f95365a;

            public c(InterfaceC13981a interfaceC13981a) {
                this.f95365a = interfaceC13981a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f95365a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC13981a f95366a;

            public d(InterfaceC13981a interfaceC13981a) {
                this.f95366a = interfaceC13981a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f95366a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC13981a interfaceC13981a, cv.b bVar, C28478k c28478k, a aVar) {
            this.f95354a = bVar;
            a aVar2 = new a(interfaceC13981a);
            com.avito.android.auto_loans_cabinet.domain.c cVar = new com.avito.android.auto_loans_cabinet.domain.c(aVar2, new com.avito.android.auto_loans_cabinet.data.d(new C2828b(interfaceC13981a)));
            this.f95357d = new h(cVar);
            this.f95359f = new f(aVar2, new c(interfaceC13981a), cVar);
            this.f95360g = new d(interfaceC13981a);
            this.f95361h = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f95360g);
            this.f95362i = l.a(new N(new M(new k(this.f95357d, this.f95359f, m.a(), p.a(), this.f95361h))));
        }

        @Override // com.avito.android.auto_loans_cabinet.di.component.a
        public final void a(AutoLoansCabinetActivity autoLoansCabinetActivity) {
            autoLoansCabinetActivity.f95295m = (L.a) this.f95362i.f393949a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f95354a.u4();
            t.c(aVarU4);
            autoLoansCabinetActivity.f95297o = aVarU4;
            autoLoansCabinetActivity.f95298p = this.f95361h.get();
        }
    }

    /* compiled from: DaggerAutoLoanCabinetPageComponent.java */
    public static final class c implements a.InterfaceC2827a {
        public c() {
        }

        @Override // com.avito.android.auto_loans_cabinet.di.component.a.InterfaceC2827a
        public final com.avito.android.auto_loans_cabinet.di.component.a a(InterfaceC13981a interfaceC13981a, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(interfaceC13981a, interfaceC39417a, c28478k, null);
        }
    }

    public static a.InterfaceC2827a a() {
        return new c();
    }
}

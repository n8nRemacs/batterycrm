package com.avito.android.mortgage_category.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_category.C;
import com.avito.android.mortgage_category.MortgageCategoryFragment;
import com.avito.android.mortgage_category.di.b;
import com.avito.android.mortgage_category.model.MortgageCategoryArguments;
import com.avito.android.mortgage_category.mvi.f;
import com.avito.android.mortgage_category.mvi.h;
import com.avito.android.mortgage_category.mvi.j;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMortgageCategoryComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageCategoryComponent.java */
    public static final class b implements b.InterfaceC6108b {
        public b() {
        }

        @Override // com.avito.android.mortgage_category.di.b.InterfaceC6108b
        public final com.avito.android.mortgage_category.di.b a(com.avito.android.mortgage_category.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, MortgageCategoryArguments mortgageCategoryArguments) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, mortgageCategoryArguments, null);
        }
    }

    /* compiled from: DaggerMortgageCategoryComponent.java */
    public static final class c implements com.avito.android.mortgage_category.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f204876a;

        /* renamed from: b, reason: collision with root package name */
        public final u<K10.a> f204877b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f204878c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f204879d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.mortgage_category.mvi.c f204880e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f204881f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f204882g;

        /* renamed from: h, reason: collision with root package name */
        public final l f204883h;

        /* renamed from: i, reason: collision with root package name */
        public final C f204884i;

        /* compiled from: DaggerMortgageCategoryComponent.java */
        /* renamed from: com.avito.android.mortgage_category.di.a$c$a, reason: collision with other inner class name */
        public static final class C6106a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_category.di.c f204885a;

            public C6106a(com.avito.android.mortgage_category.di.c cVar) {
                this.f204885a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f204885a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMortgageCategoryComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_category.di.c f204886a;

            public b(com.avito.android.mortgage_category.di.c cVar) {
                this.f204886a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f204886a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageCategoryComponent.java */
        /* renamed from: com.avito.android.mortgage_category.di.a$c$c, reason: collision with other inner class name */
        public static final class C6107c implements u<K10.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_category.di.c f204887a;

            public C6107c(com.avito.android.mortgage_category.di.c cVar) {
                this.f204887a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                K10.a aVarNa = this.f204887a.na();
                t.c(aVarNa);
                return aVarNa;
            }
        }

        /* compiled from: DaggerMortgageCategoryComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_category.di.c f204888a;

            public d(com.avito.android.mortgage_category.di.c cVar) {
                this.f204888a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f204888a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.mortgage_category.di.c cVar, cv.b bVar, C28478k c28478k, MortgageCategoryArguments mortgageCategoryArguments, C6105a c6105a) {
            this.f204876a = bVar;
            C6107c c6107c = new C6107c(cVar);
            this.f204877b = c6107c;
            this.f204878c = new b(cVar);
            com.avito.android.mortgage_category.mvi.domain.mapper.c cVarA = com.avito.android.mortgage_category.mvi.domain.mapper.c.a();
            u<R0> uVar = this.f204878c;
            this.f204880e = new com.avito.android.mortgage_category.mvi.c(new com.avito.android.mortgage_category.mvi.domain.b(c6107c, cVarA, uVar), new com.avito.android.mortgage_category.mvi.domain.e(this.f204877b, uVar), new I10.c(new C6106a(cVar)));
            this.f204881f = new d(cVar);
            this.f204882g = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f204881f);
            this.f204883h = l.a(mortgageCategoryArguments);
            this.f204884i = new C(new f(this.f204880e, h.a(), j.a(), this.f204882g, this.f204883h));
        }

        @Override // com.avito.android.mortgage_category.di.b
        public final void a(MortgageCategoryFragment mortgageCategoryFragment) {
            mortgageCategoryFragment.f204857n0 = this.f204884i;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f204876a.u4();
            t.c(aVarU4);
            mortgageCategoryFragment.f204859p0 = aVarU4;
            mortgageCategoryFragment.f204860q0 = this.f204882g.get();
        }
    }

    public static b.InterfaceC6108b a() {
        return new b();
    }
}

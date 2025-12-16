package com.avito.android.mortgage.terms.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.terms.MortgageTermsDialog;
import com.avito.android.mortgage.terms.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMortgageTermsDialogComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageTermsDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.terms.di.b.a
        public final com.avito.android.mortgage.terms.di.b a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(oVar, interfaceC39417a, c28478k, null);
        }
    }

    /* compiled from: DaggerMortgageTermsDialogComponent.java */
    public static final class c implements com.avito.android.mortgage.terms.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final o f203835a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f203836b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f203837c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203838d;

        /* compiled from: DaggerMortgageTermsDialogComponent.java */
        /* renamed from: com.avito.android.mortgage.terms.di.a$c$a, reason: collision with other inner class name */
        public static final class C6080a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203839a;

            public C6080a(o oVar) {
                this.f203839a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203839a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, cv.b bVar, C28478k c28478k, C6079a c6079a) {
            this.f203835a = oVar;
            this.f203836b = bVar;
            this.f203837c = new C6080a(oVar);
            this.f203838d = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f203837c);
        }

        @Override // com.avito.android.mortgage.terms.di.b
        public final void a(MortgageTermsDialog mortgageTermsDialog) {
            InterfaceC28373a interfaceC28373aA = this.f203835a.a();
            t.c(interfaceC28373aA);
            mortgageTermsDialog.f203828h0 = interfaceC28373aA;
            mortgageTermsDialog.f203829i0 = this.f203838d.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f203836b.u4();
            t.c(aVarU4);
            mortgageTermsDialog.f203830j0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}

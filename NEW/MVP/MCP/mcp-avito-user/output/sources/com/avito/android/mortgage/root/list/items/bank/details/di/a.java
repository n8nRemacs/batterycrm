package com.avito.android.mortgage.root.list.items.bank.details.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.root.list.items.bank.details.MortgageRootBankDetailsDialog;
import com.avito.android.mortgage.root.list.items.bank.details.di.b;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMortgageRootBankDetailsComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageRootBankDetailsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.root.list.items.bank.details.di.b.a
        public final com.avito.android.mortgage.root.list.items.bank.details.di.b a(o oVar, C28478k c28478k) {
            return new c(oVar, c28478k, null);
        }
    }

    /* compiled from: DaggerMortgageRootBankDetailsComponent.java */
    public static final class c implements com.avito.android.mortgage.root.list.items.bank.details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f202325a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f202326b;

        /* compiled from: DaggerMortgageRootBankDetailsComponent.java */
        /* renamed from: com.avito.android.mortgage.root.list.items.bank.details.di.a$c$a, reason: collision with other inner class name */
        public static final class C6012a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202327a;

            public C6012a(o oVar) {
                this.f202327a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f202327a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, C6011a c6011a) {
            this.f202325a = new C6012a(oVar);
            this.f202326b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f202325a);
        }

        @Override // com.avito.android.mortgage.root.list.items.bank.details.di.b
        public final void a(MortgageRootBankDetailsDialog mortgageRootBankDetailsDialog) {
            mortgageRootBankDetailsDialog.f202317h0 = this.f202326b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

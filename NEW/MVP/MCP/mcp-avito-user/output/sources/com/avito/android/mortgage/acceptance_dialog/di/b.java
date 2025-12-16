package com.avito.android.mortgage.acceptance_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.acceptance_dialog.AcceptanceDialog;
import com.avito.android.mortgage.acceptance_dialog.di.a;
import com.avito.android.mortgage.di.o;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAcceptanceDialogComponent.java */
@e
/* loaded from: classes15.dex */
public final class b {

    /* compiled from: DaggerAcceptanceDialogComponent.java */
    /* renamed from: com.avito.android.mortgage.acceptance_dialog.di.b$b, reason: collision with other inner class name */
    public static final class C5842b implements com.avito.android.mortgage.acceptance_dialog.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f198175a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198176b;

        /* compiled from: DaggerAcceptanceDialogComponent.java */
        /* renamed from: com.avito.android.mortgage.acceptance_dialog.di.b$b$a */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198177a;

            public a(o oVar) {
                this.f198177a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198177a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C5842b(o oVar, C28478k c28478k, a aVar) {
            this.f198175a = new a(oVar);
            this.f198176b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198175a);
        }

        @Override // com.avito.android.mortgage.acceptance_dialog.di.a
        public final void a(AcceptanceDialog acceptanceDialog) {
            acceptanceDialog.f198163h0 = this.f198176b.get();
        }
    }

    /* compiled from: DaggerAcceptanceDialogComponent.java */
    public static final class c implements a.InterfaceC5841a {
        public c() {
        }

        @Override // com.avito.android.mortgage.acceptance_dialog.di.a.InterfaceC5841a
        public final com.avito.android.mortgage.acceptance_dialog.di.a a(o oVar, C28478k c28478k) {
            return new C5842b(oVar, c28478k, null);
        }
    }

    public static a.InterfaceC5841a a() {
        return new c();
    }
}

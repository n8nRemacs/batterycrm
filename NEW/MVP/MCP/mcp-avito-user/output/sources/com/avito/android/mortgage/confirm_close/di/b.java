package com.avito.android.mortgage.confirm_close.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.confirm_close.ConfirmCloseDialog;
import com.avito.android.mortgage.confirm_close.di.a;
import com.avito.android.mortgage.di.o;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerConfirmCloseDialogComponent.java */
@e
/* loaded from: classes15.dex */
public final class b {

    /* compiled from: DaggerConfirmCloseDialogComponent.java */
    /* renamed from: com.avito.android.mortgage.confirm_close.di.b$b, reason: collision with other inner class name */
    public static final class C5855b implements com.avito.android.mortgage.confirm_close.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f198489a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198490b;

        /* compiled from: DaggerConfirmCloseDialogComponent.java */
        /* renamed from: com.avito.android.mortgage.confirm_close.di.b$b$a */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198491a;

            public a(o oVar) {
                this.f198491a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198491a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C5855b(o oVar, C28478k c28478k, a aVar) {
            this.f198489a = new a(oVar);
            this.f198490b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198489a);
        }

        @Override // com.avito.android.mortgage.confirm_close.di.a
        public final void a(ConfirmCloseDialog confirmCloseDialog) {
            confirmCloseDialog.f198480h0 = this.f198490b.get();
        }
    }

    /* compiled from: DaggerConfirmCloseDialogComponent.java */
    public static final class c implements a.InterfaceC5854a {
        public c() {
        }

        @Override // com.avito.android.mortgage.confirm_close.di.a.InterfaceC5854a
        public final com.avito.android.mortgage.confirm_close.di.a a(o oVar, C28478k c28478k) {
            return new C5855b(oVar, c28478k, null);
        }
    }

    public static a.InterfaceC5854a a() {
        return new c();
    }
}

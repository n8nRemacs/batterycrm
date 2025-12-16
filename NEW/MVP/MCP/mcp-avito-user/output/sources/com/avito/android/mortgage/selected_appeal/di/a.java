package com.avito.android.mortgage.selected_appeal.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.selected_appeal.SelectedAppealDialog;
import com.avito.android.mortgage.selected_appeal.di.c;
import com.avito.android.mortgage.selected_appeal.h;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.selected_appeal.mvi.f;
import com.avito.android.mortgage.selected_appeal.mvi.j;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import i00.InterfaceC41203a;
import i10.C41210c;

/* compiled from: DaggerSelectedAppealComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSelectedAppealComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.selected_appeal.di.c.a
        public final com.avito.android.mortgage.selected_appeal.di.c a(o oVar, SelectedAppealArguments selectedAppealArguments, C28478k c28478k) {
            return new c(oVar, selectedAppealArguments, c28478k, null);
        }
    }

    /* compiled from: DaggerSelectedAppealComponent.java */
    public static final class c implements com.avito.android.mortgage.selected_appeal.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f203422a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203423b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f203424c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41203a> f203425d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f203426e;

        /* renamed from: f, reason: collision with root package name */
        public final h f203427f;

        /* compiled from: DaggerSelectedAppealComponent.java */
        /* renamed from: com.avito.android.mortgage.selected_appeal.di.a$c$a, reason: collision with other inner class name */
        public static final class C6054a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203428a;

            public C6054a(o oVar) {
                this.f203428a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f203428a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectedAppealComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203429a;

            public b(o oVar) {
                this.f203429a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f203429a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectedAppealComponent.java */
        /* renamed from: com.avito.android.mortgage.selected_appeal.di.a$c$c, reason: collision with other inner class name */
        public static final class C6055c implements u<InterfaceC41203a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203430a;

            public C6055c(o oVar) {
                this.f203430a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41203a interfaceC41203aTb = this.f203430a.Tb();
                t.c(interfaceC41203aTb);
                return interfaceC41203aTb;
            }
        }

        /* compiled from: DaggerSelectedAppealComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203431a;

            public d(o oVar) {
                this.f203431a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203431a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, SelectedAppealArguments selectedAppealArguments, C28478k c28478k, C6053a c6053a) {
            this.f203422a = new d(oVar);
            this.f203423b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f203422a);
            this.f203427f = new h(new f(l.a(selectedAppealArguments), new com.avito.android.mortgage.selected_appeal.mvi.c(new com.avito.android.mortgage.selected_appeal.mvi.domain.b(new b(oVar), new C6055c(oVar)), new C41210c(new C6054a(oVar))), j.a(), com.avito.android.mortgage.selected_appeal.mvi.h.a(), this.f203423b));
        }

        @Override // com.avito.android.mortgage.selected_appeal.di.c
        public final void a(SelectedAppealDialog selectedAppealDialog) {
            selectedAppealDialog.f203390h0 = this.f203423b.get();
            selectedAppealDialog.f203391i0 = this.f203427f;
        }
    }

    public static c.a a() {
        return new b();
    }
}

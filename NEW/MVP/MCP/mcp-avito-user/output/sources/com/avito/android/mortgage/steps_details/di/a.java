package com.avito.android.mortgage.steps_details.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.steps_details.StepsDetailsDialog;
import com.avito.android.mortgage.steps_details.di.b;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerStepsDetailsComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerStepsDetailsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.steps_details.di.b.a
        public final com.avito.android.mortgage.steps_details.di.b a(o oVar, C28478k c28478k) {
            return new c(oVar, c28478k, null);
        }
    }

    /* compiled from: DaggerStepsDetailsComponent.java */
    public static final class c implements com.avito.android.mortgage.steps_details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f203818a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203819b;

        /* compiled from: DaggerStepsDetailsComponent.java */
        /* renamed from: com.avito.android.mortgage.steps_details.di.a$c$a, reason: collision with other inner class name */
        public static final class C6077a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203820a;

            public C6077a(o oVar) {
                this.f203820a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203820a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, C6076a c6076a) {
            this.f203818a = new C6077a(oVar);
            this.f203819b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f203818a);
        }

        @Override // com.avito.android.mortgage.steps_details.di.b
        public final void a(StepsDetailsDialog stepsDetailsDialog) {
            stepsDetailsDialog.f203814h0 = this.f203819b.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

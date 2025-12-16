package com.avito.android.mortgage.consultation.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.consultation.D;
import com.avito.android.mortgage.consultation.MortgageConsultationDialog;
import com.avito.android.mortgage.consultation.di.b;
import com.avito.android.mortgage.consultation.model.ConsultationArguments;
import com.avito.android.mortgage.consultation.mvi.g;
import com.avito.android.mortgage.consultation.mvi.i;
import com.avito.android.mortgage.consultation.mvi.k;
import com.avito.android.mortgage.di.o;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import i00.InterfaceC41203a;

/* compiled from: DaggerMortgageConsultationComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageConsultationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.consultation.di.b.a
        public final com.avito.android.mortgage.consultation.di.b a(o oVar, C28478k c28478k, ConsultationArguments consultationArguments) {
            return new c(oVar, c28478k, consultationArguments, null);
        }
    }

    /* compiled from: DaggerMortgageConsultationComponent.java */
    public static final class c implements com.avito.android.mortgage.consultation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f198545a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC41203a> f198546b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f198547c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f198548d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.mortgage.consultation.mvi.d f198549e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.mortgage.consultation.mvi.b f198550f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f198551g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198552h;

        /* renamed from: i, reason: collision with root package name */
        public final D f198553i;

        /* compiled from: DaggerMortgageConsultationComponent.java */
        /* renamed from: com.avito.android.mortgage.consultation.di.a$c$a, reason: collision with other inner class name */
        public static final class C5859a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198554a;

            public C5859a(o oVar) {
                this.f198554a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f198554a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMortgageConsultationComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198555a;

            public b(o oVar) {
                this.f198555a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f198555a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageConsultationComponent.java */
        /* renamed from: com.avito.android.mortgage.consultation.di.a$c$c, reason: collision with other inner class name */
        public static final class C5860c implements u<InterfaceC41203a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198556a;

            public C5860c(o oVar) {
                this.f198556a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41203a interfaceC41203aTb = this.f198556a.Tb();
                t.c(interfaceC41203aTb);
                return interfaceC41203aTb;
            }
        }

        /* compiled from: DaggerMortgageConsultationComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198557a;

            public d(o oVar) {
                this.f198557a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198557a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, ConsultationArguments consultationArguments, C5858a c5858a) {
            l lVarA = l.a(consultationArguments);
            this.f198545a = lVarA;
            com.avito.android.mortgage.consultation.data.e eVar = new com.avito.android.mortgage.consultation.data.e(new C5860c(oVar));
            b bVar = new b(oVar);
            com.avito.android.mortgage.consultation.domain.d dVar = new com.avito.android.mortgage.consultation.domain.d(eVar, bVar);
            UZ.c cVar = new UZ.c(new C5859a(oVar));
            this.f198549e = new com.avito.android.mortgage.consultation.mvi.d(lVarA, dVar, cVar);
            this.f198550f = new com.avito.android.mortgage.consultation.mvi.b(dVar, new com.avito.android.mortgage.consultation.domain.b(eVar, bVar), cVar);
            this.f198551g = new d(oVar);
            this.f198552h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198551g);
            this.f198553i = new D(new g(this.f198545a, this.f198549e, this.f198550f, k.a(), i.a(), this.f198552h));
        }

        @Override // com.avito.android.mortgage.consultation.di.b
        public final void a(MortgageConsultationDialog mortgageConsultationDialog) {
            mortgageConsultationDialog.f198516h0 = this.f198553i;
            mortgageConsultationDialog.f198518j0 = this.f198552h.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

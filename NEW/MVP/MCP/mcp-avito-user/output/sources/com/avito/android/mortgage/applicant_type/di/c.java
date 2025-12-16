package com.avito.android.mortgage.applicant_type.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog;
import com.avito.android.mortgage.applicant_type.di.a;
import com.avito.android.mortgage.applicant_type.g;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.applicant_type.mvi.d;
import com.avito.android.mortgage.applicant_type.mvi.f;
import com.avito.android.mortgage.applicant_type.mvi.h;
import com.avito.android.mortgage.applicant_type.mvi.j;
import com.avito.android.mortgage.di.o;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerApplicantTypeSelectorComponent.java */
@e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerApplicantTypeSelectorComponent.java */
    public static final class b implements com.avito.android.mortgage.applicant_type.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28373a> f198295a;

        /* renamed from: b, reason: collision with root package name */
        public final j f198296b;

        /* renamed from: c, reason: collision with root package name */
        public final d f198297c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f198298d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198299e;

        /* renamed from: f, reason: collision with root package name */
        public final g f198300f;

        /* compiled from: DaggerApplicantTypeSelectorComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198301a;

            public a(o oVar) {
                this.f198301a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f198301a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerApplicantTypeSelectorComponent.java */
        /* renamed from: com.avito.android.mortgage.applicant_type.di.c$b$b, reason: collision with other inner class name */
        public static final class C5848b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198302a;

            public C5848b(o oVar) {
                this.f198302a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198302a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(o oVar, ApplicantTypeSelectorArguments applicantTypeSelectorArguments, C28478k c28478k, a aVar) {
            this.f198296b = new j(new OZ.d(new a(oVar)));
            this.f198297c = new d(l.a(applicantTypeSelectorArguments));
            this.f198298d = new C5848b(oVar);
            this.f198299e = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198298d);
            this.f198300f = new g(new f(com.avito.android.mortgage.applicant_type.mvi.b.a(), h.a(), this.f198296b, this.f198297c, this.f198299e));
        }

        @Override // com.avito.android.mortgage.applicant_type.di.a
        public final void a(ApplicantTypeSelectorDialog applicantTypeSelectorDialog) {
            applicantTypeSelectorDialog.f198266h0 = this.f198300f;
            applicantTypeSelectorDialog.f198268j0 = this.f198299e.get();
        }
    }

    /* compiled from: DaggerApplicantTypeSelectorComponent.java */
    /* renamed from: com.avito.android.mortgage.applicant_type.di.c$c, reason: collision with other inner class name */
    public static final class C5849c implements a.InterfaceC5847a {
        public C5849c() {
        }

        @Override // com.avito.android.mortgage.applicant_type.di.a.InterfaceC5847a
        public final com.avito.android.mortgage.applicant_type.di.a a(o oVar, ApplicantTypeSelectorArguments applicantTypeSelectorArguments, C28478k c28478k) {
            return new b(oVar, applicantTypeSelectorArguments, c28478k, null);
        }
    }

    public static a.InterfaceC5847a a() {
        return new C5849c();
    }
}

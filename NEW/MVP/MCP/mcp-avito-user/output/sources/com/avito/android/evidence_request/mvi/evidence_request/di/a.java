package com.avito.android.evidence_request.mvi.evidence_request.di;

import Wz.C15813c;
import Wz.InterfaceC15811a;
import android.app.Application;
import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.evidence_request.EvidenceRequestActivity;
import com.avito.android.evidence_request.mvi.evidence_request.b;
import com.avito.android.evidence_request.mvi.evidence_request.di.b;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.K;
import com.avito.android.server_time.h;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hJ.i;
import java.util.Locale;

/* compiled from: DaggerEvidenceRequestComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEvidenceRequestComponent.java */
    public static final class b implements com.avito.android.evidence_request.mvi.evidence_request.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.evidence_request.di.c f149119a;

        /* renamed from: b, reason: collision with root package name */
        public final AppealId f149120b;

        /* renamed from: c, reason: collision with root package name */
        public final l f149121c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f149122d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Wz.d> f149123e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.mvi.data.evidence_request.a> f149124f;

        /* renamed from: g, reason: collision with root package name */
        public final u<G> f149125g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC15811a> f149126h;

        /* renamed from: i, reason: collision with root package name */
        public final l f149127i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f149128j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f149129k;

        /* compiled from: DaggerEvidenceRequestComponent.java */
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_request.di.a$b$a, reason: collision with other inner class name */
        public static final class C4370a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_request.di.c f149130a;

            public C4370a(com.avito.android.evidence_request.mvi.evidence_request.di.c cVar) {
                this.f149130a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f149130a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerEvidenceRequestComponent.java */
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_request.di.a$b$b, reason: collision with other inner class name */
        public static final class C4371b implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.mvi.evidence_request.di.c f149131a;

            public C4371b(com.avito.android.evidence_request.mvi.evidence_request.di.c cVar) {
                this.f149131a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f149131a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerEvidenceRequestComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f149132a;

            public c(InterfaceC30106l7 interfaceC30106l7) {
                this.f149132a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f149132a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC30106l7 interfaceC30106l7, com.avito.android.evidence_request.mvi.evidence_request.di.c cVar, C28478k c28478k, EvidenceRequestActivity evidenceRequestActivity, AppealId appealId, Resources resources, C4369a c4369a) {
            this.f149119a = cVar;
            this.f149120b = appealId;
            this.f149121c = l.a(appealId);
            this.f149123e = g.d(new Wz.f(new C4371b(cVar)));
            u<com.avito.android.evidence_request.mvi.data.evidence_request.a> uVarD = g.d(new com.avito.android.evidence_request.mvi.data.evidence_request.c(l.a(resources)));
            this.f149124f = uVarD;
            u<InterfaceC15811a> uVarD2 = g.d(new C15813c(uVarD, new C4370a(cVar)));
            this.f149126h = uVarD2;
            this.f149127i = l.a(new com.avito.android.evidence_request.mvi.evidence_request.d(new com.avito.android.evidence_request.mvi.evidence_request.c(new com.avito.android.evidence_request.mvi.evidence_request.mvi.e(new com.avito.android.evidence_request.mvi.evidence_request.mvi.b(this.f149121c, uVarD2, this.f149123e), com.avito.android.evidence_request.mvi.evidence_request.mvi.g.a()))));
            this.f149128j = new c(interfaceC30106l7);
            this.f149129k = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f149128j);
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final K E1() {
            K kE1 = this.f149119a.E1();
            t.c(kE1);
            return kE1;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final com.avito.android.photo_cache.b F() {
            com.avito.android.photo_cache.b bVarF = this.f149119a.F();
            t.c(bVarF);
            return bVarF;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final AppealId G4() {
            return this.f149120b;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final u3.l<SimpleTestGroupWithNone> O0() {
            u3.l<SimpleTestGroupWithNone> lVarO0 = this.f149119a.O0();
            t.c(lVarO0);
            return lVarO0;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final hJ.e S() {
            hJ.e eVarS = this.f149119a.S();
            t.c(eVarS);
            return eVarS;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final PhotoPickerIntentFactory X() {
            return this.f149119a.X();
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final i Y() {
            i iVarY = this.f149119a.Y();
            t.c(iVarY);
            return iVarY;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final LlmDescriptionPresenter Y0() {
            return this.f149119a.Y0();
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f149119a.a();
            t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final R0 c() {
            R0 r0C = this.f149119a.c();
            t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final u3.l<SimpleTestGroupWithNone> c1() {
            u3.l<SimpleTestGroupWithNone> lVarC1 = this.f149119a.c1();
            t.c(lVarC1);
            return lVarC1;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final InterfaceC35745a5 d() {
            InterfaceC35745a5 interfaceC35745a5D = this.f149119a.d();
            t.c(interfaceC35745a5D);
            return interfaceC35745a5D;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f149119a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final InterfaceC35845m2 h() {
            return this.f149119a.h();
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final C j() {
            C cJ2 = this.f149119a.j();
            t.c(cJ2);
            return cJ2;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final Application k() {
            Application applicationK = this.f149119a.k();
            t.c(applicationK);
            return applicationK;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final Locale locale() {
            return this.f149119a.locale();
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final InterfaceC35741a1 n() {
            InterfaceC35741a1 interfaceC35741a1N = this.f149119a.n();
            t.c(interfaceC35741a1N);
            return interfaceC35741a1N;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final hJ.g p0() {
            hJ.g gVarP0 = this.f149119a.p0();
            t.c(gVarP0);
            return gVarP0;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final G w() {
            G gW2 = this.f149119a.w();
            t.c(gW2);
            return gW2;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final h y() {
            h hVarY = this.f149119a.y();
            t.c(hVarY);
            return hVarY;
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_details.di.c
        public final Q1 z0() {
            return this.f149119a.z0();
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_request.di.b
        public final void zd(EvidenceRequestActivity evidenceRequestActivity) {
            evidenceRequestActivity.f149105m = (b.a) this.f149127i.f393949a;
            evidenceRequestActivity.f149107o = this.f149129k.get();
        }
    }

    /* compiled from: DaggerEvidenceRequestComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.evidence_request.mvi.evidence_request.di.b.a
        public final com.avito.android.evidence_request.mvi.evidence_request.di.b a(com.avito.android.evidence_request.mvi.evidence_request.di.c cVar, InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, EvidenceRequestActivity evidenceRequestActivity, AppealId appealId, Resources resources) {
            evidenceRequestActivity.getClass();
            appealId.getClass();
            return new b(interfaceC30106l7, cVar, c28478k, evidenceRequestActivity, appealId, resources, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}

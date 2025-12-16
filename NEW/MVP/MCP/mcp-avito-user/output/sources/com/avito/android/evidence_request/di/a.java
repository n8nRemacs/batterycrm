package com.avito.android.evidence_request.di;

import android.app.Application;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.evidence_request.AppealId;
import com.avito.android.evidence_request.EvidenceRequestActivity;
import com.avito.android.evidence_request.details.files.q;
import com.avito.android.evidence_request.di.b;
import com.avito.android.evidence_request.k;
import com.avito.android.evidence_request.reasons.ProofTypesFragment;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.K;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;

/* compiled from: DaggerEvidenceRequestComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEvidenceRequestComponent.java */
    public static final class b implements com.avito.android.evidence_request.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.evidence_request.di.c f148598a;

        /* renamed from: b, reason: collision with root package name */
        public final AppealId f148599b;

        /* renamed from: c, reason: collision with root package name */
        public final l f148600c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC23487e> f148601d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.repository.a> f148602e;

        /* renamed from: f, reason: collision with root package name */
        public final u<G> f148603f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.c> f148604g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f148605h;

        /* renamed from: i, reason: collision with root package name */
        public final u<q> f148606i;

        /* renamed from: j, reason: collision with root package name */
        public final u<P0.c> f148607j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.i> f148608k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.reasons.c> f148609l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.evidence_request.details.g> f148610m;

        /* compiled from: DaggerEvidenceRequestComponent.java */
        /* renamed from: com.avito.android.evidence_request.di.a$b$a, reason: collision with other inner class name */
        public static final class C4354a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.di.c f148611a;

            public C4354a(com.avito.android.evidence_request.di.c cVar) {
                this.f148611a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f148611a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerEvidenceRequestComponent.java */
        /* renamed from: com.avito.android.evidence_request.di.a$b$b, reason: collision with other inner class name */
        public static final class C4355b implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.evidence_request.di.c f148612a;

            public C4355b(com.avito.android.evidence_request.di.c cVar) {
                this.f148612a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f148612a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        public b(com.avito.android.evidence_request.di.c cVar, EvidenceRequestActivity evidenceRequestActivity, AppealId appealId, C4353a c4353a) {
            this.f148598a = cVar;
            this.f148599b = appealId;
            l lVarA = l.a(evidenceRequestActivity);
            this.f148600c = lVarA;
            this.f148601d = dagger.internal.g.d(new f(lVarA));
            u<com.avito.android.evidence_request.repository.a> uVarD = dagger.internal.g.d(com.avito.android.evidence_request.repository.c.a());
            this.f148602e = uVarD;
            this.f148604g = dagger.internal.g.d(new com.avito.android.evidence_request.e(uVarD, new C4354a(cVar)));
            this.f148606i = dagger.internal.g.d(new j(new C4355b(cVar)));
            u<P0.c> uVarD2 = dagger.internal.g.d(new k(l.a(appealId), this.f148601d, this.f148604g, this.f148606i));
            this.f148607j = uVarD2;
            u<com.avito.android.evidence_request.i> uVarD3 = dagger.internal.g.d(new h(this.f148600c, uVarD2));
            this.f148608k = uVarD3;
            this.f148609l = dagger.internal.g.d(new g(uVarD3));
            this.f148610m = dagger.internal.g.d(new e(this.f148608k));
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final K E1() {
            K kE1 = this.f148598a.E1();
            t.c(kE1);
            return kE1;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final com.avito.android.photo_cache.b F() {
            com.avito.android.photo_cache.b bVarF = this.f148598a.F();
            t.c(bVarF);
            return bVarF;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final AppealId G4() {
            return this.f148599b;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final u3.l<SimpleTestGroupWithNone> O0() {
            u3.l<SimpleTestGroupWithNone> lVarO0 = this.f148598a.O0();
            t.c(lVarO0);
            return lVarO0;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final hJ.e S() {
            hJ.e eVarS = this.f148598a.S();
            t.c(eVarS);
            return eVarS;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final PhotoPickerIntentFactory X() {
            return this.f148598a.X();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final com.avito.android.evidence_request.details.g Xh() {
            return this.f148610m.get();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final hJ.i Y() {
            hJ.i iVarY = this.f148598a.Y();
            t.c(iVarY);
            return iVarY;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final LlmDescriptionPresenter Y0() {
            return this.f148598a.Y0();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f148598a.a();
            t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // aA.InterfaceC19746a
        public final void ba(ProofTypesFragment proofTypesFragment) {
            proofTypesFragment.f149194q0 = this.f148609l.get();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final u3.l<SimpleTestGroupWithNone> c1() {
            u3.l<SimpleTestGroupWithNone> lVarC1 = this.f148598a.c1();
            t.c(lVarC1);
            return lVarC1;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final InterfaceC35745a5 d() {
            InterfaceC35745a5 interfaceC35745a5D = this.f148598a.d();
            t.c(interfaceC35745a5D);
            return interfaceC35745a5D;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f148598a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final InterfaceC35845m2 h() {
            return this.f148598a.h();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final C j() {
            C cJ2 = this.f148598a.j();
            t.c(cJ2);
            return cJ2;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final Application k() {
            Application applicationK = this.f148598a.k();
            t.c(applicationK);
            return applicationK;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final Locale locale() {
            return this.f148598a.locale();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final InterfaceC35741a1 n() {
            InterfaceC35741a1 interfaceC35741a1N = this.f148598a.n();
            t.c(interfaceC35741a1N);
            return interfaceC35741a1N;
        }

        @Override // com.avito.android.evidence_request.di.b
        public final void nk(EvidenceRequestActivity evidenceRequestActivity) {
            evidenceRequestActivity.f148210m = this.f148608k.get();
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final hJ.g p0() {
            hJ.g gVarP0 = this.f148598a.p0();
            t.c(gVarP0);
            return gVarP0;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final G w() {
            G gW2 = this.f148598a.w();
            t.c(gW2);
            return gW2;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final com.avito.android.server_time.h y() {
            com.avito.android.server_time.h hVarY = this.f148598a.y();
            t.c(hVarY);
            return hVarY;
        }

        @Override // com.avito.android.evidence_request.details.di.InterfaceC30378c
        public final Q1 z0() {
            return this.f148598a.z0();
        }
    }

    /* compiled from: DaggerEvidenceRequestComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.evidence_request.di.b.a
        public final com.avito.android.evidence_request.di.b a(EvidenceRequestActivity evidenceRequestActivity, com.avito.android.evidence_request.di.c cVar, AppealId appealId) {
            evidenceRequestActivity.getClass();
            return new b(cVar, evidenceRequestActivity, appealId, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}

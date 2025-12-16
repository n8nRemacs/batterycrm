package com.avito.android.evidence_request.mvi.proof_types.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.proof_types.ProofTypesFragment;
import com.avito.android.evidence_request.mvi.proof_types.di.b;
import com.avito.android.evidence_request.mvi.proof_types.mvi.g;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProofTypesComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerProofTypesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.evidence_request.mvi.proof_types.di.b.a
        public final com.avito.android.evidence_request.mvi.proof_types.di.b a(InterfaceC30106l7 interfaceC30106l7, C28478k c28478k) {
            return new c(interfaceC30106l7, c28478k, null);
        }
    }

    /* compiled from: DaggerProofTypesComponent.java */
    public static final class c implements com.avito.android.evidence_request.mvi.proof_types.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.evidence_request.mvi.proof_types.e f149177a = new com.avito.android.evidence_request.mvi.proof_types.e(new com.avito.android.evidence_request.mvi.proof_types.mvi.e(com.avito.android.evidence_request.mvi.proof_types.mvi.b.a(), g.a()));

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f149178b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f149179c;

        /* compiled from: DaggerProofTypesComponent.java */
        /* renamed from: com.avito.android.evidence_request.mvi.proof_types.di.a$c$a, reason: collision with other inner class name */
        public static final class C4375a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f149180a;

            public C4375a(InterfaceC30106l7 interfaceC30106l7) {
                this.f149180a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f149180a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC30106l7 interfaceC30106l7, C28478k c28478k, C4374a c4374a) {
            this.f149178b = new C4375a(interfaceC30106l7);
            this.f149179c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f149178b);
        }

        @Override // com.avito.android.evidence_request.mvi.proof_types.di.b
        public final void fm(ProofTypesFragment proofTypesFragment) {
            proofTypesFragment.f149157n0 = this.f149177a;
            proofTypesFragment.f149159p0 = this.f149179c.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}

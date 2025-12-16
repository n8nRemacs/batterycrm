package com.avito.android.evidence_request;

import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.evidence_request.details.files.q;
import com.avito.android.evidence_request.repository.model.EvidenceContent;
import com.avito.android.evidence_request.repository.model.ProofDetailsContent;
import com.avito.android.evidence_request.repository.model.ProofType;
import com.avito.android.evidence_request.repository.model.ProofTypesContent;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.util.architecture_components.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: EvidenceRequestViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/evidence_request/i;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/evidence_request/reasons/c;", "Lcom/avito/android/evidence_request/details/g;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends M0 implements com.avito.android.evidence_request.reasons.c, com.avito.android.evidence_request.details.g {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final c f148627E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final q f148628J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f148629K = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: L, reason: collision with root package name */
    public final EvidenceContent f148630L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final D<a> f148631M;

    /* compiled from: EvidenceRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/evidence_request/i$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/evidence_request/i$a$a;", "Lcom/avito/android/evidence_request/i$a$b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: EvidenceRequestViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/i$a$a;", "Lcom/avito/android/evidence_request/i$a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.evidence_request.i$a$a, reason: collision with other inner class name */
        public static final class C4356a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f148632a;

            public C4356a(@Y61.k String str) {
                super(null);
                this.f148632a = str;
            }
        }

        /* compiled from: EvidenceRequestViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/i$a$b;", "Lcom/avito/android/evidence_request/i$a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ProofTypesContent f148633a;

            public b(@Y61.k ProofTypesContent proofTypesContent) {
                super(null);
                this.f148633a = proofTypesContent;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k C23060r0 c23060r0, @Y61.k c cVar, @Y61.k q qVar, @Y61.k AppealId appealId) {
        G0 g02;
        a c4356a;
        this.f148627E = cVar;
        this.f148628J = qVar;
        D<a> d12 = new D<>();
        this.f148631M = d12;
        qVar.b();
        EvidenceContent evidenceContent = (EvidenceContent) c23060r0.b("state.content");
        if (evidenceContent != null) {
            this.f148630L = evidenceContent;
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            ModerationEvidence moderationEvidence = appealId.f148208d;
            EvidenceContent evidenceContentA = cVar.a(moderationEvidence);
            this.f148630L = evidenceContentA;
            c23060r0.e(evidenceContentA, "state.content");
            if (moderationEvidence == ModerationEvidence.f253037e) {
                EvidenceContent evidenceContent2 = this.f148630L;
                c4356a = new a.b((evidenceContent2 != null ? evidenceContent2 : null).f149199b);
            } else {
                EvidenceContent evidenceContent3 = this.f148630L;
                c4356a = new a.C4356a(((ProofType) C42745f0.E((evidenceContent3 != null ? evidenceContent3 : null).f149199b.f149210d)).f149206b);
            }
            d12.setValue(c4356a);
        }
    }

    @Override // com.avito.android.evidence_request.details.g
    @Y61.k
    public final ProofDetailsContent X6(@Y61.k String str) {
        EvidenceContent evidenceContent = this.f148630L;
        if (evidenceContent == null) {
            evidenceContent = null;
        }
        return (ProofDetailsContent) evidenceContent.f149200c.get(str);
    }

    @Override // com.avito.android.evidence_request.reasons.c
    public final void oa(@Y61.k String str) {
        this.f148631M.setValue(new a.C4356a(str));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f148629K.e();
        this.f148628J.a();
    }
}

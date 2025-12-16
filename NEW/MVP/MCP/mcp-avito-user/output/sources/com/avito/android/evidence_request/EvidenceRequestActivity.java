package com.avito.android.evidence_request;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.evidence_request.a;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;
import com.avito.android.evidence_request.i;
import com.avito.android.evidence_request.reasons.ProofTypesFragment;
import com.avito.android.evidence_request.repository.model.ProofTypesContent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceRequestActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/evidence_request/EvidenceRequestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/evidence_request/di/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EvidenceRequestActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.evidence_request.di.b>, InterfaceC28477j.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f148209o = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public i f148210m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.android.evidence_request.di.b f148211n;

    /* compiled from: EvidenceRequestActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/evidence_request/i$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/evidence_request/i$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<i.a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(i.a aVar) {
            i.a aVar2 = aVar;
            boolean z12 = aVar2 instanceof i.a.b;
            EvidenceRequestActivity evidenceRequestActivity = EvidenceRequestActivity.this;
            if (z12) {
                int i12 = EvidenceRequestActivity.f148209o;
                ProofTypesFragment.a aVar3 = ProofTypesFragment.f149190r0;
                ProofTypesContent proofTypesContent = ((i.a.b) aVar2).f148633a;
                aVar3.getClass();
                ProofTypesFragment proofTypesFragmentA = ProofTypesFragment.a.a(proofTypesContent);
                H hE2 = evidenceRequestActivity.getSupportFragmentManager().e();
                hE2.n(R.id.fragment_container, proofTypesFragmentA, "types");
                hE2.c("types");
                hE2.e();
            } else if (aVar2 instanceof i.a.C4356a) {
                int i13 = EvidenceRequestActivity.f148209o;
                EvidenceDetailsFragment.a aVar4 = EvidenceDetailsFragment.f148226A0;
                String str = ((i.a.C4356a) aVar2).f148632a;
                aVar4.getClass();
                EvidenceDetailsFragment evidenceDetailsFragmentA = EvidenceDetailsFragment.a.a(str);
                H hE3 = evidenceRequestActivity.getSupportFragmentManager().e();
                hE3.n(R.id.fragment_container, evidenceDetailsFragmentA, "details");
                hE3.c("details");
                hE3.e();
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.evidence_request_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key_appeal_id");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f148211n = com.avito.android.evidence_request.di.a.a().a(this, (com.avito.android.evidence_request.di.c) C29972i.a(C29972i.b(this), com.avito.android.evidence_request.di.c.class), (AppealId) parcelableExtra);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.evidence_request.di.b bVar = this.f148211n;
        if (bVar == null) {
            bVar = null;
        }
        bVar.nk(this);
        i iVar = this.f148210m;
        (iVar != null ? iVar : null).f148631M.observe(this, new a.C4341a(new a()));
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.evidence_request.di.b bVar = this.f148211n;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}

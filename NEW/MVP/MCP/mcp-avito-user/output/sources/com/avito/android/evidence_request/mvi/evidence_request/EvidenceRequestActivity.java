package com.avito.android.evidence_request.mvi.evidence_request;

import Cd.r;
import Y41.l;
import Y61.k;
import Yz.InterfaceC18350b;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.C23060r0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EvidenceRequestScreen;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofType;
import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import com.avito.android.evidence_request.mvi.evidence_request.b;
import com.avito.android.evidence_request.mvi.evidence_request.mvi.entity.EvidenceRequestState;
import com.avito.android.evidence_request.mvi.proof_types.ProofTypesFragment;
import com.avito.android.remote.ModerationEvidence;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EvidenceRequestActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/EvidenceRequestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/evidence_request/mvi/evidence_request/di/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EvidenceRequestActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.evidence_request.mvi.evidence_request.di.b>, InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f149104r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public b.a f149105m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f149107o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.android.evidence_request.mvi.evidence_request.di.b f149108p;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f149106n = new O0(m0.f406844a.b(com.avito.android.evidence_request.mvi.evidence_request.b.class), new f(), new e(new h()), new g());

    /* renamed from: q, reason: collision with root package name */
    @k
    public final InterfaceC42726C f149109q = C42727D.c(new b());

    /* compiled from: EvidenceRequestActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/EvidenceRequestActivity$a;", "", "<init>", "()V", "", "KEY_APPEAL_ID", "Ljava/lang/String;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EvidenceRequestActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/evidence_request/mvi/domain/evidence_request/AppealId;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<AppealId> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final AppealId invoke() {
            Parcelable parcelableExtra = EvidenceRequestActivity.this.getIntent().getParcelableExtra("key_appeal_id");
            if (parcelableExtra != null) {
                return (AppealId) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: EvidenceRequestActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC18350b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC18350b interfaceC18350b) {
            InterfaceC18350b interfaceC18350b2 = interfaceC18350b;
            EvidenceRequestActivity evidenceRequestActivity = (EvidenceRequestActivity) this.receiver;
            a aVar = EvidenceRequestActivity.f149104r;
            evidenceRequestActivity.getClass();
            if (interfaceC18350b2 instanceof InterfaceC18350b.a) {
                if (((AppealId) evidenceRequestActivity.f149109q.getValue()).f148725d == ModerationEvidence.f253037e) {
                    ProofTypesFragment.a aVar2 = ProofTypesFragment.f149156s0;
                    EvidenceContent evidenceContent = ((InterfaceC18350b.a) interfaceC18350b2).f19753a;
                    aVar2.getClass();
                    ProofTypesFragment proofTypesFragmentA = ProofTypesFragment.a.a(evidenceContent);
                    androidx.fragment.app.H hE2 = evidenceRequestActivity.getSupportFragmentManager().e();
                    hE2.n(R.id.fragment_container, proofTypesFragmentA, "types");
                    hE2.c("types");
                    hE2.e();
                } else {
                    EvidenceContent evidenceContent2 = ((InterfaceC18350b.a) interfaceC18350b2).f19753a;
                    ProofType proofType = (ProofType) C42745f0.G(evidenceContent2.f148726b.f148737d);
                    String str = proofType != null ? proofType.f148733b : null;
                    ProofDetailsContent proofDetailsContent = (ProofDetailsContent) evidenceContent2.f148727c.get(str);
                    if (str == null || proofDetailsContent == null) {
                        evidenceRequestActivity.finish();
                    } else {
                        EvidenceDetailsFragment.f148738w0.getClass();
                        EvidenceDetailsFragment evidenceDetailsFragmentA = EvidenceDetailsFragment.a.a(str, proofDetailsContent);
                        androidx.fragment.app.H hE3 = evidenceRequestActivity.getSupportFragmentManager().e();
                        hE3.n(R.id.fragment_container, evidenceDetailsFragmentA, "details");
                        hE3.c("details");
                        hE3.e();
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceRequestActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<EvidenceRequestState, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f149111l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(EvidenceRequestState evidenceRequestState) {
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f149113m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f149113m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(EvidenceRequestActivity.this, this.f149113m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return EvidenceRequestActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return EvidenceRequestActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: EvidenceRequestActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/evidence_request/mvi/evidence_request/b;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/evidence_request/mvi/evidence_request/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements l<C23060r0, com.avito.android.evidence_request.mvi.evidence_request.b> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.evidence_request.mvi.evidence_request.b invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            b.a aVar = EvidenceRequestActivity.this.f149105m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.evidence_request_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.evidence_request.mvi.evidence_request.di.b bVarA = com.avito.android.evidence_request.mvi.evidence_request.di.a.a().a((com.avito.android.evidence_request.mvi.evidence_request.di.c) C29972i.a(C29972i.b(this), com.avito.android.evidence_request.mvi.evidence_request.di.c.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), new C28478k(EvidenceRequestScreen.f90350d, s.a(this), null, 4, null), this, (AppealId) this.f149109q.getValue(), getResources());
        this.f149108p = bVarA;
        bVarA.zd(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f149107o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
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
        ScreenPerformanceTracker screenPerformanceTracker = this.f149107o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f149107o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, (com.avito.android.evidence_request.mvi.evidence_request.b) this.f149106n.getValue(), new c(1, this, EvidenceRequestActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestOneTimeEvent;)V", 0), d.f149111l);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f149107o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.evidence_request.mvi.evidence_request.di.b bVar = this.f149108p;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}

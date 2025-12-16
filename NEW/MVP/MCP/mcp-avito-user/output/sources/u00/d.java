package U00;

import JZ.o;
import MZ.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.mortgage.api.model.PreApprovalScoreStatus;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import g00.C40508e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PreApprovalResultAnalyticsHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU00/d;", "LU00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f16075a;

    /* compiled from: PreApprovalResultAnalyticsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16076a;

        static {
            int[] iArr = new int[PreApprovalScoreStatus.values().length];
            try {
                iArr[PreApprovalScoreStatus.HIGH_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreApprovalScoreStatus.CAN_IMPROVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreApprovalScoreStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16076a = iArr;
        }
    }

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a) {
        this.f16075a = interfaceC28373a;
    }

    @Override // U00.c
    public final void a(@k PreApprovalResultInternalAction preApprovalResultInternalAction, @k X00.a aVar) {
        l f18110f;
        InterfaceC28464o bVar;
        boolean z12 = preApprovalResultInternalAction instanceof PreApprovalResultInternalAction.ScoreLoadingStarted;
        InterfaceC28373a interfaceC28373a = this.f16075a;
        if (z12) {
            interfaceC28373a.c(new f(aVar.getF18112h()));
            return;
        }
        U00.a aVar2 = null;
        aVar2 = null;
        if (preApprovalResultInternalAction instanceof PreApprovalResultInternalAction.TimerTick) {
            if (C40508e.b(((PreApprovalResultInternalAction.TimerTick) preApprovalResultInternalAction).f202134b) > 0.0f) {
                return;
            }
            o f18111g = aVar.getF18111g();
            PreApprovalScoreStatus status = f18111g != null ? f18111g.getStatus() : null;
            int i12 = status == null ? -1 : a.f16076a[status.ordinal()];
            if (i12 == -1) {
                bVar = new b();
            } else if (i12 == 1) {
                bVar = new K00.b(5);
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new b();
            } else {
                bVar = new K00.b(6);
            }
            interfaceC28373a.c(bVar);
            return;
        }
        if (!(preApprovalResultInternalAction instanceof PreApprovalResultInternalAction.GetApplicationLoadingStarted)) {
            if (!(preApprovalResultInternalAction instanceof PreApprovalResultInternalAction.Retry) || (f18110f = aVar.getF18110f()) == null) {
                return;
            }
            interfaceC28373a.c(new K00.a(f18110f.getPropertyCost(), f18110f.getLandCost(), f18110f.getDownPayment(), f18110f.getCreditTerm(), f18110f.getIncome(), f18110f.getPurposeId(), f18110f.getRegionId(), f18110f.getBorrowerAge(), f18110f.getProofOfIncome(), f18110f.getOccupation(), f18110f.getLandingCurrentExperience(), "try_again"));
            return;
        }
        o f18111g2 = aVar.getF18111g();
        PreApprovalScoreStatus status2 = f18111g2 != null ? f18111g2.getStatus() : null;
        int i13 = status2 == null ? -1 : a.f16076a[status2.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                aVar2 = new U00.a("pre_offer_found");
            } else if (i13 == 2) {
                aVar2 = new U00.a("pre_offer_not_found");
            } else if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (aVar2 != null) {
            interfaceC28373a.c(aVar2);
        }
    }
}

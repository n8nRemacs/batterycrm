package com.avito.android.mortgage.pre_approval.result.mvi;

import JZ.o;
import W00.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.api.model.PreApprovalScoreStatus;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreApprovalResultActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LW00/a;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "LX00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<W00.a, PreApprovalResultInternalAction, X00.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.result.mvi.domain.a f202082a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.result.mvi.domain.d f202083b;

    /* compiled from: PreApprovalResultActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.result.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6002a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202084a;

        static {
            int[] iArr = new int[PreApprovalScoreStatus.values().length];
            try {
                iArr[PreApprovalScoreStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f202084a = iArr;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.mortgage.pre_approval.result.mvi.domain.a aVar, @Y61.k com.avito.android.mortgage.pre_approval.result.mvi.domain.d dVar) {
        this.f202082a = aVar;
        this.f202083b = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PreApprovalResultInternalAction> b(W00.a aVar, X00.a aVar2) {
        InterfaceC43160i<PreApprovalResultInternalAction> interfaceC43160iG;
        W00.a aVar3 = aVar;
        X00.a aVar4 = aVar2;
        if (aVar3 instanceof a.C1219a) {
            return new C43210w(PreApprovalResultInternalAction.CloseFlow.f202121b);
        }
        if (aVar3 instanceof a.b) {
            return new C43210w(PreApprovalResultInternalAction.CloseFlow.f202121b);
        }
        if (!(aVar3 instanceof a.c)) {
            if (aVar3 instanceof a.d) {
                return new C43210w(PreApprovalResultInternalAction.ToggleExpandableBlock.f202135b);
            }
            throw new NoWhenBranchMatchedException();
        }
        o f18111g = aVar4.getF18111g();
        PreApprovalScoreStatus status = f18111g != null ? f18111g.getStatus() : null;
        int i12 = status == null ? -1 : C6002a.f202084a[status.ordinal()];
        if (i12 == -1 || i12 == 1) {
            interfaceC43160iG = C43175k.G(new b(this, aVar4, null));
        } else {
            MZ.l f18110f = aVar4.getF18110f();
            interfaceC43160iG = this.f202082a.a(f18110f != null ? f18110f.l() : null);
        }
        return interfaceC43160iG;
    }
}

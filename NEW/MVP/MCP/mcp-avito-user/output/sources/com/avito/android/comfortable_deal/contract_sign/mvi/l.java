package com.avito.android.comfortable_deal.contract_sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import pp.C47122c;

/* compiled from: ContractSignReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lpp/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<ContractSignInternalAction, C47122c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47122c a(ContractSignInternalAction contractSignInternalAction, C47122c c47122c) {
        ContractSignInternalAction contractSignInternalAction2 = contractSignInternalAction;
        C47122c c47122c2 = c47122c;
        return contractSignInternalAction2 instanceof ContractSignInternalAction.LoadingOffer ? C47122c.a(c47122c2, null, false, true, 23) : contractSignInternalAction2 instanceof ContractSignInternalAction.LoadedOffer ? C47122c.a(c47122c2, ((ContractSignInternalAction.LoadedOffer) contractSignInternalAction2).f120861b, false, false, 22) : contractSignInternalAction2 instanceof ContractSignInternalAction.FailedOffer ? c47122c2 : contractSignInternalAction2 instanceof ContractSignInternalAction.StartLoading ? C47122c.a(c47122c2, null, true, false, 27) : contractSignInternalAction2 instanceof ContractSignInternalAction.ContractSigned ? C47122c.a(c47122c2, null, false, false, 11) : contractSignInternalAction2 instanceof ContractSignInternalAction.LoadingError ? C47122c.a(c47122c2, null, false, false, 27) : c47122c2;
    }
}

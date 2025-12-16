package com.avito.android.comfortable_deal.contract_sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pp.InterfaceC47121b;

/* compiled from: ContractSignOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lpp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<ContractSignInternalAction, InterfaceC47121b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47121b b(ContractSignInternalAction contractSignInternalAction) {
        ContractSignInternalAction contractSignInternalAction2 = contractSignInternalAction;
        if (contractSignInternalAction2 instanceof ContractSignInternalAction.OpenContractLink) {
            return new InterfaceC47121b.d(((ContractSignInternalAction.OpenContractLink) contractSignInternalAction2).f120865b);
        }
        if (contractSignInternalAction2 instanceof ContractSignInternalAction.LoadingError) {
            String message = ((ContractSignInternalAction.LoadingError) contractSignInternalAction2).f120862b.getMessage();
            String str = message.length() > 0 ? message : null;
            return new InterfaceC47121b.e(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.comfortable_deal_common_error, new Serializable[0]));
        }
        if (contractSignInternalAction2 instanceof ContractSignInternalAction.FailedOffer) {
            return InterfaceC47121b.C12290b.f428768a;
        }
        if (contractSignInternalAction2 instanceof ContractSignInternalAction.OpenClientsFragment) {
            return InterfaceC47121b.c.f428769a;
        }
        if (contractSignInternalAction2 instanceof ContractSignInternalAction.NavigateBack) {
            return InterfaceC47121b.a.f428767a;
        }
        return null;
    }
}

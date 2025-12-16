package com.avito.android.tariff.cpr.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import gB0.InterfaceC40567b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CprConfigureAdvanceOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceInternalAction;", "LgB0/b;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<CprConfigureAdvanceInternalAction, InterfaceC40567b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40567b b(CprConfigureAdvanceInternalAction cprConfigureAdvanceInternalAction) {
        InterfaceC40567b cVar;
        CprConfigureAdvanceInternalAction cprConfigureAdvanceInternalAction2 = cprConfigureAdvanceInternalAction;
        if (cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.Close) {
            return InterfaceC40567b.a.f396368a;
        }
        if (cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.Error.OnScreenError) {
            return new InterfaceC40567b.d();
        }
        if (cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.FinishFlowWithDeepLink) {
            cVar = new InterfaceC40567b.C11195b(((CprConfigureAdvanceInternalAction.FinishFlowWithDeepLink) cprConfigureAdvanceInternalAction2).f295468b);
        } else {
            if (!(cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.HandleDeeplink)) {
                return null;
            }
            CprConfigureAdvanceInternalAction.HandleDeeplink handleDeeplink = (CprConfigureAdvanceInternalAction.HandleDeeplink) cprConfigureAdvanceInternalAction2;
            cVar = new InterfaceC40567b.c(handleDeeplink.f295469b, handleDeeplink.f295470c);
        }
        return cVar;
    }
}

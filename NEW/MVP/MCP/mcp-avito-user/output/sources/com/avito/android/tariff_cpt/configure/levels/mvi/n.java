package com.avito.android.tariff_cpt.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import qC0.InterfaceC47280b;

/* compiled from: TariffCptConfigureLevelsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "LqC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<TariffCptConfigureLevelsInternalAction, InterfaceC47280b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47280b b(TariffCptConfigureLevelsInternalAction tariffCptConfigureLevelsInternalAction) {
        InterfaceC47280b cVar;
        TariffCptConfigureLevelsInternalAction tariffCptConfigureLevelsInternalAction2 = tariffCptConfigureLevelsInternalAction;
        if (tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Close) {
            return InterfaceC47280b.a.f429113a;
        }
        if (tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.FinishFlowWithDeepLink) {
            cVar = new InterfaceC47280b.C12314b(((TariffCptConfigureLevelsInternalAction.FinishFlowWithDeepLink) tariffCptConfigureLevelsInternalAction2).f297898b);
        } else {
            if (!(tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.HandleDeeplink)) {
                return null;
            }
            TariffCptConfigureLevelsInternalAction.HandleDeeplink handleDeeplink = (TariffCptConfigureLevelsInternalAction.HandleDeeplink) tariffCptConfigureLevelsInternalAction2;
            cVar = new InterfaceC47280b.c(handleDeeplink.f297899b, handleDeeplink.f297900c);
        }
        return cVar;
    }
}

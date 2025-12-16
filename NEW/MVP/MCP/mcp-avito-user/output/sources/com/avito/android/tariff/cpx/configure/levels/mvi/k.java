package com.avito.android.tariff.cpx.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff.cpx.configure.levels.mvi.entity.TariffCpxConfigureLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import sB0.d;

/* compiled from: TariffCpxConfigureLevelsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "LsB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<TariffCpxConfigureLevelsInternalAction, sB0.d> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final sB0.d b(TariffCpxConfigureLevelsInternalAction tariffCpxConfigureLevelsInternalAction) {
        sB0.d cVar;
        TariffCpxConfigureLevelsInternalAction tariffCpxConfigureLevelsInternalAction2 = tariffCpxConfigureLevelsInternalAction;
        if (tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.Close) {
            return d.a.f437518a;
        }
        if (tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.FinishFlowWithDeepLink) {
            cVar = new d.b(((TariffCpxConfigureLevelsInternalAction.FinishFlowWithDeepLink) tariffCpxConfigureLevelsInternalAction2).f296212b);
        } else {
            if (!(tariffCpxConfigureLevelsInternalAction2 instanceof TariffCpxConfigureLevelsInternalAction.HandleDeeplink)) {
                return null;
            }
            TariffCpxConfigureLevelsInternalAction.HandleDeeplink handleDeeplink = (TariffCpxConfigureLevelsInternalAction.HandleDeeplink) tariffCpxConfigureLevelsInternalAction2;
            cVar = new d.c(handleDeeplink.f296213b, handleDeeplink.f296214c);
        }
        return cVar;
    }
}

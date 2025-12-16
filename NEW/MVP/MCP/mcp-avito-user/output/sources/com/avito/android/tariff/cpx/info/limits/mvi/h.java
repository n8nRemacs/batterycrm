package com.avito.android.tariff.cpx.info.limits.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff.cpx.info.limits.mvi.entity.TariffCpxInfoLimitsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vB0.b;

/* compiled from: TariffCpxInfoLimitsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "LvB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TariffCpxInfoLimitsInternalAction, vB0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final vB0.b b(TariffCpxInfoLimitsInternalAction tariffCpxInfoLimitsInternalAction) {
        TariffCpxInfoLimitsInternalAction tariffCpxInfoLimitsInternalAction2 = tariffCpxInfoLimitsInternalAction;
        if (tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.Close) {
            return b.a.f440520a;
        }
        if (tariffCpxInfoLimitsInternalAction2 instanceof TariffCpxInfoLimitsInternalAction.HandleDeeplink) {
            return new b.C12749b();
        }
        return null;
    }
}

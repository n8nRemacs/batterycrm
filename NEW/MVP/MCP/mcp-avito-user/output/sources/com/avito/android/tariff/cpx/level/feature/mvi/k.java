package com.avito.android.tariff.cpx.level.feature.mvi;

import EB0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.level.feature.mvi.entity.TariffCpxLevelFeatureInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxLevelFeatureOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "LEB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<TariffCpxLevelFeatureInternalAction, EB0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final EB0.b b(TariffCpxLevelFeatureInternalAction tariffCpxLevelFeatureInternalAction) {
        DeepLink deepLink;
        EB0.b cVar;
        TariffCpxLevelFeatureInternalAction tariffCpxLevelFeatureInternalAction2 = tariffCpxLevelFeatureInternalAction;
        if (tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.Close) {
            return b.a.f3864a;
        }
        if (!(tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.Error.OnScreenError)) {
            if (tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.FinishFlowWithDeepLink) {
                DeepLink deepLink2 = ((TariffCpxLevelFeatureInternalAction.FinishFlowWithDeepLink) tariffCpxLevelFeatureInternalAction2).f296988b;
                if (deepLink2 != null) {
                    cVar = new b.C0222b(deepLink2);
                }
                return null;
            }
            if ((tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.HandleDeeplink) && (deepLink = ((TariffCpxLevelFeatureInternalAction.HandleDeeplink) tariffCpxLevelFeatureInternalAction2).f296989b) != null) {
                cVar = new b.c(deepLink);
            }
            return null;
        }
        cVar = new b.d(((TariffCpxLevelFeatureInternalAction.Error.OnScreenError) tariffCpxLevelFeatureInternalAction2).f296986b);
        return cVar;
    }
}

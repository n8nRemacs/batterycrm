package com.avito.android.tariff.cpx.level.feature.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff.cpx.level.feature.mvi.entity.TariffCpxLevelFeatureInternalAction;
import com.avito.android.tariff.deeplink.TariffCpxLevelFeatureBody;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxLevelFeatureReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "LEB0/c;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<TariffCpxLevelFeatureInternalAction, EB0.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final EB0.c a(TariffCpxLevelFeatureInternalAction tariffCpxLevelFeatureInternalAction, EB0.c cVar) {
        TariffCpxLevelFeatureInternalAction tariffCpxLevelFeatureInternalAction2 = tariffCpxLevelFeatureInternalAction;
        EB0.c cVar2 = cVar;
        if (!(tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.OpenScreen)) {
            return tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.Error.ScreenError ? EB0.c.a(cVar2, ((TariffCpxLevelFeatureInternalAction.Error.ScreenError) tariffCpxLevelFeatureInternalAction2).f296986b, false) : tariffCpxLevelFeatureInternalAction2 instanceof TariffCpxLevelFeatureInternalAction.ProgressChange ? EB0.c.a(cVar2, null, ((TariffCpxLevelFeatureInternalAction.ProgressChange) tariffCpxLevelFeatureInternalAction2).f296991b) : cVar2;
        }
        TariffCpxLevelFeatureBody tariffCpxLevelFeatureBody = ((TariffCpxLevelFeatureInternalAction.OpenScreen) tariffCpxLevelFeatureInternalAction2).f296990b.f296972b;
        return new EB0.c(tariffCpxLevelFeatureBody.getText(), tariffCpxLevelFeatureBody.getImage(), tariffCpxLevelFeatureBody.getButton(), null, false);
    }
}

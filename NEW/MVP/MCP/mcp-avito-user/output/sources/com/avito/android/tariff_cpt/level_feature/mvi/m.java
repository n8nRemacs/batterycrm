package com.avito.android.tariff_cpt.level_feature.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff_cpt.level_feature.deeplink.TariffCptLevelFeatureLink;
import com.avito.android.tariff_cpt.level_feature.mvi.entity.TariffCptLevelFeatureInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptLevelFeaturesReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "LDC0/c;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<TariffCptLevelFeatureInternalAction, DC0.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final DC0.c a(TariffCptLevelFeatureInternalAction tariffCptLevelFeatureInternalAction, DC0.c cVar) {
        TariffCptLevelFeatureInternalAction tariffCptLevelFeatureInternalAction2 = tariffCptLevelFeatureInternalAction;
        DC0.c cVar2 = cVar;
        if (!(tariffCptLevelFeatureInternalAction2 instanceof TariffCptLevelFeatureInternalAction.OpenScreen)) {
            return tariffCptLevelFeatureInternalAction2 instanceof TariffCptLevelFeatureInternalAction.Error.ScreenError ? DC0.c.a(cVar2, ((TariffCptLevelFeatureInternalAction.Error.ScreenError) tariffCptLevelFeatureInternalAction2).f298484b, false) : tariffCptLevelFeatureInternalAction2 instanceof TariffCptLevelFeatureInternalAction.ProgressChange ? DC0.c.a(cVar2, null, ((TariffCptLevelFeatureInternalAction.ProgressChange) tariffCptLevelFeatureInternalAction2).f298489b) : cVar2;
        }
        TariffCptLevelFeatureLink.Body body = ((TariffCptLevelFeatureInternalAction.OpenScreen) tariffCptLevelFeatureInternalAction2).f298488b.f298470b;
        return new DC0.c(body.getText(), body.getImage(), body.getButton(), null, false);
    }
}

package com.avito.android.tariff_lf_publication.level.mvi;

import UD0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff_lf_publication.level.mvi.entity.TariffLfPublicationLevelInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationLevelOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_publication/level/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_lf_publication/level/mvi/entity/TariffLfPublicationLevelInternalAction;", "LUD0/b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<TariffLfPublicationLevelInternalAction, UD0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final UD0.b b(TariffLfPublicationLevelInternalAction tariffLfPublicationLevelInternalAction) {
        TariffLfPublicationLevelInternalAction tariffLfPublicationLevelInternalAction2 = tariffLfPublicationLevelInternalAction;
        if (tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.Back) {
            return b.a.f16273a;
        }
        if (!(tariffLfPublicationLevelInternalAction2 instanceof TariffLfPublicationLevelInternalAction.HandleDeeplink)) {
            return null;
        }
        TariffLfPublicationLevelInternalAction.HandleDeeplink handleDeeplink = (TariffLfPublicationLevelInternalAction.HandleDeeplink) tariffLfPublicationLevelInternalAction2;
        return new b.C1109b(handleDeeplink.f300931c, handleDeeplink.f300930b);
    }
}

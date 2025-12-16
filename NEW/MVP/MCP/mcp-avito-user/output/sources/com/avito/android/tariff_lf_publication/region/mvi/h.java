package com.avito.android.tariff_lf_publication.region.mvi;

import VD0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationRegionOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "LVD0/b;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<TariffLfPublicationRegionInternalAction, VD0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final VD0.b b(TariffLfPublicationRegionInternalAction tariffLfPublicationRegionInternalAction) {
        VD0.b cVar;
        TariffLfPublicationRegionInternalAction tariffLfPublicationRegionInternalAction2 = tariffLfPublicationRegionInternalAction;
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.Close) {
            return b.a.f17014a;
        }
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.HandleDeeplink) {
            TariffLfPublicationRegionInternalAction.HandleDeeplink handleDeeplink = (TariffLfPublicationRegionInternalAction.HandleDeeplink) tariffLfPublicationRegionInternalAction2;
            cVar = new b.C1167b(handleDeeplink.f301108b, handleDeeplink.f301109c);
        } else {
            if (!(tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.ShowSimpleDeeplinkLoading)) {
                return null;
            }
            cVar = new b.c(((TariffLfPublicationRegionInternalAction.ShowSimpleDeeplinkLoading) tariffLfPublicationRegionInternalAction2).f301110b);
        }
        return cVar;
    }
}

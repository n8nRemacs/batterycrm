package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import ab.InterfaceC19856b;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailStatsMVIOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIInternalAction;", "Lab/b;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements t<AdvertDetailStatsMVIInternalAction, InterfaceC19856b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19856b b(AdvertDetailStatsMVIInternalAction advertDetailStatsMVIInternalAction) {
        AdvertDetailStatsMVIInternalAction advertDetailStatsMVIInternalAction2 = advertDetailStatsMVIInternalAction;
        if (advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.SetSelectedPeriod) {
            AdvertDetailStatsMVIInternalAction.SetSelectedPeriod setSelectedPeriod = (AdvertDetailStatsMVIInternalAction.SetSelectedPeriod) advertDetailStatsMVIInternalAction2;
            return new InterfaceC19856b.C1498b(setSelectedPeriod.f86107b, setSelectedPeriod.f86108c, setSelectedPeriod.f86109d);
        }
        if (advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.OnSelectTab) {
            return new InterfaceC19856b.c(((AdvertDetailStatsMVIInternalAction.OnSelectTab) advertDetailStatsMVIInternalAction2).f86106b);
        }
        if (!(advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.Content) && !(advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.Error)) {
            if (advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.HandleDeeplink) {
                return new InterfaceC19856b.a(((AdvertDetailStatsMVIInternalAction.HandleDeeplink) advertDetailStatsMVIInternalAction2).f86105b);
            }
            if (!(advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.Loading)) {
                if (advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.OpenAdvertDetails) {
                    return InterfaceC19856b.d.f21010a;
                }
                if (advertDetailStatsMVIInternalAction2 instanceof AdvertDetailStatsMVIInternalAction.ShowUxFeedback) {
                    return InterfaceC19856b.e.f21011a;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}

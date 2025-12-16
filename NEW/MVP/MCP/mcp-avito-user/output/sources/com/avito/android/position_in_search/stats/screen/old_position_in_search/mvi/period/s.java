package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PeriodInfoEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LX80/d;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.arch.mvi.t<PeriodInfoInternalAction, X80.d> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final X80.d b(PeriodInfoInternalAction periodInfoInternalAction) {
        X80.d bVar;
        PeriodInfoInternalAction periodInfoInternalAction2 = periodInfoInternalAction;
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ExpandQueryItem ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingError ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingResult ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.LoadingStart ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.NextPage ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.NoChange ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.BannerClosed ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ToastClosed ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.ChangeSortItem ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.Sort ? true : periodInfoInternalAction2 instanceof PeriodInfoInternalAction.PeriodSelected) {
            return null;
        }
        if (periodInfoInternalAction2 instanceof PeriodInfoInternalAction.OpenDeepLink) {
            bVar = new d.a(((PeriodInfoInternalAction.OpenDeepLink) periodInfoInternalAction2).f220608b);
        } else {
            if (!(periodInfoInternalAction2 instanceof PeriodInfoInternalAction.OpenSortDeepLink)) {
                throw new NoWhenBranchMatchedException();
            }
            PeriodInfoInternalAction.OpenSortDeepLink openSortDeepLink = (PeriodInfoInternalAction.OpenSortDeepLink) periodInfoInternalAction2;
            bVar = new d.b(openSortDeepLink.f220609b, openSortDeepLink.f220610c);
        }
        return bVar;
    }
}

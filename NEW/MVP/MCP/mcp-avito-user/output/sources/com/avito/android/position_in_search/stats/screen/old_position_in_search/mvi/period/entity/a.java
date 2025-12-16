package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity;

import Y61.k;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PeriodInfoInternalAction.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @k
    public static final PeriodInfoInternalAction.Sort a(@k PeriodInfoInternalAction.LoadingAction loadingAction) {
        if (loadingAction instanceof PeriodInfoInternalAction.LoadingError) {
            return new PeriodInfoInternalAction.Sort.LoadingError((PeriodInfoInternalAction.LoadingError) loadingAction);
        }
        if (loadingAction instanceof PeriodInfoInternalAction.LoadingResult) {
            return new PeriodInfoInternalAction.Sort.LoadingResult((PeriodInfoInternalAction.LoadingResult) loadingAction);
        }
        if (loadingAction instanceof PeriodInfoInternalAction.LoadingStart) {
            return new PeriodInfoInternalAction.Sort.LoadingStart((PeriodInfoInternalAction.LoadingStart) loadingAction);
        }
        throw new NoWhenBranchMatchedException();
    }
}

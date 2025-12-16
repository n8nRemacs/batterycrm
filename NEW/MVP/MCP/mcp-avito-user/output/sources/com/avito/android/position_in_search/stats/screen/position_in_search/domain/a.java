package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PositionInSearchByPeriodUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {
    @Y61.k
    InterfaceC43160i<PositionInSearchInternalAction> a(@Y61.k PeriodType periodType, @Y61.l Long l12, @Y61.k PositionInfoPeriodAction positionInfoPeriodAction);
}

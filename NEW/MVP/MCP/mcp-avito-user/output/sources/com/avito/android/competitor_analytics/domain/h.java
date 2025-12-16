package com.avito.android.competitor_analytics.domain;

import Y61.k;
import Y61.l;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.State;
import com.avito.android.competitor_analytics.mvi.entity.b;
import dr.C39787b;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsV2Mapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/h;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h {
    @k
    State a(@k StateType stateType);

    @l
    b.k b(@k C39787b c39787b);

    @l
    b.i c(@k C39787b c39787b);

    @l
    b.a d(@k C39787b c39787b);

    @l
    b.e e(@k C39787b c39787b);

    @k
    ArrayList f(@k C39787b c39787b);

    @l
    b.d g(@k C39787b c39787b);

    @l
    b.h h(@k C39787b c39787b);
}

package com.avito.android.competitor_analytics.domain;

import Y61.k;
import Y61.l;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.State;
import com.avito.android.competitor_analytics.mvi.entity.b;
import cr.C39401b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/a;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @k
    State a(@k StateType stateType);

    @l
    b.h b(@k C39401b c39401b);

    @k
    b.f c(@k C39401b c39401b);

    @l
    b.j d(@k C39401b c39401b);

    @l
    b.a e(@k C39401b c39401b);

    @l
    b.e f(@k C39401b c39401b);

    @k
    b.c g(@k C39401b c39401b);
}

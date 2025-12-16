package com.avito.android.developments_agency_search.analytics;

import Y61.k;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: AnalyticsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/analytics/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @k
    String a(@k Tab tab, @k DevelopmentSort developmentSort, @k LotSort lotSort);

    @k
    SearchType b(@k Tab tab);

    @k
    String c(@k SearchParams searchParams);
}

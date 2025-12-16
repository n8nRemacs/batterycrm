package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Lw.c;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderBy;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: RealtyAgencySearchConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @Y61.k
    String a(@Y61.k LotSort lotSort);

    @Y61.k
    Q<OrderBy, OrderDirection> b(@Y61.k LotSort lotSort);

    @Y61.k
    ArrayList c(@Y61.k c.e eVar);

    @Y61.k
    ArrayList d(@Y61.k ArrayList arrayList);

    @Y61.k
    ArrayList e(@Y61.k kotlin.enums.a aVar, @Y61.k DevelopmentSort developmentSort);

    @Y61.k
    String f(@Y61.k DevelopmentSort developmentSort);

    @Y61.k
    ArrayList g(@Y61.k kotlin.enums.a aVar, @Y61.k LotSort lotSort);

    @Y61.k
    ArrayList h(@Y61.l String str, @Y61.l List list);

    @Y61.k
    Q<com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection> i(@Y61.k DevelopmentSort developmentSort);
}

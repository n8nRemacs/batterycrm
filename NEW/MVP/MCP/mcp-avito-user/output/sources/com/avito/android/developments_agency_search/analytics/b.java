package com.avito.android.developments_agency_search.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.remote.model.MultiSelectSearchParam;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SplitSearchParam;
import com.avito.android.remote.model.StringSearchParam;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import org.json.JSONObject;

/* compiled from: AnalyticsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/analytics/b;", "Lcom/avito/android/developments_agency_search/analytics/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.analytics.a {

    /* compiled from: AnalyticsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f138450c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f138451d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DevelopmentSort.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DevelopmentSort.a aVar = DevelopmentSort.f138655b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DevelopmentSort.a aVar2 = DevelopmentSort.f138655b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DevelopmentSort.a aVar3 = DevelopmentSort.f138655b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DevelopmentSort.a aVar4 = DevelopmentSort.f138655b;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[LotSort.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                LotSort.a aVar5 = LotSort.f138659b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                LotSort.a aVar6 = LotSort.f138659b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.developments_agency_search.analytics.a
    @k
    public final String a(@k Tab tab, @k DevelopmentSort developmentSort, @k LotSort lotSort) {
        int iOrdinal = tab.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = lotSort.ordinal();
            if (iOrdinal2 == 0) {
                return "price_asc";
            }
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return "completion_date_asc";
            }
            return "price_desc";
        }
        int iOrdinal3 = developmentSort.ordinal();
        if (iOrdinal3 == 0) {
            return "development_view_count_desc";
        }
        if (iOrdinal3 == 1) {
            return "development_name_asc";
        }
        if (iOrdinal3 != 2) {
            if (iOrdinal3 == 3) {
                return "price_asc";
            }
            if (iOrdinal3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return "price_desc";
        }
        return "completion_date_asc";
    }

    @Override // com.avito.android.developments_agency_search.analytics.a
    @k
    public final SearchType b(@k Tab tab) {
        int iOrdinal = tab.ordinal();
        if (iOrdinal == 0) {
            return SearchType.f136331c;
        }
        if (iOrdinal == 1) {
            return SearchType.f136332d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.developments_agency_search.analytics.a
    @k
    public final String c(@k SearchParams searchParams) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String categoryId = searchParams.getCategoryId();
        if (categoryId != null) {
            linkedHashMap.put("categoryId", categoryId);
        }
        String locationId = searchParams.getLocationId();
        if (locationId != null) {
            linkedHashMap.put(SearchParamsConverterKt.LOCATION_ID, locationId);
        }
        Long priceMax = searchParams.getPriceMax();
        if (priceMax != null) {
            linkedHashMap.put(SearchParamsConverterKt.PRICE_MAX, String.valueOf(priceMax.longValue()));
        }
        Long priceMin = searchParams.getPriceMin();
        if (priceMin != null) {
            linkedHashMap.put(SearchParamsConverterKt.PRICE_MIN, String.valueOf(priceMin.longValue()));
        }
        List<String> districtId = searchParams.getDistrictId();
        if (districtId == null) {
            districtId = C42784z0.f406748b;
        }
        if (!districtId.isEmpty()) {
            linkedHashMap.put(SearchParamsConverterKt.DISTRICT_ID, districtId);
        }
        List<String> metroIds = searchParams.getMetroIds();
        if (metroIds == null) {
            metroIds = C42784z0.f406748b;
        }
        if (!metroIds.isEmpty()) {
            linkedHashMap.put(SearchParamsConverterKt.METRO_ID, metroIds);
        }
        Map<String, SearchParam<?>> params = searchParams.getParams();
        if (params == null) {
            params = P0.c();
        }
        for (Map.Entry<String, SearchParam<?>> entry : params.entrySet()) {
            String key = entry.getKey();
            SearchParam<?> value = entry.getValue();
            if (value instanceof StringSearchParam) {
                StringSearchParam stringSearchParam = (StringSearchParam) value;
                if (stringSearchParam.getValue().length() > 0) {
                    linkedHashMap.put(key, stringSearchParam.getValue());
                }
            } else if (value instanceof MultiSelectSearchParam) {
                linkedHashMap.put(key, ((MultiSelectSearchParam) value).getValue());
            } else if (value instanceof SplitSearchParam) {
                SplitSearchParam splitSearchParam = (SplitSearchParam) value;
                linkedHashMap.put(key, C35755b0.c(P0.g(new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, splitSearchParam.getValue().getFrom()), new Q(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, splitSearchParam.getValue().getTo()))));
            }
        }
        return new JSONObject(P0.q(linkedHashMap)).toString();
    }
}

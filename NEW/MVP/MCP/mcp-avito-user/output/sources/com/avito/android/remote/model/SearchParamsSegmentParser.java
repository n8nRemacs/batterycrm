package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchParamsSegmentParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsSegmentParser;", "", "()V", "FLAT_PARAMETER_VALUE", "", "FLAT_PERIOD_PARAMETER_ID", "HOTEL_CATEGORY_ID", "HOUSE_PARAMETER_VALUE", "HOUSE_PERIOD_PARAMETER_ID", "ROOM_PARAMETER_VALUE", "ROOM_PERIOD_PARAMETER_ID", "SEGMENT_AUTO_SELECT_VALUE", "SEGMENT_AVITO_FOR_BUSINESS_PARAMS_VALUE", "SEGMENT_AVITO_MALL_PARAMS_VALUE", "SEGMENT_PARAM_ID", "TRAVEL_MIXED_SEARCH_CATEGORY_ID", "defineSegmentParamValue", "Lcom/avito/android/remote/model/SearchParamsSegment;", "segmentParamValue", "fromParam", "searchParam", "Lcom/avito/android/remote/model/SearchParams;", "params", "", "mapStrSearchParamsToSegment", "searchParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamsSegmentParser {

    @k
    private static final String FLAT_PARAMETER_VALUE = "5257";

    @k
    private static final String FLAT_PERIOD_PARAMETER_ID = "504";

    @k
    private static final String HOTEL_CATEGORY_ID = "338";

    @k
    private static final String HOUSE_PARAMETER_VALUE = "5477";

    @k
    private static final String HOUSE_PERIOD_PARAMETER_ID = "528";

    @k
    public static final SearchParamsSegmentParser INSTANCE = new SearchParamsSegmentParser();

    @k
    private static final String ROOM_PARAMETER_VALUE = "6204";

    @k
    private static final String ROOM_PERIOD_PARAMETER_ID = "596";

    @k
    private static final String SEGMENT_AUTO_SELECT_VALUE = "3285555";

    @k
    private static final String SEGMENT_AVITO_FOR_BUSINESS_PARAMS_VALUE = "3266344";

    @k
    private static final String SEGMENT_AVITO_MALL_PARAMS_VALUE = "3261159";

    @k
    private static final String SEGMENT_PARAM_ID = "156912";

    @k
    private static final String TRAVEL_MIXED_SEARCH_CATEGORY_ID = "442";

    private SearchParamsSegmentParser() {
    }

    private final SearchParamsSegment defineSegmentParamValue(Object segmentParamValue) {
        return L.f(segmentParamValue, SEGMENT_AVITO_MALL_PARAMS_VALUE) ? SearchParamsSegment.AvitoMall : L.f(segmentParamValue, SEGMENT_AVITO_FOR_BUSINESS_PARAMS_VALUE) ? SearchParamsSegment.AvitoForBusiness : L.f(segmentParamValue, SEGMENT_AUTO_SELECT_VALUE) ? SearchParamsSegment.AutoSelect : SearchParamsSegment.UnSpecified;
    }

    private final SearchParamsSegment mapStrSearchParamsToSegment(SearchParams searchParams) {
        SearchParam<?> searchParam;
        SearchParam<?> searchParam2;
        SearchParam<?> searchParam3;
        Map<String, SearchParam<?>> params = searchParams.getParams();
        if (!L.f((params == null || (searchParam3 = params.get(FLAT_PERIOD_PARAMETER_ID)) == null) ? null : searchParam3.getValue(), FLAT_PARAMETER_VALUE)) {
            Map<String, SearchParam<?>> params2 = searchParams.getParams();
            if (!L.f((params2 == null || (searchParam2 = params2.get(HOUSE_PERIOD_PARAMETER_ID)) == null) ? null : searchParam2.getValue(), HOUSE_PARAMETER_VALUE)) {
                Map<String, SearchParam<?>> params3 = searchParams.getParams();
                if (!L.f((params3 == null || (searchParam = params3.get(ROOM_PERIOD_PARAMETER_ID)) == null) ? null : searchParam.getValue(), ROOM_PARAMETER_VALUE) && !L.f(searchParams.getCategoryId(), HOTEL_CATEGORY_ID) && !L.f(searchParams.getCategoryId(), TRAVEL_MIXED_SEARCH_CATEGORY_ID)) {
                    return null;
                }
            }
        }
        return SearchParamsSegment.AvitoTravel;
    }

    @k
    public final SearchParamsSegment fromParam(@k SearchParams searchParam) {
        SearchParam<?> searchParam2;
        SearchParamsSegment searchParamsSegmentMapStrSearchParamsToSegment = mapStrSearchParamsToSegment(searchParam);
        if (searchParamsSegmentMapStrSearchParamsToSegment != null) {
            return searchParamsSegmentMapStrSearchParamsToSegment;
        }
        Map<String, SearchParam<?>> params = searchParam.getParams();
        return defineSegmentParamValue((params == null || (searchParam2 = params.get(SEGMENT_PARAM_ID)) == null) ? null : searchParam2.getValue());
    }

    @k
    public final SearchParamsSegment fromParam(@l Map<String, ? extends Object> params) {
        if (params != null && !params.isEmpty()) {
            return defineSegmentParamValue(params.get("params[156912]"));
        }
        return SearchParamsSegment.UnSpecified;
    }
}

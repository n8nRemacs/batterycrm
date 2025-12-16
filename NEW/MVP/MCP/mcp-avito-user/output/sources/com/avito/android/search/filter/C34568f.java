package com.avito.android.search.filter;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: CombineSearchParamsUseCase.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/f;", "Lcom/avito/android/search/filter/e;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34568f implements InterfaceC34565e {
    @Inject
    public C34568f() {
    }

    public static boolean b(String str, List list) {
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }

    @Override // com.avito.android.search.filter.InterfaceC34565e
    @Y61.k
    public final SearchParams a(@Y61.k SearchParams searchParams, @Y61.k SearchParams searchParams2, @Y61.l List<String> list) {
        ArrayList arrayList;
        Set<String> setKeySet;
        Map<String, SearchParam<?>> params;
        SearchParam<?> searchParam;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            List<String> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (String strA0 : list2) {
                if (C43066x.q(strA0, "params", false)) {
                    strA0 = C43066x.a0(C43066x.a0(androidx.compose.foundation.H.k("[A-Za-z]", strA0, ""), "[", "", false), "]", "", false);
                }
                arrayList.add(strA0);
            }
        } else {
            arrayList = null;
        }
        Map<String, SearchParam<?>> params2 = searchParams.getParams();
        if (params2 != null && (setKeySet = params2.keySet()) != null) {
            for (String str : setKeySet) {
                if (!b(str, arrayList) && (params = searchParams.getParams()) != null && (searchParam = params.get(str)) != null) {
                    linkedHashMap.put(str, searchParam);
                }
            }
        }
        Map<String, SearchParam<?>> params3 = searchParams2.getParams();
        if (params3 != null) {
            linkedHashMap.putAll(params3);
        }
        return searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : b(SearchParamsConverterKt.GEO_COORDS, list) ? searchParams2.getGeoCoords() : searchParams.getGeoCoords(), ((-1234173943) & 4) != 0 ? searchParams2.locationId : b(SearchParamsConverterKt.LOCATION_ID, list) ? searchParams2.getLocationId() : searchParams.getLocationId(), ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : b(SearchParamsConverterKt.METRO_ID, list) ? searchParams2.getMetroIds() : searchParams.getMetroIds(), ((-1234173943) & 32) != 0 ? searchParams2.directionId : b(SearchParamsConverterKt.DIRECTION_ID, list) ? searchParams2.getDirectionId() : searchParams.getDirectionId(), ((-1234173943) & 64) != 0 ? searchParams2.districtId : b(SearchParamsConverterKt.DISTRICT_ID, list) ? searchParams2.getDistrictId() : searchParams.getDistrictId(), ((-1234173943) & 128) != 0 ? searchParams2.params : linkedHashMap, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : b(SearchParamsConverterKt.PRICE_MAX, list) ? searchParams2.getPriceMax() : searchParams.getPriceMax(), ((-1234173943) & 512) != 0 ? searchParams2.priceMin : b(SearchParamsConverterKt.PRICE_MIN, list) ? searchParams2.getPriceMin() : searchParams.getPriceMin(), ((-1234173943) & 1024) != 0 ? searchParams2.query : b("query", list) ? searchParams2.getQuery() : searchParams.getQuery(), ((-1234173943) & 2048) != 0 ? searchParams2.title : b("title", list) ? searchParams2.getTitle() : searchParams.getTitle(), ((-1234173943) & 4096) != 0 ? searchParams2.owner : b(SearchParamsConverterKt.OWNER, list) ? searchParams2.getOwner() : searchParams.getOwner(), ((-1234173943) & 8192) != 0 ? searchParams2.sort : b(SearchParamsConverterKt.SORT, list) ? searchParams2.getSort() : searchParams.getSort(), ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : b(SearchParamsConverterKt.WITH_IMAGES_ONLY, list) ? searchParams2.getWithImagesOnly() : searchParams.getWithImagesOnly(), ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : b("searchRadius", list) ? searchParams2.getSearchRadius() : searchParams.getSearchRadius(), ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : b("radius", list) ? searchParams2.getRadius() : searchParams.getRadius(), ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : b(SearchParamsConverterKt.FOOT_WALKING_METRO, list) ? searchParams2.getFootWalkingMetro() : searchParams.getFootWalkingMetro(), ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : b(SearchParamsConverterKt.WITH_DELIVERY_ONLY, list) ? searchParams2.getWithDeliveryOnly() : searchParams.getWithDeliveryOnly(), ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : b("localPriority", list) ? searchParams2.getLocalPriority() : searchParams.getLocalPriority(), ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : b(SearchParamsConverterKt.EXPANDED, list) ? searchParams2.getExpanded() : searchParams.getExpanded(), ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : b(SearchParamsConverterKt.SELLER_ID, list) ? searchParams2.getSellerId() : searchParams.getSellerId(), ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : b(SearchParamsConverterKt.SHOP_ID, list) ? searchParams2.getShopId() : searchParams.getShopId(), ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : b(SearchParamsConverterKt.SOURCE, list) ? searchParams2.getSource() : searchParams.getSource(), ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : b(SearchParamsConverterKt.DRAW_ID, list) ? searchParams2.getDrawId() : searchParams.getDrawId());
    }
}

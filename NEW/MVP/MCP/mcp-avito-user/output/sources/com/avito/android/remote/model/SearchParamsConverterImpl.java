package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.search.map.AreaKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SearchParamsConverter.kt */
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000f\u001a\u00020\u000e*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\n*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JX\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0015\u001a\u00020\u00142!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsConverterImpl;", "Lcom/avito/android/remote/model/SearchParamsConverter;", "<init>", "()V", "K", "V", "", "filterNullValues", "(Ljava/util/Map;)Ljava/util/Map;", "", "", "key", "", "values", "Lkotlin/G0;", "appendMultipleValues", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "", "toValue", "(Z)Ljava/lang/String;", "Lcom/avito/android/remote/model/SearchParams;", "searchParams", "Lkotlin/Function1;", "Lkotlin/S;", "name", "keyWrapper", "isSubscribeSearch", "Lcom/avito/android/remote/model/PresentationType;", PresentationTypeKt.PRESENTATION_TYPE, "convertToMap", "(Lcom/avito/android/remote/model/SearchParams;LY41/l;ZLcom/avito/android/remote/model/PresentationType;)Ljava/util/Map;", "convertParamsToMap", "(Lcom/avito/android/remote/model/SearchParams;LY41/l;)Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamsConverterImpl implements SearchParamsConverter {
    @Inject
    public SearchParamsConverterImpl() {
    }

    private final void appendMultipleValues(Map<String, String> map, String str, List<String> list) {
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String str2 = (String) obj;
                if (str2.length() > 0) {
                    map.put(str + '[' + i12 + ']', str2);
                }
                i12 = i13;
            }
        }
    }

    private final <K, V> Map<K, V> filterNullValues(Map<? extends K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private final String toValue(boolean z12) {
        return z12 ? "1" : "0";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.remote.model.SearchParamsConverter
    @k
    public Map<String, String> convertParamsToMap(@l SearchParams searchParams, @k Y41.l<? super String, String> keyWrapper) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (searchParams == null) {
            return filterNullValues(linkedHashMap);
        }
        Map<String, SearchParam<?>> params = searchParams.getParams();
        if (params == null) {
            return filterNullValues(linkedHashMap);
        }
        for (Map.Entry<String, SearchParam<?>> entry : params.entrySet()) {
            String key = entry.getKey();
            SearchParam<?> value = entry.getValue();
            if (value instanceof StringSearchParam) {
                StringSearchParam stringSearchParam = (StringSearchParam) value;
                if (stringSearchParam.getValue().length() > 0) {
                    linkedHashMap.put(keyWrapper.invoke("params") + '[' + key + ']', stringSearchParam.getValue());
                }
            } else if (value instanceof MultiSelectSearchParam) {
                appendMultipleValues(linkedHashMap, keyWrapper.invoke("params") + '[' + key + ']', ((MultiSelectSearchParam) value).getValue());
            } else if (value instanceof MultiSelectWithParentIdSearchParam) {
                List<? extends MultiSelectWithAttrIdValue> value2 = ((MultiSelectWithParentIdSearchParam) value).getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj : value2) {
                    String attrId = ((MultiSelectWithAttrIdValue) obj).getAttrId();
                    Object objR = linkedHashMap2.get(attrId);
                    if (objR == null) {
                        objR = e.r(linkedHashMap2, attrId);
                    }
                    ((List) objR).add(obj);
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String str2 = keyWrapper.invoke("params") + '[' + str + ']';
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MultiSelectWithAttrIdValue) it.next()).getValue());
                    }
                    appendMultipleValues(linkedHashMap, str2, arrayList);
                }
            } else if (value instanceof SplitSearchParam) {
                SplitSearchParam splitSearchParam = (SplitSearchParam) value;
                linkedHashMap.put(keyWrapper.invoke("params") + '[' + key + "-from]", splitSearchParam.getValue().getFrom());
                linkedHashMap.put(keyWrapper.invoke("params") + '[' + key + "-to]", splitSearchParam.getValue().getTo());
            } else if (value instanceof DateSearchParam) {
                linkedHashMap.put(keyWrapper.invoke(key), ((DateSearchParam) value).getValue());
            } else if (value instanceof AreaSearchParams) {
                linkedHashMap.putAll(AreaKt.toMap(((AreaSearchParams) value).getValue()));
            }
        }
        return filterNullValues(linkedHashMap);
    }

    @Override // com.avito.android.remote.model.SearchParamsConverter
    @k
    public Map<String, String> convertToMap(@k SearchParams searchParams, @k Y41.l<? super String, String> keyWrapper, boolean isSubscribeSearch, @l PresentationType presentationType) {
        String string;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(keyWrapper.invoke("categoryId"), searchParams.getCategoryId());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.DRAW_ID), searchParams.getDrawId());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.LOCATION_ID), searchParams.getLocationId());
        linkedHashMap.put(keyWrapper.invoke("suggestLocationId"), searchParams.getSuggestLocationId());
        linkedHashMap.put(keyWrapper.invoke("query"), searchParams.getQuery());
        linkedHashMap.put(keyWrapper.invoke("title"), searchParams.getTitle());
        String strInvoke = keyWrapper.invoke(SearchParamsConverterKt.GEO_COORDS);
        Coordinates geoCoords = searchParams.getGeoCoords();
        if (geoCoords != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(geoCoords.getLatitude());
            sb2.append(',');
            sb2.append(geoCoords.getLongitude());
            string = sb2.toString();
        } else {
            string = null;
        }
        linkedHashMap.put(strInvoke, string);
        String strInvoke2 = keyWrapper.invoke(SearchParamsConverterKt.PRICE_MIN);
        Long priceMin = searchParams.getPriceMin();
        linkedHashMap.put(strInvoke2, priceMin != null ? priceMin.toString() : null);
        String strInvoke3 = keyWrapper.invoke(SearchParamsConverterKt.PRICE_MAX);
        Long priceMax = searchParams.getPriceMax();
        linkedHashMap.put(strInvoke3, priceMax != null ? priceMax.toString() : null);
        appendMultipleValues(linkedHashMap, keyWrapper.invoke(SearchParamsConverterKt.METRO_ID), searchParams.getMetroIds());
        appendMultipleValues(linkedHashMap, keyWrapper.invoke(SearchParamsConverterKt.DIRECTION_ID), searchParams.getDirectionId());
        appendMultipleValues(linkedHashMap, keyWrapper.invoke(SearchParamsConverterKt.DISTRICT_ID), searchParams.getDistrictId());
        String strInvoke4 = keyWrapper.invoke(SearchParamsConverterKt.WITH_IMAGES_ONLY);
        Boolean withImagesOnly = searchParams.getWithImagesOnly();
        linkedHashMap.put(strInvoke4, withImagesOnly != null ? toValue(withImagesOnly.booleanValue()) : null);
        String strInvoke5 = keyWrapper.invoke(SearchParamsConverterKt.WITH_DELIVERY_ONLY);
        Boolean withDeliveryOnly = searchParams.getWithDeliveryOnly();
        linkedHashMap.put(strInvoke5, withDeliveryOnly != null ? toValue(withDeliveryOnly.booleanValue()) : null);
        String strInvoke6 = keyWrapper.invoke("localPriority");
        Boolean localPriority = searchParams.getLocalPriority();
        linkedHashMap.put(strInvoke6, localPriority != null ? toValue(localPriority.booleanValue()) : null);
        String strInvoke7 = keyWrapper.invoke("earlyAccess");
        Boolean earlyAccess = searchParams.getEarlyAccess();
        linkedHashMap.put(strInvoke7, earlyAccess != null ? toValue(earlyAccess.booleanValue()) : null);
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.MORE_EXPENSIVE), searchParams.getMoreExpensive());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.WIDGET_CATEGORY), searchParams.getWidgetCategory());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.SORT), searchParams.getSort());
        appendMultipleValues(linkedHashMap, keyWrapper.invoke(SearchParamsConverterKt.OWNER), searchParams.getOwner());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.EXPANDED), searchParams.getExpanded());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.SELLER_ID), searchParams.getSellerId());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.CV_2_VACANCY), searchParams.getCv2Vacancy());
        linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.SHOP_ID), searchParams.getShopId());
        linkedHashMap.put(keyWrapper.invoke("iconType"), searchParams.getClarifyIconType());
        if (presentationType != null) {
            linkedHashMap.put(keyWrapper.invoke(PresentationTypeKt.PRESENTATION_TYPE), PresentationTypeKt.toParameterValue(presentationType));
        }
        Source source = searchParams.getSource();
        if (source != null) {
            linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.SOURCE), SourceKt.toParameterValue(source));
        }
        Integer radius = searchParams.getRadius();
        if (radius != null) {
            int iIntValue = radius.intValue();
            if (isSubscribeSearch) {
                linkedHashMap.put(keyWrapper.invoke("searchRadius"), String.valueOf(iIntValue));
            } else {
                linkedHashMap.put(keyWrapper.invoke("radius"), String.valueOf(iIntValue));
            }
        } else {
            String searchRadius = searchParams.getSearchRadius();
            if (searchRadius != null) {
                linkedHashMap.put(keyWrapper.invoke("searchRadius"), searchRadius);
            }
        }
        String footWalkingMetro = searchParams.getFootWalkingMetro();
        if (footWalkingMetro != null) {
            linkedHashMap.put(keyWrapper.invoke(SearchParamsConverterKt.FOOT_WALKING_METRO), footWalkingMetro);
        }
        List<String> owner = searchParams.getOwner();
        if (owner != null) {
            if (owner.contains(UserTypeCode.PRIVATE)) {
                linkedHashMap.put(keyWrapper.invoke("privateOnly"), "1");
            }
            if (owner.contains(UserTypeCode.COMPANY)) {
                linkedHashMap.put(keyWrapper.invoke("companyOnly"), "1");
            }
        }
        linkedHashMap.putAll(convertParamsToMap(searchParams, keyWrapper));
        Area area = searchParams.getArea();
        if (area != null && (map = AreaKt.toMap(area)) != null) {
            for (String str : map.keySet()) {
                linkedHashMap.put(keyWrapper.invoke(str), map.get(str));
            }
        }
        return filterNullValues(linkedHashMap);
    }
}

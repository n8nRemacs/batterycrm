package zg;

import android.net.Uri;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.C35837l2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AvlElementConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_avl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {
    public static final AvitoNetworkBannerItem a(Map<String, ?> map) {
        Object obj = map.get("id");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("alid");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("bannerCode");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("categoryId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("microCategoryId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get(SearchParamsConverterKt.LOCATION_ID);
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("creativeId");
        String str7 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("params");
        return new AvitoNetworkBannerItem(str, str2, str3, str4, str5, str6, str7, obj8 instanceof Map ? (Map) obj8 : null);
    }

    public static final BuzzoolaNetworkBannerItem b(Map<String, ?> map) {
        Object obj = map.get("id");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("alid");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("bannerCode");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("categoryId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("microCategoryId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get(SearchParamsConverterKt.LOCATION_ID);
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("params");
        Map map2 = obj7 instanceof Map ? (Map) obj7 : null;
        Object obj8 = map.get("analyticParams");
        return new BuzzoolaNetworkBannerItem(str, str2, str3, str4, str5, str6, map2, obj8 instanceof Map ? (Map) obj8 : null);
    }

    public static final Image c(Map<String, String> map) throws NumberFormatException {
        if (map.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Size sizeB = C35837l2.b(key);
            if (sizeB != null) {
                linkedHashMap.put(sizeB, Uri.parse(value));
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new Image(linkedHashMap);
    }

    public static final YandexNetworkBannerItem d(Map<String, ?> map) {
        String str;
        String str2;
        String str3;
        String str4;
        Coordinates coordinates;
        Object obj = map.get("id");
        String str5 = obj instanceof String ? (String) obj : null;
        if (str5 == null) {
            return null;
        }
        Object obj2 = map.get("alid");
        String str6 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("bannerCode");
        String str7 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("categoryId");
        String str8 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("microCategoryId");
        String str9 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get(SearchParamsConverterKt.LOCATION_ID);
        String str10 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("partnerId");
        String str11 = obj7 instanceof String ? (String) obj7 : null;
        if (str11 == null) {
            return null;
        }
        Object obj8 = map.get("hash");
        String str12 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map.get("statId");
        String str13 = obj9 instanceof String ? (String) obj9 : null;
        if (str13 == null) {
            return null;
        }
        Object obj10 = map.get("query");
        String str14 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = map.get("location");
        Map map2 = obj11 instanceof Map ? (Map) obj11 : null;
        if (map2 != null) {
            Object obj12 = map2.get("lat");
            Double d12 = obj12 instanceof Double ? (Double) obj12 : null;
            if (d12 != null) {
                str3 = str13;
                str4 = str14;
                double dDoubleValue = d12.doubleValue();
                Object obj13 = map2.get(AddressParameter.Value.LNG);
                Double d13 = obj13 instanceof Double ? (Double) obj13 : null;
                str = str11;
                str2 = str12;
                Coordinates coordinates2 = d13 != null ? new Coordinates(dDoubleValue, d13.doubleValue()) : null;
                coordinates = coordinates2;
            } else {
                str = str11;
                str2 = str12;
                str3 = str13;
                str4 = str14;
            }
            coordinates = coordinates2;
        } else {
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            coordinates = null;
        }
        Object obj14 = map.get("contextTags");
        List list = obj14 instanceof List ? (List) obj14 : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        List list2 = list;
        Object obj15 = map.get("params");
        Map map3 = obj15 instanceof Map ? (Map) obj15 : null;
        Object obj16 = map.get("analyticParams");
        return new YandexNetworkBannerItem(str5, str6, str7, str8, str9, str10, str, str2, str3, str4, coordinates, list2, map3, obj16 instanceof Map ? (Map) obj16 : null);
    }
}

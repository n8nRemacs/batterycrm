package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.sequences.C43018a;
import kotlin.sequences.C43033p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CategoryParametersConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"KEY_NAVIGATION", "", "stringToMap", "", "", "paramsStr", "toMap", "Lorg/json/JSONObject;", "_avito-discouraged_avito-api_publish"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryParametersConverterKt {

    @k
    private static final String KEY_NAVIGATION = "navigation";

    @l
    public static final Map<String, Object> stringToMap(@l String str) {
        if (str != null) {
            return toMap(new JSONObject(str));
        }
        return null;
    }

    @k
    public static final Map<String, Object> toMap(@k JSONObject jSONObject) throws JSONException {
        C43018a c43018aB = C43033p.b(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c43018aB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object map = jSONObject.get((String) next);
            if (map instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) map;
                kotlin.ranges.l lVarR = s.r(0, jSONArray.length());
                int iF2 = P0.f(C42745f0.q(lVarR, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
                kotlin.ranges.k it2 = lVarR.iterator();
                while (it2.f406910d) {
                    int iA2 = it2.a();
                    linkedHashMap2.put(String.valueOf(iA2), jSONArray.get(iA2));
                }
                map = C42745f0.M0(toMap(new JSONObject(linkedHashMap2)).values());
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            } else if (L.f(map, JSONObject.NULL)) {
                map = "";
            }
            linkedHashMap.put(next, map);
        }
        return linkedHashMap;
    }
}

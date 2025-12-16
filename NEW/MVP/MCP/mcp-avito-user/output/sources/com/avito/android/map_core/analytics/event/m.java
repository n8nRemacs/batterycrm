package com.avito.android.map_core.analytics.event;

import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MapOnboardingEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_search-map-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m {
    public static final void a(LinkedHashMap linkedHashMap, SearchParams searchParams) {
        ArrayList arrayList;
        Map<String, SearchParam<?>> params = searchParams.getParams();
        if (params != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, SearchParam<?>> entry : params.entrySet()) {
                if (entry.getValue().getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                arrayList.add(((String) entry2.getKey()) + ": " + ((SearchParam) entry2.getValue()).getValue());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 == null || !(!arrayList2.isEmpty())) {
            return;
        }
        linkedHashMap.put("params", "{ " + C42745f0.O(arrayList2, ", ", null, null, null, 62) + " }");
    }
}

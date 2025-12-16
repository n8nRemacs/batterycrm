package qJ;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MapExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-analytics_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: qJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47304a {
    @k
    public static final LinkedHashMap a(@k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }
}

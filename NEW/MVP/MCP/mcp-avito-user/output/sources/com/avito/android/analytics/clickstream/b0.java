package com.avito.android.analytics.clickstream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: FieldConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/clickstream/b0;", "", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28376a f89779a;

    public b0(@Y61.k C28376a c28376a) {
        this.f89779a = c28376a;
    }

    @Y61.k
    public final LinkedHashMap a(@Y61.k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            String strValueOf = value instanceof Boolean ? String.valueOf(((Boolean) value).booleanValue() ? 1 : 0) : value instanceof List ? C42745f0.O((Iterable) value, ",", null, null, new Z(this), 30) : value instanceof Object[] ? C42756l.P((Object[]) value, ",", null, null, new a0(this), 30) : String.valueOf(value);
            if (strValueOf.length() > 0) {
                linkedHashMap.put(str, strValueOf);
            }
        }
        return linkedHashMap;
    }
}

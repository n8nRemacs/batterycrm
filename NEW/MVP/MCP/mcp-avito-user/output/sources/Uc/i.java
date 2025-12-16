package Uc;

import Y61.k;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-ratings-reviews_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {
    @k
    public static final <K, V> Map<K, V> a(@k Map<K, ? extends V> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            Q q12 = (key == null || value == null) ? null : new Q(key, value);
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        return P0.p(arrayList);
    }
}

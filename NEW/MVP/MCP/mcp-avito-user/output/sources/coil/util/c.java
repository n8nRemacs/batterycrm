package coil.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: Collections.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class c {
    @Y61.k
    public static final <T> List<T> a(@Y61.k List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(C42745f0.E(list)) : C42784z0.f406748b;
    }

    @Y61.k
    public static final <K, V> Map<K, V> b(@Y61.k Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return P0.c();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) C42745f0.D(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}

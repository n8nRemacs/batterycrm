package com.avito.android.beduin.common.component.model;

import Y41.l;
import Y61.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {
    public static final <Result> Result a(Iterator<String> it, String str, Map<String, ?> map, l<Object, ? extends Result> lVar) {
        while (it.hasNext()) {
            Object obj = map.get(it.next());
            map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                return lVar.invoke(null);
            }
        }
        return lVar.invoke(map.get(str));
    }

    public static final <Result> Result b(@Y61.l List<? extends String> list, @k String str, @k Map<String, ?> map, @k l<Object, ? extends Result> lVar) {
        if (list == null) {
            list = null;
        }
        if (list == null) {
            list = C42784z0.f406748b;
        }
        return (Result) a(list.iterator(), str, map, lVar);
    }

    public static Object c(List list, Map map) {
        d dVar = d.f101777l;
        if (list == null) {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return a(C42745f0.E0(list, list.size() - 1).iterator(), (String) C42745f0.Q(list), map, dVar);
    }
}

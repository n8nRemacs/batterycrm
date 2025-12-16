package com.avito.android.gson;

import Y61.k;
import Y61.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_gson_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {
    @l
    public static final Serializable a(@k Class cls) {
        String arrayList = cls.equals(String.class) ? "" : cls.equals(Integer.TYPE) ? 0 : cls.equals(Long.TYPE) ? 0L : cls.equals(Short.TYPE) ? (short) 0 : cls.equals(Double.TYPE) ? Double.valueOf(0.0d) : cls.equals(Float.TYPE) ? Float.valueOf(0.0f) : cls.equals(Boolean.TYPE) ? Boolean.FALSE : cls.equals(List.class) ? C42784z0.f406748b : (cls.equals(List.class) || cls.equals(ArrayList.class)) ? new ArrayList() : cls.equals(LinkedList.class) ? new LinkedList() : cls.equals(CopyOnWriteArrayList.class) ? new CopyOnWriteArrayList() : cls.equals(Set.class) ? B0.f406639b : cls.equals(HashSet.class) ? new HashSet() : cls.equals(LinkedHashSet.class) ? new LinkedHashSet() : (cls.equals(Collection.class) || cls.equals(Iterable.class)) ? C42784z0.f406748b : cls.equals(Object[].class) ? new Object[0] : cls.equals(Map.class) ? P0.c() : cls.equals(HashMap.class) ? new HashMap() : cls.equals(LinkedHashMap.class) ? new LinkedHashMap() : cls.equals(ConcurrentHashMap.class) ? new ConcurrentHashMap() : null;
        return (Serializable) arrayList;
    }
}

package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class mg1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final Map<z3, String> f388000b = kotlin.collections.P0.g(new kotlin.Q(z3.f392172l, "video_ad_rendering_duration"), new kotlin.Q(z3.f392173m, "video_ad_prepare_duration"));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a4 f388001a;

    public mg1(@Y61.k a4 a4Var) {
        this.f388001a = a4Var;
    }

    @Y61.k
    public final Map<String, Object> a() {
        List<y3> listB = this.f388001a.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listB) {
            z3 z3VarA = ((y3) obj).a();
            Object arrayList = linkedHashMap.get(z3VarA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(z3VarA, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = f388000b.get(entry.getKey());
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put(str, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getKey()).length() > 0) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Iterable iterable = (Iterable) entry3.getValue();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y3) it.next()).b());
            }
            linkedHashMap4.put(key, arrayList2);
        }
        return Collections.singletonMap("durations", linkedHashMap4);
    }
}

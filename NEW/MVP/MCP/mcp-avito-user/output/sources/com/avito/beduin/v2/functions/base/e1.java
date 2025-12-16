package com.avito.beduin.v2.functions.base;

import com.avito.beduin.v2.engine.field.entity.C36269b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: WhenFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e1 {
    public static final com.avito.beduin.v2.engine.field.h a(com.avito.beduin.v2.engine.field.h hVar) {
        Map<String, com.avito.beduin.v2.engine.field.f<?>> map = hVar.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Object objR = (com.avito.beduin.v2.engine.field.f) entry.getValue();
            if (kotlin.jvm.internal.L.f(str, "cases")) {
                if (!(objR instanceof C36269b)) {
                    throw new IllegalStateException("Field 'cases' can be ArrayField directly only. To use all types you can turn on 'enableStraightResolve' feature");
                }
                C36269b c36269b = (C36269b) objR;
                Iterable<com.avito.beduin.v2.engine.field.f> iterable = (Iterable) objR;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                for (com.avito.beduin.v2.engine.field.f fVar : iterable) {
                    if (!(fVar instanceof com.avito.beduin.v2.engine.field.entity.B)) {
                        throw new IllegalStateException("Value in 'cases' can be StructureField directly only. To use all types you can turn on 'enableStraightResolve' feature");
                    }
                    com.avito.beduin.v2.engine.field.entity.B b12 = (com.avito.beduin.v2.engine.field.entity.B) fVar;
                    Map<String, com.avito.beduin.v2.engine.field.f<?>> map2 = b12.f336781c.f336867a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(map2.size()));
                    Iterator<T> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        Object key2 = entry2.getKey();
                        String str2 = (String) entry2.getKey();
                        com.avito.beduin.v2.engine.field.f fVar2 = (com.avito.beduin.v2.engine.field.f) entry2.getValue();
                        linkedHashMap2.put(key2, (kotlin.jvm.internal.L.f(str2, "condition") || kotlin.jvm.internal.L.f(str2, "result")) ? new com.avito.beduin.v2.engine.field.entity.y(com.avito.beduin.v2.engine.field.e.f336775a, fVar2, null, 4, null) : fVar2);
                    }
                    arrayList.add(com.avito.beduin.v2.engine.field.entity.B.c(b12, null, new com.avito.beduin.v2.engine.field.h(linkedHashMap2), 1));
                }
                objR = C36269b.r(c36269b, null, arrayList, 1);
            }
            linkedHashMap.put(key, objR);
        }
        return new com.avito.beduin.v2.engine.field.h(linkedHashMap);
    }
}

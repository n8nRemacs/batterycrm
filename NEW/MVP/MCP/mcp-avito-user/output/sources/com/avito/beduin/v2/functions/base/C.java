package com.avito.beduin.v2.functions.base;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ConditionFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C {
    public static final com.avito.beduin.v2.engine.field.h a(com.avito.beduin.v2.engine.field.h hVar) {
        Map<String, com.avito.beduin.v2.engine.field.f<?>> map = hVar.f336867a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            com.avito.beduin.v2.engine.field.f yVar = (com.avito.beduin.v2.engine.field.f) entry.getValue();
            if (kotlin.jvm.internal.L.f(str, "trueResult") ? true : kotlin.jvm.internal.L.f(str, "falseResult")) {
                yVar = new com.avito.beduin.v2.engine.field.entity.y(com.avito.beduin.v2.engine.field.e.f336775a, yVar, null, 4, null);
            }
            linkedHashMap.put(key, yVar);
        }
        return new com.avito.beduin.v2.engine.field.h(linkedHashMap);
    }
}

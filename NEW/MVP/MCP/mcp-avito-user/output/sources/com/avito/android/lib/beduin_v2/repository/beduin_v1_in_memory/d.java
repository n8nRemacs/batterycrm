package com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV1ParamsToDataMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/d;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {
    @Inject
    public d() {
    }

    public static com.avito.beduin.v2.engine.field.d a(Object obj, C36272i c36272i) {
        if (obj instanceof Integer) {
            return c36272i.c(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return c36272i.d(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return c36272i.b(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return c36272i.a(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return c36272i.e((String) obj);
        }
        if (obj instanceof Boolean) {
            return c36272i.f(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Number) {
            return c36272i.c(((Number) obj).intValue());
        }
        if (obj instanceof Map) {
            Map map = obj instanceof Map ? (Map) obj : null;
            return map != null ? c(map, c36272i) : com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
            if (objArr == null) {
                return new C36268a(C42784z0.f406748b);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : objArr) {
                com.avito.beduin.v2.engine.field.d dVarA = a(obj2, c36272i);
                if (dVarA != null) {
                    arrayList.add(dVarA);
                }
            }
            return new C36268a(arrayList);
        }
        if (!(obj instanceof Iterable)) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        Iterable iterable = obj instanceof Iterable ? (Iterable) obj : null;
        if (iterable == null) {
            return new C36268a(C42784z0.f406748b);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.avito.beduin.v2.engine.field.d dVarA2 = a(it.next(), c36272i);
            if (dVarA2 instanceof com.avito.beduin.v2.engine.field.entity.f) {
                dVarA2 = null;
            }
            if (dVarA2 != null) {
                arrayList2.add(dVarA2);
            }
        }
        return new C36268a(arrayList2);
    }

    public static Object b(com.avito.beduin.v2.engine.field.d dVar) {
        if (dVar instanceof A) {
            return d((A) dVar);
        }
        if (dVar instanceof v) {
            return ((v) dVar).getF336843b();
        }
        if (!(dVar instanceof C36268a)) {
            return dVar.toString();
        }
        List<com.avito.beduin.v2.engine.field.d> list = ((C36268a) dVar).f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((com.avito.beduin.v2.engine.field.d) it.next()));
        }
        return arrayList;
    }

    public static A c(Map map, C36272i c36272i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), c36272i));
        }
        return new A(new m(linkedHashMap), null, 2, null);
    }

    public static LinkedHashMap d(A a12) {
        Map<String, com.avito.beduin.v2.engine.field.d> map = a12.f336778b.f336870a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), b((com.avito.beduin.v2.engine.field.d) entry.getValue()));
        }
        return linkedHashMap;
    }
}

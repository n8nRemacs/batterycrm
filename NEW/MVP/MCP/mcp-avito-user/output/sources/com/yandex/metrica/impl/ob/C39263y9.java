package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.If;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;

/* renamed from: com.yandex.metrica.impl.ob.y9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39263y9 implements Converter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.d[] fromModel(@Y61.k Map<String, ? extends List<String>> map) {
        int size = map.size();
        If.d[] dVarArr = new If.d[size];
        for (int i12 = 0; i12 < size; i12++) {
            dVarArr[i12] = new If.d();
        }
        int i13 = 0;
        for (Object obj : map.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            dVarArr[i13].f378349a = (String) entry.getKey();
            If.d dVar = dVarArr[i13];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            dVar.f378350b = (String[]) array;
            i13 = i14;
        }
        return dVarArr;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<String, List<String>> toModel(@Y61.k If.d[] dVarArr) {
        int iF2 = kotlin.collections.P0.f(dVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (If.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f378349a, C42756l.g0(dVar.f378350b));
        }
        return linkedHashMap;
    }
}

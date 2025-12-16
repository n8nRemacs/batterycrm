package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public final class N9 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    private final C38902jd f378988a = F0.g().j();

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.l[] fromModel(@Y61.k Map<String, ? extends Object> map) {
        If.l lVar;
        Map<String, C38853hd> mapC = this.f378988a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C38853hd c38853hd = mapC.get(key);
            if (c38853hd == null || value == null) {
                lVar = null;
            } else {
                lVar = new If.l();
                lVar.f378421a = key;
                lVar.f378422b = c38853hd.a(value);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Object[] array = arrayList.toArray(new If.l[0]);
        if (array != null) {
            return (If.l[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> toModel(@Y61.k If.l[] lVarArr) {
        Map<String, C38853hd> mapC = this.f378988a.c();
        ArrayList arrayList = new ArrayList();
        for (If.l lVar : lVarArr) {
            C38853hd c38853hd = mapC.get(lVar.f378421a);
            kotlin.Q q12 = c38853hd != null ? new kotlin.Q(lVar.f378421a, c38853hd.a(lVar.f378422b)) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        return kotlin.collections.P0.p(arrayList);
    }
}

package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zn;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class qn<T, R> implements vn<T, R> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Map<T, wn<R>> f381683a;

    public qn(@j.N Map<T, wn<R>> map) {
        this.f381683a = A2.d(map);
    }

    @Override // com.yandex.metrica.impl.ob.wn
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zn<Map<T, R>> get(@j.N Map<T, R> map) {
        zn.a.values();
        int[] iArr = new int[3];
        HashMap map2 = new HashMap();
        for (Map.Entry<T, R> entry : map.entrySet()) {
            wn<R> wnVar = this.f381683a.get(entry.getKey());
            if (wnVar != null) {
                zn<R> znVar = wnVar.get(entry.getValue());
                int iOrdinal = znVar.f382336a.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
                map2.put(entry.getKey(), znVar.f382337b);
            }
        }
        zn.a aVar = zn.a.NEW;
        if (iArr[0] > 0) {
            return new zn<>(aVar, map2);
        }
        return iArr[2] > 0 ? new zn<>(zn.a.REFRESH, map2) : new zn<>(zn.a.NOT_CHANGED, map2);
    }
}

package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.zn;
import java.util.Map;

/* loaded from: classes7.dex */
public class rn<T, R> implements vn<T, R> {
    @Override // com.yandex.metrica.impl.ob.vn
    @j.N
    public zn<Map<T, R>> a(@j.N Map<T, R> map) {
        return new zn<>(zn.a.NEW, map);
    }

    @Override // com.yandex.metrica.impl.ob.wn
    @j.N
    public zn get(@j.N Object obj) {
        return new zn(zn.a.NEW, (Map) obj);
    }
}

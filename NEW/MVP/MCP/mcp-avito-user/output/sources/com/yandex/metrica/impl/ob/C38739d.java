package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38739d implements InterfaceC39013o {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T21.d f380352a;

    public C38739d() {
        this(new T21.d());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39013o
    @j.N
    public Map<String, T21.a> a(@j.N C38864i c38864i, @j.N Map<String, T21.a> map, @j.N InterfaceC38938l interfaceC38938l) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            T21.a aVar = map.get(str);
            this.f380352a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.f15318a != com.yandex.metrica.billing_interface.e.f377619b || interfaceC38938l.a()) {
                T21.a aVarA = interfaceC38938l.a(aVar.f15319b);
                if (aVarA != null && aVarA.f15320c.equals(aVar.f15320c)) {
                    if (aVar.f15318a != com.yandex.metrica.billing_interface.e.f377620c || jCurrentTimeMillis - aVarA.f15322e < TimeUnit.SECONDS.toMillis(c38864i.f380750a)) {
                    }
                }
                map2.put(str, aVar);
            } else if (jCurrentTimeMillis - aVar.f15321d <= TimeUnit.SECONDS.toMillis(c38864i.f380751b)) {
                map2.put(str, aVar);
            }
        }
        return map2;
    }

    public C38739d(@j.N T21.d dVar) {
        this.f380352a = dVar;
    }
}

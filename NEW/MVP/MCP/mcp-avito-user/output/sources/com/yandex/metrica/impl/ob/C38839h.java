package com.yandex.metrica.impl.ob;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38839h implements InterfaceC39013o {

    /* renamed from: a, reason: collision with root package name */
    private final T21.d f380670a;

    public C38839h(@Y61.k T21.d dVar) {
        this.f380670a = dVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39013o
    @Y61.k
    public Map<String, T21.a> a(@Y61.k C38864i c38864i, @Y61.k Map<String, ? extends T21.a> map, @Y61.k InterfaceC38938l interfaceC38938l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends T21.a> entry : map.entrySet()) {
            T21.a value = entry.getValue();
            this.f380670a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (value.f15318a != com.yandex.metrica.billing_interface.e.f377619b || interfaceC38938l.a()) {
                T21.a aVarA = interfaceC38938l.a(value.f15319b);
                if (aVarA != null && kotlin.jvm.internal.L.f(aVarA.f15320c, value.f15320c)) {
                    if (value.f15318a != com.yandex.metrica.billing_interface.e.f377620c || jCurrentTimeMillis - aVarA.f15322e < TimeUnit.SECONDS.toMillis(c38864i.f380750a)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (jCurrentTimeMillis - value.f15321d <= TimeUnit.SECONDS.toMillis(c38864i.f380751b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ C38839h(T21.d dVar, int i12) {
        this((i12 & 1) != 0 ? new T21.d() : null);
    }
}

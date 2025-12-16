package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38814g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C38814g f380609a = new C38814g();

    private C38814g() {
    }

    public static void a(C38814g c38814g, Map map, Map map2, String str, InterfaceC38938l interfaceC38938l, T21.d dVar, int i12) {
        if ((i12 & 16) != 0) {
            new T21.d();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (T21.a aVar : map.values()) {
            if (map2.containsKey(aVar.f15319b)) {
                aVar.f15322e = jCurrentTimeMillis;
            } else {
                T21.a aVarA = interfaceC38938l.a(aVar.f15319b);
                if (aVarA != null) {
                    aVar.f15322e = aVarA.f15322e;
                }
            }
        }
        interfaceC38938l.a((Map<String, T21.a>) map);
        if (interfaceC38938l.a() || !"inapp".equals(str)) {
            return;
        }
        interfaceC38938l.b();
    }
}

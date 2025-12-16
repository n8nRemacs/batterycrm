package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.rk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39106rk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Map<Float, Integer> f381776a = new HashMap();

    public C39106rk(@j.N TreeSet<Float> treeSet) {
        Iterator<Float> it = treeSet.descendingSet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            this.f381776a.put(it.next(), Integer.valueOf(i12));
            i12++;
        }
    }

    public void a(@j.N C38711bl c38711bl) {
        c38711bl.f380239s = this.f381776a.get(c38711bl.f380233m);
    }
}

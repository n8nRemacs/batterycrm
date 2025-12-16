package com.avito.android.beduin.common.form;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: ComponentsForms.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {
    @Y61.k
    public static final Map<String, Object> a(@Y61.k List<? extends InterfaceC43779a> list, @Y61.l List<String> list2) {
        Object obj;
        LinkedHashMap parameters;
        List<? extends InterfaceC43779a> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (InterfaceC43779a interfaceC43779a : list3) {
            List<String> list4 = list2;
            if (list4 == null || list4.isEmpty()) {
                parameters = interfaceC43779a.getParameters();
            } else {
                Set setP0 = C42745f0.P0(list2);
                LinkedHashMap parameters2 = interfaceC43779a.getParameters();
                parameters = new LinkedHashMap();
                for (Map.Entry entry : parameters2.entrySet()) {
                    if (setP0.contains((String) entry.getKey())) {
                        parameters.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            arrayList.add(parameters);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = P0.k((Map) next, (Map) it.next());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map<String, Object> map = (Map) obj;
        return map == null ? P0.c() : map;
    }
}

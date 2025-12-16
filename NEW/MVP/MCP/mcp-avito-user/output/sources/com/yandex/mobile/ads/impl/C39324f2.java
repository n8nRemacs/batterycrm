package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39324f2 {
    @j.N
    public static ArrayList a(@j.N String str, @j.N ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p60 p60Var = (p60) it.next();
            if (a(p60Var, str)) {
                arrayList2.add(p60Var);
            }
        }
        return arrayList2;
    }

    private static boolean a(@j.N p60 p60Var, @j.N String str) {
        if (!p60Var.getType().equals(str)) {
            return false;
        }
        return InstreamAdBreakPosition.Type.POSITION.equals(p60Var.getAdBreakPosition().getPositionType());
    }
}

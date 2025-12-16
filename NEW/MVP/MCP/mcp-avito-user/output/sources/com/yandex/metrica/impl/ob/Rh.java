package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39185v3;
import java.util.Map;

/* loaded from: classes7.dex */
public class Rh {
    public boolean a(@j.P Map<String, String> map, @j.N C39057pi c39057pi, @j.N I i12) {
        Map<String, String> mapB = i12.a(new C39185v3.a(map, EnumC39158u0.APP)).b();
        if (A2.b(mapB)) {
            return true;
        }
        return mapB.equals(Tl.a(c39057pi.u()));
    }
}

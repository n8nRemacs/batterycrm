package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39109s;
import java.util.HashMap;

/* loaded from: classes7.dex */
class B3 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, C39109s> f377807a = new HashMap<>();

    public synchronized C39109s a(@j.N I3 i32, @j.N C38737cm c38737cm, @j.N C38724c9 c38724c9) {
        C39109s c39109s;
        c39109s = this.f377807a.get(i32.toString());
        if (c39109s == null) {
            C39109s.a aVarF = c38724c9.f();
            c39109s = new C39109s(aVarF.f381813a, aVarF.f381814b, c38737cm);
            this.f377807a.put(i32.toString(), c39109s);
        }
        return c39109s;
    }
}

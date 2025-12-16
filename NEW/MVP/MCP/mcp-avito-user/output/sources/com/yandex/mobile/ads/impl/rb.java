package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f389459a;

    public rb(@j.N List<eb<?>> list) {
        this.f389459a = a(list);
    }

    @j.N
    private static HashMap a(@j.N List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eb ebVar = (eb) it.next();
            map.put(ebVar.b(), ebVar.d());
        }
        return map;
    }

    @j.P
    public final rd0 a() {
        Object obj = this.f389459a.get("media");
        if (obj instanceof rd0) {
            return (rd0) obj;
        }
        return null;
    }
}

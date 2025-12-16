package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class yl {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, xl> f392021a = new a();

    public class a extends HashMap<String, xl> {
        public a() {
            put("html", xl.f391760a);
            put("native", xl.f391761b);
        }
    }

    @j.P
    public static xl a(@j.N Map map) {
        return (xl) ((HashMap) f392021a).get((String) map.get(i10.b(18)));
    }
}

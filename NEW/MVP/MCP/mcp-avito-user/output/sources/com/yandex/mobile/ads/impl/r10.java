package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class r10 extends af {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final af f389357a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nc1 f389358b = e9.a();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Context f389359c;

    public r10(@j.P Context context, @j.N wg0 wg0Var) {
        this.f389357a = wg0Var;
        this.f389359c = context != null ? context.getApplicationContext() : null;
    }

    @Override // com.yandex.mobile.ads.impl.af
    public final o10 a(@j.N qy0<?> qy0Var, @j.N Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put(i10.b(44), this.f389358b.a(this.f389359c));
        return this.f389357a.a(qy0Var, map2);
    }
}

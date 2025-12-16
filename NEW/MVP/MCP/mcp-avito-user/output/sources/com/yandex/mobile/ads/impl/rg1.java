package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class rg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389529a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final q21 f389530b = q21.b();

    public rg1(@j.N Context context) {
        this.f389529a = context.getApplicationContext();
    }

    @j.N
    public final Map a(@j.N HashMap map, @j.P uj1 uj1Var) {
        v11 v11VarA = this.f389530b.a(this.f389529a);
        if (v11VarA != null ? v11VarA.O() : false) {
            return map;
        }
        HashMap map2 = new HashMap(map);
        List<String> listA = uj1Var != null ? uj1Var.a() : null;
        List list = (List) map2.get("impression");
        if (listA != null) {
            map2.put("impression", listA);
        } else {
            map2.remove("impression");
        }
        if (list != null) {
            map2.put("render_impression", list);
        } else {
            map2.remove("render_impression");
        }
        return map2;
    }
}

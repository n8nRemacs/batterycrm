package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class af0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final n2 f383541a;

    public af0(@j.N n2 n2Var) {
        this.f383541a = n2Var;
    }

    @j.N
    public HashMap a(@j.N Context context) {
        HashMap map = new HashMap();
        g5 g5VarA = this.f383541a.a();
        if (g5VarA != null) {
            Map<String, String> mapG = g5VarA.g();
            if (mapG != null) {
                map.putAll(mapG);
            }
            map.put("age", g5VarA.a());
            map.put("context_tags", g5VarA.d());
            map.put("gender", g5VarA.e());
            Boolean boolD = q21.b().d();
            if (boolD != null) {
                map.put("age_restricted_user", boolD);
            }
            v11 v11VarA = q21.b().a(context);
            Boolean boolT = v11VarA != null ? v11VarA.T() : null;
            if (boolT != null) {
                map.put("user_consent", boolT);
            }
        }
        return map;
    }
}

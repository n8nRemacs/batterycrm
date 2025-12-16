package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.r2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class d21 extends df<v11> {

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final az0<v11> f384509r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final Context f384510s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final Map<String, String> f384511t;

    public d21(@j.N Context context, @j.N String str, @j.N e21 e21Var, @j.N Map map, @j.N f21 f21Var) {
        super(0, str, f21Var);
        this.f384510s = context;
        this.f384509r = e21Var;
        this.f384511t = map;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final kz0<v11> a(@j.N zo0 zo0Var) {
        int i12;
        if (200 == zo0Var.f392315a) {
            v11 v11VarA = this.f384509r.a(zo0Var);
            if (v11VarA != null) {
                return kz0.a(v11VarA, j10.a(zo0Var));
            }
            i12 = 5;
        } else {
            i12 = 8;
        }
        return kz0.a(new r2(zo0Var, i12));
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final ok1 b(ok1 ok1Var) {
        zo0 zo0Var = ok1Var.f388568a;
        int i12 = r2.f389360c;
        return r2.a.b(zo0Var);
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final Map<String, String> f() {
        HashMap map = new HashMap();
        k10.a(this.f384510s, map);
        map.putAll(this.f384511t);
        return map;
    }
}

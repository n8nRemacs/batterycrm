package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.e;
import java.util.Map;

/* loaded from: classes8.dex */
public final class de0<T extends com.monetization.ads.mediation.base.e> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T f384585a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final zf0 f384586b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final af0 f384587c;

    public de0(@j.N T t12, @j.N zf0 zf0Var, @j.N af0 af0Var) {
        this.f384585a = t12;
        this.f384586b = zf0Var;
        this.f384587c = af0Var;
    }

    @j.N
    public final T a() {
        return this.f384585a;
    }

    @j.N
    public final zf0 b() {
        return this.f384586b;
    }

    @j.N
    public final Map<String, String> c() {
        af0 af0Var = this.f384587c;
        zf0 zf0Var = this.f384586b;
        af0Var.getClass();
        return zf0Var.g();
    }

    @j.N
    public final Map<String, Object> a(@j.N Context context) {
        return this.f384587c.a(context);
    }
}

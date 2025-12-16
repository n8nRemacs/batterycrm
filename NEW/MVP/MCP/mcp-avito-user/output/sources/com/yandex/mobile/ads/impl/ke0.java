package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.e;
import java.util.List;

/* loaded from: classes8.dex */
public final class ke0<T extends com.monetization.ads.mediation.base.e> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<zf0> f387118a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final af0 f387119b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final oe0<T> f387120c;

    /* renamed from: d, reason: collision with root package name */
    private int f387121d;

    public ke0(@j.N List<zf0> list, @j.N af0 af0Var, @j.N re0 re0Var) {
        this.f387118a = list;
        this.f387119b = af0Var;
        this.f387120c = new oe0<>(re0Var);
    }

    @j.P
    public final de0<T> a(@j.N Context context, @j.N Class<T> cls) {
        de0<T> de0Var = null;
        while (de0Var == null && this.f387121d < this.f387118a.size()) {
            List<zf0> list = this.f387118a;
            int i12 = this.f387121d;
            this.f387121d = i12 + 1;
            zf0 zf0Var = list.get(i12);
            com.monetization.ads.mediation.base.e eVarA = this.f387120c.a(context, zf0Var, cls);
            if (eVarA != null) {
                de0Var = new de0<>(eVarA, zf0Var, this.f387119b);
            }
        }
        return de0Var;
    }
}

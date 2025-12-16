package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Map;

/* loaded from: classes8.dex */
public final class sk1<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qk1 f389973a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final dp0<T> f389974b;

    public sk1(@Y61.k Context context, @Y61.k n2 n2Var, @Y61.k uk1<T> uk1Var, @Y61.k oz0<T> oz0Var, @Y61.k qk1 qk1Var, @Y61.k dp0<T> dp0Var) {
        this.f389973a = qk1Var;
        this.f389974b = dp0Var;
    }

    @Y61.k
    public final AdResponse<T> a(@Y61.k zo0 zo0Var, @Y61.k Map<String, String> map, @Y61.k y6 y6Var) {
        this.f389973a.getClass();
        return this.f389974b.a(qk1.a(zo0Var), map, y6Var);
    }

    public /* synthetic */ sk1(Context context, n2 n2Var, uk1 uk1Var) {
        pz0 pz0Var = new pz0(uk1Var);
        this(context, n2Var, uk1Var, pz0Var, new qk1(), xo0.a(context, n2Var, pz0Var));
    }
}

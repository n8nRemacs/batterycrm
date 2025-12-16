package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.c7;
import com.yandex.mobile.ads.impl.d7;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.impl.sw;
import com.yandex.mobile.ads.impl.uj0;
import j.N;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final d7 f392691a = new d7();

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ko1 f392692b;

    public m0(@N ko1 ko1Var) {
        this.f392692b = ko1Var;
    }

    @N
    public final C39385a a(@N Context context, @N uj0 uj0Var, @N h0 h0Var, @N ok0 ok0Var, @N sw swVar) {
        oo0 oo0VarA = this.f392691a.a(uj0Var);
        rl0 rl0VarA = rl0.a();
        l0 l0Var = new l0(oo0VarA.b(), rl0VarA);
        return new C39385a(uj0Var, new n0(h0Var, l0Var, q21.b(), uj0Var.b()), oo0VarA, new o0(oo0VarA.b()), ok0Var, new c7(swVar), new a0(context, l0Var, rl0VarA), this.f392692b, null);
    }
}

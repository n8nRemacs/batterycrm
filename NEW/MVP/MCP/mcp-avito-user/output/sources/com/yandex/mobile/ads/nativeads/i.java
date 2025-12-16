package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.e4;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.mo0;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.impl.sw;
import com.yandex.mobile.ads.impl.uj0;
import j.N;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final ko1 f392640a;

    public i(@N ko1 ko1Var) {
        this.f392640a = ko1Var;
    }

    @N
    public final C39385a a(@N Context context, @N uj0 uj0Var, @N oo0 oo0Var, @N mo0 mo0Var, @N ok0 ok0Var, @N sw swVar, @N nj0 nj0Var) {
        rl0 rl0VarA = rl0.a();
        g gVar = new g(oo0Var.b(), rl0VarA);
        return new C39385a(uj0Var, new v(gVar, uj0Var.b()), oo0Var, mo0Var, ok0Var, new e4(swVar), new a0(context, gVar, rl0VarA), this.f392640a, nj0Var);
    }
}

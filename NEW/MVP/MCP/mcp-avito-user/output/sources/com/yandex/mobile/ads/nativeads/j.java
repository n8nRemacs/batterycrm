package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ha1;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.q31;
import com.yandex.mobile.ads.impl.sw;
import com.yandex.mobile.ads.impl.uj0;
import com.yandex.mobile.ads.impl.w20;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final ha1 f392643a = new ha1();

    /* renamed from: b, reason: collision with root package name */
    @N
    private final hm0 f392644b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final m0 f392645c;

    public j(@N ko1 ko1Var) {
        this.f392644b = new hm0(ko1Var);
        this.f392645c = new m0(ko1Var);
    }

    @N
    public final oo0 a(@N uj0 uj0Var, @N nj0 nj0Var) {
        ha1 ha1Var = this.f392643a;
        ArrayList arrayListH = nj0Var.h();
        List<q31> listI = uj0Var.c().i();
        ha1Var.getClass();
        ArrayList arrayListA = ha1.a(arrayListH, listI);
        ha1 ha1Var2 = this.f392643a;
        ArrayList arrayListF = nj0Var.f();
        List<String> listG = uj0Var.c().g();
        ha1Var2.getClass();
        return new oo0(nj0Var.b(), arrayListA, ha1.a(arrayListF, listG), nj0Var.a(), nj0Var.c());
    }

    @N
    public final i0 a(@N Context context, @N uj0 uj0Var, @N w20 w20Var, @N ok0 ok0Var) {
        sw swVar = new sw();
        h0 h0Var = new h0(this.f392644b.a(context, uj0Var, w20Var, ok0Var, swVar));
        return new i0(context, h0Var, w20Var, this.f392645c.a(context, uj0Var, h0Var, ok0Var, swVar));
    }
}

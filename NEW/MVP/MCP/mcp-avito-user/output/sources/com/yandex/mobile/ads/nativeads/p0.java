package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.co;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.v11;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @P
    private CustomClickHandler f392716a;

    public final void a(@P CustomClickHandler customClickHandler) {
        this.f392716a = customClickHandler;
    }

    @N
    public final j81 a(@N Context context, @N ko1 ko1Var, @N n2 n2Var, @N AdResultReceiver adResultReceiver) {
        v11 v11VarA = q21.b().a(context);
        boolean z12 = v11VarA != null && v11VarA.C();
        CustomClickHandler customClickHandler = this.f392716a;
        return (customClickHandler == null || !z12) ? new co(context, ko1Var, n2Var, adResultReceiver, 0) : new d(customClickHandler, adResultReceiver);
    }
}

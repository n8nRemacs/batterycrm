package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.l7;
import j.N;

/* loaded from: classes8.dex */
public final class b0 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final dn0 f392602a;

    public b0(@N dn0 dn0Var) {
        this.f392602a = dn0Var;
    }

    @Override // com.yandex.mobile.ads.impl.l7
    public final boolean a() {
        return ((v) this.f392602a).b();
    }

    @Override // com.yandex.mobile.ads.impl.l7
    public final boolean b() {
        return !((v) this.f392602a).a();
    }
}

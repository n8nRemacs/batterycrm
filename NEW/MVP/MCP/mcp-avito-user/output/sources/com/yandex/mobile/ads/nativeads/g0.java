package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.n6;
import com.yandex.mobile.ads.impl.qj;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final String f392636a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final int f392637b;

    public g0(@N qj qjVar) {
        this.f392636a = qjVar.a();
        this.f392637b = qjVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        String str = this.f392636a;
        if (str == null ? g0Var.f392636a == null : str.equals(g0Var.f392636a)) {
            return this.f392637b == g0Var.f392637b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f392636a;
        return n6.a(this.f392637b) + ((str != null ? str.hashCode() : 0) * 31);
    }
}

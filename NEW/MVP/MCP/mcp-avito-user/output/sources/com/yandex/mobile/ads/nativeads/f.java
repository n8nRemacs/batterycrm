package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.qj;
import j.P;

/* loaded from: classes8.dex */
public final class f extends NativeAdAssets {

    /* renamed from: p, reason: collision with root package name */
    private g0 f392627p;

    public final void a(@P qj qjVar) {
        this.f392627p = qjVar != null ? new g0(qjVar) : null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g0 g0Var = this.f392627p;
        g0 g0Var2 = ((f) obj).f392627p;
        return g0Var != null ? g0Var.equals(g0Var2) : g0Var2 == null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        g0 g0Var = this.f392627p;
        return iHashCode + (g0Var != null ? g0Var.hashCode() : 0);
    }
}

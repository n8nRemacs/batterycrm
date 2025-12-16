package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class h00 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final v11 f385874a;

    public h00(@Y61.l v11 v11Var) {
        this.f385874a = v11Var;
    }

    public final long a() {
        v11 v11Var = this.f385874a;
        Long lValueOf = v11Var != null ? Long.valueOf(v11Var.l()) : null;
        if (lValueOf == null || lValueOf.longValue() == 0) {
            return 10000L;
        }
        return lValueOf.longValue();
    }
}

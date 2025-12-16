package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes8.dex */
public final class zd1 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xd1 f392232a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final int f392233b;

    /* JADX WARN: Illegal instructions before constructor call */
    public zd1(@j.N xd1 xd1Var, @j.N int i12) {
        StringBuilder sbA = Cif.a("Verification not executed with reason = ");
        sbA.append(yd1.c(i12).toLowerCase(Locale.US));
        super(sbA.toString());
        this.f392232a = xd1Var;
        this.f392233b = i12;
    }

    @j.N
    public final int a() {
        return this.f392233b;
    }

    @j.N
    public final xd1 b() {
        return this.f392232a;
    }
}

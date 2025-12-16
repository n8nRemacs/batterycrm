package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class q5 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f389085b = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final j5 f389086a = new j5();

    @j.N
    public final hp a(@j.N Context context) {
        return a(context, f389085b);
    }

    @j.N
    public final hp a(@j.N Context context, int i12) {
        Integer numD;
        this.f389086a.getClass();
        v11 v11VarA = q21.b().a(context);
        return new hp(1.0f, i12, (v11VarA == null || (numD = v11VarA.d()) == null) ? 0 : numD.intValue());
    }
}

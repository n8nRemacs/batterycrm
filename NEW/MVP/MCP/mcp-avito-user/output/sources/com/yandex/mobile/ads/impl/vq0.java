package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class vq0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final q21 f390969a = q21.b();

    private boolean a(@j.N Context context) {
        v11 v11VarA = this.f390969a.a(context);
        if (v11VarA != null) {
            return v11VarA.W();
        }
        return true;
    }

    public final boolean b(@j.N Context context) {
        return g7.a(context) && !a(context);
    }
}

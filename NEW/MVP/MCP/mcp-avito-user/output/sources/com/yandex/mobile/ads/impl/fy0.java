package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;

/* loaded from: classes8.dex */
final class fy0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hy0 f385528a = new hy0();

    @j.N
    public final dy0 a(@j.N Context context) {
        Button buttonA = this.f385528a.a(context);
        buttonA.setVisibility(8);
        dy0 dy0Var = new dy0(context, buttonA);
        dy0Var.addView(buttonA);
        return dy0Var;
    }
}

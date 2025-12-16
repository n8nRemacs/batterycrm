package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class sh1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zu0 f389949a = new zu0();

    @j.N
    public final rh1 a(@j.N Context context) {
        ProgressBar progressBarA = this.f389949a.a(context);
        progressBarA.setVisibility(8);
        rh1 rh1Var = new rh1(context, progressBarA);
        rh1Var.addView(progressBarA);
        rh1Var.setBackgroundColor(-16777216);
        return rh1Var;
    }
}

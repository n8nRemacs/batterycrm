package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class rh1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ProgressBar f389544a;

    public rh1(@j.N Context context, @j.N ProgressBar progressBar) {
        super(context);
        this.f389544a = progressBar;
    }

    @j.N
    public final ProgressBar a() {
        return this.f389544a;
    }
}

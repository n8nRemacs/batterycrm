package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class wu0 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakReference<ProgressBar> f391492a;

    /* renamed from: b, reason: collision with root package name */
    private final int f391493b;

    /* renamed from: c, reason: collision with root package name */
    private final int f391494c;

    public wu0(@j.N ProgressBar progressBar, int i12, int i13) {
        setInterpolator(new LinearInterpolator());
        this.f391492a = new WeakReference<>(progressBar);
        this.f391493b = i12;
        this.f391494c = i13;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, @j.P Transformation transformation) {
        ProgressBar progressBar = this.f391492a.get();
        if (progressBar != null) {
            super.applyTransformation(f12, transformation);
            progressBar.setProgress(Math.round(((this.f391494c - r5) * f12) + this.f391493b));
        }
    }
}

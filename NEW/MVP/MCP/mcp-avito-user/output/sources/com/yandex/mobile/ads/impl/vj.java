package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class vj {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w9 f390900a;

    public vj(@Y61.k w9 w9Var) {
        this.f390900a = w9Var;
    }

    public static void a(@Y61.k ProgressBar progressBar, int i12, int i13) {
        progressBar.setMax(i12);
        progressBar.setVisibility(0);
        progressBar.setProgress(i13);
    }

    public /* synthetic */ vj() {
        this(new w9());
    }

    public final void a(@Y61.k ProgressBar progressBar, long j12, long j13) {
        this.f390900a.getClass();
        w9.a(progressBar, j12, j13);
    }
}

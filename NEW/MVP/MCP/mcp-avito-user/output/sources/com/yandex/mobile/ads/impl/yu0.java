package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class yu0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final w9 f392073a = new w9();

    public final void a(@j.N ProgressBar progressBar, long j12, long j13) {
        this.f392073a.getClass();
        w9.a(progressBar, j13, j12);
    }

    public static void a(@j.N ProgressBar progressBar, @j.N t50 t50Var) {
        progressBar.setProgress((int) (t50Var.b() * progressBar.getMax()));
    }
}

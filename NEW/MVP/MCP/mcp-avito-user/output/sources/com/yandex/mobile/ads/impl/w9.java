package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes8.dex */
public final class w9 {
    public static void a(@j.N ProgressBar progressBar, long j12, long j13) {
        progressBar.clearAnimation();
        if (j12 > 0) {
            progressBar.setMax((int) j12);
            wu0 wu0Var = new wu0(progressBar, progressBar.getProgress(), (int) j13);
            wu0Var.setDuration(200L);
            progressBar.startAnimation(wu0Var);
        }
    }
}

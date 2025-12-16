package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class s81 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f389814a = TimeUnit.SECONDS.toMillis(1);

    public static void a(@j.N TextView textView, long j12, long j13) {
        textView.setText(String.valueOf((int) Math.ceil((j12 - j13) / f389814a)));
    }
}

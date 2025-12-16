package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cv0 f386168a = new cv0();

    public final void a(@j.N TextView textView, long j12, long j13) {
        this.f386168a.getClass();
        long jCeil = (long) Math.ceil((j12 - j13) / 1000.0f);
        textView.setText(String.format(Locale.US, "%02d:%02d", Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)));
    }
}

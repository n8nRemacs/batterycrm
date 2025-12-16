package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes8.dex */
public final class ck1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ir0 f384322a = new ir0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final dk1 f384323b = new dk1();

    public final int a(@j.N View view) {
        boolean zD2 = rj1.d(view);
        Rect rectA = this.f384323b.a(view);
        if (zD2 || rectA == null) {
            return 0;
        }
        return (rectA.width() * rectA.height()) - this.f384322a.a(view, rectA);
    }
}

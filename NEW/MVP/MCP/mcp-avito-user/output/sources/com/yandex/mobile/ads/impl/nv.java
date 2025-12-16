package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes8.dex */
public final class nv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388379a;

    public nv(@j.N Context context) {
        this.f388379a = context;
    }

    @j.N
    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f388379a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}

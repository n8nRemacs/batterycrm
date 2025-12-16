package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class n91 implements m91 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h11 f388194a = new h11();

    @Override // com.yandex.mobile.ads.impl.m91
    @j.P
    public final TextView a(@j.N View view) {
        h11 h11Var = this.f388194a;
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        h11Var.getClass();
        return (TextView) h11.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.m91
    @j.P
    public final View b(@j.N View view) {
        h11 h11Var = this.f388194a;
        View viewFindViewWithTag = view.findViewWithTag("timer_container");
        h11Var.getClass();
        return (View) h11.a(View.class, viewFindViewWithTag);
    }
}

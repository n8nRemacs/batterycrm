package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class gj1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final View f385770a;

    public gj1(@j.P TextView textView) {
        this.f385770a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.P View view) {
        View view2 = this.f385770a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}

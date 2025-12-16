package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class d31 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f384516a;

    public d31(@j.P TextView textView) {
        this.f384516a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f384516a;
        if (view2 != null) {
            view2.setSelected(!view2.isSelected());
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.td;
import com.yandex.mobile.ads.impl.ze0;

/* loaded from: classes8.dex */
final class xe0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f391705b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ze0.a f391706c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ze0 f391707d;

    public xe0(ze0 ze0Var, View view, td.a aVar) {
        this.f391707d = ze0Var;
        this.f391705b = view;
        this.f391706c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = (ViewGroup) this.f391707d.f392235b.get();
        if (viewGroup != null && viewGroup.indexOfChild(this.f391705b) == -1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            viewGroup.addView(this.f391705b, layoutParams);
            viewGroup.setVisibility(0);
            this.f391705b.setVisibility(0);
        }
        ze0 ze0Var = this.f391707d;
        View view = this.f391705b;
        ze0.a aVar = this.f391706c;
        ze0Var.getClass();
        view.getViewTreeObserver().addOnPreDrawListener(new ye0(ze0Var, view, aVar));
    }
}

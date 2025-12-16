package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
public final class hl0 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ui f386161a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tk0 f386162b = tk0.a();

    public hl0(@j.N Context context, @j.N View.OnClickListener onClickListener) {
        this.f386161a = new ui(context, onClickListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@j.P View view) {
        this.f386161a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f386162b.b(view, motionEvent);
        return this.f386161a.onTouch(view, motionEvent);
    }
}

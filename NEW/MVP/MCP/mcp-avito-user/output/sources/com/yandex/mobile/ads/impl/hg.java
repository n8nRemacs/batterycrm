package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.nb0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class hg extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dq f386127a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Paint f386128b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ls f386129c;

    /* renamed from: d, reason: collision with root package name */
    private int f386130d;

    public hg(@j.N Context context, @j.N dq dqVar) {
        super(context);
        this.f386127a = dqVar;
        this.f386128b = new Paint();
        this.f386129c = new ls();
        a(context);
    }

    private void a(@j.N Context context) {
        this.f386127a.getClass();
        int iRound = Math.round(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        this.f386127a.getClass();
        this.f386130d = Math.round(TypedValue.applyDimension(1, 0.5f, context.getResources().getDisplayMetrics()));
        this.f386128b.setStyle(Paint.Style.STROKE);
        this.f386128b.setStrokeWidth(iRound);
        this.f386128b.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f12 = this.f386130d;
        canvas.drawRect(f12, f12, getWidth() - this.f386130d, getHeight() - this.f386130d, this.f386128b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z12, i12, i13, i14, i15);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z12, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        nb0.a aVarA = this.f386129c.a(i12, i13);
        super.onMeasure(aVarA.f388198a, aVarA.f388199b);
    }

    public void setColor(int i12) {
        if (this.f386128b.getColor() != i12) {
            this.f386128b.setColor(i12);
            requestLayout();
        }
    }
}

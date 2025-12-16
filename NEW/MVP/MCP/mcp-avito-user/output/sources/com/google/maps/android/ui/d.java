package com.google.maps.android.ui;

import android.graphics.Canvas;
import android.widget.TextView;

/* compiled from: SquareTextView.java */
/* loaded from: classes6.dex */
public class d extends TextView {

    /* renamed from: b, reason: collision with root package name */
    public int f362286b;

    /* renamed from: c, reason: collision with root package name */
    public int f362287c;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.f362287c / 2, this.f362286b / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f362286b = measuredWidth - measuredHeight;
            this.f362287c = 0;
        } else {
            this.f362286b = 0;
            this.f362287c = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }
}

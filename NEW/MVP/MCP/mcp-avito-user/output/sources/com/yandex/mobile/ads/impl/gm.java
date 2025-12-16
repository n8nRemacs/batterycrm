package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes8.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final View f385776a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final RectF f385777b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Path f385778c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final float[] f385779d;

    public gm(@j.N View view, float f12) {
        this(view, f12, f12, f12, f12);
    }

    public final void a(@j.N Canvas canvas) {
        if (this.f385779d == null || this.f385778c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f385778c);
    }

    public gm(@j.N View view, float f12, float f13, float f14, float f15) {
        this.f385776a = view;
        this.f385777b = new RectF();
        this.f385778c = new Path();
        this.f385779d = a(f12, f13, f14, f15);
    }

    private static float[] a(float f12, float f13, float f14, float f15) {
        if (f12 > 0.0f || f13 > 0.0f || f14 > 0.0f || f15 > 0.0f) {
            return new float[]{f12, f12, f13, f13, f14, f14, f15, f15};
        }
        return null;
    }

    public final void a() {
        if (this.f385779d != null) {
            int measuredWidth = this.f385776a.getMeasuredWidth();
            int measuredHeight = this.f385776a.getMeasuredHeight();
            int paddingLeft = this.f385776a.getPaddingLeft();
            int paddingTop = this.f385776a.getPaddingTop();
            int paddingRight = measuredWidth - this.f385776a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f385776a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f385777b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f385778c.reset();
            this.f385778c.addRoundRect(this.f385777b, this.f385779d, Path.Direction.CW);
        }
    }
}

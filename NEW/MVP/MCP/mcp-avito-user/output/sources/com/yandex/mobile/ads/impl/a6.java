package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
final class a6 extends View {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cn f383412a;

    /* renamed from: b, reason: collision with root package name */
    Paint f383413b;

    /* renamed from: c, reason: collision with root package name */
    Paint f383414c;

    /* renamed from: d, reason: collision with root package name */
    Paint f383415d;

    /* renamed from: e, reason: collision with root package name */
    int f383416e;

    /* renamed from: f, reason: collision with root package name */
    int f383417f;

    /* renamed from: g, reason: collision with root package name */
    int f383418g;

    /* renamed from: h, reason: collision with root package name */
    float f383419h;

    public a6(Context context) {
        super(context);
        int i12 = x5.f391548a;
        this.f383416e = i12;
        this.f383417f = i12;
        this.f383418g = -1;
        this.f383419h = -1.0f;
        this.f383412a = new cn(context);
        this.f383417f = i12;
        a(i12);
        a();
    }

    private void a(int i12) {
        int iA2 = rj1.a(i12, 20.0f);
        this.f383416e = iA2;
        float[] fArr = new float[3];
        Color.colorToHSV(iA2, fArr);
        if (fArr[2] >= 0.5f) {
            this.f383418g = -16777216;
        } else if (this.f383412a.a()) {
            this.f383418g = -7829368;
        } else {
            this.f383418g = -1;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f383412a.a()) {
            this.f383418g = -7829368;
        } else {
            this.f383418g = -1;
        }
        this.f383413b.setColor(this.f383416e);
        this.f383414c.setColor(this.f383418g);
        this.f383415d.setColor(this.f383418g);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float fMin = Math.min(getWidth(), getHeight());
        float f12 = fMin / 2.0f;
        canvas.drawCircle(f12, f12, f12, this.f383413b);
        float f13 = fMin / 5.0f;
        float f14 = f12 - f13;
        float f15 = f13 + f12;
        canvas.drawLine(f14, f14, f15, f15, this.f383414c);
        canvas.drawLine(f14, f15, f15, f14, this.f383414c);
        float f16 = this.f383419h;
        if (f16 > 0.0f) {
            this.f383415d.setStrokeWidth(f16);
            canvas.drawCircle(f12, f12, f12 - this.f383419h, this.f383415d);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a(w5.f391286a);
            this.f383413b.setColor(this.f383416e);
            this.f383414c.setColor(this.f383418g);
            this.f383415d.setColor(this.f383418g);
            invalidate();
        } else if (1 == motionEvent.getAction()) {
            a(this.f383417f);
            this.f383413b.setColor(this.f383416e);
            this.f383414c.setColor(this.f383418g);
            this.f383415d.setColor(this.f383418g);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i12) {
        this.f383417f = i12;
        a(i12);
        this.f383413b.setColor(this.f383416e);
        this.f383414c.setColor(this.f383418g);
        this.f383415d.setColor(this.f383418g);
        invalidate();
    }

    private void a() {
        Paint paint = new Paint(0);
        this.f383413b = paint;
        paint.setAntiAlias(true);
        this.f383413b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(0);
        this.f383414c = paint2;
        paint2.setAntiAlias(true);
        this.f383414c.setStrokeWidth(2.0f);
        Paint paint3 = this.f383414c;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint(0);
        this.f383415d = paint4;
        paint4.setAntiAlias(true);
        this.f383415d.setStyle(style);
        this.f383413b.setColor(this.f383416e);
        this.f383414c.setColor(this.f383418g);
        this.f383415d.setColor(this.f383418g);
    }
}

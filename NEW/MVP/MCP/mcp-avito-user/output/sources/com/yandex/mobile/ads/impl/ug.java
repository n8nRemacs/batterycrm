package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class ug extends View {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dq f390550a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private Paint f390551b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Paint f390552c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private Paint f390553d;

    /* renamed from: e, reason: collision with root package name */
    private float f390554e;

    /* renamed from: f, reason: collision with root package name */
    private float f390555f;

    /* renamed from: g, reason: collision with root package name */
    private float f390556g;

    /* renamed from: h, reason: collision with root package name */
    private float f390557h;

    public ug(@j.N Context context, @j.N dq dqVar) {
        super(context);
        this.f390550a = dqVar;
        a(context);
    }

    private void a(@j.N Context context) {
        this.f390554e = 40.0f;
        this.f390550a.getClass();
        this.f390555f = Math.round(TypedValue.applyDimension(1, 34.0f, context.getResources().getDisplayMetrics()));
        this.f390550a.getClass();
        this.f390556g = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f390550a.getClass();
        this.f390557h = Math.round(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        this.f390551b = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f390552c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f390552c.setStrokeWidth(this.f390556g);
        this.f390552c.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f390553d = paint3;
        paint3.setStyle(style);
        this.f390553d.setTextSize(this.f390557h);
        this.f390553d.setTextAlign(Paint.Align.CENTER);
        this.f390552c.setColor(rj1.a(-65536, this.f390554e));
        this.f390551b.setColor(rj1.a(-1, this.f390554e));
        this.f390553d.setColor(rj1.a(-65536, this.f390554e));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f12 = this.f390555f / 2.0f;
        canvas.drawCircle(f12, f12, f12, this.f390551b);
        canvas.drawCircle(f12, f12, f12 - (this.f390556g / 2.0f), this.f390552c);
        float f13 = this.f390555f / 2.0f;
        canvas.drawText("!", f13, f13 - ((this.f390553d.ascent() + this.f390553d.descent()) / 2.0f), this.f390553d);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = (int) this.f390555f;
        setMeasuredDimension(i14, i14);
    }

    @Override // android.view.View
    public void setSelected(boolean z12) {
        super.setSelected(z12);
        float f12 = z12 ? 0.0f : 40.0f;
        this.f390554e = f12;
        this.f390552c.setColor(rj1.a(-65536, f12));
        this.f390551b.setColor(rj1.a(-1, this.f390554e));
        this.f390553d.setColor(rj1.a(-65536, this.f390554e));
        invalidate();
    }
}

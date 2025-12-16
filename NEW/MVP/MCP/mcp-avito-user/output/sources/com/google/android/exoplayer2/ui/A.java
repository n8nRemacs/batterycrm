package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import j.P;

/* compiled from: SubtitlePainter.java */
/* loaded from: classes6.dex */
final class A {

    /* renamed from: A, reason: collision with root package name */
    public int f347342A;

    /* renamed from: B, reason: collision with root package name */
    public int f347343B;

    /* renamed from: C, reason: collision with root package name */
    public int f347344C;

    /* renamed from: D, reason: collision with root package name */
    public int f347345D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f347346E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f347347F;

    /* renamed from: G, reason: collision with root package name */
    public int f347348G;

    /* renamed from: H, reason: collision with root package name */
    public int f347349H;

    /* renamed from: I, reason: collision with root package name */
    public int f347350I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f347351J;

    /* renamed from: a, reason: collision with root package name */
    public final float f347352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f347353b;

    /* renamed from: c, reason: collision with root package name */
    public final float f347354c;

    /* renamed from: d, reason: collision with root package name */
    public final float f347355d;

    /* renamed from: e, reason: collision with root package name */
    public final float f347356e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f347357f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f347358g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f347359h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public CharSequence f347360i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public Layout.Alignment f347361j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public Bitmap f347362k;

    /* renamed from: l, reason: collision with root package name */
    public float f347363l;

    /* renamed from: m, reason: collision with root package name */
    public int f347364m;

    /* renamed from: n, reason: collision with root package name */
    public int f347365n;

    /* renamed from: o, reason: collision with root package name */
    public float f347366o;

    /* renamed from: p, reason: collision with root package name */
    public int f347367p;

    /* renamed from: q, reason: collision with root package name */
    public float f347368q;

    /* renamed from: r, reason: collision with root package name */
    public float f347369r;

    /* renamed from: s, reason: collision with root package name */
    public int f347370s;

    /* renamed from: t, reason: collision with root package name */
    public int f347371t;

    /* renamed from: u, reason: collision with root package name */
    public int f347372u;

    /* renamed from: v, reason: collision with root package name */
    public int f347373v;

    /* renamed from: w, reason: collision with root package name */
    public int f347374w;

    /* renamed from: x, reason: collision with root package name */
    public float f347375x;

    /* renamed from: y, reason: collision with root package name */
    public float f347376y;

    /* renamed from: z, reason: collision with root package name */
    public float f347377z;

    public A(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f347356e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f347355d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f347352a = fRound;
        this.f347353b = fRound;
        this.f347354c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f347357f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f347358g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f347359h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z12) {
        if (!z12) {
            this.f347351J.getClass();
            this.f347362k.getClass();
            canvas.drawBitmap(this.f347362k, (Rect) null, this.f347351J, this.f347359h);
            return;
        }
        StaticLayout staticLayout = this.f347346E;
        StaticLayout staticLayout2 = this.f347347F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f347348G, this.f347349H);
        if (Color.alpha(this.f347372u) > 0) {
            Paint paint = this.f347358g;
            paint.setColor(this.f347372u);
            canvas.drawRect(-this.f347350I, 0.0f, staticLayout.getWidth() + this.f347350I, staticLayout.getHeight(), paint);
        }
        int i12 = this.f347374w;
        TextPaint textPaint = this.f347357f;
        if (i12 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f347352a);
            textPaint.setColor(this.f347373v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f12 = this.f347353b;
            if (i12 == 2) {
                float f13 = this.f347354c;
                textPaint.setShadowLayer(f12, f13, f13, this.f347373v);
            } else if (i12 == 3 || i12 == 4) {
                boolean z13 = i12 == 3;
                int i13 = z13 ? -1 : this.f347373v;
                int i14 = z13 ? this.f347373v : -1;
                float f14 = f12 / 2.0f;
                textPaint.setColor(this.f347370s);
                textPaint.setStyle(Paint.Style.FILL);
                float f15 = -f14;
                textPaint.setShadowLayer(f12, f15, f15, i13);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f12, f14, f14, i14);
            }
        }
        textPaint.setColor(this.f347370s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}

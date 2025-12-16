package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class i51 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final e51 f386333a = new e51();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Matrix f386334b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Paint f386335c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final Rect f386336d;

    public i51() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f386335c = paint;
        this.f386336d = new Rect();
    }

    public final void a(@Y61.k ImageView imageView, @Y61.k Bitmap bitmap, @Y61.k c51 c51Var, @Y61.k String str) {
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fC2 = c51Var.c();
        float fB2 = c51Var.b();
        if (height == 0.0f || fB2 == 0.0f || height2 == 0.0f) {
            return;
        }
        float f12 = width / height;
        float f13 = f12 < fC2 / fB2 ? width / fC2 : height / fB2;
        if (f13 > 1.0f) {
            f13 = f12 < width2 / height2 ? width / width2 : height / height2;
        }
        float f14 = 2;
        this.f386334b.setScale(f13, f13);
        this.f386334b.postTranslate((width / f14) - (((c51Var.c() / 2) + c51Var.d()) * f13), (height / f14) - (((c51Var.b() / 2) + c51Var.e()) * f13));
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f386334b);
        imageView.setBackgroundColor(Color.parseColor(str));
        e51 e51Var = this.f386333a;
        Context context = imageView.getContext();
        e51Var.getClass();
        if (e51.a(context)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f386336d;
            rect.set(c51Var.d(), c51Var.e(), c51Var.c() + c51Var.d(), c51Var.b() + c51Var.e());
            canvas.drawRect(rect, this.f386335c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }

    public final void a(@Y61.k ImageView imageView, @Y61.k Bitmap bitmap, @Y61.k c51 c51Var) {
        float fC2;
        Float fValueOf;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fFloatValue = 0.0f;
        Float fValueOf2 = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z12 = width / height > width2 / height2;
        float f12 = z12 ? width / width2 : height / height2;
        float f13 = width2 * f12;
        float f14 = height2 * f12;
        if (z12) {
            fC2 = 0.0f;
        } else {
            fC2 = (width / 2) - (((c51Var.c() / 2) + c51Var.d()) * f12);
            if (fC2 > 0.0f) {
                fValueOf = fValueOf2;
            } else {
                fValueOf = fC2 + f13 < width ? Float.valueOf(width - f13) : null;
            }
            if (fValueOf != null) {
                fC2 = fValueOf.floatValue();
            }
        }
        if (z12) {
            float fB2 = (height / 2) - (((c51Var.b() / 2) + c51Var.e()) * f12);
            if (fB2 <= 0.0f) {
                fValueOf2 = fB2 + f14 < height ? Float.valueOf(height - f14) : null;
            }
            fFloatValue = fValueOf2 != null ? fValueOf2.floatValue() : fB2;
        }
        this.f386334b.setScale(f12, f12);
        this.f386334b.postTranslate(fC2, fFloatValue);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f386334b);
        e51 e51Var = this.f386333a;
        Context context = imageView.getContext();
        e51Var.getClass();
        if (e51.a(context)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f386336d;
            rect.set(c51Var.d(), c51Var.e(), c51Var.c() + c51Var.d(), c51Var.b() + c51Var.e());
            canvas.drawRect(rect, this.f386335c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}

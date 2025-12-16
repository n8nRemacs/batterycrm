package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class RoundedBitmapDrawable extends p {

    /* renamed from: A, reason: collision with root package name */
    @I41.h
    public final Bitmap f340018A;

    @I41.h
    private WeakReference<Bitmap> mLastBitmap;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f340019y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f340020z;

    public RoundedBitmapDrawable(Resources resources, @I41.h Bitmap bitmap, @I41.h Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f340019y = paint2;
        Paint paint3 = new Paint(1);
        this.f340020z = paint3;
        this.f340018A = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.facebook.drawee.drawable.p, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        com.facebook.imagepipeline.systrace.b.a();
        if (!((this.f340100c || this.f340101d || this.f340102e > 0.0f) && this.f340018A != null)) {
            super.draw(canvas);
            com.facebook.imagepipeline.systrace.b.a();
            return;
        }
        f();
        a();
        WeakReference<Bitmap> weakReference = this.mLastBitmap;
        Paint paint = this.f340019y;
        Bitmap bitmap = this.f340018A;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.mLastBitmap = new WeakReference<>(bitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f340104g = true;
        }
        if (this.f340104g) {
            paint.getShader().setLocalMatrix(this.f340118u);
            this.f340104g = false;
        }
        paint.setFilterBitmap(false);
        int iSave = canvas.save();
        canvas.concat(this.f340117t);
        canvas.drawPath(this.f340103f, paint);
        float f12 = this.f340102e;
        if (f12 > 0.0f) {
            Paint paint2 = this.f340020z;
            paint2.setStrokeWidth(f12);
            paint2.setColor(g.b(this.f340105h, paint.getAlpha()));
            canvas.drawPath(this.f340106i, paint2);
        }
        canvas.restoreToCount(iSave);
        com.facebook.imagepipeline.systrace.b.a();
    }

    @Override // com.facebook.drawee.drawable.p, android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        super.setAlpha(i12);
        Paint paint = this.f340019y;
        if (i12 != paint.getAlpha()) {
            paint.setAlpha(i12);
            super.setAlpha(i12);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.p, android.graphics.drawable.Drawable
    public final void setColorFilter(@I41.h ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f340019y.setColorFilter(colorFilter);
    }
}

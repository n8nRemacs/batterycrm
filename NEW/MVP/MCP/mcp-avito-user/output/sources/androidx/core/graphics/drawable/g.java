package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import j.N;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f44748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44749b;

    /* renamed from: e, reason: collision with root package name */
    public final BitmapShader f44752e;

    /* renamed from: g, reason: collision with root package name */
    public float f44754g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44758k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44759l;

    /* renamed from: m, reason: collision with root package name */
    public final int f44760m;

    /* renamed from: c, reason: collision with root package name */
    public final int f44750c = 119;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f44751d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f44753f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final Rect f44755h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    public final RectF f44756i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    public boolean f44757j = true;

    public g(Resources resources, Bitmap bitmap) {
        this.f44749b = 160;
        if (resources != null) {
            this.f44749b = resources.getDisplayMetrics().densityDpi;
        }
        this.f44748a = bitmap;
        if (bitmap == null) {
            this.f44760m = -1;
            this.f44759l = -1;
            this.f44752e = null;
        } else {
            int i12 = this.f44749b;
            this.f44759l = bitmap.getScaledWidth(i12);
            this.f44760m = bitmap.getScaledHeight(i12);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f44752e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public void a(int i12, int i13, int i14, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void b(float f12) {
        if (this.f44754g == f12) {
            return;
        }
        this.f44758k = false;
        boolean z12 = f12 > 0.05f;
        Paint paint = this.f44751d;
        if (z12) {
            paint.setShader(this.f44752e);
        } else {
            paint.setShader(null);
        }
        this.f44754g = f12;
        invalidateSelf();
    }

    public final void c() {
        if (this.f44757j) {
            boolean z12 = this.f44758k;
            Rect rect = this.f44755h;
            if (z12) {
                int iMin = Math.min(this.f44759l, this.f44760m);
                a(this.f44750c, iMin, iMin, getBounds(), this.f44755h);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f44754g = iMin2 * 0.5f;
            } else {
                a(this.f44750c, this.f44759l, this.f44760m, getBounds(), this.f44755h);
            }
            RectF rectF = this.f44756i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f44752e;
            if (bitmapShader != null) {
                Matrix matrix = this.f44753f;
                matrix.setTranslate(rectF.left, rectF.top);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f44748a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f44751d.setShader(bitmapShader);
            }
            this.f44757j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        Bitmap bitmap = this.f44748a;
        if (bitmap == null) {
            return;
        }
        c();
        Paint paint = this.f44751d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f44755h, paint);
            return;
        }
        RectF rectF = this.f44756i;
        float f12 = this.f44754g;
        canvas.drawRoundRect(rectF, f12, f12, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f44751d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f44751d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f44760m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f44759l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f44750c != 119 || this.f44758k || (bitmap = this.f44748a) == null || bitmap.hasAlpha() || this.f44751d.getAlpha() < 255 || this.f44754g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@N Rect rect) {
        super.onBoundsChange(rect);
        if (this.f44758k) {
            this.f44754g = Math.min(this.f44760m, this.f44759l) / 2;
        }
        this.f44757j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        Paint paint = this.f44751d;
        if (i12 != paint.getAlpha()) {
            paint.setAlpha(i12);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44751d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z12) {
        this.f44751d.setDither(z12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z12) {
        this.f44751d.setFilterBitmap(z12);
        invalidateSelf();
    }
}

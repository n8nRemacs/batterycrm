package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ntd extends std {
    public static final /* synthetic */ int M0 = 0;
    public final Paint H0;
    public final Paint I0;
    public final Bitmap J0;
    public WeakReference K0;
    public RectF L0;

    public ntd(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = null;
        this.J0 = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.std, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        ml6.i();
        if (!((this.b || this.c || this.d > 0.0f) && this.J0 != null)) {
            super.draw(canvas);
            ml6.i();
            return;
        }
        e();
        d();
        WeakReference weakReference = this.K0;
        Paint paint = this.H0;
        Bitmap bitmap = this.J0;
        if (weakReference == null || weakReference.get() != bitmap) {
            this.K0 = new WeakReference(bitmap);
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.X = true;
            }
        }
        if (this.X && (shader = paint.getShader()) != null) {
            shader.setLocalMatrix(this.D0);
            this.X = false;
        }
        paint.setFilterBitmap(false);
        int iSave = canvas.save();
        canvas.concat(this.C0);
        RectF rectF = this.L0;
        Path path = this.o;
        if (rectF != null) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.L0);
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSave2);
        } else {
            canvas.drawPath(path, paint);
        }
        float f = this.d;
        if (f > 0.0f) {
            Paint paint2 = this.I0;
            paint2.setStrokeWidth(f);
            paint2.setColor(mee.c(this.Y, paint.getAlpha()));
            canvas.drawPath(this.Z, paint2);
        }
        canvas.restoreToCount(iSave);
        ml6.i();
    }

    @Override // defpackage.std
    public final void e() {
        super.e();
        if (this.L0 == null) {
            this.L0 = new RectF();
        }
        this.D0.mapRect(this.L0, this.w0);
    }

    @Override // defpackage.std, defpackage.mtd
    public final void f() {
    }

    @Override // defpackage.std, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        Paint paint = this.H0;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // defpackage.std, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.H0.setColorFilter(colorFilter);
    }
}

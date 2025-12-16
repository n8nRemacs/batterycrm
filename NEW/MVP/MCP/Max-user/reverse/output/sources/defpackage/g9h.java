package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g9h extends Drawable implements Animatable, u6g {
    public final PathMeasure X;
    public final Path Y;
    public final ds Z;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public final Path o;
    public float s0;
    public final ValueAnimator t0;

    public g9h() {
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.c = paint3;
        this.d = 1.0f;
        this.o = new Path();
        this.X = new PathMeasure();
        this.Y = new Path();
        this.Z = new ds(0.0f, 0.0f, 0.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2000);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new q00(29, this));
        this.t0 = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ds dsVar;
        long jA;
        canvas.drawPath(this.o, this.a);
        float f = this.s0;
        int size = h9h.b.size() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dsVar = (ds) ue3.P(h9h.b);
                break;
            }
            List list = h9h.b;
            ds dsVar2 = (ds) list.get(i2);
            i2++;
            ds dsVar3 = (ds) list.get(i2);
            float f2 = dsVar2.a;
            float f3 = dsVar3.a;
            if (f <= f3 && f2 <= f) {
                float f4 = (f - f2) / (f3 - f2);
                dsVar = this.Z;
                dsVar.a = f;
                float f5 = dsVar2.b;
                dsVar.b = utb.i(dsVar3.b, f5, f4, f5);
                float f6 = dsVar2.c;
                dsVar.c = utb.i(dsVar3.c, f6, f4, f6);
                float f7 = dsVar2.d;
                dsVar.d = utb.i(dsVar3.d, f7, f4, f7);
                break;
            }
        }
        Path path = this.Y;
        path.reset();
        PathMeasure pathMeasure = this.X;
        pathMeasure.getSegment(pathMeasure.getLength() * dsVar.b, pathMeasure.getLength() * dsVar.c, path, true);
        float f8 = dsVar.d - 90.0f;
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        int iSave = canvas.save();
        canvas.rotate(f8, fCenterX, fCenterY);
        try {
            canvas.drawPath(path, this.b);
            canvas.restoreToCount(iSave);
            float f9 = this.s0;
            int size2 = h9h.a.size() - 1;
            while (true) {
                if (i >= size2) {
                    jA = ((m26) ue3.P(h9h.a)).a;
                    break;
                }
                List list2 = h9h.a;
                long j = ((m26) list2.get(i)).a;
                i++;
                long j2 = ((m26) list2.get(i)).a;
                int i3 = (int) (j >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                int i4 = (int) (j2 >> 32);
                if (f9 <= Float.intBitsToFloat(i4) && fIntBitsToFloat <= f9) {
                    float fIntBitsToFloat2 = (f9 - Float.intBitsToFloat(i3)) / (Float.intBitsToFloat(i4) - Float.intBitsToFloat(i3));
                    int i5 = (int) (j & 4294967295L);
                    jA = m26.a(f9, ((Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat(i5)) * fIntBitsToFloat2) + Float.intBitsToFloat(i5));
                    break;
                }
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jA & 4294967295L));
            float f10 = this.d;
            if (fIntBitsToFloat3 > f10) {
                fIntBitsToFloat3 = f10;
            }
            Paint paint = this.c;
            paint.setAlpha((int) (fIntBitsToFloat3 * 255));
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), (Math.min(getBounds().width(), getBounds().height()) * 0.3125f) / 2.0f, paint);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.t0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fMin = Math.min(rect.width(), rect.height());
        float f = 0.125f * fMin;
        this.a.setStrokeWidth(f);
        this.b.setStrokeWidth(f);
        Path path = this.o;
        path.reset();
        path.addCircle(rect.centerX(), rect.centerY(), (fMin - f) / 2.0f, Path.Direction.CW);
        this.X.setPath(path, false);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i = yebVar.getIcon().j;
        this.d = ((i >> 24) & 255) / 255.0f;
        this.a.setColor(v4j.c(i, 0.3f));
        this.b.setColor(i);
        this.c.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.t0.cancel();
    }
}

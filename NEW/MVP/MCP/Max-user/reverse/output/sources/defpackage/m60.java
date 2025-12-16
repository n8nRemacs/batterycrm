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
public final class m60 extends Drawable implements Animatable, u6g {
    public final PathMeasure X;
    public final Path Y;
    public final PathMeasure Z;
    public final Paint a;
    public float b;
    public final Path c;
    public final PathMeasure d;
    public final Path o;
    public final Path s0;
    public final ez7 t0;
    public float u0;
    public final ValueAnimator v0;

    public m60() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.a = paint;
        this.b = 1.0f;
        this.c = new Path();
        this.d = new PathMeasure();
        this.o = new Path();
        this.X = new PathMeasure();
        this.Y = new Path();
        this.Z = new PathMeasure();
        this.s0 = new Path();
        this.t0 = new ez7(0.0f, 0.0f, 0.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2000);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new q00(2, this));
        this.v0 = valueAnimatorOfFloat;
    }

    public final void a(Canvas canvas, List list, PathMeasure pathMeasure) {
        ez7 ez7Var;
        float f = this.u0;
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i >= size) {
                ez7Var = (ez7) ue3.P(list);
                break;
            }
            ez7 ez7Var2 = (ez7) list.get(i);
            i++;
            ez7 ez7Var3 = (ez7) list.get(i);
            float f2 = ez7Var2.a;
            float f3 = ez7Var3.a;
            if (f <= f3 && f2 <= f) {
                float f4 = (f - f2) / (f3 - f2);
                ez7Var = this.t0;
                ez7Var.a = f;
                float f5 = ez7Var2.b;
                ez7Var.b = utb.i(ez7Var3.b, f5, f4, f5);
                float f6 = ez7Var2.c;
                ez7Var.c = utb.i(ez7Var3.c, f6, f4, f6);
                float f7 = ez7Var2.d;
                ez7Var.d = utb.i(ez7Var3.d, f7, f4, f7);
                break;
            }
        }
        float f8 = ez7Var.b;
        float f9 = this.b;
        if (f8 > f9) {
            f8 = f9;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (f8 * 255));
        Path path = this.s0;
        path.reset();
        pathMeasure.getSegment(pathMeasure.getLength() * ez7Var.c, pathMeasure.getLength() * ez7Var.d, path, true);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, n60.a, this.d);
        a(canvas, n60.b, this.X);
        a(canvas, n60.c, this.Z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.v0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fWidth = rect.width();
        float fHeight = rect.height();
        float f = 0.1875f * fWidth;
        this.a.setStrokeWidth(f);
        float f2 = 0.5625f * fHeight;
        float f3 = ((fHeight - f2) / 2.0f) + rect.top;
        float f4 = f2 + f3;
        float f5 = (fWidth - (3 * f)) / 4.0f;
        float f6 = (f / 2.0f) + rect.left + f5;
        float f7 = f6 + f5 + f;
        float f8 = f5 + f7 + f;
        Path path = this.c;
        path.reset();
        path.moveTo(f6, f3);
        path.lineTo(f6, f4);
        this.d.setPath(path, false);
        Path path2 = this.o;
        path2.reset();
        path2.moveTo(f7, f3);
        path2.lineTo(f7, f4);
        this.X.setPath(path2, false);
        Path path3 = this.Y;
        path3.reset();
        path3.moveTo(f8, f3);
        path3.lineTo(f8, f4);
        this.Z.setPath(path3, false);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setColor(yebVar.getIcon().j);
        this.b = ((r2 >> 24) & 255) / 255.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.a;
        if (fni.a(colorFilter, paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.v0.cancel();
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public final class hrc extends View {
    public final Paint a;
    public float b;
    public final ValueAnimator c;
    public final RectF d;
    public RectF o;
    public final RectF s0;
    public final RectF t0;
    public ValueAnimator u0;
    public ValueAnimator v0;
    public final int w0;
    public final int x0;
    public boolean y0;
    public cm6 z0;

    public hrc(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        v1a v1aVar = a93.s0;
        v1aVar.y(this).getIcon();
        paint.setColor(-1);
        this.a = paint;
        float f = vw4.d().getDisplayMetrics().density * 182.0f;
        float f2 = vw4.d().getDisplayMetrics().density * 232.0f;
        this.b = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(1160L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new grc(this, 0));
        this.c = valueAnimatorOfFloat;
        this.d = new RectF();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.w0 = (int) 4280934486L;
        v1aVar.y(this).getIcon();
        this.x0 = -1;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.cancel();
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.v0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.y0;
        RectF rectF = this.d;
        if (!z || this.o == null) {
            rectF.set((getWidth() - this.b) / 2.0f, (getHeight() - this.b) / 2.0f, (getWidth() + this.b) / 2.0f, (getHeight() + this.b) / 2.0f);
        }
        float f = 2;
        float fWidth = (((rectF.width() * 0.15f) * f) / 3.1415927f) * f;
        RectF rectF2 = this.s0;
        rectF2.setEmpty();
        float f2 = rectF.left;
        float f3 = rectF.top;
        rectF2.set(f2, f3, f2 + fWidth, f3 + fWidth);
        Paint paint = this.a;
        canvas.drawArc(rectF2, 180.0f, 90.0f, false, paint);
        float f4 = rectF.right;
        float f5 = rectF.top;
        rectF2.set(f4 - fWidth, f5, f4, f5 + fWidth);
        canvas.drawArc(rectF2, 270.0f, 90.0f, false, paint);
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        rectF2.set(f6 - fWidth, f7 - fWidth, f6, f7);
        canvas.drawArc(rectF2, 0.0f, 90.0f, false, paint);
        float f8 = rectF.left;
        float f9 = rectF.bottom;
        rectF2.set(f8, f9 - fWidth, fWidth + f8, f9);
        canvas.drawArc(rectF2, 90.0f, 90.0f, false, paint);
    }

    public final void setOnQrAnimationCompleteListener(cm6 cm6Var) {
        this.z0 = cm6Var;
    }
}

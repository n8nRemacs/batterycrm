package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public final class efa extends Drawable implements u6g {
    public float X;
    public float Y;
    public final int Z;
    public final Paint a;
    public final Drawable b;
    public int c;
    public int d;
    public float o;
    public final int s0;

    public efa(Context context) {
        v1a v1aVar = a93.s0;
        this.a = new Paint();
        Drawable drawableB = r34.b(context, ivd.c);
        if (drawableB != null) {
            drawableB.setTint(ctd.f(v1aVar, context).f);
            float f = 45;
            drawableB.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        } else {
            drawableB = null;
        }
        this.b = drawableB;
        this.c = v1aVar.x(context).k().b().a.h;
        this.d = ctd.f(v1aVar, context).f;
        this.Z = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(3 * vw4.d().getDisplayMetrics().density);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 30.0f);
        valueAnimatorOfFloat.addUpdateListener(new q00(17, this));
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(4400L);
        valueAnimatorOfFloat.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        paint.setColor(this.c);
        canvas.drawCircle(fCenterX, fCenterY, this.o, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.s0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.d);
        for (int i = 0; i < 12; i++) {
            float f = this.X;
            canvas.drawArc(fCenterX - f, fCenterY - f, fCenterX + f, fCenterY + f, (i * 30.0f) + this.Y, 15.0f, false, paint);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            int iSave = canvas.save();
            canvas.translate((getBounds().width() - drawable.getBounds().width()) / 2.0f, (getBounds().height() - drawable.getBounds().height()) / 2.0f);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fMin = Math.min(rect.width(), rect.height()) / 2.0f;
        this.o = fMin;
        this.X = fMin - this.Z;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(yebVar.getIcon().f);
        }
        this.d = yebVar.getIcon().f;
        this.c = yebVar.b().a.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(i);
        }
    }
}

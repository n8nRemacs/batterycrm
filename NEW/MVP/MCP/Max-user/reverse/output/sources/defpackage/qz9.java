package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class qz9 extends Drawable implements Animatable {
    public final gg X;
    public final ObjectAnimator Y;
    public final Path Z;
    public final Context a;
    public final Object b;
    public final Object c;
    public final lg d;
    public final ObjectAnimator o;
    public float s0;

    public qz9(Context context) {
        this.a = context;
        final int i = 0;
        this.b = ipi.b(3, new cm6(this) { // from class: oz9
            public final /* synthetic */ qz9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Context context2 = this.b.a;
                        Drawable drawableB = r34.b(context2, i0b.T);
                        yeb yebVar = a93.s0.z(context2).c;
                        drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawableB;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(a93.s0.z(this.b.a).c.getIcon().e);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setStrokeWidth(2.0f);
                        return paint;
                }
            }
        });
        final int i2 = 1;
        this.c = ipi.b(3, new cm6(this) { // from class: oz9
            public final /* synthetic */ qz9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Context context2 = this.b.a;
                        Drawable drawableB = r34.b(context2, i0b.T);
                        yeb yebVar = a93.s0.z(context2).c;
                        drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawableB;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(a93.s0.z(this.b.a).c.getIcon().e);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setStrokeWidth(2.0f);
                        return paint;
                }
            }
        });
        lg lgVar = new lg("waveX", 0);
        this.d = lgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, 0, getBounds().width());
        objectAnimatorOfInt.setDuration(1000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pz9
            public final /* synthetic */ qz9 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        qz9 qz9Var = this.b;
                        qz9Var.a(qz9Var.Z);
                        qz9Var.invalidateSelf();
                        break;
                }
            }
        });
        this.o = objectAnimatorOfInt;
        gg ggVar = new gg("volume", 0.0f);
        this.X = ggVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, ggVar, 0.0f, 0.7f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pz9
            public final /* synthetic */ qz9 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        qz9 qz9Var = this.b;
                        qz9Var.a(qz9Var.Z);
                        qz9Var.invalidateSelf();
                        break;
                }
            }
        });
        this.Y = objectAnimatorOfFloat;
        this.Z = new Path();
        this.s0 = 0.7f;
    }

    public final void a(Path path) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = fHeight - (this.X.a * fHeight);
        float f2 = 4;
        float fD = f + (kti.d(vw4.d().getDisplayMetrics().density * f2) / 2);
        path.rewind();
        path.moveTo(0.0f, fD);
        float f3 = fWidth / 3.0f;
        path.cubicTo(f3, (kti.d(vw4.d().getDisplayMetrics().density * f2) / 2) + f, 2 * f3, f, fWidth, (kti.d(f2 * vw4.d().getDisplayMetrics().density) / 2) + f);
        path.lineTo(fWidth, fHeight);
        path.lineTo(0.0f, fHeight);
        path.lineTo(0.0f, fD);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        ((Drawable) this.b.getValue()).draw(canvas);
        lg lgVar = this.d;
        canvas.translate(-lgVar.a, 0.0f);
        ?? r2 = this.c;
        Paint paint = (Paint) r2.getValue();
        Path path = this.Z;
        canvas.drawPath(path, paint);
        canvas.translate(getBounds().width(), 0.0f);
        canvas.drawPath(path, (Paint) r2.getValue());
        canvas.translate(lgVar.a - getBounds().width(), 0.0f);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.o.isRunning() || this.Y.isRunning();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.b.getValue()).setBounds(rect);
        this.o.setValues(PropertyValuesHolder.ofInt(this.d, 0, rect.width()));
        a(this.Z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.o.start();
        this.Y.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.o.cancel();
        this.Y.cancel();
    }
}

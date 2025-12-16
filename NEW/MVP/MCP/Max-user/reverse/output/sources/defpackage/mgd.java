package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class mgd extends Drawable implements Animatable {
    public final Object X;
    public final Object Y;
    public final Context a;
    public final lg b;
    public final ObjectAnimator c;
    public final lg d;
    public final ObjectAnimator o;

    public mgd(Context context) {
        this.a = context;
        lg lgVar = new lg("bgAlpha", 255);
        this.b = lgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, 255, 128, 255);
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        final int i = 0;
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lgd
            public final /* synthetic */ mgd b;

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
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.c = objectAnimatorOfInt;
        lg lgVar2 = new lg("indicatorAlpha", 255);
        this.d = lgVar2;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, lgVar2, 255, 0, 255);
        objectAnimatorOfInt2.setDuration(2000L);
        objectAnimatorOfInt2.setRepeatCount(-1);
        objectAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        final int i2 = 1;
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lgd
            public final /* synthetic */ mgd b;

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
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.o = objectAnimatorOfInt2;
        this.X = ipi.b(3, new efd(1));
        this.Y = ipi.b(3, new ffb(25, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ?? r0 = this.X;
        ((ShapeDrawable) r0.getValue()).setAlpha(this.b.a);
        ((ShapeDrawable) r0.getValue()).draw(canvas);
        int iWidth = getBounds().width() / 2;
        ?? r1 = this.Y;
        float fWidth = iWidth - (((ShapeDrawable) r1.getValue()).getBounds().width() / 2);
        float fHeight = (getBounds().height() / 2) - (((ShapeDrawable) r1.getValue()).getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            ((ShapeDrawable) r1.getValue()).setAlpha(this.d.a);
            ((ShapeDrawable) r1.getValue()).draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
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
        return this.c.isRunning() || this.o.isRunning();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.X.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int iMin = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.Y.getValue()).setBounds(0, 0, iMin, iMin);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c.start();
        this.o.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c.cancel();
        this.o.cancel();
    }
}

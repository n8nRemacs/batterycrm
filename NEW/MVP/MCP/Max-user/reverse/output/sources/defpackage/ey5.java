package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.PathInterpolator;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* loaded from: classes2.dex */
public final class ey5 extends fg5 implements u6g {
    public final AnimatorSet X;
    public boolean Y;
    public int d;
    public final RectF o;

    public ey5(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, cxc.file_typing);
        super(enhancedAnimatedVectorDrawable);
        this.d = 255;
        this.o = new RectF();
        AnimatorSet animatorSet = new AnimatorSet();
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        final VectorPath vectorPathFindPath = enhancedAnimatedVectorDrawable.findPath("_R_G_L_4_G_D_0_P_0");
        if (vectorPathFindPath != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(122, 255);
            valueAnimatorOfInt.setDuration(350L);
            valueAnimatorOfInt.setInterpolator(pathInterpolator);
            final int i = 0;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dy5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            vectorPathFindPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                        default:
                            vectorPathFindPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 122);
            valueAnimatorOfInt2.setDuration(350L);
            valueAnimatorOfInt2.setStartDelay(350L);
            valueAnimatorOfInt2.setInterpolator(pathInterpolator);
            final int i2 = 1;
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dy5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            vectorPathFindPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                        default:
                            vectorPathFindPath.setStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        }
        this.X = animatorSet;
    }

    @Override // defpackage.fg5
    public final void a() {
        this.X.cancel();
        if (this.Y) {
            return;
        }
        start();
    }

    @Override // defpackage.fg5
    public final void b() {
        if (this.Y) {
            return;
        }
        this.X.start();
    }

    @Override // defpackage.h45, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        enhancedAnimatedVectorDrawable.setBounds(bounds);
        Rect bounds2 = getBounds();
        RectF rectF = this.o;
        rectF.set(bounds2);
        canvas.saveLayerAlpha(rectF, this.d);
        enhancedAnimatedVectorDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.d = (yebVar.getIcon().j >> 24) & 255;
        int iC = v4j.c(yebVar.getIcon().j, 1.0f);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        z18.f(enhancedAnimatedVectorDrawable, "_R_G_L_3_G_D_0_P_0", iC);
        z18.f(enhancedAnimatedVectorDrawable, "_R_G_L_2_G_D_0_P_0", iC);
        z18.f(enhancedAnimatedVectorDrawable, "_R_G_L_1_G_D_0_P_0", iC);
        z18.f(enhancedAnimatedVectorDrawable, "_R_G_L_0_G_D_0_P_0", iC);
        z18.f(enhancedAnimatedVectorDrawable, "_R_G_L_4_G_D_0_P_0", iC);
    }

    @Override // defpackage.fg5, android.graphics.drawable.Animatable
    public final void start() {
        this.Y = false;
        super.start();
    }

    @Override // defpackage.fg5, android.graphics.drawable.Animatable
    public final void stop() {
        this.Y = true;
        super.stop();
    }
}

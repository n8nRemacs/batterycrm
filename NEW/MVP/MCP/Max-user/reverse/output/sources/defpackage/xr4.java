package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class xr4 implements t7i, Animator.AnimatorListener {
    public final aqc a;
    public w7i b = null;
    public boolean c = false;
    public boolean d = false;
    public float e = 1.0f;
    public float f = 4.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Matrix j = new Matrix();
    public final Matrix k = new Matrix();

    public xr4(aqc aqcVar) {
        new Matrix();
        this.a = aqcVar;
        aqcVar.c = this;
    }

    @Override // defpackage.t7i
    public void a(final float f, final float f2) {
        float fB = mei.b(this.k);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fB, ((double) fB) <= 1.1d ? 2.5f : 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wr4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xr4 xr4Var = this.a;
                Matrix matrix = xr4Var.k;
                float fB2 = fFloatValue / mei.b(matrix);
                matrix.postScale(fB2, fB2, f, f2);
                xr4Var.j.set(matrix);
                xr4Var.b();
                w7i w7iVar = xr4Var.b;
                if (w7iVar != null) {
                    w7iVar.a(matrix);
                }
            }
        });
        valueAnimatorOfFloat.addListener(this);
        valueAnimatorOfFloat.start();
    }

    public void b() {
        RectF rectF = this.h;
        RectF rectF2 = this.i;
        rectF2.set(rectF);
        Matrix matrix = this.k;
        matrix.mapRect(rectF2);
        float f = rectF2.left;
        float fWidth = rectF2.width();
        RectF rectF3 = this.g;
        float fWidth2 = rectF3.width() - fWidth;
        float fMin = fWidth2 > 0.0f ? fWidth2 / 2.0f : Math.min(Math.max(fWidth2, f), 0.0f);
        float f2 = rectF2.top;
        float fHeight = rectF3.height() - rectF2.height();
        float fMin2 = fHeight > 0.0f ? fHeight / 2.0f : Math.min(Math.max(fHeight, f2), 0.0f);
        float f3 = rectF2.left;
        if (fMin == f3 && fMin2 == rectF2.top) {
            return;
        }
        matrix.postTranslate(fMin - f3, fMin2 - rectF2.top);
        this.a.j();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = true;
    }

    @Override // defpackage.t7i
    public void reset() {
        ((b6) this.a.b).i();
        this.j.reset();
        this.k.reset();
    }
}

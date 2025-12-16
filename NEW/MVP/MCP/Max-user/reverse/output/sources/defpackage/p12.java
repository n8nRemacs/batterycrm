package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class p12 extends FrameLayout {
    public static final /* synthetic */ int z0 = 0;
    public ytc a;
    public ValueAnimator b;
    public final IntEvaluator c;
    public final FloatEvaluator d;
    public int o;
    public int s0;
    public float t0;
    public int u0;
    public int v0;
    public final pcg w0;
    public o12 x0;
    public boolean y0;

    public p12(Context context) {
        super(context, null, 0, 0);
        this.c = new IntEvaluator();
        this.d = new FloatEvaluator();
        pcg pcgVar = new pcg();
        pcgVar.a = 0;
        pcgVar.b = 0;
        this.w0 = pcgVar;
        setOutlineProvider(pcgVar);
    }

    public static final void b(p12 p12Var, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        IntEvaluator intEvaluator = p12Var.c;
        Integer numEvaluate = intEvaluator.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        Integer numEvaluate2 = intEvaluator.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float fEvaluate = p12Var.d.evaluate(f3, (Number) Float.valueOf(f), (Number) Float.valueOf(f2));
        Integer numEvaluate3 = intEvaluator.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer numEvaluate4 = intEvaluator.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        p12Var.getLayoutParams().width = numEvaluate.intValue();
        p12Var.getLayoutParams().height = numEvaluate2.intValue();
        p12Var.setLayoutParams(p12Var.getLayoutParams());
        p12Var.setTranslationY(fEvaluate.floatValue());
        pcg pcgVar = p12Var.w0;
        pcgVar.a = numEvaluate3.intValue();
        pcgVar.b = numEvaluate4.intValue();
        p12Var.invalidateOutline();
    }

    public final void a(boolean z, boolean z2) {
        if (this.y0 == z) {
            return;
        }
        this.y0 = z;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ytc ytcVar = this.a;
        ytc ytcVar2 = ytcVar == null ? null : ytcVar;
        boolean z3 = this.y0;
        if (ytcVar2.b != z3) {
            ytcVar2.b = z3;
            ValueAnimator valueAnimator2 = ytcVar2.c;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float alpha = ytcVar2.u0.getAlpha();
            float f = z3 ? 0.0f : 1.0f;
            float alpha2 = ytcVar2.C0.getAlpha();
            float f2 = z3 ? 1.0f : 0.0f;
            if (!z3) {
                buc bucVar = ytcVar2.d;
                if (bucVar == null) {
                    bucVar = null;
                }
                tcf tcfVar = bucVar.t0;
                if (tcfVar.getValue() instanceof ltc) {
                    tcfVar.m(null, mtc.a);
                    xfh.r(bucVar.v0, ftc.a);
                }
            }
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ytcVar2.c = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new utc(ytcVar2, alpha, f, alpha2, f2, 0));
                valueAnimatorOfFloat.setStartDelay(z3 ? 50L : 0L);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.start();
            } else {
                ytc.c(ytcVar2, alpha, f, alpha2, f2, 1.0f);
            }
        }
        final int measuredWidth = getMeasuredWidth();
        final int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.y0 ? fqi.e(this).getMeasuredWidth() : this.o;
        int measuredHeight2 = this.y0 ? fqi.e(this).getMeasuredHeight() : this.s0;
        final float translationY = getTranslationY();
        boolean z4 = this.y0;
        final float f3 = z4 ? 0.0f : this.t0;
        pcg pcgVar = this.w0;
        final int i = pcgVar.a;
        int i2 = z4 ? 0 : this.u0;
        final int i3 = pcgVar.b;
        final int i4 = z4 ? 0 : this.v0;
        if (!z2) {
            b(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i2, i3, i4, 1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat2;
        final int i5 = i2;
        final int i6 = measuredHeight2;
        final int i7 = measuredWidth2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                p12.b(this.a, measuredWidth, i7, measuredHeight, i6, translationY, f3, i, i5, i3, i4, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.start();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof ytc)) {
            throw new IllegalArgumentException("child must be QuickCameraView instance");
        }
        super.addView(view, layoutParams);
    }

    public final o12 getListener() {
        return this.x0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.y0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        pcg pcgVar = this.w0;
        boolean z = y <= ((float) pcgVar.a);
        boolean z2 = motionEvent.getY() >= ((float) (getMeasuredHeight() - pcgVar.b));
        if (this.y0 || !(z || z2)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(o12 o12Var) {
        this.x0 = o12Var;
    }

    public final void setPreviewTranslationY(float f) {
        this.t0 = f;
        if (this.y0) {
            return;
        }
        setTranslationY(f);
    }
}

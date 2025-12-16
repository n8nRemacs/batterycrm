package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ar8 extends ih {
    public static final /* synthetic */ int w0 = 0;
    public final int u0;
    public final int v0;

    public ar8() {
        this(0);
    }

    public static ObjectAnimator p(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new zq8(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator q(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new yq8(view, f3, 2));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // defpackage.h54
    public final h54 b() {
        return new ar8(this.u0, null);
    }

    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        ar8 ar8Var;
        View view3;
        View view4;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new yq5());
        if (view2 != null) {
            float alpha = view2.getAlpha() == 0.0f ? 1.0f : view2.getAlpha();
            ar8Var = this;
            view3 = view2;
            animatorSet.play(o(view2, 0.0f, alpha, n7j.b(-0.15f, 0.0f, 1.0f), 1.0f, alpha));
        } else {
            ar8Var = this;
            view3 = view2;
        }
        if (view == null || (z && !ar8Var.t0)) {
            view4 = view;
        } else {
            float alpha2 = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
            view4 = view;
            animatorSet.play(ar8Var.o(view4, alpha2, 0.0f, 0.0f, n7j.b(0.85f, 0.0f, 1.0f), alpha2));
        }
        int iV = az1.v(ar8Var.u0);
        if (iV == 0) {
            int i = ar8Var.v0;
            if (z) {
                if (view3 != null) {
                    animatorSet.play(q(view3, view3.getTranslationX() + i, view3.getTranslationX(), view3.getTranslationX()));
                }
                if (view4 != null) {
                    animatorSet.play(q(view4, view4.getTranslationX(), view4.getTranslationX() - i, view4.getTranslationX()));
                    return animatorSet;
                }
            } else {
                if (view3 != null) {
                    animatorSet.play(q(view3, view3.getTranslationX() - i, view3.getTranslationX(), view3.getTranslationX()));
                }
                if (view4 != null) {
                    animatorSet.play(q(view4, view4.getTranslationX(), view4.getTranslationX() + i, view4.getTranslationX()));
                }
            }
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                if (view3 != null) {
                    animatorSet.play(p(view3, 0.8f, 1.0f));
                }
                if (view4 != null) {
                    animatorSet.play(p(view4, 1.0f, 1.1f));
                    return animatorSet;
                }
            } else {
                if (view3 != null) {
                    animatorSet.play(p(view3, 1.1f, 1.0f));
                }
                if (view4 != null) {
                    animatorSet.play(p(view4, 1.0f, 0.8f));
                    return animatorSet;
                }
            }
        }
        return animatorSet;
    }

    @Override // defpackage.ih
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public final ValueAnimator o(final View view, final float f, final float f2, final float f3, final float f4, float f5) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(valueAnimatorOfFloat, view, this, f, f2, f3, f4) { // from class: xq8
            public final /* synthetic */ float X;
            public final /* synthetic */ ValueAnimator a;
            public final /* synthetic */ View b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;
            public final /* synthetic */ float o;

            {
                this.c = f;
                this.d = f2;
                this.o = f3;
                this.X = f4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ar8.w0;
                float fFloatValue = ((Float) this.a.getAnimatedValue()).floatValue();
                float f6 = this.o;
                float fI = this.c;
                if (fFloatValue >= f6) {
                    float f7 = this.X;
                    float f8 = this.d;
                    fI = fFloatValue > f7 ? f8 : utb.i(f8, fI, (fFloatValue - f6) / (f7 - f6), fI);
                }
                this.b.setAlpha(fI);
            }
        });
        valueAnimatorOfFloat.addListener(new yq8(view, f5, 1));
        valueAnimatorOfFloat.addListener(new yq8(view, f5, 0));
        return valueAnimatorOfFloat;
    }

    public /* synthetic */ ar8(int i) {
        this(1, null);
    }

    public ar8(int i, az1 az1Var) {
        super(300L, 2);
        this.u0 = i;
        this.v0 = kti.d(30 * vw4.d().getDisplayMetrics().density);
    }
}

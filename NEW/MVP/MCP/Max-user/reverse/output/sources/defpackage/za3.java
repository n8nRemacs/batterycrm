package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class za3 extends mf5 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final j6 j;
    public final wa3 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public za3(lf5 lf5Var) {
        super(lf5Var);
        this.j = new j6(14, this);
        this.k = new wa3(0, this);
        this.e = exi.c(dvc.motionDurationShort3, 100, lf5Var.getContext());
        this.f = exi.c(dvc.motionDurationShort3, 150, lf5Var.getContext());
        this.g = exi.d(lf5Var.getContext(), dvc.motionEasingLinearInterpolator, rg.a);
        this.h = exi.d(lf5Var.getContext(), dvc.motionEasingEmphasizedInterpolator, rg.d);
    }

    @Override // defpackage.mf5
    public final void a() {
        if (this.b.C0 != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.mf5
    public final int c() {
        return s2d.clear_text_end_icon_content_description;
    }

    @Override // defpackage.mf5
    public final int d() {
        return lxc.mtrl_ic_cancel;
    }

    @Override // defpackage.mf5
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.mf5
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.mf5
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.mf5
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.mf5
    public final void p(boolean z) {
        if (this.b.C0 == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.mf5
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xa3
            public final /* synthetic */ za3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        za3 za3Var = this.b;
                        za3Var.getClass();
                        za3Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        za3 za3Var2 = this.b;
                        za3Var2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = za3Var2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xa3
            public final /* synthetic */ za3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        za3 za3Var = this.b;
                        za3Var.getClass();
                        za3Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        za3 za3Var2 = this.b;
                        za3Var2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = za3Var2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new ya3(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xa3
            public final /* synthetic */ za3 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        za3 za3Var = this.b;
                        za3Var.getClass();
                        za3Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        za3 za3Var2 = this.b;
                        za3Var2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = za3Var2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new ya3(this, i));
    }

    @Override // defpackage.mf5
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new vy1(19, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}

package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R;
import j.N;
import j.P;
import lY0.C43707b;
import wY0.C49576a;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes6.dex */
class g extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f357451e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357452f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final TimeInterpolator f357453g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final TimeInterpolator f357454h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public EditText f357455i;

    /* renamed from: j, reason: collision with root package name */
    public final a f357456j;

    /* renamed from: k, reason: collision with root package name */
    public final b f357457k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f357458l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f357459m;

    public g(@N p pVar) {
        super(pVar);
        this.f357456j = new a(this, 0);
        this.f357457k = new b(this, 0);
        this.f357451e = C49576a.c(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f357452f = C49576a.c(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f357453g = C49576a.d(pVar.getContext(), R.attr.motionEasingLinearInterpolator, C43707b.f413879a);
        this.f357454h = C49576a.d(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, C43707b.f413882d);
    }

    @Override // com.google.android.material.textfield.q
    public final void a() {
        if (this.f357515b.f357499q != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnFocusChangeListener e() {
        return this.f357457k;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnClickListener f() {
        return this.f357456j;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnFocusChangeListener g() {
        return this.f357457k;
    }

    @Override // com.google.android.material.textfield.q
    public final void m(@P EditText editText) {
        this.f357455i = editText;
        this.f357514a.setEndIconVisible(u());
    }

    @Override // com.google.android.material.textfield.q
    public final void p(boolean z12) {
        if (this.f357515b.f357499q == null) {
            return;
        }
        t(z12);
    }

    @Override // com.google.android.material.textfield.q
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f357454h);
        valueAnimatorOfFloat.setDuration(this.f357452f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f357453g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i12 = this.f357451e;
        valueAnimatorOfFloat2.setDuration(i12);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f357458l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f357458l.addListener(new e(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i12);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        this.f357459m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new f(this));
    }

    @Override // com.google.android.material.textfield.q
    public final void s() {
        EditText editText = this.f357455i;
        if (editText != null) {
            editText.post(new d(this, 0));
        }
    }

    public final void t(boolean z12) {
        boolean z13 = this.f357515b.c() == z12;
        if (z12 && !this.f357458l.isRunning()) {
            this.f357459m.cancel();
            this.f357458l.start();
            if (z13) {
                this.f357458l.end();
                return;
            }
            return;
        }
        if (z12) {
            return;
        }
        this.f357458l.cancel();
        this.f357459m.start();
        if (z13) {
            this.f357459m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f357455i;
        return editText != null && (editText.hasFocus() || this.f357517d.hasFocus()) && this.f357455i.getText().length() > 0;
    }
}

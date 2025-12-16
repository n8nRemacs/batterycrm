package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class zb1 extends ConstraintLayout implements jn1 {
    public static final /* synthetic */ yy7[] I0;
    public final AppCompatTextView F0;
    public final AppCompatTextView G0;
    public final nk H0;

    static {
        z8a z8aVar = new z8a(zb1.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;");
        vid.a.getClass();
        I0 = new yy7[]{z8aVar};
    }

    public zb1(Context context) {
        super(context, null);
        this.H0 = new nk(this);
        setBackground(new ec1(context));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(j0b.U);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new kt3(-2, -2));
        t5g t5gVar = dpg.j;
        t5gVar.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(getTitleColor());
        this.G0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(j0b.V);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(new kt3(-2, -1));
        t5gVar.b(appCompatTextView2, t75.b);
        appCompatTextView2.setTextColor(getTitleColor());
        this.F0 = appCompatTextView2;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        float f = 24;
        float f2 = 0;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatTextView2.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, appCompatTextView.getId(), 6);
        ut3VarG.g(id).d.l0 = true;
        ut3VarG.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        ut3VarG.d(id2, 4, appCompatTextView2.getId(), 4);
        ut3VarG.d(id2, 3, appCompatTextView2.getId(), 3);
        ut3VarG.d(id2, 6, appCompatTextView2.getId(), 7);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.a(this);
    }

    private final int getTitleColor() {
        return a93.s0.B(this).c.getText().e;
    }

    @Override // defpackage.jn1
    public final void a(boolean z) {
        ec1 background = getBackground();
        if (background != null) {
            background.Y.O(background, ec1.Z[0], dc1.b);
        }
        ec1 background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        AppCompatTextView appCompatTextView = this.G0;
        appCompatTextView.setTranslationY(0.0f);
        AppCompatTextView appCompatTextView2 = this.F0;
        appCompatTextView2.setTranslationY(0.0f);
        ec1 background3 = getBackground();
        if (background3 != null) {
            background3.setAlpha(255);
        }
        appCompatTextView2.setAlpha(1.0f);
        appCompatTextView.setAlpha(1.0f);
    }

    @Override // defpackage.jn1
    public final void c(boolean z) {
        ec1 background = getBackground();
        if (background != null) {
            background.Y.O(background, ec1.Z[0], dc1.a);
        }
        ec1 background2 = getBackground();
        if (background2 != null) {
            background2.stop();
        }
    }

    @Override // defpackage.jn1
    public final void g(o98 o98Var, boolean z, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new q00(6, this));
        o98Var.add(valueAnimatorOfFloat);
    }

    public final yb1 getIndicatorState() {
        yy7 yy7Var = I0[0];
        return (yb1) this.H0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec1 background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec1 background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void setIndicatorState(yb1 yb1Var) {
        this.H0.O(this, I0[0], yb1Var);
    }

    public final void setTime(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }

    @Override // android.view.View
    public ec1 getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof ec1) {
            return (ec1) background;
        }
        return null;
    }
}

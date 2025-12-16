package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes2.dex */
public final class y09 {
    public static final /* synthetic */ yy7[] m;
    public final ytd a;
    public final View b;
    public final View c;
    public final cm6 d;
    public final boolean e;
    public final v38 f;
    public boolean g;
    public final cm6 h;
    public AnimatorSet i;
    public final t9f j = c7j.c();
    public final int k = kti.d(100 * vw4.d().getDisplayMetrics().density);
    public boolean l;

    static {
        z8a z8aVar = new z8a(y09.class, "keyboardObserverJob", "getKeyboardObserverJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        m = new yy7[]{z8aVar};
    }

    public y09(ytd ytdVar, f82 f82Var, ViewGroup viewGroup, cm6 cm6Var, boolean z, v38 v38Var, boolean z2, cm6 cm6Var2) {
        this.a = ytdVar;
        this.b = f82Var;
        this.c = viewGroup;
        this.d = cm6Var;
        this.e = z;
        this.f = v38Var;
        this.g = z2;
        this.h = cm6Var2;
    }

    public final void a() {
        yy7[] yy7VarArr = m;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.j;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.i = null;
        ytd ytdVar = this.a;
        if (ytdVar.n()) {
            ytdVar.C();
        }
    }

    public final ValueAnimator b(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.c.getPaddingBottom(), i);
        valueAnimatorOfInt.addUpdateListener(new v09(this, 1));
        return valueAnimatorOfInt;
    }

    public final int c() {
        int i = xz7.a;
        return xz7.a(this.b.getContext());
    }

    public final MediaKeyboardWidget d() {
        bud budVar = (bud) ue3.I(this.a.e());
        c54 c54Var = budVar != null ? budVar.a : null;
        if (c54Var instanceof MediaKeyboardWidget) {
            return (MediaKeyboardWidget) c54Var;
        }
        return null;
    }

    public final void e(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.a.n()) {
            boolean z2 = this.e;
            View view = this.b;
            if (!z2) {
                view.setTranslationY(view.getHeight());
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                View view2 = this.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i);
                this.l = false;
                a();
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getHeight());
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                animatorSet2.playTogether(b(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), objectAnimatorOfFloat);
            } else {
                animatorSet2.play(objectAnimatorOfFloat);
            }
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new lh(animatorSet2, new u09(this, 1), 0));
            animatorSet2.start();
            this.i = animatorSet2;
        }
    }

    public final void f() {
        this.l = true;
        boolean z = this.e;
        View view = this.c;
        View view2 = this.b;
        if (z) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getTranslationY(), 0.0f);
            int iC = c();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            boolean z2 = view.getPaddingBottom() != i;
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z2) {
                animatorSet2.playTogether(b(i), objectAnimatorOfFloat);
            } else {
                animatorSet2.play(objectAnimatorOfFloat);
            }
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new lh(animatorSet2, new u09(this, 0), 1));
            animatorSet2.start();
            this.i = animatorSet2;
        } else {
            int i2 = xz7.a;
            boolean zB = xz7.b(xz7.c);
            wz7 wz7Var = (wz7) this.d.invoke();
            if (wz7Var != null) {
                wz7Var.k();
            }
            if (zB) {
                hfh.p(view, new jf(view, this));
            } else {
                int iC2 = c();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i3 = iC2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                boolean z3 = view.getPaddingBottom() != i3;
                view2.setTranslationY(0.0f);
                if (z3) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
                }
            }
        }
        tcf tcfVar = xz7.f;
        d53 d53Var = new d53(tcfVar, 18);
        if (((Boolean) tcfVar.getValue()).booleanValue()) {
            d53Var = new d53(d53Var, 8);
        }
        this.j.O(this, m[0], vpi.b(new g56(d53Var, new x09(this, null), 1), this.f));
    }
}

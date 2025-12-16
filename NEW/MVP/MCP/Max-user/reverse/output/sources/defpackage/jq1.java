package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class jq1 extends ih {
    public static final /* synthetic */ int w0 = 0;
    public final boolean u0;
    public final k18 v0;

    public jq1() {
        this(-1L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(jq1 jq1Var, View view, boolean z) {
        jn1 jn1Var = view instanceof jn1 ? (jn1) view : null;
        if (jn1Var != null) {
            jn1Var.a(z);
        }
        if (z) {
            view.setClipToOutline(true);
            mfh.b(view, new Rect(0, 0, view.getWidth(), view.getHeight()), vw4.d().getDisplayMetrics().density * 0.0f);
        }
    }

    @Override // defpackage.ih, defpackage.h54
    public final boolean d() {
        return this.u0;
    }

    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            p(animatorSet, view2, true);
            return animatorSet;
        }
        if (!z && view != null) {
            p(animatorSet, view, false);
        }
        return animatorSet;
    }

    @Override // defpackage.ih
    public final void n(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(AnimatorSet animatorSet, View view, boolean z) {
        int height;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new hl1(this, view, z, view, z, view, z, 1));
        o98 o98VarD = ve3.d();
        if (z) {
            ((mc1) ((lc1) this.v0.getValue())).getClass();
            height = kti.d(174 * vw4.d().getDisplayMetrics().density);
        } else {
            height = view.getHeight();
        }
        int height2 = z ? view.getHeight() : 0;
        lg lgVar = new lg("bounds", height);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, lgVar, height, height2);
        objectAnimatorOfInt.addUpdateListener(new tg(view, lgVar, 1));
        o98VarD.add(objectAnimatorOfInt);
        jn1 jn1Var = view instanceof jn1 ? (jn1) view : null;
        if (jn1Var != null) {
            jn1Var.g(o98VarD, z, this.d);
        }
        animatorSet.playTogether(ve3.a(o98VarD));
    }

    public jq1(long j, boolean z) {
        super(j, 2);
        this.u0 = z;
        this.v0 = gm1.a.getAccessor().d(HttpStatus.SC_INSUFFICIENT_STORAGE);
    }
}

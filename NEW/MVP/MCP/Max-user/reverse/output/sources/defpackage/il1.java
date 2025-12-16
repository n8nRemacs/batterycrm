package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class il1 extends ih {
    public static final /* synthetic */ int w0 = 0;
    public final boolean u0;
    public final k18 v0;

    public il1() {
        this(-1L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(il1 il1Var, View view, boolean z) {
        hn1 hn1Var = view instanceof hn1 ? (hn1) view : null;
        if (hn1Var != null) {
            hn1Var.o(z);
        }
        if (z) {
            mfh.b(view, new Rect(0, 0, view.getWidth(), view.getHeight()), 0.0f);
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
    public final void p(AnimatorSet animatorSet, final View view, final boolean z) {
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new hl1(this, view, z, view, z, view, z, 0));
        o98 o98VarD = ve3.d();
        PointF pointF = ((mc1) ((lc1) this.v0.getValue())).b;
        final PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        gg ggVar = new gg("bounds", f);
        boolean z2 = view instanceof hn1;
        final hn1 hn1Var = z2 ? (hn1) view : null;
        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, ggVar, f, f2);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gl1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                il1 il1Var = this;
                k18 k18Var = il1Var.v0;
                int i = il1.w0;
                long j = il1Var.d;
                ObjectAnimator objectAnimator = objectAnimatorOfFloat;
                objectAnimator.setDuration(j);
                boolean z3 = z;
                float animatedFraction = z3 ? objectAnimator.getAnimatedFraction() : 1 - objectAnimator.getAnimatedFraction();
                View view2 = view;
                int width = view2.getWidth();
                int height = view2.getHeight();
                PointF pointF3 = pointF2;
                float f3 = pointF3.x;
                float f4 = 1 - animatedFraction;
                float f5 = pointF3.y * f4;
                float fMin = Math.min(f3, f3 * f4);
                float fMin2 = Math.min(pointF3.y, f5);
                float f6 = width * animatedFraction;
                float f7 = height * animatedFraction;
                float f8 = pointF3.x;
                ((mc1) ((lc1) k18Var.getValue())).getClass();
                float fMax = Math.max(f8 + kti.d(118 * vw4.d().getDisplayMetrics().density), f6);
                float f9 = pointF3.y;
                ((mc1) ((lc1) k18Var.getValue())).getClass();
                RectF rectF = new RectF(fMin, fMin2, fMax, Math.max(f9 + kti.d(174 * vw4.d().getDisplayMetrics().density), f7));
                hn1 hn1Var2 = hn1Var;
                if (hn1Var2 != null) {
                    hn1Var2.d(rectF, z3);
                }
                Rect rect = new Rect();
                rectF.roundOut(rect);
                mfh.b(view2, rect, vw4.d().getDisplayMetrics().density * 20.0f);
            }
        });
        if (z) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
            objectAnimatorOfFloat2.setDuration(50L);
            o98VarD.add(objectAnimatorOfFloat2);
        }
        o98VarD.add(objectAnimatorOfFloat);
        hn1 hn1Var2 = z2 ? (hn1) view : null;
        if (hn1Var2 != null) {
            hn1Var2.f(o98VarD, z, this.d);
        }
        animatorSet.playTogether(ve3.a(o98VarD));
    }

    public il1(long j, boolean z) {
        super(j, 2);
        this.u0 = z;
        this.v0 = gm1.a.getAccessor().d(HttpStatus.SC_INSUFFICIENT_STORAGE);
    }
}

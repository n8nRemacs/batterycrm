package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class v5f {
    public static final /* synthetic */ yy7[] e = {new z8a(v5f.class, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, v5f.class, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;")};
    public final x38 a;
    public final Object b = ipi.b(3, new nte(8));
    public final t9f c = c7j.c();
    public final t9f d = c7j.c();

    public v5f(x38 x38Var) {
        this.a = x38Var;
    }

    public static void a(lm7 lm7Var, int i) {
        if (lm7Var == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(((j5f) lm7Var).G0.getCurrentTextColor()), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new p5f(lm7Var, 1));
        valueAnimatorOfObject.start();
    }

    public final void b() {
        yy7[] yy7VarArr = e;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.c;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }
}

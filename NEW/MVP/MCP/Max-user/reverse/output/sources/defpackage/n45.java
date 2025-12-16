package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n45 extends Transition {
    public static final /* synthetic */ int c = 0;
    public final e9j a;
    public final e9j b;

    public n45(e9j e9jVar, e9j e9jVar2) {
        this.a = e9jVar;
        this.b = e9jVar2;
    }

    public static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof ir6) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        e9j e9jVar;
        e9j e9jVar2;
        if (transitionValues != null && transitionValues2 != null) {
            Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
            if (rect == null || rect2 == null || (e9jVar = this.a) == (e9jVar2 = this.b)) {
                return null;
            }
            ir6 ir6Var = (ir6) transitionValues.view;
            ryd rydVar = new ryd(e9jVar, e9jVar2, rect, rect2);
            ((gr6) ir6Var.getHierarchy()).h(rydVar);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new wk0(3, rydVar));
            valueAnimatorOfFloat.addListener(new kh(this, ir6Var, false, 2));
            return valueAnimatorOfFloat;
        }
        return null;
    }
}

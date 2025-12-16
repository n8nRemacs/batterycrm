package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class sp5 extends qih {
    public sp5(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Q0 = i;
    }

    public static float V(eig eigVar, float f) {
        Float f2;
        return (eigVar == null || (f2 = (Float) eigVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.qih
    public final ObjectAnimator S(ViewGroup viewGroup, View view, eig eigVar, eig eigVar2) {
        vhh.a.getClass();
        return U(view, V(eigVar, 0.0f), 1.0f);
    }

    @Override // defpackage.qih
    public final ObjectAnimator T(ViewGroup viewGroup, View view, eig eigVar, eig eigVar2) {
        cih cihVar = vhh.a;
        cihVar.getClass();
        ObjectAnimator objectAnimatorU = U(view, V(eigVar, 1.0f), 0.0f);
        if (objectAnimatorU == null) {
            cihVar.d(view, V(eigVar2, 1.0f));
        }
        return objectAnimatorU;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        vhh.a.d(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, vhh.b, f2);
        rp5 rp5Var = new rp5(view);
        objectAnimatorOfFloat.addListener(rp5Var);
        s().a(rp5Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.shg
    public final void h(eig eigVar) {
        qih.Q(eigVar);
        View view = eigVar.b;
        Float fValueOf = (Float) view.getTag(sxc.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(vhh.a.a(view)) : Float.valueOf(0.0f);
        }
        eigVar.a.put("android:fade:transitionAlpha", fValueOf);
    }
}

package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class mp4 extends u7f {
    public final np4 c;

    public mp4(np4 np4Var) {
        this.c = np4Var;
    }

    @Override // defpackage.u7f
    public final void a(ViewGroup viewGroup) {
        np4 np4Var = this.c;
        v7f v7fVar = (v7f) np4Var.b;
        View view = v7fVar.c.S0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((v7f) np4Var.b).c(this);
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + v7fVar + " has been cancelled.");
        }
    }

    @Override // defpackage.u7f
    public final void b(ViewGroup viewGroup) {
        np4 np4Var = this.c;
        v7f v7fVar = (v7f) np4Var.b;
        if (np4Var.B0()) {
            v7fVar.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = v7fVar.c.S0;
        xo8 xo8VarL0 = np4Var.L0(context);
        if (xo8VarL0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) xo8VarL0.b;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (v7fVar.a != 1) {
            view.startAnimation(animation);
            v7fVar.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        fi6 fi6Var = new fi6(animation, viewGroup, view);
        fi6Var.setAnimationListener(new lp4(v7fVar, viewGroup, view, this));
        view.startAnimation(fi6Var);
        if (c.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + v7fVar + " has started.");
        }
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class pp4 extends u7f {
    public final np4 c;
    public AnimatorSet d;

    public pp4(np4 np4Var) {
        this.c = np4Var;
    }

    @Override // defpackage.u7f
    public final void a(ViewGroup viewGroup) {
        v7f v7fVar = (v7f) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            v7fVar.c(this);
            return;
        }
        if (v7fVar.g) {
            rp4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (c.K(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(v7fVar);
            sb.append(" has been canceled");
            sb.append(v7fVar.g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.u7f
    public final void b(ViewGroup viewGroup) {
        v7f v7fVar = (v7f) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            v7fVar.c(this);
            return;
        }
        animatorSet.start();
        if (c.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + v7fVar + " has started.");
        }
    }

    @Override // defpackage.u7f
    public final void c(te0 te0Var) {
        v7f v7fVar = (v7f) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            v7fVar.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !v7fVar.c.w0) {
            return;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + v7fVar);
        }
        long jA = qp4.a.a(animatorSet);
        long j = (long) (te0Var.c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + v7fVar);
        }
        rp4.a.b(animatorSet, j);
    }

    @Override // defpackage.u7f
    public final void d(ViewGroup viewGroup) {
        pp4 pp4Var;
        np4 np4Var = this.c;
        if (np4Var.B0()) {
            return;
        }
        xo8 xo8VarL0 = np4Var.L0(viewGroup.getContext());
        this.d = xo8VarL0 != null ? (AnimatorSet) xo8VarL0.c : null;
        v7f v7fVar = (v7f) np4Var.b;
        a aVar = v7fVar.c;
        boolean z = v7fVar.a == 3;
        View view = aVar.S0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            pp4Var = this;
            animatorSet.addListener(new op4(viewGroup, view, z, v7fVar, pp4Var));
        } else {
            pp4Var = this;
        }
        AnimatorSet animatorSet2 = pp4Var.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}

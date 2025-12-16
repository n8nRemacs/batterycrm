package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final class op4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ v7f d;
    public final /* synthetic */ pp4 e;

    public op4(ViewGroup viewGroup, View view, boolean z, v7f v7fVar, pp4 pp4Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = v7fVar;
        this.e = pp4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        v7f v7fVar = this.d;
        if (z) {
            ctd.a(v7fVar.a, view, viewGroup);
        }
        pp4 pp4Var = this.e;
        ((v7f) pp4Var.c.b).c(pp4Var);
        if (c.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + v7fVar + " has ended.");
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class hh extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ih d;
    public final /* synthetic */ f54 e;
    public final /* synthetic */ boolean f;

    public hh(ih ihVar, f54 f54Var, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = view;
        this.b = view2;
        this.c = viewGroup;
        this.d = ihVar;
        this.e = f54Var;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ih ihVar = this.d;
        View view = this.a;
        if (view != null) {
            ihVar.n(view);
        }
        View view2 = this.b;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = this.c;
            if (parent == viewGroup) {
                viewGroup.removeView(view2);
            }
        }
        ihVar.k(this.e, this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ih ihVar = this.d;
        if (ihVar.o || ihVar.Z == null) {
            return;
        }
        boolean z = this.f;
        View view = this.a;
        if (view != null && (!z || ihVar.d())) {
            this.c.removeView(view);
        }
        ihVar.k(this.e, this);
        if (!z || view == null) {
            return;
        }
        ihVar.n(view);
    }
}

package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes.dex */
public final class vg implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ em6 f;

    public vg(View view, String str, float f, float f2, boolean z, em6 em6Var) {
        int i = j0b.a;
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = em6Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        em6 em6Var = this.f;
        if (em6Var != null) {
            em6Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(j0b.m, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        em6 em6Var = this.f;
        if (em6Var != null) {
            em6Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(j0b.m, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = j0b.m;
        String str = this.b;
        View view = this.a;
        view.setTag(i, str);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}

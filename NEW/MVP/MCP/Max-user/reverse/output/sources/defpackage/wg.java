package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes.dex */
public final class wg implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ em6 h;

    public wg(View view, String str, float f, float f2, float f3, float f4, boolean z, em6 em6Var) {
        int i = j0b.a;
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = em6Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        float f = this.e;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.f);
        view.setVisibility(this.g ? 0 : 8);
        em6 em6Var = this.h;
        if (em6Var != null) {
            em6Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(j0b.m, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        float f = this.e;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.f);
        view.setVisibility(this.g ? 0 : 8);
        em6 em6Var = this.h;
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
        float f = this.c;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.d);
        view.setVisibility(0);
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class d64 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ e64 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public d64(f82 f82Var, boolean z, f82 f82Var2, e64 e64Var, float f, float f2) {
        this.a = f82Var;
        this.b = z;
        this.c = f82Var2;
        this.d = e64Var;
        this.e = f;
        this.f = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.setTranslationY(this.e);
        this.c.setTranslationY(this.f);
        e64.a(this.d, this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e64.a(this.d, this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = j0b.m;
        boolean z = this.b;
        this.a.setTag(i, z ? "fade_in" : "fade_out");
        this.c.setTag(i, z ? "fade_in" : "fade_out");
        this.d.i.invoke(Boolean.valueOf(z));
    }
}

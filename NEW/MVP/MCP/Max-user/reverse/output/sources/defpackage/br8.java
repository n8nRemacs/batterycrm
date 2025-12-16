package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class br8 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cr8 c;

    public br8(cr8 cr8Var, boolean z, int i) {
        this.c = cr8Var;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cr8 cr8Var = this.c;
        cr8Var.b.setTranslationX(0.0f);
        cr8Var.a(0.0f, this.a, this.b);
    }
}

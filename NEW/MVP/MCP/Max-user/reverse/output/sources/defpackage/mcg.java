package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
public final class mcg implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ cm6 g;

    public mcg(View view, String str, float f, float f2, boolean z, float f3, cm6 cm6Var) {
        int i = zud.a;
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = f3;
        this.g = cm6Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.e ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        cm6 cm6Var = this.g;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
        view.setTag(zud.V0, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        view.setTranslationY(this.f);
        cm6 cm6Var = this.g;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
        view.setTag(zud.V0, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = zud.V0;
        String str = this.b;
        View view = this.a;
        view.setTag(i, str);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}

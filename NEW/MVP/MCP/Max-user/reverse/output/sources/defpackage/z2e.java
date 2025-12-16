package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class z2e implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ d3e b;
    public final /* synthetic */ x2e c;
    public final /* synthetic */ d3e d;
    public final /* synthetic */ t2e e;

    public z2e(View view, d3e d3eVar, x2e x2eVar, d3e d3eVar2, t2e t2eVar) {
        this.a = view;
        this.b = d3eVar;
        this.c = x2eVar;
        this.d = d3eVar2;
        this.e = t2eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.u0.put((EnumMap) this.c, (x2e) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.u0.put((EnumMap) this.c, (x2e) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

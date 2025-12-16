package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class rp5 extends AnimatorListenerAdapter implements rhg {
    public final View a;
    public boolean b = false;

    public rp5(View view) {
        this.a = view;
    }

    @Override // defpackage.rhg
    public final void a(shg shgVar) {
    }

    @Override // defpackage.rhg
    public final void b() {
        View view = this.a;
        view.setTag(sxc.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? vhh.a.a(view) : 0.0f));
    }

    @Override // defpackage.rhg
    public final void c(shg shgVar) {
    }

    @Override // defpackage.rhg
    public final void d(shg shgVar) {
    }

    @Override // defpackage.rhg
    public final void f() {
        this.a.setTag(sxc.transition_pause_alpha, null);
    }

    @Override // defpackage.rhg
    public final void h(shg shgVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        vhh.a.d(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        cih cihVar = vhh.a;
        cihVar.d(view, 1.0f);
        cihVar.getClass();
    }
}

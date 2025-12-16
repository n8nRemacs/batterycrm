package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
public final class q9d implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s9d b;
    public final /* synthetic */ View c;

    public q9d(boolean z, s9d s9dVar, View view) {
        this.a = z;
        this.b = s9dVar;
        this.c = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean zBooleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (zBooleanValue) {
                c9d c9dVar = view instanceof c9d ? (c9d) view : null;
                if (c9dVar == null || !c9dVar.b()) {
                    return;
                }
            }
            uog.i(view, p07.CONFIRM);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

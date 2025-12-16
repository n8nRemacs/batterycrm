package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public final class j4f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideOutLayout b;

    public j4f(SlideOutLayout slideOutLayout, int i) {
        this.b = slideOutLayout;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k4f k4fVar = this.b.x0;
        if (k4fVar != null) {
            k4fVar.m(this.a);
        }
    }
}

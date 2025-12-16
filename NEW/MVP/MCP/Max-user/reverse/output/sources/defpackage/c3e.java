package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class c3e implements Animator.AnimatorListener {
    public final /* synthetic */ d3e a;
    public final /* synthetic */ x2e b;
    public final /* synthetic */ View c;

    public c3e(d3e d3eVar, x2e x2eVar, View view) {
        this.a = d3eVar;
        this.b = x2eVar;
        this.c = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.t0.put((EnumMap) this.b, (x2e) null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.c;
        view.setVisibility(0);
        if (view.getTranslationY() == 0.0f) {
            view.setTranslationY(vw4.d().getDisplayMetrics().density * 4.0f);
        }
    }
}

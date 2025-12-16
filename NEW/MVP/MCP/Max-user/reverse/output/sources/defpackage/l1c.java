package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public final class l1c extends AnimatorListenerAdapter {
    public final /* synthetic */ m1c a;
    public final /* synthetic */ View b;
    public final /* synthetic */ qj1 c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ l3b e;

    public l1c(m1c m1cVar, View view, qj1 qj1Var, RectF rectF, l3b l3bVar) {
        this.a = m1cVar;
        this.b = view;
        this.c = qj1Var;
        this.d = rectF;
        this.e = l3bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        RectF rectF = this.d;
        m1c m1cVar = this.a;
        View view = this.b;
        qj1 qj1Var = this.c;
        m1c.a(m1cVar, view, qj1Var, rectF);
        this.e.invoke();
        if (m1c.b()) {
            view.setLayerType(0, null);
            qj1Var.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RectF rectF = this.d;
        m1c m1cVar = this.a;
        View view = this.b;
        qj1 qj1Var = this.c;
        m1c.a(m1cVar, view, qj1Var, rectF);
        this.e.invoke();
        if (m1c.b()) {
            view.setLayerType(0, null);
            qj1Var.setLayerType(0, null);
        }
    }
}

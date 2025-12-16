package defpackage;

import android.transition.Transition;
import android.view.View;

/* loaded from: classes2.dex */
public final class p9d implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ o75 b;
    public final /* synthetic */ float c;

    public p9d(View view, o75 o75Var, float f) {
        this.a = view;
        this.b = o75Var;
        this.c = f;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        View view = this.a;
        o75 o75Var = this.b;
        float f = this.c;
        m8f m8fVar = new m8f(view, o75Var, f);
        m8fVar.a = 0.0f;
        n8f n8fVar = new n8f(f);
        n8fVar.b(400.0f);
        n8fVar.a(0.68f);
        m8fVar.m = n8fVar;
        m8fVar.g();
    }
}

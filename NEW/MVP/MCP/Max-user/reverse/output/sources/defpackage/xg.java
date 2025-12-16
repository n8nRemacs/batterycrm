package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class xg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ cm6 d;

    public /* synthetic */ xg(cm6 cm6Var, FrameLayout frameLayout, cm6 cm6Var2, int i) {
        this.a = i;
        this.b = cm6Var;
        this.c = frameLayout;
        this.d = cm6Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((View) this.b).setTag(j0b.m, null);
                ((na1) this.d).invoke();
                break;
            case 1:
                ((o6c) this.c).requestLayout();
                this.d.invoke();
                break;
            default:
                ((gvf) this.c).requestLayout();
                this.d.invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((View) this.b).setTag(j0b.m, null);
                ((na1) this.d).invoke();
                break;
            case 1:
                o6c o6cVar = (o6c) this.c;
                o6cVar.requestLayout();
                this.d.invoke();
                o6cVar.o = null;
                break;
            default:
                gvf gvfVar = (gvf) this.c;
                gvfVar.requestLayout();
                this.d.invoke();
                gvfVar.c = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                ((View) this.b).setTag(j0b.m, (String) this.c);
                break;
            case 1:
                ((cm6) this.b).invoke();
                break;
            default:
                ((cm6) this.b).invoke();
                break;
        }
    }

    public xg(View view, String str, na1 na1Var) {
        this.a = 0;
        int i = j0b.a;
        this.b = view;
        this.c = str;
        this.d = na1Var;
    }
}

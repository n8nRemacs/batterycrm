package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e45 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f45 b;

    public /* synthetic */ e45(f45 f45Var, int i) {
        this.a = i;
        this.b = f45Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                f45 f45Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = f45Var.X;
                if (arrayList != null && !f45Var.Y) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).a(f45Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                f45 f45Var = this.b;
                ArrayList arrayList = f45Var.X;
                if (arrayList != null && !f45Var.Y) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).b(f45Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

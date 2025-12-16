package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.view.View;

/* loaded from: classes2.dex */
public final class kh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                ((TransitionValues) this.b).view.setClipBounds(null);
                break;
            case 5:
                ((ehh) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ValueAnimator) this.b).removeListener(this);
                ((fr7) this.c).invoke();
                break;
            case 1:
                super.onAnimationEnd(animator);
                if (((wb3) this.c).b) {
                    ((TransitionValues) this.b).view.setClipBounds(null);
                    break;
                }
                break;
            case 2:
                ((gr6) ((ir6) this.b).getHierarchy()).h(((n45) this.c).b);
                break;
            case 3:
                r95 r95Var = (r95) this.c;
                r95Var.d.setValues((float[]) this.b);
                r95Var.d.invert(r95Var.o);
                r95Var.invalidate();
                break;
            case 4:
                ((us) this.b).remove(animator);
                ((shg) this.c).z0.remove(animator);
                break;
            case 5:
                ((ehh) this.b).c();
                break;
            default:
                s3i s3iVar = (s3i) this.b;
                s3iVar.a.d(1.0f);
                o3i.e((View) this.c, s3iVar);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                ((shg) this.c).z0.add(animator);
                break;
            case 5:
                ((ehh) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ kh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}

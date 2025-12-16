package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.J0 = null;
                actionBarOverlayLayout.w0 = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.J0 = null;
                actionBarOverlayLayout.w0 = false;
                break;
            case 1:
                vf vfVar = (vf) this.b;
                ArrayList arrayList = new ArrayList(vfVar.o);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).a(vfVar);
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                al0 al0Var = (al0) this.b;
                ViewGroup viewGroupD = yqi.d(al0Var);
                nud nudVar = viewGroupD == null ? null : new nud(viewGroupD);
                Iterator it = al0Var.y0.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) nudVar.b).remove((icg) it.next());
                }
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                d65 d65Var = (d65) this.b;
                d65Var.q();
                d65Var.r.start();
                break;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                break;
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                fq8 fq8Var = (fq8) this.b;
                fq8Var.b.setTranslationY(0.0f);
                fq8Var.b(0.0f);
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 9:
                ((shg) this.b).n();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 6:
                super.onAnimationRepeat(animator);
                s48 s48Var = (s48) this.b;
                s48Var.Y = (s48Var.Y + 1) % s48Var.X.c.length;
                s48Var.Z = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                vf vfVar = (vf) this.b;
                ArrayList arrayList = new ArrayList(vfVar.o);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).b(vfVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

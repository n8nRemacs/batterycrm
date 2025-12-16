package defpackage;

import android.animation.Animator;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class hl1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ View f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ih h;

    public /* synthetic */ hl1(ih ihVar, View view, boolean z, View view2, boolean z2, View view3, boolean z3, int i) {
        this.a = i;
        this.h = ihVar;
        this.b = view;
        this.c = z;
        this.d = view2;
        this.e = z2;
        this.f = view3;
        this.g = z3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                il1.o((il1) this.h, this.d, this.e);
                break;
            default:
                jq1.o((jq1) this.h, this.d, this.e);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                il1.o((il1) this.h, this.b, this.c);
                break;
            default:
                jq1.o((jq1) this.h, this.b, this.c);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                KeyEvent.Callback callback = this.f;
                hn1 hn1Var = callback instanceof hn1 ? (hn1) callback : null;
                if (hn1Var != null) {
                    hn1Var.e(this.g);
                    break;
                }
                break;
            default:
                KeyEvent.Callback callback2 = this.f;
                jn1 jn1Var = callback2 instanceof jn1 ? (jn1) callback2 : null;
                if (jn1Var != null) {
                    jn1Var.c(this.g);
                    break;
                }
                break;
        }
    }
}

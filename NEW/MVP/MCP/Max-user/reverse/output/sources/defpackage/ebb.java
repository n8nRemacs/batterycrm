package defpackage;

import android.animation.Animator;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class ebb implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;

    public /* synthetic */ ebb(fbb fbbVar, int i) {
        this.a = i;
        this.b = fbbVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                api.f((View) this.b.B0.getValue());
                break;
            default:
                fbb fbbVar = this.b;
                ((w3b) fbbVar.B0.getValue()).setHint(fbbVar.o);
                fbbVar.z0 = dbb.c;
                cbb cbbVar = fbbVar.t0;
                if (cbbVar != null) {
                    cbbVar.m();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                fbb fbbVar = this.b;
                ?? r0 = fbbVar.B0;
                ?? r1 = fbbVar.D0;
                int i = 8;
                if (r1.e()) {
                    ((ImageView) r1.getValue()).setVisibility(8);
                }
                ?? r12 = fbbVar.C0;
                if (r12.e()) {
                    ((AppCompatImageView) r12.getValue()).setVisibility(8);
                }
                ((View) fbbVar.A0.getValue()).setVisibility(0);
                View view = (View) fbbVar.E0.getValue();
                Editable text = ((w3b) r0.getValue()).getText();
                if (text != null && text.length() != 0) {
                    i = 0;
                }
                view.setVisibility(i);
                ((View) r0.getValue()).setVisibility(0);
                fbbVar.z0 = dbb.d;
                break;
        }
    }
}

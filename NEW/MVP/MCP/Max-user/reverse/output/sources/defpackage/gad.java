package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class gad implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9d b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ int d;

    public /* synthetic */ gad(x9d x9dVar, ViewGroup viewGroup, int i, int i2) {
        this.a = i2;
        this.b = x9dVar;
        this.c = viewGroup;
        this.d = i;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.d;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i = this.d;
                layoutParams.height = i;
                recyclerView.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.c;
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i;
                viewGroup.setLayoutParams(layoutParams2);
                return;
            default:
                RecyclerView recyclerView2 = this.b.d;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i2 = this.d;
                layoutParams3.height = i2;
                recyclerView2.setLayoutParams(layoutParams3);
                ViewGroup viewGroup2 = this.c;
                ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams4.height = i2;
                viewGroup2.setLayoutParams(layoutParams4);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.d;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i = this.d;
                layoutParams.height = i;
                recyclerView.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.c;
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i;
                viewGroup.setLayoutParams(layoutParams2);
                return;
            default:
                RecyclerView recyclerView2 = this.b.d;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i2 = this.d;
                layoutParams3.height = i2;
                recyclerView2.setLayoutParams(layoutParams3);
                ViewGroup viewGroup2 = this.c;
                ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams4.height = i2;
                viewGroup2.setLayoutParams(layoutParams4);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}

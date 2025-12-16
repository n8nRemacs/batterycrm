package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import androidx.swiperefreshlayout.widget.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes10.dex */
class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.b f54600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f54601b;

    public c(d dVar, d.b bVar) {
        this.f54601b = dVar;
        this.f54600a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f54601b;
        d.b bVar = this.f54600a;
        dVar.a(1.0f, bVar, true);
        bVar.f54621k = bVar.f54615e;
        bVar.f54622l = bVar.f54616f;
        bVar.f54623m = bVar.f54617g;
        bVar.a((bVar.f54620j + 1) % bVar.f54619i.length);
        if (!dVar.f54610g) {
            dVar.f54609f += 1.0f;
            return;
        }
        dVar.f54610g = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (bVar.f54624n) {
            bVar.f54624n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54601b.f54609f = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}

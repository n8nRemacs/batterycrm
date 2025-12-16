package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.C20199a;

/* compiled from: Transition.java */
/* loaded from: classes10.dex */
class M extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C20199a f54693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f54694b;

    public M(L l12, C20199a c20199a) {
        this.f54694b = l12;
        this.f54693a = c20199a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54693a.remove(animator);
        this.f54694b.f54679p.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54694b.f54679p.add(animator);
    }
}

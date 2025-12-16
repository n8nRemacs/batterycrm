package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23420k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f54048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f54049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f54050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23418i f54051d;

    public C23420k(View view, ViewPropertyAnimator viewPropertyAnimator, C23418i c23418i, RecyclerView.C c12) {
        this.f54051d = c23418i;
        this.f54048a = c12;
        this.f54049b = view;
        this.f54050c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f54049b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54050c.setListener(null);
        C23418i c23418i = this.f54051d;
        RecyclerView.C c12 = this.f54048a;
        c23418i.h(c12);
        c23418i.f54023o.remove(c12);
        c23418i.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54051d.getClass();
    }
}

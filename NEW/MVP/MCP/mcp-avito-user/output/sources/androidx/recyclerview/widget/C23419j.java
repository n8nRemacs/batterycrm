package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23419j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f54044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f54045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f54046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23418i f54047d;

    public C23419j(View view, ViewPropertyAnimator viewPropertyAnimator, C23418i c23418i, RecyclerView.C c12) {
        this.f54047d = c23418i;
        this.f54044a = c12;
        this.f54045b = viewPropertyAnimator;
        this.f54046c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54045b.setListener(null);
        this.f54046c.setAlpha(1.0f);
        C23418i c23418i = this.f54047d;
        RecyclerView.C c12 = this.f54044a;
        c23418i.h(c12);
        c23418i.f54025q.remove(c12);
        c23418i.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54047d.getClass();
    }
}

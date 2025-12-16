package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C23418i;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23423n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23418i.d f54062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f54063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f54064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23418i f54065d;

    public C23423n(C23418i c23418i, C23418i.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f54065d = c23418i;
        this.f54062a = dVar;
        this.f54063b = viewPropertyAnimator;
        this.f54064c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54063b.setListener(null);
        View view = this.f54064c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23418i.d dVar = this.f54062a;
        RecyclerView.C c12 = dVar.f54034b;
        C23418i c23418i = this.f54065d;
        c23418i.h(c12);
        c23418i.f54026r.remove(dVar.f54034b);
        c23418i.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.C c12 = this.f54062a.f54034b;
        this.f54065d.getClass();
    }
}

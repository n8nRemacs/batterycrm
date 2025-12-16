package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C23418i;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23422m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23418i.d f54058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f54059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f54060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23418i f54061d;

    public C23422m(C23418i c23418i, C23418i.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f54061d = c23418i;
        this.f54058a = dVar;
        this.f54059b = viewPropertyAnimator;
        this.f54060c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54059b.setListener(null);
        View view = this.f54060c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23418i.d dVar = this.f54058a;
        RecyclerView.C c12 = dVar.f54033a;
        C23418i c23418i = this.f54061d;
        c23418i.h(c12);
        c23418i.f54026r.remove(dVar.f54033a);
        c23418i.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.C c12 = this.f54058a.f54033a;
        this.f54061d.getClass();
    }
}

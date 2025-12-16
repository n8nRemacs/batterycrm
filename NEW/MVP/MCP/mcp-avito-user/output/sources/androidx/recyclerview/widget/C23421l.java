package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23421l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f54052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f54054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f54056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C23418i f54057f;

    public C23421l(C23418i c23418i, RecyclerView.C c12, int i12, View view, int i13, ViewPropertyAnimator viewPropertyAnimator) {
        this.f54057f = c23418i;
        this.f54052a = c12;
        this.f54053b = i12;
        this.f54054c = view;
        this.f54055d = i13;
        this.f54056e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i12 = this.f54053b;
        View view = this.f54054c;
        if (i12 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f54055d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54056e.setListener(null);
        C23418i c23418i = this.f54057f;
        RecyclerView.C c12 = this.f54052a;
        c23418i.h(c12);
        c23418i.f54024p.remove(c12);
        c23418i.t();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54057f.getClass();
    }
}

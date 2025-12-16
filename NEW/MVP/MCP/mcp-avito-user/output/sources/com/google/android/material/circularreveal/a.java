package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.g;
import j.N;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes6.dex */
public final class a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    public class C10638a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f356310a;

        public C10638a(g gVar) {
            this.f356310a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f356310a.a();
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f356310a.b();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public static AnimatorSet a(@N g gVar, float f12, float f13, float f14) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(gVar, g.c.f356313a, g.b.f356311b, new g.e(f12, f13, f14));
        g.e revealInfo = gVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f12, (int) f13, revealInfo.f356317c, f14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @N
    public static Animator.AnimatorListener b(@N g gVar) {
        return new C10638a(gVar);
    }
}

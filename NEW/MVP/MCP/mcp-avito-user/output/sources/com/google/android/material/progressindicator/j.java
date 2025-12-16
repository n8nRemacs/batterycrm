package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes6.dex */
class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f356941a;

    public j(l lVar) {
        this.f356941a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        l lVar = this.f356941a;
        ArrayList arrayList = lVar.f356949g;
        if (arrayList == null || lVar.f356950h) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b.a) it.next()).c(lVar);
        }
    }
}

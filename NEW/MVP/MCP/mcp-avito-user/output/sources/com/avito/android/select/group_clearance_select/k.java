package com.avito.android.select.group_clearance_select;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupClearanceView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/k;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f265504a;

    public k(n nVar) {
        this.f265504a = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        n nVar = this.f265504a;
        nVar.f265540i.setVisibility(4);
        nVar.f265542k = false;
        Y41.a<G0> aVar = nVar.f265543l;
        if (aVar != null) {
            aVar.invoke();
        }
        nVar.f265543l = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
        this.f265504a.f265542k = true;
    }
}

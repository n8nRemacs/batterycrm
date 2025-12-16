package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.avito.android.evidence_request.mvi.evidence_details.adapter.files.i;
import kotlin.Metadata;

/* compiled from: FilesViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/j;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i.b f148798a;

    public j(i.b bVar) {
        this.f148798a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
        super.onAnimationCancel(animator);
        this.f148798a.f148797i = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        AnimatorSet animatorSet = this.f148798a.f148797i;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}

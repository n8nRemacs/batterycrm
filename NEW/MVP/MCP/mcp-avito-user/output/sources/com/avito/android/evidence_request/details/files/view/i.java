package com.avito.android.evidence_request.details.files.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.avito.android.evidence_request.details.files.view.g;
import kotlin.Metadata;

/* compiled from: FilesViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/i;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.b f148490a;

    public i(g.b bVar) {
        this.f148490a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
        super.onAnimationCancel(animator);
        this.f148490a.f148487j = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        super.onAnimationEnd(animator);
        AnimatorSet animatorSet = this.f148490a.f148487j;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}

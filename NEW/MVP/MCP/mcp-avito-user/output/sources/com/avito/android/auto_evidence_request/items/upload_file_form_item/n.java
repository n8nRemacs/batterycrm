package com.avito.android.auto_evidence_request.items.upload_file_form_item;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Animator.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/animation/e", "Landroid/animation/Animator$AnimatorListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f95235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f95236b;

    public n(AnimatorSet animatorSet, o oVar) {
        this.f95235a = animatorSet;
        this.f95236b = oVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f95236b.f95246j = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f95235a.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

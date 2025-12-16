package com.avito.android.lib.design.animation;

import Y61.k;
import android.animation.Animator;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationViewLottieEngine.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/e;", "Landroid/animation/Animator$AnimatorPauseListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements Animator.AnimatorPauseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f178346a;

    public e(d dVar) {
        this.f178346a = dVar;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(@k Animator animator) {
        AnimationView.AnimationState animationState = AnimationView.AnimationState.f178274b;
        d dVar = this.f178346a;
        AnimationView.AnimationState animationState2 = dVar.f178342d;
        dVar.f178342d = animationState;
        AnimationView.c cVar = dVar.f178344f;
        if (cVar != null) {
            cVar.a(animationState2, animationState);
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(@k Animator animator) {
        AnimationView.AnimationState animationState = AnimationView.AnimationState.f178275c;
        d dVar = this.f178346a;
        AnimationView.AnimationState animationState2 = dVar.f178342d;
        dVar.f178342d = animationState;
        AnimationView.c cVar = dVar.f178344f;
        if (cVar != null) {
            cVar.a(animationState2, animationState);
        }
    }
}

package com.avito.android.lib.deprecated_design.circular_progress;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.Metadata;

/* compiled from: DefaultCircularProgressDrawableDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/g;", "Lcom/avito/android/lib/deprecated_design/circular_progress/q;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f177901c;

    public g(i iVar) {
        this.f177901c = iVar;
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.q
    public final void a() {
        if (!this.f177937a || this.f177938b) {
            return;
        }
        i iVar = this.f177901c;
        iVar.f177913k = false;
        iVar.f177914l = false;
        iVar.f177910h = (360 - iVar.f177906d) + iVar.f177910h;
        ValueAnimator valueAnimator = iVar.f177916n;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.start();
    }

    @Override // com.avito.android.lib.deprecated_design.circular_progress.q, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
        super.onAnimationStart(animator);
        this.f177901c.f177914l = true;
    }
}

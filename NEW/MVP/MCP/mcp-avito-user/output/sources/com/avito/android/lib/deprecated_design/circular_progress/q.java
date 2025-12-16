package com.avito.android.lib.deprecated_design.circular_progress;

import android.animation.Animator;
import j.InterfaceC42153i;
import kotlin.Metadata;

/* compiled from: SimpleAnimatorListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/q;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class q implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f177937a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f177938b;

    @Override // android.animation.Animator.AnimatorListener
    @InterfaceC42153i
    public final void onAnimationCancel(@Y61.k Animator animator) {
        this.f177938b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    @InterfaceC42153i
    public final void onAnimationEnd(@Y61.k Animator animator) {
        a();
        this.f177937a = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    @InterfaceC42153i
    public void onAnimationStart(@Y61.k Animator animator) {
        this.f177938b = false;
        this.f177937a = true;
    }

    public void a() {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@Y61.k Animator animator) {
    }
}

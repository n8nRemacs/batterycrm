package com.avito.android.lib.deprecated_design.tab;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f178162b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n(int i12, Y41.l lVar) {
        this.f178161a = i12;
        this.f178162b = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f178161a) {
            case 0:
                this.f178162b.invoke((Integer) valueAnimator.getAnimatedValue());
                break;
            case 1:
                this.f178162b.invoke(valueAnimator);
                break;
            default:
                this.f178162b.invoke((Float) valueAnimator.getAnimatedValue());
                break;
        }
    }
}

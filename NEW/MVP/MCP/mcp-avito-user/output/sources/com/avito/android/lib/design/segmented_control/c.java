package com.avito.android.lib.design.segmented_control;

import Y61.k;
import android.animation.Animator;
import com.avito.android.util.C35872q;
import kotlin.Metadata;

/* compiled from: ControlView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/c;", "Lcom/avito/android/util/q$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f180238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f180240c;

    public c(d dVar, int i12, int i13) {
        this.f180238a = dVar;
        this.f180239b = i12;
        this.f180240c = i13;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@k Animator animator) {
        float f12 = this.f180239b;
        float f13 = this.f180240c;
        int i12 = d.f180241h;
        d dVar = this.f180238a;
        dVar.segmentOffset = f12;
        dVar.segmentWidth = f13;
        dVar.postInvalidateOnAnimation();
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        float f12 = this.f180239b;
        float f13 = this.f180240c;
        int i12 = d.f180241h;
        d dVar = this.f180238a;
        dVar.segmentOffset = f12;
        dVar.segmentWidth = f13;
        dVar.postInvalidateOnAnimation();
    }
}

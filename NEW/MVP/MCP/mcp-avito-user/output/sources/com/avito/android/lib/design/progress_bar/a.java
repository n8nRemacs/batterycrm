package com.avito.android.lib.design.progress_bar;

import Y61.k;
import android.animation.Animator;
import com.avito.android.util.C35872q;
import kotlin.Metadata;

/* compiled from: ProgressAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/progress_bar/a;", "Lcom/avito/android/util/q$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f180097a;

    public a(e eVar) {
        this.f180097a = eVar;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        this.f180097a.f180102b = null;
    }
}

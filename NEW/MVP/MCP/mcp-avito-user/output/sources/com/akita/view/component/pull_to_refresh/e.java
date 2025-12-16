package com.akita.view.component.pull_to_refresh;

import Y61.k;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.Metadata;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/e;", "Landroid/view/animation/Animation;", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f66985b;

    public e(b bVar) {
        this.f66985b = bVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, @k Transformation transformation) {
        int i12 = b.f66939S;
        this.f66985b.k(f12);
    }
}

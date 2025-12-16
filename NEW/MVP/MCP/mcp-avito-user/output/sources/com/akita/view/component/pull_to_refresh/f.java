package com.akita.view.component.pull_to_refresh;

import Y61.l;
import android.view.animation.Animation;
import kotlin.Metadata;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/f;", "Landroid/view/animation/Animation$AnimationListener;", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f66986a;

    public f(b bVar) {
        this.f66986a = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@l Animation animation) {
        int i12 = b.f66939S;
        b bVar = this.f66986a;
        bVar.getClass();
        h hVar = new h(bVar);
        bVar.f66950K = hVar;
        hVar.setDuration(300L);
        j jVar = bVar.f66959c;
        (jVar == null ? null : jVar).f66990b = null;
        if (jVar == null) {
            jVar = null;
        }
        jVar.clearAnimation();
        j jVar2 = bVar.f66959c;
        (jVar2 != null ? jVar2 : null).startAnimation(bVar.f66950K);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@l Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@l Animation animation) {
    }
}

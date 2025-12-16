package com.akita.view.component.pull_to_refresh;

import Y61.l;
import android.view.View;
import android.view.animation.Animation;
import com.akita.view.component.pull_to_refresh.b;
import kotlin.Metadata;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/g;", "Landroid/view/animation/Animation$AnimationListener;", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f66987a;

    public g(b bVar) {
        this.f66987a = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@l Animation animation) {
        b.c cVar;
        b bVar = this.f66987a;
        if (!bVar.f66965i) {
            bVar.l();
            return;
        }
        if (bVar.f66951L && (cVar = bVar.f66964h) != null) {
            cVar.j0();
        }
        j jVar = bVar.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        bVar.f66974r = jVar.getTop();
        View view = bVar.f66958b;
        bVar.f66975s = view != null ? view.getTop() : 0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@l Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@l Animation animation) {
    }
}

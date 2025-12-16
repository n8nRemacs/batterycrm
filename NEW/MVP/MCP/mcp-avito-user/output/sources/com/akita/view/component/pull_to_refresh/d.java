package com.akita.view.component.pull_to_refresh;

import Y61.k;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/d;", "Landroid/view/animation/Animation;", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f66984b;

    public d(b bVar) {
        this.f66984b = bVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, @k Transformation transformation) {
        int i12 = b.f66939S;
        b bVar = this.f66984b;
        int iAbs = (int) (bVar.f66946G - Math.abs(bVar.getOriginalSpinnerOffsetTop()));
        int iAbs2 = (int) (bVar.f66947H - Math.abs(bVar.getOriginalTargetOffsetTop()));
        int i13 = bVar.f66940A + ((int) ((iAbs - r2) * f12));
        int i14 = bVar.f66941B + ((int) ((iAbs2 - r0) * f12));
        j jVar = bVar.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        int top = i13 - jVar.getTop();
        View view = bVar.f66958b;
        int top2 = i14 - (view != null ? view.getTop() : 0);
        float f13 = 1;
        float f14 = bVar.f66942C;
        float fC2 = r.c(f13, f14, f12, f14);
        j jVar2 = bVar.f66959c;
        j jVar3 = jVar2 != null ? jVar2 : null;
        float f15 = bVar.f66943D;
        jVar3.setAlpha(((f13 - f15) * f12) + f15);
        bVar.setSpinnerViewScale(fC2);
        bVar.setSpinnerViewOffsetTopAndBottom(top);
        bVar.setTargetViewOffsetTopAndBottom(top2);
    }
}

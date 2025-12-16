package com.akita.view.component.pull_to_refresh;

import Y61.l;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/j;", "Landroidx/appcompat/widget/AppCompatImageView;", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Animation.AnimationListener f66990b;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f66990b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f66990b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }
}

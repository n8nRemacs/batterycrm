package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes10.dex */
class h extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f54637b;

    public h(SwipeRefreshLayout swipeRefreshLayout) {
        this.f54637b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f54637b;
        float f13 = swipeRefreshLayout.f54589y;
        swipeRefreshLayout.setAnimationProgress(((-f13) * f12) + f13);
        swipeRefreshLayout.e(f12);
    }
}

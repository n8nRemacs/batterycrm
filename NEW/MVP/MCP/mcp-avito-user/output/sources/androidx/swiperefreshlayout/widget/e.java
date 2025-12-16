package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes10.dex */
class e extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f54632b;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f54632b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, Transformation transformation) {
        this.f54632b.setAnimationProgress(f12);
    }
}

package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes10.dex */
class f extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f54633b;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f54633b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, Transformation transformation) {
        this.f54633b.setAnimationProgress(1.0f - f12);
    }
}

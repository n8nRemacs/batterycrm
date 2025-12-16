package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes10.dex */
class g extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f54636d;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i12, int i13) {
        this.f54636d = swipeRefreshLayout;
        this.f54634b = i12;
        this.f54635c = i13;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f12, Transformation transformation) {
        this.f54636d.f54552C.setAlpha((int) (((this.f54635c - r0) * f12) + this.f54634b));
    }
}

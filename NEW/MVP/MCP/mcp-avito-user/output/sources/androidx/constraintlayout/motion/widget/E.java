package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
class E implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f43742a;

    public E(androidx.constraintlayout.core.motion.utils.d dVar) {
        this.f43742a = dVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        return (float) this.f43742a.a(f12);
    }
}

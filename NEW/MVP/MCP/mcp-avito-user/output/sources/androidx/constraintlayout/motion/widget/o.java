package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
class o implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f43996a;

    public o(androidx.constraintlayout.core.motion.utils.d dVar) {
        this.f43996a = dVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        return (float) this.f43996a.a(f12);
    }
}

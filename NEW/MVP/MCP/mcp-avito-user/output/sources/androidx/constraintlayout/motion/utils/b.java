package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.q;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.motion.widget.s;

/* compiled from: StopLogic.java */
/* loaded from: classes.dex */
public class b extends s {

    /* renamed from: a, reason: collision with root package name */
    public final t f43695a;

    /* renamed from: b, reason: collision with root package name */
    public q f43696b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.motion.utils.s f43697c;

    public b() {
        t tVar = new t();
        this.f43695a = tVar;
        this.f43697c = tVar;
    }

    @Override // androidx.constraintlayout.motion.widget.s
    public final float a() {
        return this.f43697c.a();
    }

    public final void b(float f12, float f13, float f14, float f15, float f16, float f17) {
        t tVar = this.f43695a;
        this.f43697c = tVar;
        tVar.f43353l = f12;
        boolean z12 = f12 > f13;
        tVar.f43352k = z12;
        if (z12) {
            tVar.d(-f14, f12 - f13, f16, f17, f15);
        } else {
            tVar.d(f14, f13 - f12, f16, f17, f15);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f12) {
        return this.f43697c.getInterpolation(f12);
    }
}

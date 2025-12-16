package lY0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import j.N;
import j.P;

/* compiled from: MotionTiming.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f413893a;

    /* renamed from: c, reason: collision with root package name */
    @P
    public TimeInterpolator f413895c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f413896d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f413897e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f413894b = 150;

    public j(long j12) {
        this.f413893a = j12;
    }

    public final void a(@N Animator animator) {
        animator.setStartDelay(this.f413893a);
        animator.setDuration(this.f413894b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f413896d);
            valueAnimator.setRepeatMode(this.f413897e);
        }
    }

    @P
    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f413895c;
        return timeInterpolator != null ? timeInterpolator : C43707b.f413880b;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f413893a == jVar.f413893a && this.f413894b == jVar.f413894b && this.f413896d == jVar.f413896d && this.f413897e == jVar.f413897e) {
            return b().getClass().equals(jVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j12 = this.f413893a;
        long j13 = this.f413894b;
        return ((((b().getClass().hashCode() + (((((int) (j12 ^ (j12 >>> 32))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31)) * 31) + this.f413896d) * 31) + this.f413897e;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(getClass().getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f413893a);
        sb2.append(" duration: ");
        sb2.append(this.f413894b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f413896d);
        sb2.append(" repeatMode: ");
        return AK.c.i(this.f413897e, "}\n", sb2);
    }
}

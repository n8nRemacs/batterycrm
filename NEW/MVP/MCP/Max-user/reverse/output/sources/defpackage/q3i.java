package defpackage;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class q3i extends r3i {
    public final WindowInsetsAnimation e;

    public q3i(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.r3i
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.r3i
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.r3i
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.r3i
    public final void d(float f) {
        this.e.setFraction(f);
    }
}

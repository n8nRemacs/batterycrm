package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class yx6 extends cy6 {
    public int d;

    @Override // defpackage.cy6
    public final int a(hy6 hy6Var, View view, bxe bxeVar, int i, boolean z) {
        return Math.max(0, super.a(hy6Var, view, bxeVar, i, z));
    }

    @Override // defpackage.cy6
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override // defpackage.cy6
    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    @Override // defpackage.cy6
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}

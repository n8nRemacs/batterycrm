package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class ze7 extends kj0 {
    public final qg4 b;
    public long c = -1;

    public ze7(qg4 qg4Var) {
        this.b = qg4Var;
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void b(String str, Object obj, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        qg4 qg4Var = this.b;
        qg4Var.s = jCurrentTimeMillis;
        qg4Var.invalidateSelf();
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void g(String str) {
        this.c = System.currentTimeMillis();
    }
}

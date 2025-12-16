package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class bpg extends cie {
    public final int i;
    public final boolean j;
    public final boolean k;

    public bpg(Context context, h18 h18Var, nxg nxgVar, pc2 pc2Var, so3 so3Var) {
        super(context, h18Var, pc2Var, nxgVar, so3Var);
        this.i = 2;
        this.j = true;
        this.k = true;
    }

    @Override // defpackage.cie
    public final boolean c() {
        return this.k;
    }

    @Override // defpackage.cie
    public final boolean d() {
        return this.j;
    }

    @Override // defpackage.cie
    public final int e() {
        return this.i;
    }
}

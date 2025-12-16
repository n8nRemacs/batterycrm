package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bh4 implements mu6 {
    public final uy0 a;
    public final gf3 b;

    public bh4(uy0 uy0Var, gf3 gf3Var) {
        this.a = uy0Var;
        this.b = gf3Var;
    }

    @Override // defpackage.mu6
    public final su6 a(Context context, boolean z) {
        return new ch4(context, this.a, this.b);
    }
}

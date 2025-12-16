package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class gz {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;

    public gz(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9) {
        this.a = k18Var2;
        this.b = k18Var;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var6;
        this.f = k18Var5;
        this.g = k18Var7;
        this.h = k18Var8;
        this.i = k18Var9;
    }

    public static Object b(gz gzVar, si9 si9Var, boolean z, Long l, int i, q44 q44Var, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            l = null;
        }
        return svi.i(((q2b) ((lzf) gzVar.d.getValue())).b(), new fz(gzVar, si9Var, (i2 & 8) != 0 ? 0 : i, l, z2, null), q44Var);
    }

    public final Context a() {
        return (Context) this.f.getValue();
    }
}

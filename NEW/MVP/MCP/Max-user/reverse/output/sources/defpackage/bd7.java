package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class bd7 {
    public static final id7 a;

    static {
        Object size = new Size(640, 480);
        Object aodVar = new aod(l16.c, new bod(d4f.c), null);
        ad7 ad7Var = new ad7(0);
        s90 s90Var = bf7.E;
        x8a x8aVar = ad7Var.b;
        x8aVar.n(s90Var, size);
        x8aVar.n(xwg.l0, 1);
        x8aVar.n(bf7.z, 0);
        x8aVar.n(bf7.H, aodVar);
        u75 u75Var = u75.d;
        if (!u75Var.equals(u75Var)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        x8aVar.n(re7.y, u75Var);
        a = new id7(fjb.a(x8aVar));
    }
}

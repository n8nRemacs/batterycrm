package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class hch {
    public final Context b;
    public final f28 c;
    public final ur3 d;
    public final m0g e;
    public final z7c f;
    public final hwa g;
    public final d1g h;
    public final lr3 i;
    public final tw0 j;
    public final qx5 k;
    public final m3h a = new m3h();
    public final int l = 30;

    public hch(Context context, ur3 ur3Var, f28 f28Var, m0g m0gVar, z7c z7cVar, hwa hwaVar, d1g d1gVar, lr3 lr3Var, tw0 tw0Var, qx5 qx5Var) {
        this.b = context;
        this.d = ur3Var;
        this.c = f28Var;
        this.e = m0gVar;
        this.f = z7cVar;
        this.g = hwaVar;
        this.h = d1gVar;
        this.i = lr3Var;
        this.j = tw0Var;
        this.k = qx5Var;
    }

    public final String a(w10 w10Var) {
        long j;
        boolean zH = ssi.h(w10Var);
        boolean zH2 = w10Var.h();
        String str = w10Var.s;
        if (zH2) {
            j = w10Var.d.a;
        } else {
            if (!zH) {
                return null;
            }
            j = 0;
        }
        if (l8g.c(str)) {
            return null;
        }
        if (pbj.b(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        File fileR = ((iz5) this.k).r(j);
        if (pbj.b(fileR)) {
            return fileR.getAbsolutePath();
        }
        return null;
    }
}

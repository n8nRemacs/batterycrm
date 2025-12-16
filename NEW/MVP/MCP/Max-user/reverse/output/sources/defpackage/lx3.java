package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lx3 {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public lx3(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public final void a(jx3 jx3Var, long[] jArr, long j) {
        ((qv3) this.b.getValue()).r(jx3Var.e(), jArr);
        List listE = jx3Var.e();
        xs xsVar = new xs(0);
        Iterator it = ((ArrayList) listE).iterator();
        while (it.hasNext()) {
            xsVar.add(Long.valueOf(((gx3) it.next()).a));
        }
        for (long j2 : jArr) {
            xsVar.add(Long.valueOf(j2));
        }
        if (xsVar.isEmpty()) {
            return;
        }
        ((kq7) this.c.getValue()).a(xsVar);
        ((tw0) this.a.getValue()).c(new t24(j, xsVar));
    }
}

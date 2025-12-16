package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d5a {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public d5a(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public final void a(w4a w4aVar, long j, long[] jArr, long j2) {
        pb2 pb2VarJ;
        sz szVar = w4aVar.d;
        sz szVar2 = w4aVar.d;
        n8a n8aVar = new n8a(szVar.size());
        ArrayList arrayList = new ArrayList();
        Iterator it = szVar.iterator();
        while (it.hasNext()) {
            fh9 fh9Var = (fh9) it.next();
            if (fh9Var.o != km9.c) {
                arrayList.add(fh9Var);
                n8aVar.a(fh9Var.a);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        k18 k18Var = this.b;
        if (zIsEmpty) {
            pb2VarJ = null;
        } else {
            pb2VarJ = ((ve2) this.c.getValue()).J(w4aVar.c);
            if (pb2VarJ != null) {
                ((qi9) k18Var.getValue()).g(pb2VarJ.a, ((w4e) ((pb3) this.d.getValue())).s(), szVar2);
            }
        }
        k18 k18Var2 = this.a;
        ((tw0) k18Var2.getValue()).c(new z4a(j2, j, dsi.f(n8aVar), szVar2, jArr));
        if (pb2VarJ != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                si9 si9VarI = ((qi9) k18Var.getValue()).i(pb2VarJ.a, ((fh9) it2.next()).a);
                if (si9VarI != null) {
                    ((tw0) k18Var2.getValue()).c(new itg(pb2VarJ.a, si9VarI.a, false));
                }
            }
        }
        she.v((c6i) this.e.getValue());
    }
}

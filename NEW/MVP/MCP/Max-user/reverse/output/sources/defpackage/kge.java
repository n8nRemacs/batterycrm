package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class kge extends hge {
    public final long b;
    public final boolean c;
    public final String d = kge.class.getName();

    public kge(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.hge
    public final void u() throws Throwable {
        StringBuilder sb = new StringBuilder("process, chatsIds = ");
        long j = this.b;
        sb.append(j);
        sb.append(" , forAll = ");
        boolean z = this.c;
        sb.append(z);
        wqi.c(this.d, sb.toString(), new Object[0]);
        if (j == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        pb2 pb2VarM = e().M(j);
        if (pb2VarM == null) {
            return;
        }
        rf2 rf2Var = pb2VarM.b;
        long j2 = rf2Var.k;
        m().u(this.b, j2, jm9.DELETED);
        e().H(j);
        ve2 ve2VarE = e();
        ve2VarE.getClass();
        long j3 = pb2VarM.a;
        ve2VarE.n(j3, bf2.d);
        ve2VarE.r(j3, false, new de2(0));
        hwa hwaVarA = a();
        long j4 = pb2VarM.a;
        long j5 = rf2Var.a;
        boolean z2 = pb2VarM.I() || z;
        if (hwaVarA.j(j4)) {
            hwa.r(hwaVarA, new td2(hwaVarA.t().a.k(), j4, j5, j2, z2));
        }
        r().c(new ud2(j));
        ku3 ku3VarN = pb2VarM.n();
        if (ku3VarN != null) {
            arrayList.add(Long.valueOf(ku3VarN.p()));
        }
        wf8 wf8VarK = k();
        m().h(j);
        wf8VarK.getClass();
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((y7b) igeVar.w.getValue()).a(rf2Var.a);
        if (!arrayList.isEmpty()) {
            r().c(new t24(arrayList));
        }
        r().c(new n73(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vj2 implements g37 {
    public final /* synthetic */ df2 b;
    public final /* synthetic */ gge c;

    public vj2(gge ggeVar, df2 df2Var) {
        this.c = ggeVar;
        this.b = df2Var;
    }

    @Override // defpackage.g37
    public final long g() {
        return this.b.c;
    }

    @Override // defpackage.g37
    public final long h() {
        long j = this.b.d;
        if (j == 0) {
            gge ggeVar = this.c;
            long j2 = ((pb2) ggeVar.b).b.j;
            long j3 = ((si9) ggeVar.c).a;
            if (j2 == j3) {
                return j3;
            }
        }
        return j;
    }

    @Override // defpackage.g37
    public final List j() {
        ArrayList arrayList = new ArrayList(this.b.e);
        gge ggeVar = this.c;
        arrayList.addAll(((pb2) ggeVar.b).b.n.d(rs4.REGULAR));
        p4j.j(arrayList);
        si9 si9Var = (si9) ggeVar.c;
        if (((jf2) p4j.e(si9Var.c, arrayList).b) == null) {
            long j = si9Var.c;
            arrayList.add(new jf2(j, j));
        }
        return new ArrayList(arrayList);
    }
}

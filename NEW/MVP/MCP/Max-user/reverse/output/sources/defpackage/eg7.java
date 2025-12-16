package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class eg7 extends a2 implements lh7, lyg, Iterable {
    public static final eg7 b = new eg7(new lyg[0]);
    public final lyg[] a;

    public eg7(lyg[] lygVarArr) {
        this.a = lygVarArr;
    }

    @Override // defpackage.lyg
    public final String a() {
        lyg[] lygVarArr = this.a;
        if (lygVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(lygVarArr[0].a());
        for (int i = 1; i < lygVarArr.length; i++) {
            sb.append(",");
            sb.append(lygVarArr[i].a());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.a2, defpackage.lyg
    public final eg7 c() {
        return this;
    }

    @Override // defpackage.lyg
    public final int d() {
        return 7;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyg) {
            lyg lygVar = (lyg) obj;
            boolean z = lygVar instanceof eg7;
            lyg[] lygVarArr = this.a;
            if (z) {
                return Arrays.equals(lygVarArr, ((eg7) lygVar).a);
            }
            int iD = ((a2) lygVar).d();
            if (iD == 0) {
                throw null;
            }
            if (iD == 7) {
                eg7 eg7VarC = lygVar.c();
                if (lygVarArr.length == eg7VarC.a.length) {
                    Iterator it = eg7VarC.iterator();
                    for (lyg lygVar2 : lygVarArr) {
                        dg7 dg7Var = (dg7) it;
                        if (dg7Var.hasNext() && lygVar2.equals(dg7Var.next())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        int i = 0;
        while (true) {
            lyg[] lygVarArr = this.a;
            if (i >= lygVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + lygVarArr[i].hashCode();
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dg7(this.a, 0);
    }

    @Override // defpackage.a2
    /* renamed from: r */
    public final eg7 c() {
        return this;
    }

    public final String toString() {
        lyg[] lygVarArr = this.a;
        if (lygVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        lyg lygVar = lygVarArr[0];
        if (xrf.e(((a2) lygVar).d())) {
            sb.append(lygVar.a());
        } else {
            sb.append(lygVar.toString());
        }
        for (int i = 1; i < lygVarArr.length; i++) {
            sb.append(",");
            lyg lygVar2 = lygVarArr[i];
            if (xrf.e(((a2) lygVar2).d())) {
                sb.append(lygVar2.a());
            } else {
                sb.append(lygVar2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

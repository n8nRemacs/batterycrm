package defpackage;

/* loaded from: classes2.dex */
public final class dh7 extends a2 implements lh7, lyg {
    public static final dh7 b = new dh7(new lyg[0]);
    public final lyg[] a;

    public dh7(lyg[] lygVarArr) {
        this.a = lygVarArr;
    }

    public static void x(StringBuilder sb, lyg lygVar) {
        if (xrf.e(((a2) lygVar).d())) {
            sb.append(lygVar.a());
        } else {
            sb.append(lygVar.toString());
        }
    }

    @Override // defpackage.lyg
    public final String a() {
        lyg[] lygVarArr = this.a;
        if (lygVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbM = az1.m("{");
        lyg lygVar = lygVarArr[0];
        if (xrf.e(((a2) lygVar).d())) {
            sbM.append(lygVar.a());
        } else {
            z1.x(sbM, lygVar.toString());
        }
        sbM.append(":");
        sbM.append(lygVarArr[1].a());
        for (int i = 2; i < lygVarArr.length; i += 2) {
            sbM.append(",");
            lyg lygVar2 = lygVarArr[i];
            if (xrf.e(((a2) lygVar2).d())) {
                sbM.append(lygVar2.a());
            } else {
                z1.x(sbM, lygVar2.toString());
            }
            sbM.append(":");
            sbM.append(lygVarArr[i + 1].a());
        }
        sbM.append("}");
        return sbM.toString();
    }

    @Override // defpackage.lyg
    public final int d() {
        return 8;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        lyg lygVar = (lyg) obj;
        int iD = ((a2) lygVar).d();
        if (iD == 0) {
            throw null;
        }
        if (iD != 8) {
            return false;
        }
        dh7 dh7VarG = lygVar.g();
        ch7 ch7Var = new ch7(this.a);
        dh7VarG.getClass();
        return ch7Var.equals(new ch7(dh7VarG.a));
    }

    @Override // defpackage.a2, defpackage.lyg
    public final dh7 g() {
        return this;
    }

    public final int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            lyg[] lygVarArr = this.a;
            if (i >= lygVarArr.length) {
                return iHashCode;
            }
            iHashCode += lygVarArr[i + 1].hashCode() ^ lygVarArr[i].hashCode();
            i += 2;
        }
    }

    public final String toString() {
        lyg[] lygVarArr = this.a;
        if (lygVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbM = az1.m("{");
        x(sbM, lygVarArr[0]);
        sbM.append(":");
        x(sbM, lygVarArr[1]);
        for (int i = 2; i < lygVarArr.length; i += 2) {
            sbM.append(",");
            x(sbM, lygVarArr[i]);
            sbM.append(":");
            x(sbM, lygVarArr[i + 1]);
        }
        sbM.append("}");
        return sbM.toString();
    }

    @Override // defpackage.a2
    /* renamed from: w */
    public final dh7 g() {
        return this;
    }
}

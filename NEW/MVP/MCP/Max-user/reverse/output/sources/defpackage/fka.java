package defpackage;

/* loaded from: classes2.dex */
public final class fka extends l0g {
    public qb2 c;
    public long d;
    public long o;

    public fka(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "startTime":
                this.d = efi.l(tm9Var, 0L);
                break;
            case "endTime":
                this.o = efi.l(tm9Var, 0L);
                break;
            case "chat":
                this.c = qb2.a(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.d;
        long j2 = this.o;
        qb2 qb2Var = this.c;
        StringBuilder sbL = az1.l(j, "{startTime=", ", endTime=");
        sbL.append(j2);
        sbL.append(", chat=");
        sbL.append(qb2Var);
        sbL.append("}");
        return sbL.toString();
    }
}

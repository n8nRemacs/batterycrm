package defpackage;

/* loaded from: classes2.dex */
public final class kka extends l0g {
    public long c;
    public c8c d;
    public long o;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "presence":
                this.d = c8c.a(tm9Var);
                break;
            case "userId":
                this.c = tm9Var.t0();
                break;
            case "time":
                this.o = tm9Var.t0();
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.c;
        c8c c8cVar = this.d;
        long j2 = this.o;
        StringBuilder sb = new StringBuilder("{userId=");
        sb.append(j);
        sb.append(", presence=");
        sb.append(c8cVar);
        return u45.i(j2, ", time=", "}", sb);
    }
}

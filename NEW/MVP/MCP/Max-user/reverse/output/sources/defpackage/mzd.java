package defpackage;

/* loaded from: classes2.dex */
public final class mzd {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public mzd(long j, String str, fh9 fh9Var, String str2) {
        this.a = fh9Var.Y;
        ss4 ss4Var = fh9Var.A0;
        this.b = ss4Var != null ? ss4Var.a : System.currentTimeMillis();
        this.c = fh9Var.o == km9.d;
        Object objI = ue3.I(fh9Var.Z);
        String str3 = null;
        uub uubVar = objI instanceof uub ? (uub) objI : null;
        if (uubVar != null) {
            String str4 = uubVar.w0;
            str3 = str4 == null ? uubVar.d : str4;
        }
        this.d = str3;
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class edd implements Comparable {
    public final pb2 a;
    public final ku3 b;

    public edd(pb2 pb2Var, ku3 ku3Var) {
        this.a = pb2Var;
        this.b = ku3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        edd eddVar = (edd) obj;
        pb2 pb2Var = this.a;
        long j = pb2Var != null ? pb2Var.b.Y : this.b.a.b.r;
        pb2 pb2Var2 = eddVar.a;
        return pmi.a(pb2Var2 != null ? pb2Var2.b.Y : eddVar.b.a.b.r, j);
    }
}

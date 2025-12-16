package defpackage;

/* loaded from: classes2.dex */
public final class qd6 extends l0g {
    public final dh2 c;
    public final long d;
    public final w8a o;

    public qd6(dh2 dh2Var, long j, w8a w8aVar) {
        this.c = dh2Var;
        this.d = j;
        this.o = w8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd6)) {
            return false;
        }
        qd6 qd6Var = (qd6) obj;
        return fni.a(this.c, qd6Var.c) && this.d == qd6Var.d && fni.a(this.o, qd6Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + a9h.a(this.c.hashCode() * 31, 31, this.d);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(folder=" + this.c + ", folderSync=" + this.d + ", foldersOrder=" + this.o + ")";
    }
}

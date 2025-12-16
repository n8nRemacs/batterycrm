package defpackage;

/* loaded from: classes2.dex */
public final class uja extends l0g {
    public final boolean X;
    public final long Y;
    public final boolean Z;
    public final long c;
    public final qb2 d;
    public final fh9 o;

    public uja(long j, qb2 qb2Var, fh9 fh9Var, boolean z, long j2, boolean z2) {
        this.c = j;
        this.d = qb2Var;
        this.o = fh9Var;
        this.X = z;
        this.Y = j2;
        this.Z = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uja)) {
            return false;
        }
        uja ujaVar = (uja) obj;
        return this.c == ujaVar.c && fni.a(this.d, ujaVar.d) && fni.a(this.o, ujaVar.o) && this.X == ujaVar.X && this.Y == ujaVar.Y && this.Z == ujaVar.Z;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        qb2 qb2Var = this.d;
        return Boolean.hashCode(this.Z) + a9h.a(a9h.b((this.o.hashCode() + ((iHashCode + (qb2Var == null ? 0 : qb2Var.hashCode())) * 31)) * 31, 31, this.X), 31, this.Y);
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.o);
        sb.append(", isInvisible=");
        sb.append(this.X);
        az1.r(this.Y, ", prevMessageId=", ", ttl=", sb);
        return az1.k(sb, this.Z, ")");
    }
}

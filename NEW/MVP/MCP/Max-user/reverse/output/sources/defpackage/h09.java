package defpackage;

/* loaded from: classes.dex */
public final class h09 implements j09 {
    public final long X;
    public final int Y;
    public final long a;
    public final long b;
    public final m00 c;
    public final s0h d;
    public final String o;

    public h09(long j, long j2, m00 m00Var, s0h s0hVar, String str) {
        this.a = j;
        this.b = j2;
        this.c = m00Var;
        this.d = s0hVar;
        this.o = str;
        this.X = s0hVar.g != null ? r1.hashCode() : 0L;
        this.Y = d1b.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h09)) {
            return false;
        }
        h09 h09Var = (h09) obj;
        return this.a == h09Var.a && this.b == h09Var.b && fni.a(this.c, h09Var.c) && fni.a(this.d, h09Var.d) && fni.a(this.o, h09Var.o);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    @Override // defpackage.j09
    public final long i() {
        return this.b;
    }

    @Override // defpackage.j09
    public final long j() {
        return this.a;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Video(messageId=", ", attachId=");
        sbL.append(this.b);
        sbL.append(", attachModel=");
        sbL.append(this.c);
        sbL.append(", videoAttachConfig=");
        sbL.append(this.d);
        sbL.append(", localId=");
        sbL.append(this.o);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // defpackage.j09
    public final m00 v() {
        return this.c;
    }

    @Override // defpackage.j09
    public final String w() {
        return this.o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h09(long j, long j2, m00 m00Var, s0h s0hVar) {
        String str = s0hVar.g;
        this(j, j2, m00Var, s0hVar, str == null ? "" : str);
    }
}

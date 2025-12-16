package defpackage;

/* loaded from: classes.dex */
public final class b09 implements j09 {
    public final String X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long b;
    public final m00 c;
    public final od7 d;
    public final boolean o;

    public b09(long j, long j2, m00 m00Var, od7 od7Var, String str, int i) {
        boolean z = od7Var.e;
        if ((i & 32) != 0 && (str = od7Var.k) == null) {
            str = "";
        }
        this.a = j;
        this.b = j2;
        this.c = m00Var;
        this.d = od7Var;
        this.o = z;
        this.X = str;
        this.Y = od7Var.k != null ? r2.hashCode() : 0L;
        this.Z = d1b.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b09)) {
            return false;
        }
        b09 b09Var = (b09) obj;
        return this.a == b09Var.a && this.b == b09Var.b && fni.a(this.c, b09Var.c) && fni.a(this.d, b09Var.d) && this.o == b09Var.o && fni.a(this.X, b09Var.X);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        return this.X.hashCode() + a9h.b((this.d.hashCode() + ((this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.o);
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
    public final int m() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Photo(messageId=", ", attachId=");
        sbL.append(this.b);
        sbL.append(", attachModel=");
        sbL.append(this.c);
        sbL.append(", imageAttachConfig=");
        sbL.append(this.d);
        sbL.append(", isGif=");
        sbL.append(this.o);
        return ctd.j(sbL, ", localId=", this.X, ")");
    }

    @Override // defpackage.j09
    public final m00 v() {
        return this.c;
    }

    @Override // defpackage.j09
    public final String w() {
        return this.X;
    }
}

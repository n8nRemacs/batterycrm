package defpackage;

/* loaded from: classes.dex */
public final class tz8 implements j09 {
    public final long X;
    public final long a;
    public final long b;
    public final m00 c;
    public final String d;
    public final int o = d1b.a;

    public tz8(long j, long j2, m00 m00Var, String str) {
        this.a = j;
        this.b = j2;
        this.c = m00Var;
        this.d = str;
        this.X = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz8)) {
            return false;
        }
        tz8 tz8Var = (tz8) obj;
        return this.a == tz8Var.a && this.b == tz8Var.b && fni.a(this.c, tz8Var.c) && fni.a(this.d, tz8Var.d);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
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
        return this.o;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ContentLevel(messageId=", ", attachId=");
        sbL.append(this.b);
        sbL.append(", attachModel=");
        sbL.append(this.c);
        return ctd.j(sbL, ", localId=", this.d, ")");
    }

    @Override // defpackage.j09
    public final m00 v() {
        return this.c;
    }

    @Override // defpackage.j09
    public final String w() {
        return this.d;
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class c80 extends l0g {
    public final String c;
    public final int d;
    public final int o;

    public c80(String str, int i, int i2) {
        this.c = str;
        this.d = i;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return fni.a(this.c, c80Var.c) && this.d == c80Var.d && this.o == c80Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + xrf.k(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.j(utb.m(this.d, "Response(trackId='", this.c, "',codeLength=", ",blockingDuration="), this.o, ")");
    }
}

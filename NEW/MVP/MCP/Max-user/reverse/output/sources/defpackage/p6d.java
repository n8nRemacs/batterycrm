package defpackage;

/* loaded from: classes.dex */
public final class p6d {
    public final int a;
    public final ps8 b;
    public final boolean c;

    public p6d(int i, ps8 ps8Var, boolean z) {
        this.a = i;
        this.b = ps8Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6d)) {
            return false;
        }
        p6d p6dVar = (p6d) obj;
        return this.a == p6dVar.a && fni.a(this.b, p6dVar.b) && this.c == p6dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (az1.v(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkParameters(condition=");
        sb.append(ho7.t(this.a));
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", preferHardwareVPX=");
        return az1.k(sb, this.c, ")");
    }
}

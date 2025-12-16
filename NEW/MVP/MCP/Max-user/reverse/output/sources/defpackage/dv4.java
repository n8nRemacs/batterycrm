package defpackage;

/* loaded from: classes2.dex */
public final class dv4 {
    public final int a;
    public final String b;

    public dv4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv4)) {
            return false;
        }
        dv4 dv4Var = (dv4) obj;
        return this.a == dv4Var.a && this.b.equals(dv4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DevMenuTab(id=" + this.a + ", name=" + this.b + ")";
    }
}

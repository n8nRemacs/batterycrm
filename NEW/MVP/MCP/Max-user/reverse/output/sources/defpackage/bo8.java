package defpackage;

/* loaded from: classes2.dex */
public final class bo8 {
    public final long a;
    public final np8 b;
    public final boolean c;

    public bo8(long j, np8 np8Var, boolean z) {
        this.a = j;
        this.b = np8Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bo8.class.equals(obj.getClass())) {
            bo8 bo8Var = (bo8) obj;
            if (this.a == bo8Var.a && this.c == bo8Var.c && this.b == bo8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key{contactId=");
        sb.append(this.a);
        sb.append(", markerWeight=");
        sb.append(this.b);
        return vb9.f(sb, ", active=", this.c, "}");
    }
}

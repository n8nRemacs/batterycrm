package defpackage;

/* loaded from: classes.dex */
public final class v4i {
    public final String a;
    public final int b;

    public v4i(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4i)) {
            return false;
        }
        v4i v4iVar = (v4i) obj;
        return fni.a(this.a, v4iVar.a) && this.b == v4iVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return xc0.h(sb, this.b, ')');
    }
}

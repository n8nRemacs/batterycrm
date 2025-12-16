package defpackage;

/* loaded from: classes.dex */
public final class na0 {
    public final String a;
    public final String b;

    public na0(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof na0) {
            na0 na0Var = (na0) obj;
            if (this.a.equals(na0Var.a) && this.b.equals(na0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return ho7.l(sb, this.b, "}");
    }
}

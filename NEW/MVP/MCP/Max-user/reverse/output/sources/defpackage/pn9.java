package defpackage;

/* loaded from: classes2.dex */
public final class pn9 {
    public final long a;
    public final boolean b;

    public pn9(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn9)) {
            return false;
        }
        pn9 pn9Var = (pn9) obj;
        return this.a == pn9Var.a && this.b == pn9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "InputEditData(messageId=", ", shouldInsertOriginalText=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}

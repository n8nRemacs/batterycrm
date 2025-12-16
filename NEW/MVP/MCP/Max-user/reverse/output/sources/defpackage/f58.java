package defpackage;

/* loaded from: classes2.dex */
public final class f58 extends h58 {
    public final long a;
    public final String b;

    public f58(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.h58
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f58)) {
            return false;
        }
        f58 f58Var = (f58) obj;
        return this.a == f58Var.a && fni.a(this.b, f58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("ErrorLinkInfo(requestId=", this.a, ", error=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}

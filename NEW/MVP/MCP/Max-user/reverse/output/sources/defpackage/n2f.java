package defpackage;

/* loaded from: classes2.dex */
public final class n2f implements ws8 {
    public final long a;
    public final String b;
    public final od7 c;
    public final boolean d;

    public n2f(long j, String str, od7 od7Var, boolean z) {
        this.a = j;
        this.b = str;
        this.c = od7Var;
        this.d = z;
    }

    @Override // defpackage.ws8
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2f)) {
            return false;
        }
        n2f n2fVar = (n2f) obj;
        return this.a == n2fVar.a && fni.a(this.b, n2fVar.b) && fni.a(this.c, n2fVar.c) && this.d == n2fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("SingleImageAttach(messageId=", this.a, ", attachId=", this.b);
        sbN.append(", imageAttach=");
        sbN.append(this.c);
        sbN.append(", isMediaOrderedFirst=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}

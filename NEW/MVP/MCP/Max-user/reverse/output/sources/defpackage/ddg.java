package defpackage;

/* loaded from: classes2.dex */
public final class ddg {
    public final edg a;
    public final fdg b;

    public ddg(edg edgVar, fdg fdgVar) {
        this.a = edgVar;
        this.b = fdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddg)) {
            return false;
        }
        ddg ddgVar = (ddg) obj;
        return fni.a(this.a, ddgVar.a) && fni.a(this.b, ddgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarTextColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}

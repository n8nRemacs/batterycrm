package defpackage;

/* loaded from: classes2.dex */
public final class swg {
    public final String a;
    public final boolean b;

    public swg(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swg)) {
            return false;
        }
        swg swgVar = (swg) obj;
        return fni.a(this.a, swgVar.a) && this.b == swgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlState(url=" + this.a + ", isRestored=" + this.b + ")";
    }
}

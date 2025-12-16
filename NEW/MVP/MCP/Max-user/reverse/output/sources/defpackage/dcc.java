package defpackage;

/* loaded from: classes2.dex */
public final class dcc implements hcc {
    public final s5g a;
    public final boolean b;

    public dcc(s5g s5gVar, boolean z) {
        this.a = s5gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcc)) {
            return false;
        }
        dcc dccVar = (dcc) obj;
        return fni.a(this.a, dccVar.a) && this.b == dccVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotifyUser(text=" + this.a + ", isError=" + this.b + ")";
    }
}

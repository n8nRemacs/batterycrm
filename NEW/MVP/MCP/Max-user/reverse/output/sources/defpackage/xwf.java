package defpackage;

/* loaded from: classes.dex */
public final class xwf {
    public final String a;
    public final int b;
    public final int c;

    public xwf(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwf)) {
            return false;
        }
        xwf xwfVar = (xwf) obj;
        return fni.a(this.a, xwfVar.a) && this.b == xwfVar.b && this.c == xwfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return xc0.h(sb, this.c, ')');
    }
}

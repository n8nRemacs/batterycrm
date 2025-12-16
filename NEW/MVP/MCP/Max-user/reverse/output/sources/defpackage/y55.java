package defpackage;

/* loaded from: classes2.dex */
public final class y55 {
    public final String a;
    public final String b;
    public final int c;

    public y55(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y55)) {
            return false;
        }
        y55 y55Var = (y55) obj;
        return fni.a(this.a, y55Var.a) && fni.a(this.b, y55Var.b) && this.c == y55Var.c;
    }

    public final int hashCode() {
        return u45.e(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropRecord(event='");
        sb.append(this.a);
        sb.append("', reason='");
        sb.append(this.b);
        sb.append("', count=");
        return xc0.h(sb, this.c, ')');
    }
}

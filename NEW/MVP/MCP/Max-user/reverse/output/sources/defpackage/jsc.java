package defpackage;

/* loaded from: classes2.dex */
public final class jsc {
    public int a;
    public int b;
    public final int c;
    public final long d;

    public jsc(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsc)) {
            return false;
        }
        jsc jscVar = (jsc) obj;
        return this.a == jscVar.a && this.b == jscVar.b && this.c == jscVar.c && this.d == jscVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoParams(|");
        sb.append(this.a);
        sb.append('x');
        sb.append(this.b);
        sb.append('|');
        sb.append(this.c);
        sb.append('|');
        return ho7.k(sb, this.d, "B)");
    }
}

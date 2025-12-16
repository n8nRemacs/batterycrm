package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class g90 {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        t86 t86VarA = a();
        t86VarA.e = 0;
        t86VarA.b();
    }

    public g90(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    public static t86 a() {
        t86 t86Var = new t86();
        t86Var.b = -1;
        t86Var.c = -1;
        t86Var.e = -1;
        Range range = f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        t86Var.a = range;
        Range range2 = g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        t86Var.d = range2;
        return t86Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g90) {
            g90 g90Var = (g90) obj;
            if (this.a.equals(g90Var.a) && this.b == g90Var.b && this.c == g90Var.c && this.d.equals(g90Var.d) && this.e == g90Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return ho7.j(sb, this.e, "}");
    }
}

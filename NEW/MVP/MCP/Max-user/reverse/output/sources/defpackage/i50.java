package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i50 {
    public static final i50 e = new i50(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i50(hf6 hf6Var) {
        this(hf6Var.G, hf6Var.F, hf6Var.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return this.a == i50Var.a && this.b == i50Var.b && this.c == i50Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return xc0.h(sb, this.c, ']');
    }

    public i50(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = zxg.M(i3) ? zxg.t(i3) * i2 : -1;
    }
}

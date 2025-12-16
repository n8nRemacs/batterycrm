package defpackage;

import android.util.Range;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fc0 {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final wib g;
    public final wib a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        fb0 fb0Var = fb0.f;
        g = wib.x(Arrays.asList(fb0Var, fb0.e, fb0.d), new da0(fb0Var, 1));
    }

    public fc0(wib wibVar, Range range, Range range2, int i) {
        this.a = wibVar;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    public static ec0 a() {
        ec0 ec0Var = new ec0();
        wib wibVar = g;
        if (wibVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        ec0Var.a = wibVar;
        Range range = e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        ec0Var.b = range;
        Range range2 = f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        ec0Var.c = range2;
        ec0Var.d = -1;
        return ec0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fc0) {
            fc0 fc0Var = (fc0) obj;
            if (this.a.equals(fc0Var.a) && this.b.equals(fc0Var.b) && this.c.equals(fc0Var.c) && this.d == fc0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return ho7.j(sb, this.d, "}");
    }
}

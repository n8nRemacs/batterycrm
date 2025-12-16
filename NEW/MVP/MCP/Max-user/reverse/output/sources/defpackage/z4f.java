package defpackage;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z4f {
    public final long a;
    public final long b;
    public final int c;

    public z4f(int i, long j, long j2) {
        hsi.b(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z4f.class == obj.getClass()) {
            z4f z4fVar = (z4f) obj;
            if (this.a == z4fVar.a && this.b == z4fVar.b && this.c == z4fVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = zxg.a;
        Locale locale = Locale.US;
        StringBuilder sbL = az1.l(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbL.append(this.b);
        sbL.append(", speedDivisor=");
        sbL.append(this.c);
        return sbL.toString();
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class h90 {
    public final int a;
    public final double b;
    public final Throwable c;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public h90(int i, double d, Throwable th) {
        this.a = i;
        this.b = d;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h90) {
            h90 h90Var = (h90) obj;
            int i = h90Var.a;
            Throwable th2 = h90Var.c;
            if (this.a == i && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(h90Var.b) && ((th = this.c) != null ? th.equals(th2) : th2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        double d = this.b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        Throwable th = this.c;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.a + ", audioAmplitudeInternal=" + this.b + ", errorCause=" + this.c + "}";
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ra2 extends nc7 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final nc7[] g;

    public ra2(String str, int i, int i2, long j, long j2, nc7[] nc7VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = nc7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ra2.class == obj.getClass()) {
            ra2 ra2Var = (ra2) obj;
            if (this.c == ra2Var.c && this.d == ra2Var.d && this.e == ra2Var.e && this.f == ra2Var.f && Objects.equals(this.b, ra2Var.b) && Arrays.equals(this.g, ra2Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}

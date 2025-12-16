package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ta2 extends nc7 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final nc7[] f;

    public ta2(String str, boolean z, boolean z2, String[] strArr, nc7[] nc7VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = nc7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ta2.class == obj.getClass()) {
            ta2 ta2Var = (ta2) obj;
            if (this.c == ta2Var.c && this.d == ta2Var.d && Objects.equals(this.b, ta2Var.b) && Arrays.equals(this.e, ta2Var.e) && Arrays.equals(this.f, ta2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}

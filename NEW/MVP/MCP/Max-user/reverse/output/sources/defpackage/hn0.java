package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hn0 extends nc7 {
    public final byte[] b;

    public hn0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hn0.class == obj.getClass()) {
            hn0 hn0Var = (hn0) obj;
            if (this.a.equals(hn0Var.a) && Arrays.equals(this.b, hn0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + u45.e(527, 31, this.a);
    }
}

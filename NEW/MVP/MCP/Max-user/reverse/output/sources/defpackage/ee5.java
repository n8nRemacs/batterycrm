package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ee5 {
    public final gf5 a;
    public final byte[] b;

    public ee5(gf5 gf5Var, byte[] bArr) {
        if (gf5Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = gf5Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee5)) {
            return false;
        }
        ee5 ee5Var = (ee5) obj;
        if (this.a.equals(ee5Var.a)) {
            return Arrays.equals(this.b, ee5Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}

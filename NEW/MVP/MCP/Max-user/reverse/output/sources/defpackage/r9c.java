package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r9c extends nc7 {
    public final String b;
    public final byte[] c;

    public r9c(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r9c.class == obj.getClass()) {
            r9c r9cVar = (r9c) obj;
            if (Objects.equals(this.b, r9cVar.b) && Arrays.equals(this.c, r9cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nc7
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}

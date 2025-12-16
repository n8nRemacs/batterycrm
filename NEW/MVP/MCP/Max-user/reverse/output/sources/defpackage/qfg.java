package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qfg {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public qfg(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qfg.class == obj.getClass()) {
            qfg qfgVar = (qfg) obj;
            if (this.a == qfgVar.a && this.c == qfgVar.c && this.d == qfgVar.d && Arrays.equals(this.b, qfgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}

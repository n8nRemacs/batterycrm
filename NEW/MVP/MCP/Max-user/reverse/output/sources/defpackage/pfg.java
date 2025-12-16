package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pfg {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public pfg(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pfg.class == obj.getClass()) {
            pfg pfgVar = (pfg) obj;
            if (this.a == pfgVar.a && this.c == pfgVar.c && this.d == pfgVar.d && Arrays.equals(this.b, pfgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}

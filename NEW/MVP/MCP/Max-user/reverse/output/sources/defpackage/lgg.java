package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lgg implements lw0 {
    public final kfg a;
    public final int[] b;
    public final int c;
    public final boolean[] d;

    public lgg(kfg kfgVar, int[] iArr, int i, boolean[] zArr) {
        int i2 = kfgVar.a;
        fsi.b(i2 == iArr.length && i2 == zArr.length);
        this.a = kfgVar;
        this.b = (int[]) iArr.clone();
        this.c = i;
        this.d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lgg.class == obj.getClass()) {
            lgg lggVar = (lgg) obj;
            if (this.c == lggVar.c && this.a.equals(lggVar.a) && Arrays.equals(this.b, lggVar.b) && Arrays.equals(this.d, lggVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }
}

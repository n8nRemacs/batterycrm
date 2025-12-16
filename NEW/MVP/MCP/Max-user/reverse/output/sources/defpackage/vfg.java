package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vfg {
    public final an5[] a;
    public int b;

    public vfg(an5... an5VarArr) {
        this.a = an5VarArr;
        int length = an5VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vfg.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((vfg) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}

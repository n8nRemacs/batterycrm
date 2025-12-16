package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ty9 {
    public final ry9[] a;
    public final long b;

    public ty9(ry9... ry9VarArr) {
        this(-9223372036854775807L, ry9VarArr);
    }

    public final ty9 a(ry9... ry9VarArr) {
        if (ry9VarArr.length == 0) {
            return this;
        }
        String str = zxg.a;
        ry9[] ry9VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(ry9VarArr2, ry9VarArr2.length + ry9VarArr.length);
        System.arraycopy(ry9VarArr, 0, objArrCopyOf, ry9VarArr2.length, ry9VarArr.length);
        return new ty9(this.b, (ry9[]) objArrCopyOf);
    }

    public final ty9 b(ty9 ty9Var) {
        return ty9Var == null ? this : a(ty9Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ty9.class == obj.getClass()) {
            ty9 ty9Var = (ty9) obj;
            if (Arrays.equals(this.a, ty9Var.a) && this.b == ty9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fsi.g(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public ty9(long j, ry9... ry9VarArr) {
        this.b = j;
        this.a = ry9VarArr;
    }

    public ty9(List list) {
        this((ry9[]) list.toArray(new ry9[0]));
    }
}

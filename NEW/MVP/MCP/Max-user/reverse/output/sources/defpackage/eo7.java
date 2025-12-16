package defpackage;

/* loaded from: classes2.dex */
public final class eo7 {
    public static final eo7 e = new eo7(0, null, 15);
    public static final eo7 f = new eo7(5, 3, 5, new ms0(3, 3, false));
    public final int a;
    public final int b;
    public final int c;
    public final ms0 d;

    public eo7(int i, int i2, int i3, ms0 ms0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = ms0Var;
    }

    public static eo7 a() {
        return new eo7(5, 0, 5, f.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo7)) {
            return false;
        }
        eo7 eo7Var = (eo7) obj;
        int i = eo7Var.a;
        int i2 = this.a;
        if (i2 == 0) {
            if (i != 0) {
                return false;
            }
        } else if (i == 0 || i2 != i) {
            return false;
        }
        int i3 = eo7Var.b;
        int i4 = this.b;
        if (i4 == 0) {
            if (i3 != 0) {
                return false;
            }
        } else if (i3 == 0 || i4 != i3) {
            return false;
        }
        int i5 = eo7Var.c;
        int i6 = this.c;
        if (i6 == 0) {
            if (i5 != 0) {
                return false;
            }
        } else if (i5 == 0 || i6 != i5) {
            return false;
        }
        return fni.a(this.d, eo7Var.d);
    }

    public final int hashCode() {
        int i = this.a;
        int iV = (i == 0 ? 0 : az1.v(i)) * 31;
        int i2 = this.b;
        int iV2 = (iV + (i2 == 0 ? 0 : az1.v(i2))) * 31;
        int i3 = this.c;
        int iV3 = (iV2 + (i3 == 0 ? 0 : az1.v(i3))) * 31;
        ms0 ms0Var = this.d;
        return iV3 + (ms0Var != null ? ms0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = "null";
        int i = this.a;
        if (i == 0) {
            str = "null";
        } else {
            str = "LeftInsetConfig(persistentType=" + vb9.m(i) + ")";
        }
        int i2 = this.b;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = "TopInsetConfig(persistentType=" + vb9.m(i2) + ")";
        }
        int i3 = this.c;
        if (i3 != 0) {
            str3 = "RightInsetConfig(persistentType=" + vb9.m(i3) + ")";
        }
        StringBuilder sbL = wy1.l("InsetsConfig(leftInsetConfig=", str, ", topConfig=", str2, ", rightInsetConfig=");
        sbL.append(str3);
        sbL.append(", bottomConfig=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }

    public /* synthetic */ eo7(int i, ms0 ms0Var, int i2) {
        this(0, (i2 & 2) != 0 ? 0 : i, 0, (i2 & 8) != 0 ? null : ms0Var);
    }
}

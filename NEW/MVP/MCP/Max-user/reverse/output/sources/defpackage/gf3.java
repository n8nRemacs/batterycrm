package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gf3 {
    public static final gf3 h = new gf3(1, 2, 3, -1, -1, null);
    public static final gf3 i = new gf3(1, 1, 2, -1, -1, null);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = zxg.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
    }

    public gf3(int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? ho7.f(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? ho7.f(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static int d(int i2) {
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 13;
        }
        if (i2 == 6) {
            return 16;
        }
        if (i2 != 7) {
            return i2 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String e(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? ho7.f(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean g(gf3 gf3Var) {
        if (gf3Var == null) {
            return true;
        }
        int i2 = gf3Var.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = gf3Var.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = gf3Var.c;
        if ((i4 != -1 && i4 != 3) || gf3Var.d != null) {
            return false;
        }
        int i5 = gf3Var.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = gf3Var.e;
        return i6 == -1 || i6 == 8;
    }

    public static boolean h(gf3 gf3Var) {
        if (gf3Var == null) {
            return false;
        }
        int i2 = gf3Var.c;
        return i2 == 7 || i2 == 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final ef3 a() {
        ef3 ef3Var = new ef3();
        ef3Var.a = this.a;
        ef3Var.b = this.b;
        ef3Var.c = this.c;
        ef3Var.d = this.d;
        ef3Var.e = this.e;
        ef3Var.f = this.f;
        return ef3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gf3.class == obj.getClass()) {
            gf3 gf3Var = (gf3) obj;
            if (this.a == gf3Var.a && this.b == gf3Var.b && this.c == gf3Var.c && Arrays.equals(this.d, gf3Var.d) && this.e == gf3Var.e && this.f == gf3Var.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return ho7.l(sb, str2, ")");
    }
}

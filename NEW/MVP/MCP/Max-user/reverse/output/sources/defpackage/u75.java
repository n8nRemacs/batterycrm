package defpackage;

/* loaded from: classes.dex */
public final class u75 {
    public static final u75 c = new u75(0, 0);
    public static final u75 d = new u75(1, 8);
    public static final u75 e = new u75(3, 10);
    public static final u75 f = new u75(4, 10);
    public static final u75 g = new u75(5, 10);
    public static final u75 h = new u75(6, 10);
    public static final u75 i = new u75(6, 8);
    public final int a;
    public final int b;

    public u75(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u75) {
            u75 u75Var = (u75) obj;
            if (this.a == u75Var.a && this.b == u75Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return ho7.j(sb, this.b, "}");
    }
}

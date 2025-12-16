package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class df8 {
    public final cf8 a;
    public final long b;

    public df8(cf8 cf8Var, long j) {
        this.a = cf8Var;
        this.b = j;
    }

    public static df8 a(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        double dI = 1.401298464324817E-45d;
        double dI2 = 1.401298464324817E-45d;
        long jL = 0;
        double dI3 = 0.0d;
        float fJ = 0.0f;
        float fJ2 = 0.0f;
        float fJ3 = 0.0f;
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "alt":
                    dI3 = efi.i(tm9Var, 0.0d);
                    break;
                case "epu":
                    fJ = efi.j(tm9Var);
                    break;
                case "hdn":
                    fJ2 = efi.j(tm9Var);
                    break;
                case "lat":
                    dI = efi.i(tm9Var, 1.401298464324817E-45d);
                    break;
                case "lng":
                    dI2 = efi.i(tm9Var, 1.401298464324817E-45d);
                    break;
                case "spd":
                    fJ3 = efi.j(tm9Var);
                    break;
                case "time":
                    jL = efi.l(tm9Var, 0L);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new df8(new cf8(dI, dI2, dI3, fJ, fJ2, fJ3), jL);
    }

    public final String toString() {
        return "LocationInfo{location=" + this.a + ", time=" + this.b + "}";
    }
}

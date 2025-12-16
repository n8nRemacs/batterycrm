package defpackage;

/* loaded from: classes.dex */
public abstract class uyi {
    public static void a(long j, umb umbVar, sfg[] sfgVarArr) {
        int i;
        while (true) {
            if (umbVar.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (umbVar.a() == 0) {
                    i = -1;
                    break;
                }
                int iX = umbVar.x();
                i2 += iX;
                if (iX != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (umbVar.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iX2 = umbVar.x();
                i3 += iX2;
                if (iX2 != 255) {
                    break;
                }
            }
            int i4 = umbVar.b + i3;
            if (i3 == -1 || i3 > umbVar.a()) {
                a8i.l("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = umbVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iX3 = umbVar.x();
                int iD = umbVar.D();
                int iJ = iD == 49 ? umbVar.j() : 0;
                int iX4 = umbVar.x();
                if (iD == 47) {
                    umbVar.K(1);
                }
                boolean z = iX3 == 181 && (iD == 49 || iD == 47) && iX4 == 3;
                if (iD == 49) {
                    z &= iJ == 1195456820;
                }
                if (z) {
                    b(j, umbVar, sfgVarArr);
                }
            }
            umbVar.J(i4);
        }
    }

    public static void b(long j, umb umbVar, sfg[] sfgVarArr) {
        int iX = umbVar.x();
        if ((iX & 64) != 0) {
            umbVar.K(1);
            int i = (iX & 31) * 3;
            int i2 = umbVar.b;
            for (sfg sfgVar : sfgVarArr) {
                umbVar.J(i2);
                sfgVar.b(umbVar, i, 0);
                hsi.g(j != -9223372036854775807L);
                sfgVar.a(j, 1, i, 0, null);
            }
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class syi {
    public static void a(long j, qyg qygVar, rfg[] rfgVarArr) {
        int i;
        while (true) {
            if (qygVar.c() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (qygVar.c() == 0) {
                    i = -1;
                    break;
                }
                int iS = qygVar.s();
                i2 += iS;
                if (iS != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (qygVar.c() == 0) {
                    i3 = -1;
                    break;
                }
                int iS2 = qygVar.s();
                i3 += iS2;
                if (iS2 != 255) {
                    break;
                }
            }
            int i4 = qygVar.b + i3;
            if (i3 == -1 || i3 > qygVar.c()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = qygVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iS3 = qygVar.s();
                int iX = qygVar.x();
                int iF = iX == 49 ? qygVar.f() : 0;
                int iS4 = qygVar.s();
                if (iX == 47) {
                    qygVar.F(1);
                }
                boolean z = iS3 == 181 && (iX == 49 || iX == 47) && iS4 == 3;
                if (iX == 49) {
                    z &= iF == 1195456820;
                }
                if (z) {
                    b(j, qygVar, rfgVarArr);
                }
            }
            qygVar.E(i4);
        }
    }

    public static void b(long j, qyg qygVar, rfg[] rfgVarArr) {
        long j2;
        int iS = qygVar.s();
        if ((iS & 64) != 0) {
            qygVar.F(1);
            int i = (iS & 31) * 3;
            int i2 = qygVar.b;
            int length = rfgVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                rfg rfgVar = rfgVarArr[i3];
                qygVar.E(i2);
                rfgVar.c(i, qygVar);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    rfgVar.b(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i3++;
                j = j2;
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

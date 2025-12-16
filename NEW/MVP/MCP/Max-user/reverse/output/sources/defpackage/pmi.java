package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class pmi {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static boolean b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static vjg c(vjg vjgVar, String[] strArr, Map map) {
        int i = 0;
        if (vjgVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (vjg) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                vjg vjgVar2 = new vjg();
                int length = strArr.length;
                while (i < length) {
                    vjgVar2.a((vjg) map.get(strArr[i]));
                    i++;
                }
                return vjgVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                vjgVar.a((vjg) map.get(strArr[0]));
                return vjgVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    vjgVar.a((vjg) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return vjgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c6f d(defpackage.ip5 r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmi.d(ip5, boolean, boolean):c6f");
    }
}

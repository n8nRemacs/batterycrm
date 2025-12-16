package defpackage;

/* loaded from: classes.dex */
public abstract class o1j {
    public static m1j a;

    public static long a(long j, rf2 rf2Var) {
        Long lB;
        Long l;
        long j2 = rf2Var.d0;
        p3b p3bVar = rf2Var.c0;
        if (p3bVar == null) {
            j2 = 0;
        } else if (j2 == 0 && (p3bVar.b() == null || ((lB = p3bVar.b()) != null && lB.longValue() == 0))) {
            j2 = rf2Var.e0;
        }
        Long[] lArr = {Long.valueOf(rf2Var.P), Long.valueOf(j), Long.valueOf(j2)};
        if (lArr.length == 0) {
            l = null;
        } else {
            Long l2 = lArr[0];
            int i = 1;
            int length = lArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Long l3 = lArr[i];
                    if (l2.compareTo(l3) < 0) {
                        l2 = l3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            l = l2;
        }
        long jLongValue = (l != null ? l : 0L).longValue();
        return jLongValue == 0 ? rf2Var.k : jLongValue;
    }
}

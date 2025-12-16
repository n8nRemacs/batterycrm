package defpackage;

/* loaded from: classes.dex */
public abstract class kti {
    public static final Object a(mbd mbdVar, d7i d7iVar) {
        l42 l42Var = new l42(1, hni.f(d7iVar));
        l42Var.o();
        l42Var.e(new tua(mbdVar, 1));
        mbdVar.e(new uvd(l42Var));
        return l42Var.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u70 b(defpackage.tm9 r13) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kti.b(tm9):u70");
    }

    public static int c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int d(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long e(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}

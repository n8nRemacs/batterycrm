package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class kwi {
    public static float a(jza jzaVar) {
        float f;
        float f2;
        int iOrdinal = jzaVar.ordinal();
        if (iOrdinal == 0) {
            f = vw4.d().getDisplayMetrics().density;
            f2 = 10.0f;
        } else if (iOrdinal == 1) {
            f = vw4.d().getDisplayMetrics().density;
            f2 = 12.0f;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = vw4.d().getDisplayMetrics().density;
            f2 = 16.0f;
        }
        return f * f2;
    }

    public static int b(jza jzaVar) {
        int iOrdinal = jzaVar.ordinal();
        if (iOrdinal == 0) {
            return kti.d(28 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return kti.d(40 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return kti.d(52 * vw4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }
}

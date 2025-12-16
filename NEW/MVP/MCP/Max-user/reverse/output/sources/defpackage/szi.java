package defpackage;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class szi {
    public static final int[] a(yeb yebVar) {
        int iOrdinal = yebVar.h().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new int[]{v4j.c(-1, 0.2f), 0};
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new int[]{v4j.c(-1, 0.5f), 0};
    }

    public static final long b(pb2 pb2Var) {
        si9 si9Var;
        long jP = pb2Var.p();
        eh9 eh9Var = pb2Var.c;
        long j = (eh9Var == null || (si9Var = eh9Var.a) == null) ? BuildConfig.MAX_TIME_TO_UPLOAD : si9Var.c;
        return jP > j ? j : jP;
    }
}

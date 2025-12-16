package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class o9j {
    public static final boolean a(u6e u6eVar, r03 r03Var) {
        if (r03Var instanceof q03) {
            return true;
        }
        if (!(r03Var instanceof p03)) {
            throw new NoWhenBranchMatchedException();
        }
        if (u6eVar.a != 1) {
            return false;
        }
        Set set = ((p03) r03Var).a;
        pb2 pb2Var = u6eVar.d;
        return ue3.A(set, pb2Var != null ? Long.valueOf(pb2Var.a) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d35 b(defpackage.tm9 r17) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9j.b(tm9):d35");
    }
}

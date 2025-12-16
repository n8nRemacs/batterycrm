package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class q92 implements or9 {
    public static List b(s5g s5gVar, n5g n5gVar, pb2 pb2Var) {
        String strI = pb2Var.i(il0.b, hl0.a);
        pb2Var.q0();
        return Collections.singletonList(new bg2(s5gVar, n5gVar, strI, pb2Var.w0, pb2Var.h()));
    }

    @Override // defpackage.or9
    public final List a(pb2 pb2Var) {
        return (pb2Var == null || !pb2Var.M()) ? hd5.a : pb2Var.g0() ? b(new n5g(l7b.J0), new n5g(l7b.I0), pb2Var) : pb2Var.e0() ? b(new r5g(pb2Var.s()), new n5g(l7b.K0), pb2Var) : b(new r5g(pb2Var.s()), new n5g(l7b.L0), pb2Var);
    }
}

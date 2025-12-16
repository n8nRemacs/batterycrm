package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class xf2 implements or9 {
    public final i5i a;

    public xf2(i5i i5iVar) {
        this.a = i5iVar;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, k18] */
    @Override // defpackage.or9
    public final List a(pb2 pb2Var) {
        s5g r5gVar;
        int i;
        CharSequence charSequence;
        hl0 hl0Var = hl0.a;
        il0 il0Var = il0.b;
        if (pb2Var != null && pb2Var.O()) {
            n5g n5gVar = new n5g(l7b.T);
            r5g r5gVar2 = s5g.b;
            String strI = pb2Var.i(il0Var, hl0Var);
            if (pb2Var.O()) {
                charSequence = null;
            } else {
                pb2Var.q0();
                charSequence = pb2Var.w0;
            }
            return Collections.singletonList(new bg2(n5gVar, r5gVar2, strI, charSequence, pb2Var.h(), pb2Var.O() ? (yd0) this.a.b.getValue() : null, ve3.j(new n5g(l7b.Q), new n5g(l7b.R), new n5g(l7b.S))));
        }
        if (pb2Var == null || !pb2Var.N()) {
            return hd5.a;
        }
        if (pb2Var.g0()) {
            r5gVar = new n5g(l7b.N0);
            i = l7b.M0;
        } else {
            r5gVar = new r5g(pb2Var.s());
            i = l7b.O0;
        }
        s5g s5gVar = r5gVar;
        n5g n5gVar2 = new n5g(i);
        String strI2 = pb2Var.i(il0Var, hl0Var);
        pb2Var.q0();
        return Collections.singletonList(new bg2(s5gVar, n5gVar2, strI2, pb2Var.w0, pb2Var.h()));
    }
}

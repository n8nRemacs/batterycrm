package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wy6 extends dtf implements um6 {
    public int X;
    public /* synthetic */ z26 Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o = 1;
    public final /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy6(ej0 ej0Var, w63 w63Var, Continuation continuation) {
        super(3, continuation);
        this.s0 = ej0Var;
        this.t0 = w63Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        switch (this.o) {
            case 0:
                wy6 wy6Var = new wy6((Continuation) obj3, (List) this.s0, (zy6) this.t0);
                wy6Var.Y = z26Var;
                wy6Var.Z = (Object[]) obj2;
                return wy6Var.n(qqg.a);
            default:
                wy6 wy6Var2 = new wy6((ej0) this.s0, (w63) this.t0, (Continuation) obj3);
                wy6Var2.Y = z26Var;
                wy6Var2.Z = (dmb) obj2;
                return wy6Var2.n(qqg.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy6.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy6(Continuation continuation, List list, zy6 zy6Var) {
        super(3, continuation);
        this.s0 = list;
        this.t0 = zy6Var;
    }
}

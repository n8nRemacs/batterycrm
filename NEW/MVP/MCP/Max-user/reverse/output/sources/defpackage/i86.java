package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i86 extends dtf implements sm6 {
    public final /* synthetic */ j86 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i86(j86 j86Var, Continuation continuation) {
        super(2, continuation);
        this.X = j86Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        i86 i86Var = (i86) l((f86) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        i86Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i86 i86Var = new i86(this.X, continuation);
        i86Var.o = obj;
        return i86Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f86 f86Var = (f86) this.o;
        j86 j86Var = this.X;
        f86 f86Var2 = j86Var.d;
        if (f86Var2 == null) {
            j86Var.d = f86Var;
        } else {
            j86Var.getClass();
            if (f86Var2 != null && !f86Var2.equals(f86Var)) {
                if (!fni.a(f86Var2.d, f86Var.d) || !fni.a(f86Var2.o, f86Var.o) || !fni.a(f86Var2.A0, f86Var.A0) || !fni.a(f86Var2.z0, f86Var.z0)) {
                    j86Var.a(q03.a);
                }
                j86Var.d = f86Var;
            }
        }
        return qqg.a;
    }
}

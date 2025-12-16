package defpackage;

import android.os.Looper;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z83 extends dtf implements sm6 {
    public final /* synthetic */ a93 X;
    public final /* synthetic */ jl8 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z83(a93 a93Var, jl8 jl8Var, Continuation continuation) {
        super(2, continuation);
        this.X = a93Var;
        this.Y = jl8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        z83 z83Var = (z83) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        z83Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        z83 z83Var = new z83(this.X, this.Y, continuation);
        z83Var.o = obj;
        return z83Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        a93 a93Var = this.X;
        tcf tcfVar = (tcf) a93Var.X;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        if (fni.a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        hbd hbdVar = (hbd) ((xpb) a93Var.b).c;
        gbd gbdVar = (gbd) ((dh4) a93Var.d).d;
        gw0.w(new n46(new m36(new g56(new d53(new y83(gw0.t(new m11(12, new x26[]{hbdVar, gbdVar, gw0.m(gw0.E(new m36(new r83(a93Var, null), new ovh(new d53(gbdVar, 3), 1, a93Var)), new s83(3, (Continuation) null, 0))), tcfVar})), 0, a93Var), 12), new t83(a93Var, null), 1), new u83(a93Var, null, 0)), new u83(a93Var, null, 1)), f84Var);
        hbd hbdVar2 = (hbd) a93Var.Y;
        jl8 jl8Var = this.Y;
        gw0.w(new g56(hbdVar2, new v83(a93Var, jl8Var, null), 1), f84Var);
        gw0.w(new g56(tcfVar, new w83(a93Var, jl8Var, null), 1), f84Var);
        return qqg.a;
    }
}

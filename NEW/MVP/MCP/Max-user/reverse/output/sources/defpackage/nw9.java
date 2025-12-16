package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nw9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yw9 Y;
    public final /* synthetic */ lzf Z;
    public int o;
    public final /* synthetic */ k18 s0;
    public final /* synthetic */ k18 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw9(yw9 yw9Var, lzf lzfVar, k18 k18Var, k18 k18Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = yw9Var;
        this.Z = lzfVar;
        this.s0 = k18Var;
        this.t0 = k18Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nw9) l((ltb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nw9 nw9Var = new nw9(this.Y, this.Z, this.s0, this.t0, continuation);
        nw9Var.X = obj;
        return nw9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        yw9 yw9Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            ltb ltbVar = (ltb) this.X;
            tcf tcfVar = yw9Var.k;
            this.o = 1;
            tcfVar.setValue(ltbVar);
            g84 g84Var = g84.a;
            if (qqgVar == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        yw9Var.l.O(yw9Var, yw9.o[0], svi.e(yw9Var.j, ((q2b) this.Z).b(), null, new mw9(this.s0, yw9Var, this.t0, null), 2));
        return qqgVar;
    }
}

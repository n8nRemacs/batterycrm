package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lt9 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ vu9 Y;
    public final /* synthetic */ n3e Z;
    public pb2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt9(vu9 vu9Var, n3e n3eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
        this.Z = n3eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lt9(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2Var;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2Var2 = (pb2) this.Y.B1.a.getValue();
            if (pb2Var2 == null) {
                return qqgVar;
            }
            em9 em9Var = (em9) this.Y.S0.getValue();
            long j = this.Y.b.a;
            this.o = pb2Var2;
            this.X = 1;
            ve2 ve2VarI = ((w63) em9Var.b.getValue()).i();
            ve2VarI.getClass();
            ve2VarI.r(j, true, new be2(j, 3));
            ve2VarI.n.c(new ti2(j));
            if (qqgVar == g84Var) {
                return g84Var;
            }
            pb2Var = pb2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pb2Var = this.o;
            g8j.b(obj);
        }
        xo8 xo8Var = this.Y.t0;
        long j2 = this.Z.a;
        String str = (String) xo8Var.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, vb9.e(j2, "Marking as read reaction for message="), null);
            }
        }
        ((abd) ((k18) xo8Var.c).getValue()).d(pb2Var.b.a, pb2Var.p(), j2, false, false, false, true);
        return qqgVar;
    }
}

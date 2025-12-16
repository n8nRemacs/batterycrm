package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w0c extends dtf implements sm6 {
    public long X;
    public long Y;
    public int Z;
    public pb2 o;
    public final /* synthetic */ x0c s0;
    public final /* synthetic */ int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0c(x0c x0cVar, int i, Continuation continuation) {
        super(2, continuation);
        this.s0 = x0cVar;
        this.t0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w0c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w0c(this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2Var;
        long j;
        long j2;
        int i = this.Z;
        qqg qqgVar = qqg.a;
        x0c x0cVar = this.s0;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            pb2Var = (pb2) x0cVar.a.getValue();
            if (pb2Var != null) {
                j = pb2Var.b.a;
                eh9 eh9Var = pb2Var.o;
                if (eh9Var != null) {
                    j2 = eh9Var.a.a;
                    wz2 wz2Var = x0cVar.c;
                    long j3 = pb2Var.a;
                    this.o = pb2Var;
                    this.X = j;
                    this.Y = j2;
                    this.Z = 1;
                    wz2Var.a(j3, j);
                    if (qqgVar != g84Var) {
                    }
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        j2 = this.Y;
        j = this.X;
        pb2Var = this.o;
        g8j.b(obj);
        pb2 pb2Var2 = pb2Var;
        long j4 = j2;
        long j5 = j;
        wl8 wl8VarC = ((q2b) x0cVar.b).c();
        v0c v0cVar = new v0c(this.s0, this.t0, pb2Var2, j5, j4, null);
        this.o = null;
        this.Z = 2;
        return svi.i(wl8VarC, v0cVar, this) == g84Var ? g84Var : qqgVar;
    }
}

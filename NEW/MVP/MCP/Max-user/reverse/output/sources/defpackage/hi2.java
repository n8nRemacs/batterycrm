package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hi2 extends dtf implements sm6 {
    public final /* synthetic */ ve2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ pb2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ve2 ve2Var, long j, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = ve2Var;
        this.Y = j;
        this.Z = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hi2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hi2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2Var;
        int i = this.o;
        ve2 ve2Var = this.X;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            gx9 gx9Var = (gx9) ve2Var.u.getValue();
            this.o = 1;
            lq9 lq9VarD = gx9Var.a.d();
            Object objB = k7j.b(lq9VarD.a, new us5(lq9VarD, this.Y, 1), this);
            if (objB != g84Var) {
                objB = qqgVar;
            }
            if (objB != g84Var) {
                objB = qqgVar;
            }
            if (objB != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
            pb2Var = this.Z;
            if (pb2Var != null && ((va4) ve2Var.B.getValue()) != null) {
                pb2Var.b.getClass();
                this.o = 3;
                if (qqgVar != g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        g8j.b(obj);
        jrd jrdVar = ((ie4) ve2Var.m.get()).b;
        this.o = 2;
        m03 m03VarC = jrdVar.c();
        Object objA = i8j.a(m03VarC.a, new j03(m03VarC, this.Y, (lq9) jrdVar.d.getValue(), jrdVar.d()), this);
        if (objA != g84Var) {
            objA = qqgVar;
        }
        if (objA != g84Var) {
            pb2Var = this.Z;
            if (pb2Var != null) {
                pb2Var.b.getClass();
                this.o = 3;
                if (qqgVar != g84Var) {
                }
            }
            return qqgVar;
        }
        return g84Var;
    }
}

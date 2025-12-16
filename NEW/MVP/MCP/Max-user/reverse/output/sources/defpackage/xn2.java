package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xn2 extends dtf implements sm6 {
    public ci5 X;
    public int Y;
    public final /* synthetic */ jo2 Z;
    public jo2 o;
    public final /* synthetic */ yb9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(jo2 jo2Var, yb9 yb9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = jo2Var;
        this.s0 = yb9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xn2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xn2(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        jo2 jo2Var;
        ci5 ci5Var;
        int i = this.Y;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = jo2.W0;
            jo2 jo2Var2 = this.Z;
            pb2 pb2VarZ = jo2Var2.z();
            if (pb2VarZ != null) {
                yb9 yb9Var = this.s0;
                eh9 eh9VarC = jo2Var2.C(yb9Var.j());
                if (eh9VarC != null) {
                    ci5 ci5Var2 = jo2Var2.P0;
                    uj2 uj2Var = (uj2) jo2Var2.M0.getValue();
                    this.o = jo2Var2;
                    this.X = ci5Var2;
                    this.Y = 1;
                    Object objB = uj2Var.b(pb2VarZ, eh9VarC, yb9Var, this);
                    g84 g84Var = g84.a;
                    if (objB == g84Var) {
                        return g84Var;
                    }
                    jo2Var = jo2Var2;
                    obj = objB;
                    ci5Var = ci5Var2;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ci5Var = this.X;
        jo2Var = this.o;
        g8j.b(obj);
        yy7[] yy7VarArr2 = jo2.W0;
        jo2Var.getClass();
        xfh.r(ci5Var, obj);
        return qqgVar;
    }
}

package defpackage;

import java.util.HashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v63 extends dtf implements sm6 {
    public final /* synthetic */ df2 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ w63 Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ Set s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v63(df2 df2Var, int i, w63 w63Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.X = df2Var;
        this.Y = i;
        this.Z = w63Var;
        this.s0 = set;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        v63 v63Var = (v63) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        v63Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        v63 v63Var = new v63(this.X, this.Y, this.Z, this.s0, continuation);
        v63Var.o = obj;
        return v63Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        af2 af2Var = (af2) this.o;
        cf2 cf2VarA = this.X.a();
        cf2VarA.a = this.Y;
        df2 df2VarA = cf2VarA.a();
        this.Z.getClass();
        HashSet hashSet = s00.C0;
        Set set = this.s0;
        if (fni.a(hashSet, set)) {
            af2Var.p = df2VarA;
        } else if (fni.a(s00.D0, set)) {
            af2Var.q = df2VarA;
        } else if (fni.a(s00.E0, set)) {
            af2Var.r = df2VarA;
        } else if (fni.a(s00.F0, set)) {
            af2Var.s = df2VarA;
        } else if (fni.a(s00.G0, set)) {
            af2Var.t = df2VarA;
        } else if (fni.a(s00.H0, set)) {
            af2Var.u = df2VarA;
        } else if (fni.a(s00.I0, set)) {
            af2Var.v = df2VarA;
        } else if (fni.a(s00.J0, set)) {
            af2Var.w = df2VarA;
        }
        return qqg.a;
    }
}

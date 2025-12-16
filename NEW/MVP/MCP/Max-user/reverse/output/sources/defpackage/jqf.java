package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jqf extends dtf implements sm6 {
    public final /* synthetic */ pf2 X;
    public final /* synthetic */ mqf Y;
    public final /* synthetic */ Context Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqf(pf2 pf2Var, mqf mqfVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.X = pf2Var;
        this.Y = mqfVar;
        this.Z = context;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jqf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jqf(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objP;
        mqf mqfVar = this.Y;
        k18 k18Var = mqfVar.x0;
        k18 k18Var2 = mqfVar.w0;
        k18 k18Var3 = mqfVar.z0;
        k18 k18Var4 = mqfVar.Z;
        int i = this.o;
        qqg qqgVar = qqg.a;
        pf2 pf2Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            if (pf2Var == null) {
                return qqgVar;
            }
            d53 d53Var = new d53(mqfVar.b, 12);
            this.o = 1;
            objP = gw0.p(d53Var, this);
            g84 g84Var = g84.a;
            if (objP == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objP = obj;
        }
        xqf xqfVar = new xqf((hwa) mqfVar.t0.getValue(), (w63) mqfVar.u0.getValue(), mqfVar.Y, (pb2) objP, (o7e) k18Var4.getValue(), (f7b) k18Var3.getValue(), (z7c) k18Var2.getValue(), (f8c) k18Var.getValue(), (oje) mqfVar.y0.getValue(), mqfVar.d, mqfVar.c, mqfVar.a, mqfVar.t());
        lzf lzfVarT = mqfVar.t();
        v6d v6dVar = new v6d(this.X, (qv3) mqfVar.v0.getValue(), mqfVar.t(), (o7e) k18Var4.getValue(), (f7b) k18Var3.getValue(), (z7c) k18Var2.getValue(), (f8c) k18Var.getValue(), mqfVar.c, mqfVar.d);
        a93 a93Var = new a93();
        a93Var.a = pf2Var;
        a93Var.b = lzfVarT;
        a93Var.c = xqfVar;
        a93Var.d = v6dVar;
        sa9 sa9Var = new sa9(this.Z, pf2Var, k18Var4);
        mqfVar.P0 = pf2Var;
        mqfVar.N0 = xqfVar;
        mqfVar.O0 = a93Var;
        mqfVar.Q0 = sa9Var;
        return qqgVar;
    }
}

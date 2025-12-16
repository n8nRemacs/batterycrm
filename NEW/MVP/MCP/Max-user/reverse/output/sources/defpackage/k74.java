package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k74 extends dtf implements sm6 {
    public final /* synthetic */ vl3 X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k74(vl3 vl3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.X = vl3Var;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k74) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k74(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        sxd sxdVar = (sxd) this.X.c;
        this.o = 1;
        Object objI = svi.i(bia.a.plus(sxdVar.b), new qxd(sxdVar, this.Y, false, true, null), this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gzb extends dtf implements sm6 {
    public final /* synthetic */ izb X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzb(izb izbVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = izbVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gzb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gzb(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        s5i s5iVar = this.X.d;
        this.o = 1;
        s5iVar.getClass();
        Object objD = d7j.d(new qe9(s5iVar, this.Y, null), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i6b extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public final /* synthetic */ l6b Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6b(x26 x26Var, l6b l6bVar, Continuation continuation) {
        super(2, continuation);
        this.X = x26Var;
        this.Y = l6bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i6b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new i6b(this.X, this.Y, continuation);
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
        l6b l6bVar = this.Y;
        h6b h6bVar = new h6b(l6bVar, null);
        tcf tcfVar = l6bVar.d;
        this.o = 1;
        Object objD = this.X.d(new f56(tcfVar, h6bVar, 1), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}

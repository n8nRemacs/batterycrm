package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ys2 extends dtf implements sm6 {
    public final /* synthetic */ xs X;
    public final /* synthetic */ dt2 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys2(xs xsVar, dt2 dt2Var, Continuation continuation) {
        super(2, continuation);
        this.X = xsVar;
        this.Y = dt2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ys2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ys2 ys2Var = new ys2(this.X, this.Y, continuation);
        ys2Var.o = obj;
        return ys2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        StringBuilder sb = new StringBuilder("getFcmHistory: chats=");
        xs xsVar = this.X;
        sb.append(xsVar);
        wqi.c("dt2", sb.toString(), new Object[0]);
        return xsVar.isEmpty() ? svi.b(f84Var, null, new ws2(2, null), 3) : svi.b(f84Var, null, new xs2(xsVar, this.Y, null), 3);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xh8 extends dtf implements sm6 {
    public final /* synthetic */ uid X;
    public final /* synthetic */ fh9 Y;
    public final /* synthetic */ yh8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh8(yh8 yh8Var, uid uidVar, fh9 fh9Var, Continuation continuation) {
        super(2, continuation);
        this.o = yh8Var;
        this.X = uidVar;
        this.Y = fh9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xh8 xh8Var = (xh8) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xh8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xh8(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yh8 yh8Var = this.o;
        ((qi9) yh8Var.l.getValue()).s((si9) this.X.a, po8.e(this.Y.Z, (m4e) yh8Var.s.getValue()));
        return qqg.a;
    }
}

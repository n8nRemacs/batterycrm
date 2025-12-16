package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zf6 extends dtf implements sm6 {
    public final /* synthetic */ StringBuilder X;
    public final /* synthetic */ cg6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf6(cg6 cg6Var, StringBuilder sb, Continuation continuation) {
        super(2, continuation);
        this.o = cg6Var;
        this.X = sb;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zf6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zf6(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cg6 cg6Var = this.o;
        ccb ccbVar = (ccb) cg6Var.k.getValue();
        ccbVar.h(this.X);
        ccbVar.c(new kcb(0, 0, i9j.b(cg6Var.f).d, 3));
        return ccbVar.i();
    }
}

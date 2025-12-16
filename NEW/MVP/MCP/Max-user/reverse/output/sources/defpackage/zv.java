package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zv extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ mk3 Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ mk3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(xw xwVar, long j, mk3 mk3Var, mk3 mk3Var2, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
        this.Y = j;
        this.Z = mk3Var;
        this.s0 = mk3Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zv) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zv zvVar = new zv(this.X, this.Y, this.Z, this.s0, continuation);
        zvVar.o = obj;
        return zvVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        xw xwVar = this.X;
        x74 x74Var = xwVar.q;
        lzf lzfVar = xwVar.b;
        svi.e(f84Var, x74Var.plus(((q2b) lzfVar).b()), null, new xv(xwVar, this.Y, this.Z, null), 2);
        return svi.e(f84Var, x74Var.plus(((q2b) lzfVar).b()), null, new yv(xwVar, this.Y, this.s0, null), 2);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xad extends dtf implements sm6 {
    public final /* synthetic */ yad X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xad(yad yadVar, Continuation continuation) {
        super(2, continuation);
        this.X = yadVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xad xadVar = (xad) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xadVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xad xadVar = new xad(this.X, continuation);
        xadVar.o = obj;
        return xadVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        vad vadVarT = this.X.t();
        long j = pb2Var.b.i0;
        vadVarT.getClass();
        return qqg.a;
    }
}

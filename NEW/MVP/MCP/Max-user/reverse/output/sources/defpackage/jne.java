package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jne extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ lne o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jne(lne lneVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = lneVar;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jne jneVar = (jne) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jneVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jne(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        lne lneVar = this.o;
        pb2 pb2VarN = ((w63) lneVar.o.getValue()).n(this.X);
        if (pb2VarN != null) {
            ci5 ci5Var = lneVar.x0;
            gqe gqeVar = gqe.c;
            long j = pb2VarN.a;
            gqeVar.getClass();
            xc0.l(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=false", ci5Var);
        }
        return qqg.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mwh extends dtf implements sm6 {
    public final /* synthetic */ owh X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwh(owh owhVar, Continuation continuation) {
        super(2, continuation);
        this.X = owhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mwh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mwh(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        owh owhVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            qlh qlhVar = (qlh) owhVar.X.getValue();
            long j = owhVar.b;
            long j2 = owhVar.c;
            this.o = 1;
            Object objB = k7j.b(qlhVar.a, new vna(1, j, j2, qlhVar), this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        ((t9c) owhVar.s0.getValue()).a(owhVar.c, true);
        owhVar.t();
        return qqg.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nmh extends dtf implements sm6 {
    public final /* synthetic */ tmh X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmh(tmh tmhVar, Continuation continuation) {
        super(2, continuation);
        this.X = tmhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nmh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nmh(this.X, continuation);
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
        tmh tmhVar = this.X;
        qlh qlhVar = (qlh) tmhVar.h.getValue();
        long j = tmhVar.a;
        long j2 = tmhVar.b;
        this.o = 1;
        Object objA = qlhVar.a(j, j2, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}

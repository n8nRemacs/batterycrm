package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g8c extends dtf implements sm6 {
    public final /* synthetic */ h8c X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8c(h8c h8cVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = h8cVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g8c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g8c(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            h8c h8cVar = this.X;
            jve jveVar = h8cVar.s0;
            int i2 = s65.d;
            u92 u92VarG = zs0.g(jveVar, v9j.i(this.Y, y65.MILLISECONDS));
            tw twVar = new tw(10, h8cVar);
            this.o = 1;
            Object objD = u92VarG.d(twVar, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}

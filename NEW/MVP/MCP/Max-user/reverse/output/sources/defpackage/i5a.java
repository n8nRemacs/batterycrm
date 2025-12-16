package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i5a extends dtf implements sm6 {
    public final /* synthetic */ j5a X;
    public final /* synthetic */ ul9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5a(j5a j5aVar, ul9 ul9Var, Continuation continuation) {
        super(2, continuation);
        this.X = j5aVar;
        this.Y = ul9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i5a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new i5a(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            j5a j5aVar = this.X;
            tm tmVar = j5aVar.c;
            if (tmVar == null) {
                tmVar = null;
            }
            em9 em9Var = (em9) tmVar.J.getValue();
            long j = j5aVar.X;
            long j2 = j5aVar.Y;
            this.o = 1;
            Object objC = em9Var.c(j, j2, this.Y, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
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

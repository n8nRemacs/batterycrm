package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k4a extends dtf implements sm6 {
    public final /* synthetic */ l4a X;
    public final /* synthetic */ ul9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4a(l4a l4aVar, ul9 ul9Var, Continuation continuation) {
        super(2, continuation);
        this.X = l4aVar;
        this.Y = ul9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k4a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k4a(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        l4a l4aVar = this.X;
        try {
            if (i == 0) {
                g8j.b(obj);
                tm tmVar = l4aVar.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                em9 em9Var = (em9) tmVar.J.getValue();
                long j = l4aVar.X;
                long j2 = l4aVar.Y;
                ul9 ul9Var = this.Y;
                this.o = 1;
                Object objC = em9Var.c(j, j2, ul9Var, this);
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
        } catch (Throwable th) {
            wqi.p("l4a", "fail to updateMessagesWithReactions", th);
            l4aVar.f();
        }
        return qqg.a;
    }
}

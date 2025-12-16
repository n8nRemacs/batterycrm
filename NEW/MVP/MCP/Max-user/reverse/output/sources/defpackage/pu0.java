package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pu0 extends dtf implements sm6 {
    public final /* synthetic */ ru0 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu0(ru0 ru0Var, Continuation continuation) {
        super(2, continuation);
        this.X = ru0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pu0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pu0(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ru0 ru0Var = this.X;
            long j = ru0Var.c;
            m36 m36Var = new m36(new nu0(ru0Var, null), gw0.u(gw0.y(ru0Var.h, new mwd(new ku0(j, null)), ru0Var.g), ru0Var.b));
            tw twVar = new tw(2, ru0Var);
            this.o = 1;
            Object objD = m36Var.d(twVar, this);
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

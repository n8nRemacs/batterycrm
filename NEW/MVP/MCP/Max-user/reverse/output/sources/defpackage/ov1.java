package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ov1 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ur3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov1(ur3 ur3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ur3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ov1) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ov1 ov1Var = new ov1(this.Y, continuation);
        ov1Var.X = obj;
        return ov1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            ur3 ur3Var = this.Y;
            bwf bwfVar = new bwf(new m3(ur3Var, 21, sacVar));
            pac pacVar = (pac) sacVar;
            pacVar.g(ur3Var.d() ? dxg.a : dxg.b);
            ur3Var.c((tr3) bwfVar.getValue());
            m3 m3Var = new m3(ur3Var, 22, bwfVar);
            this.o = 1;
            Object objA = e6j.a(pacVar, m3Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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

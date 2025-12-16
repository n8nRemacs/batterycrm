package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw2(zx2 zx2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uw2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zx2 zx2Var = this.X;
            zx2Var.X.i().Z(this.Y);
            uo5 uo5Var = zx2Var.d;
            uo5Var.a.f(uo5Var);
            jve jveVar = zx2Var.c1;
            jc3 jc3Var = jc3.b;
            this.o = 1;
            Object objA = jveVar.a(jc3Var, this);
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

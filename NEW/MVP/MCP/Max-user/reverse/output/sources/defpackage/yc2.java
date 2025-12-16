package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yc2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sd2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yc2) l((pb2) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yc2 yc2Var = new yc2(this.Y, continuation);
        yc2Var.X = obj;
        return yc2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2Var = (pb2) this.X;
            if (pb2Var.N() && !pb2Var.C()) {
                jve jveVar = this.Y.e;
                jc3 jc3Var = jc3.b;
                this.o = 1;
                Object objA = jveVar.a(jc3Var, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
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

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b81 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qv1 Y;
    public final /* synthetic */ i81 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(qv1 qv1Var, i81 i81Var, Continuation continuation) {
        super(2, continuation);
        this.Y = qv1Var;
        this.Z = i81Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b81) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b81 b81Var = new b81(this.Y, this.Z, continuation);
        b81Var.X = obj;
        return b81Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            a81 a81Var = new a81(sacVar);
            mb4 mb4Var = (mb4) ((tcf) this.Y.b()).getValue();
            if (mb4Var.f && !(mb4Var.l instanceof zn5)) {
                ((pac) sacVar).g(h71.c);
            }
            i81 i81Var = this.Z;
            i81Var.b.d(a81Var);
            m3 m3Var = new m3(i81Var, 9, a81Var);
            this.o = 1;
            Object objA = e6j.a(sacVar, m3Var, this);
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

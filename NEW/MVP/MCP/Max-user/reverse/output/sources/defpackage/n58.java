package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n58 extends dtf implements sm6 {
    public final /* synthetic */ o58 X;
    public final /* synthetic */ rj0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n58(o58 o58Var, rj0 rj0Var, Continuation continuation) {
        super(2, continuation);
        this.X = o58Var;
        this.Y = rj0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n58) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n58(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            rj0 rj0Var = this.Y;
            long j = rj0Var.a;
            pzf pzfVar = rj0Var.b;
            String str = pzfVar.d;
            if (str == null) {
                str = pzfVar.c;
            }
            f58 f58Var = new f58(j, str);
            this.o = 1;
            Object objA = jveVar.a(f58Var, this);
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

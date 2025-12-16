package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r83 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ a93 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(a93 a93Var, Continuation continuation) {
        super(2, continuation);
        this.Y = a93Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r83) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r83 r83Var = new r83(this.Y, continuation);
        r83Var.X = obj;
        return r83Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            lha lhaVarB = ((dh4) this.Y.d).b();
            this.o = 1;
            Object objA = z26Var.a(lhaVarB, this);
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

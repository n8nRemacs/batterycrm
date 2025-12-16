package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ct9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct9(vu9 vu9Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ct9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ct9 ct9Var = new ct9(this.Y, this.Z, continuation);
        ct9Var.X = obj;
        return ct9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            vu9 vu9Var = this.Y;
            s78 s78Var = (s78) vu9Var.X0.getValue();
            String str = this.Z;
            x26 x26VarF = s78Var.f(str);
            bt9 bt9Var = new bt9(vu9Var, str, f84Var, 0);
            this.o = 1;
            Object objD = x26VarF.d(bt9Var, this);
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

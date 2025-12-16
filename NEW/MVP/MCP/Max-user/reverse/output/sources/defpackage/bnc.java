package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bnc extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pnc Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(pnc pncVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = pncVar;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bnc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bnc bncVar = new bnc(this.Y, this.Z, continuation);
        bncVar.X = obj;
        return bncVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            pnc pncVar = this.Y;
            s78 s78Var = (s78) pncVar.z0.getValue();
            String str = this.Z;
            x26 x26VarF = s78Var.f(str);
            a40 a40Var = new a40(pncVar, str, f84Var, 10);
            this.o = 1;
            Object objD = x26VarF.d(a40Var, this);
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

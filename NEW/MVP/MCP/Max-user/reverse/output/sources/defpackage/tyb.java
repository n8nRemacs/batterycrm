package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tyb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wyb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyb(wyb wybVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wybVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tyb) l((nx3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tyb tybVar = new tyb(this.Y, continuation);
        tybVar.X = obj;
        return tybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        nx3 nx3Var = (nx3) this.X;
        wyb wybVar = this.Y;
        tcf tcfVar = wybVar.o;
        List listT = wyb.t(wybVar, nx3Var);
        this.o = 1;
        tcfVar.setValue(listT);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}

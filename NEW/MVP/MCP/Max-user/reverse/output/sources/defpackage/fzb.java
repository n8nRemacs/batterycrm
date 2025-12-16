package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fzb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ izb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzb(izb izbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = izbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fzb) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fzb fzbVar = new fzb(this.Y, continuation);
        fzbVar.X = obj;
        return fzbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2Var;
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
        List listT = (List) this.X;
        yy7[] yy7VarArr = izb.Z;
        izb izbVar = this.Y;
        long j = izbVar.b;
        if (j > 0 && (pb2Var = (pb2) ((w63) izbVar.o.getValue()).j(j).a.getValue()) != null && (!pb2Var.l().isEmpty())) {
            listT = izb.t(izbVar, listT);
        }
        tcf tcfVar = izbVar.X;
        this.o = 1;
        tcfVar.setValue(listT);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}

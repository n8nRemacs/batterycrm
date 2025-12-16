package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rd6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ae6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd6(ae6 ae6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ae6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rd6) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rd6 rd6Var = new rd6(this.Y, continuation);
        rd6Var.X = obj;
        return rd6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws InterruptedException {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        List<pa6> list = (List) this.X;
        q5b q5bVar = this.Y.o;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (pa6 pa6Var : list) {
            arrayList.add(new l0a(pa6Var.a, pa6Var.b, pa6Var.d, pa6Var.e));
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            q5bVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeInitialDataStorage", ho7.f(arrayList.size(), "updateFolders by count: "), null);
            }
        }
        ((AtomicReference) ((m0a) q5bVar.b.getValue()).b).set(arrayList);
        ((m0a) q5bVar.b.getValue()).t();
        tcf tcfVar = this.Y.t0;
        this.o = 1;
        tcfVar.m(null, list);
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ra extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ sa Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(k18 k18Var, sa saVar, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = saVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ra raVar = (ra) l((qa) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        raVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ra raVar = new ra(this.X, this.Y, continuation);
        raVar.o = obj;
        return raVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        s5g n5gVar;
        ArrayList arrayListL;
        g8j.b(obj);
        qa qaVar = (qa) this.o;
        qv1 qv1Var = (qv1) this.X.getValue();
        long j = qaVar.c;
        Map map = qaVar.a;
        qv1Var.h(j);
        sa saVar = this.Y;
        tcf tcfVar = saVar.d;
        do {
            value = tcfVar.getValue();
            pa paVar = (pa) value;
            n5gVar = map.isEmpty() ? new n5g(m0b.s2) : new j5g(l0b.a, map.size());
            saVar.b.getClass();
            arrayListL = lcj.l(map);
            paVar.getClass();
        } while (!tcfVar.c(value, new pa(n5gVar, arrayListL)));
        return qqg.a;
    }
}

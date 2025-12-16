package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ws1 extends dtf implements sm6 {
    public final /* synthetic */ at1 X;
    public final /* synthetic */ Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws1(Set set, at1 at1Var, Continuation continuation) {
        super(2, continuation);
        this.o = set;
        this.X = at1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ws1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ws1(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Set set = this.o;
        if (!set.isEmpty()) {
            qv3 qv3Var = ((l24) this.X.b.getValue()).a;
            qv3Var.b();
            us usVar = new us(0);
            qv3Var.a.forEach(new se2(set, 2, usVar));
            if (!usVar.isEmpty()) {
                us usVar2 = new us(usVar.c);
                Iterator it = ((ps) usVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    ku3 ku3Var = (ku3) entry.getValue();
                    Long l = new Long(jLongValue);
                    String strE = ku3Var.e();
                    if (strE == null) {
                        strE = "";
                    }
                    String strP = dnf.p(strE, ' ', (char) 160, true);
                    usVar2.put(l, new kxg(ku3Var.p(), strP, ku3Var.o(), ku3Var.B(), ku3Var.r(il0.d)));
                }
                return usVar2;
            }
        }
        return id5.a;
    }
}

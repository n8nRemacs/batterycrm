package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ine extends dtf implements sm6 {
    public final /* synthetic */ lne o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ine(lne lneVar, Continuation continuation) {
        super(2, continuation);
        this.o = lneVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ine ineVar = (ine) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ineVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ine(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        g8j.b(obj);
        lne lneVar = this.o;
        List<ku3> listJ = ((l24) lneVar.d.getValue()).a.j(qv3.o, qv3.r);
        v04 v04Var = (v04) lneVar.X.getValue();
        v04Var.getClass();
        Collections.sort(listJ, new dj3(3, v04Var));
        tcf tcfVar = lneVar.s0;
        do {
            value = tcfVar.getValue();
            int i = to8.i(we3.q(listJ, 10));
            if (i < 16) {
                i = 16;
            }
            linkedHashMap = new LinkedHashMap(i);
            for (ku3 ku3Var : listJ) {
                Long l = new Long(ku3Var.p());
                long jP = ku3Var.p();
                String strR = ku3Var.r(il0.b);
                String strE = ku3Var.e();
                if (strE == null) {
                    strE = "";
                }
                linkedHashMap.put(l, new eq0(jP, strR, strE, ku3Var.o()));
            }
        } while (!tcfVar.c(value, linkedHashMap));
        return qqg.a;
    }
}

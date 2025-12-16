package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c81 extends dtf implements sm6 {
    public final /* synthetic */ i81 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(i81 i81Var, Continuation continuation) {
        super(2, continuation);
        this.X = i81Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c81 c81Var = (c81) l((t71) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c81Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c81 c81Var = new c81(this.X, continuation);
        c81Var.o = obj;
        return c81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object objS;
        g8j.b(obj);
        t71 t71Var = (t71) this.o;
        i81 i81Var = this.X;
        tcf tcfVar = i81Var.d;
        do {
            value = tcfVar.getValue();
            Map map = (Map) value;
            if (fni.a(t71Var, d71.a) || fni.a(t71Var, c71.a)) {
                objS = id5.a;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(t71Var.getPriority()), t71Var);
                objS = to8.s(linkedHashMap);
            }
        } while (!tcfVar.c(value, objS));
        if ((t71Var instanceof wih) && ((wih) t71Var).b != null) {
            svi.e(i81Var.a, null, null, new d81(t71Var, i81Var, null), 3);
        }
        return qqg.a;
    }
}

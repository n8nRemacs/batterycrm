package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d81 extends dtf implements sm6 {
    public final /* synthetic */ t71 X;
    public final /* synthetic */ i81 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d81(t71 t71Var, i81 i81Var, Continuation continuation) {
        super(2, continuation);
        this.X = t71Var;
        this.Y = i81Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d81) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d81(this.X, this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        int i = this.o;
        t71 t71Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            long jLongValue = ((wih) t71Var).b.longValue();
            this.o = 1;
            Object objC = s8j.c(jLongValue, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        tcf tcfVar = this.Y.d;
        do {
            value = tcfVar.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.remove(Integer.valueOf(t71Var.getPriority()));
        } while (!tcfVar.c(value, to8.s(linkedHashMap)));
        return qqg.a;
    }
}

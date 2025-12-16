package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kne extends dtf implements sm6 {
    public final /* synthetic */ lne X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kne(lne lneVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = lneVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kne) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kne(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        long j;
        int i = this.o;
        qqg qqgVar = qqg.a;
        lne lneVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            tcf tcfVar = lneVar.s0;
            do {
                value = tcfVar.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                j = this.Y;
                linkedHashMap.remove(new Long(j));
            } while (!tcfVar.c(value, linkedHashMap));
            w04 w04Var = (w04) lneVar.Y.getValue();
            this.o = 1;
            w04Var.a(j);
            g84 g84Var = g84.a;
            if (qqgVar == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(lneVar.x0, new ime(new n5g(nbb.f)));
        return qqgVar;
    }
}

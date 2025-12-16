package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aj7 extends dtf implements sm6 {
    public final /* synthetic */ uo6 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ bj7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj7(bj7 bj7Var, uo6 uo6Var, int i, Continuation continuation) {
        super(2, continuation);
        this.o = bj7Var;
        this.X = uo6Var;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aj7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aj7(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bj7 bj7Var = this.o;
        ConcurrentHashMap concurrentHashMap = bj7Var.z0;
        uo6 uo6Var = this.X;
        List list = (List) concurrentHashMap.get(uo6Var);
        qqg qqgVar = qqg.a;
        if (list == null) {
            return qqgVar;
        }
        int i = uo6Var instanceof to6 ? 40 : this.Y;
        if (list.size() <= i) {
            return qqgVar;
        }
        bj7Var.z0.put(uo6Var, list.subList(0, i));
        return qqgVar;
    }
}

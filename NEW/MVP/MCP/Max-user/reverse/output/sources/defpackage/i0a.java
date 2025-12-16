package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i0a extends dtf implements sm6 {
    public final /* synthetic */ k0a X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0a(k0a k0aVar, Continuation continuation) {
        super(2, continuation);
        this.X = k0aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws InterruptedException {
        i0a i0aVar = (i0a) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        i0aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i0a i0aVar = new i0a(this.X, continuation);
        i0aVar.o = obj;
        return i0aVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws InterruptedException {
        g8j.b(obj);
        List list = (List) this.o;
        q5b q5bVar = this.X.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            q5bVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeInitialDataStorage", ho7.f(list.size(), "updateMiniChats by count: "), null);
            }
        }
        ((AtomicReference) ((c0a) q5bVar.a.getValue()).b).set(list);
        ((c0a) q5bVar.a.getValue()).t();
        return qqg.a;
    }
}

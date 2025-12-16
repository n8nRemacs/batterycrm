package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class woa extends dtf implements sm6 {
    public final /* synthetic */ cpa X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woa(cpa cpaVar, Continuation continuation) {
        super(2, continuation);
        this.X = cpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        woa woaVar = (woa) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        woaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        woa woaVar = new woa(this.X, continuation);
        woaVar.o = obj;
        return woaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.Z.setValue((List) this.o);
        return qqg.a;
    }
}

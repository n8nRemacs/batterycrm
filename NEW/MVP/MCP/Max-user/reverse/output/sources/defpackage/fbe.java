package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fbe extends dtf implements sm6 {
    public final /* synthetic */ tbe X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbe(Continuation continuation, tbe tbeVar) {
        super(2, continuation);
        this.X = tbeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fbe fbeVar = (fbe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fbeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fbe fbeVar = new fbe(continuation, this.X);
        fbeVar.o = obj;
        return fbeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.E((List) this.o);
        return qqg.a;
    }
}

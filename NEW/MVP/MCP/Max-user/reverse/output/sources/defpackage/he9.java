package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class he9 extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        he9 he9Var = (he9) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        he9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new he9(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return qqg.a;
    }
}

package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hj8 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hj8) l((File) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hj8 hj8Var = new hj8(2, continuation);
        hj8Var.o = obj;
        return hj8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return new mwd(new vyf(new ssb(((File) this.o).getAbsolutePath(), 11), null));
    }
}

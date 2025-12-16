package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oj8 extends dtf implements sm6 {
    public final /* synthetic */ CharSequence X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj8(CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.X = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oj8) l((File) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oj8 oj8Var = new oj8(this.X, continuation);
        oj8Var.o = obj;
        return oj8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ssb ssbVar = new ssb(((File) this.o).getAbsolutePath(), 11);
        return new uxb(new mwd(new vyf(ssbVar, null)), this.X.toString(), 26);
    }
}

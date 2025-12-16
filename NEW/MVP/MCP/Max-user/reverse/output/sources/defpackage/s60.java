package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s60 extends dtf implements sm6 {
    public final /* synthetic */ w60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(w60 w60Var, Continuation continuation) {
        super(2, continuation);
        this.o = w60Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s60 s60Var = (s60) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s60Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s60(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x9f x9fVar = this.o.n;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.o.n = null;
        this.o.g.setValue(null);
        this.o.b = null;
        w60 w60Var = this.o;
        w60Var.k = null;
        w60Var.c.clear();
        js jsVar = this.o.j;
        if (jsVar != null) {
            jsVar.clear();
        }
        return qqg.a;
    }
}

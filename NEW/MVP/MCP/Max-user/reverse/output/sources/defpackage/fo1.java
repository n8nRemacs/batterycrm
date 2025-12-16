package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fo1 extends dtf implements sm6 {
    public final /* synthetic */ wo1 X;
    public final /* synthetic */ nr1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo1(nr1 nr1Var, wo1 wo1Var, Continuation continuation) {
        super(2, continuation);
        this.o = nr1Var;
        this.X = wo1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fo1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fo1(this.o, this.X, continuation);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pr1 pr1Var = (pr1) this.X.Q0.getValue();
        nr1 nr1Var = this.o;
        pr1Var.b = nr1Var;
        Iterator it = pr1Var.a.iterator();
        while (it.hasNext()) {
            ((or1) it.next()).B(nr1Var);
        }
        return nr1Var;
    }
}

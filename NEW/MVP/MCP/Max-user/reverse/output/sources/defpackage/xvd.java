package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xvd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lta Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvd(lta ltaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ltaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xvd) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xvd xvdVar = new xvd(this.Y, continuation);
        xvdVar.X = obj;
        return xvdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            AtomicReference atomicReference = new AtomicReference();
            this.Y.a(new ssb(sacVar, 5, atomicReference));
            t64 t64Var = new t64(atomicReference, 4);
            this.o = 1;
            Object objA = e6j.a(sacVar, t64Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}

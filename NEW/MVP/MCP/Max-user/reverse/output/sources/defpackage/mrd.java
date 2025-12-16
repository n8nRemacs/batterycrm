package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadLocalElement;

/* loaded from: classes.dex */
public final class mrd extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lrd Y;
    public final /* synthetic */ l42 Z;
    public int o;
    public final /* synthetic */ nrd s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrd(lrd lrdVar, l42 l42Var, nrd nrdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = lrdVar;
        this.Z = l42Var;
        this.s0 = nrdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mrd mrdVar = new mrd(this.Y, this.Z, this.s0, continuation);
        mrdVar.X = obj;
        return mrdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Continuation continuation;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            r44 r44Var = (r44) ((f84) this.X).getCoroutineContext().get(jbe.t0);
            rgg rggVar = new rgg(r44Var);
            x74 x74VarPlus = r44Var.plus(rggVar).plus(new ThreadLocalElement(Integer.valueOf(System.identityHashCode(rggVar)), this.Y.j));
            continuation = this.Z;
            this.X = continuation;
            this.o = 1;
            obj = svi.i(x74VarPlus, this.s0, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            continuation = (Continuation) this.X;
            g8j.b(obj);
        }
        continuation.resumeWith(obj);
        return qqg.a;
    }
}

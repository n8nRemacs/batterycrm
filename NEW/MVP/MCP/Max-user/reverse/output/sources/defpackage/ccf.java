package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ccf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mcf Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccf(mcf mcfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mcfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((ccf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ccf ccfVar = new ccf(this.Y, continuation);
        ccfVar.X = obj;
        return ccfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            hv7 hv7Var = new hv7(new rid(), (z26) this.X);
            this.o = 1;
            Object objD = this.Y.d(hv7Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}

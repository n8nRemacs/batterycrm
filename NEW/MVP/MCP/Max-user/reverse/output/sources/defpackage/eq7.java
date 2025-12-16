package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eq7 extends q44 {
    public final /* synthetic */ Object X;
    public int d;
    public final /* synthetic */ sm6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq7(Continuation continuation, x74 x74Var, sm6 sm6Var, Object obj) {
        super(x74Var, continuation);
        this.o = sm6Var;
        this.X = obj;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.d = 2;
            g8j.b(obj);
            return obj;
        }
        this.d = 1;
        g8j.b(obj);
        sm6 sm6Var = this.o;
        uog.d(2, sm6Var);
        return sm6Var.invoke(this.X, this);
    }
}

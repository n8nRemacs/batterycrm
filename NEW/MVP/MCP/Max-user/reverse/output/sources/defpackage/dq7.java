package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dq7 extends apd {
    public int b;
    public final /* synthetic */ sm6 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq7(sm6 sm6Var, Object obj, Continuation continuation) {
        super(continuation);
        this.c = sm6Var;
        this.d = obj;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.b = 2;
            g8j.b(obj);
            return obj;
        }
        this.b = 1;
        g8j.b(obj);
        sm6 sm6Var = this.c;
        uog.d(2, sm6Var);
        return sm6Var.invoke(this.d, this);
    }
}

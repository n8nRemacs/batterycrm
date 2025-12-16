package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class y56 extends q44 {
    public final /* synthetic */ f56 X;
    public Object Y;
    public z26 Z;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y56(f56 f56Var, Continuation continuation) {
        super(continuation);
        this.X = f56Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}

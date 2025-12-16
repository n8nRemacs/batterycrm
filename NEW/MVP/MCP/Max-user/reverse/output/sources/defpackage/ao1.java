package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ao1 extends q44 {
    public final /* synthetic */ pg0 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao1(pg0 pg0Var, Continuation continuation) {
        super(continuation);
        this.X = pg0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}

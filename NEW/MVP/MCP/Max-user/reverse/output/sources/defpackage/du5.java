package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class du5 extends q44 {
    public final /* synthetic */ cu5 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du5(cu5 cu5Var, Continuation continuation) {
        super(continuation);
        this.X = cu5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        this.X.d(null, this);
        return g84.a;
    }
}

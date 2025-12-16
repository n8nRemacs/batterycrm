package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eq6 extends q44 {
    public final /* synthetic */ cq6 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq6(cq6 cq6Var, Continuation continuation) {
        super(continuation);
        this.X = cq6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}

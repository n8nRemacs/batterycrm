package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t31 extends q44 {
    public final /* synthetic */ u31 X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t31(u31 u31Var, Continuation continuation) {
        super(continuation);
        this.X = u31Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}

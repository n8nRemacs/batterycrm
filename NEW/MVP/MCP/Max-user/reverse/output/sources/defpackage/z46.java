package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z46 extends q44 {
    public final /* synthetic */ y83 X;
    public w3 Y;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z46(y83 y83Var, Continuation continuation) {
        super(continuation);
        this.X = y83Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
